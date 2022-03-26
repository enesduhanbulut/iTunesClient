package com.duhan.itunesclient.data;

import com.duhan.itunesclient.api.ITunesService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Single;

public class ITunesRepository {
    private static final int PAGE_SIZE = 30;
    private final ITunesService iTunesService;

    @Inject
    public ITunesRepository(ITunesService iTunesService) {
        this.iTunesService = iTunesService;
    }

    public Single<List<Result>> search(String arg) {
        return iTunesService.search(arg, PAGE_SIZE)
                .firstOrError()
                .map(ITunesResult::getResults);
    }


}
