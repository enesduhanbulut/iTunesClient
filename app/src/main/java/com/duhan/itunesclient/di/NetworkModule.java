package com.duhan.itunesclient.di;

import com.duhan.itunesclient.api.ITunesService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@InstallIn(SingletonComponent.class)
@Module
public class NetworkModule {

    @Singleton
    @Provides
    ITunesService provideITunesService() {
        return ITunesService.create();
    }
}
