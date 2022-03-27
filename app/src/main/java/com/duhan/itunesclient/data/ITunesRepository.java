package com.duhan.itunesclient.data;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.rxjava3.PagingRx;

import com.duhan.itunesclient.api.ITunesService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Flowable;

public class ITunesRepository {
    private final ITunesService iTunesService;
    private final PagingConfig pagingConfig;

    @Inject
    public ITunesRepository(ITunesService iTunesService) {
        this.iTunesService = iTunesService;
        this.pagingConfig = new PagingConfig(ITunesPagingSource.PAGE_LIMIT);
    }

    public Flowable<PagingData<Artist>> searchArtist(String query) {
        Pager<Integer, Artist> pager = new Pager(pagingConfig,
                () -> new ITunesPagingSource<>(Artist.class, iTunesService, query, WrapperType.ARTIST.getEntity()));
        return PagingRx.getFlowable(pager);
    }


    public Flowable<PagingData<Track>> searchTrack(String query) {
        Pager<Integer, Track> pager = new Pager(pagingConfig,
                () -> new ITunesPagingSource<>(Track.class, iTunesService, query, WrapperType.TRACK.getEntity()));
        return PagingRx.getFlowable(pager);
    }
}
