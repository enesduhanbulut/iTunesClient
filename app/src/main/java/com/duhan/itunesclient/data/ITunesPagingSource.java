package com.duhan.itunesclient.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.paging.rxjava3.RxPagingSource;

import com.duhan.itunesclient.api.ITunesService;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ITunesPagingSource<T extends AbstractResult> extends RxPagingSource<Integer, T> {
    public static final int PAGE_LIMIT = 20;
    public static final int API_RESULT_LIMIT = 20;
    private final ITunesService iTunesService;
    private final String query;
    private final String entity;
    private final Object type;

    ITunesPagingSource(Class<T> type, @NonNull ITunesService iTunesService, @NonNull String query, String entity) {
        this.iTunesService = iTunesService;
        this.query = query;
        this.entity = entity;
        this.type = type;
    }

    @NotNull
    @Override
    public Single<PagingSource.LoadResult<Integer, T>> loadSingle(@NotNull PagingSource.LoadParams<Integer> params) {
        final int page = params.getKey() != null ? params.getKey() : 1;
        if (type.equals(Artist.class)) {
            return iTunesService.searchArtist(query, entity, API_RESULT_LIMIT, (page - 1) * PAGE_LIMIT)
                    .subscribeOn(Schedulers.io())
                    .map(iTunesResult -> (List<T>) iTunesResult.getResults())
                    .map(abstractResults -> toLoadResult(abstractResults, page))
                    .onErrorReturn(throwable -> {
                        throwable.printStackTrace();
                        return new LoadResult.Error(throwable);
                    });
        } else if (type.equals(Track.class)) {
            return iTunesService.searchTrack(query, entity, API_RESULT_LIMIT, API_RESULT_LIMIT * ((page * PAGE_LIMIT) / API_RESULT_LIMIT))
                    .subscribeOn(Schedulers.io())
                    .map(iTunesResult -> (List<T>) iTunesResult.getResults())
                    .map(abstractResults -> toLoadResult(abstractResults, page))
                    .onErrorReturn(throwable -> {
                        throwable.printStackTrace();
                        return new LoadResult.Error(throwable);
                    });
        } else {
            throw new IllegalArgumentException();
        }
    }

    private LoadResult<Integer, T> toLoadResult(@NonNull List<T> response, int page) {
        return new LoadResult.Page(
                response,
                null, // Only paging forward.
                response.isEmpty() ? null : page + 1,
                LoadResult.Page.COUNT_UNDEFINED,
                LoadResult.Page.COUNT_UNDEFINED);
    }

    @Override
    public boolean getKeyReuseSupported() {
        return true;
    }

    @Nullable
    @Override
    public Integer getRefreshKey(@NonNull PagingState<Integer, T> pagingState) {
        // Try to find the page key of the closest page to anchorPosition, from
        // either the prevKey or the nextKey, but you need to handle nullability
        // here:
        //  * prevKey == null -> anchorPage is the first page.
        //  * nextKey == null -> anchorPage is the last page.
        //  * both prevKey and nextKey null -> anchorPage is the initial page, so
        //    just return null.
        Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition == null) {
            return null;
        }

        LoadResult.Page<Integer, T> anchorPage = pagingState.closestPageToPosition(anchorPosition);
        if (anchorPage == null) {
            return null;
        }

        Integer prevKey = anchorPage.getPrevKey();
        if (prevKey != null) {
            return prevKey + 1;
        }

        Integer nextKey = anchorPage.getNextKey();
        if (nextKey != null) {
            return nextKey - 1;
        }

        return null;
    }
}
