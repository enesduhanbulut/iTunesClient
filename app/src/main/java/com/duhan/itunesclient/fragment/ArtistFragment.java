package com.duhan.itunesclient.fragment;

import static autodispose2.AutoDispose.autoDisposable;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.duhan.itunesclient.R;
import com.duhan.itunesclient.adapter.ArtistAdapter;
import com.duhan.itunesclient.data.Artist;
import com.duhan.itunesclient.viewmodel.SearchViewModel;

import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;

@AndroidEntryPoint
public class ArtistFragment extends Fragment {
    private SearchViewModel searchViewModel;
    private ArtistAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_artist, container, false);
        searchViewModel = new ViewModelProvider(requireActivity()).get(SearchViewModel.class);
        RecyclerView recyclerView = rootView.findViewById(R.id.artistRecyclerView);
        adapter = new ArtistAdapter(object -> {
            Toast.makeText(requireContext(), object.toString(), Toast.LENGTH_SHORT).show();
        });
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        searchViewModel.getQueryLiveData().observe(requireActivity(), s -> {
            searchViewModel.searchArtist(s)
                    .to(autoDisposable(AndroidLifecycleScopeProvider.from(this)))
                    .subscribeWith(new DisposableSubscriber<PagingData<Artist>>() {
                        @Override
                        public void onNext(PagingData<Artist> artistPagingData) {
                            adapter.submitData(getLifecycle(), artistPagingData);
                        }

                        @Override
                        public void onError(Throwable t) {
                            t.printStackTrace();
                        }

                        @Override
                        public void onComplete() {
                            System.out.println("test");
                        }
                    });
        });
    }
}
