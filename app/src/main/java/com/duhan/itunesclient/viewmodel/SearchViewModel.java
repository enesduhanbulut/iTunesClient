package com.duhan.itunesclient.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.paging.rxjava3.PagingRx;

import com.duhan.itunesclient.data.AbstractResult;
import com.duhan.itunesclient.data.Artist;
import com.duhan.itunesclient.data.ITunesRepository;
import com.duhan.itunesclient.data.Track;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.subjects.PublishSubject;

@HiltViewModel
public class SearchViewModel extends ViewModel {
    private final ITunesRepository iTunesRepository;
    private Flowable<PagingData<Artist>> artistResult;
    private Flowable<PagingData<Track>> trackResult;
    private String query;
    private MutableLiveData<String> queryLiveData = new MutableLiveData<>();

    @Inject
    public SearchViewModel(ITunesRepository iTunesRepository) {
        this.iTunesRepository = iTunesRepository;
    }

    public Flowable<PagingData<Artist>> searchArtist(String query) {
        artistResult = iTunesRepository.searchArtist(query);
        PagingRx.cachedIn(artistResult, ViewModelKt.getViewModelScope(this));
        return artistResult;
    }

    public Flowable<PagingData<Track>> searchTrack(String query) {
        trackResult = iTunesRepository.searchTrack(query);
        PagingRx.cachedIn(trackResult, ViewModelKt.getViewModelScope(this));
        return trackResult;
    }

    public void setQuery(String query) {
        this.query = query;
        queryLiveData.postValue(this.query);
    }

    public LiveData<String> getQueryLiveData() {
        return queryLiveData;
    }
}
