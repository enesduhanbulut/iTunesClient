package com.duhan.itunesclient.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.duhan.itunesclient.R;
import com.duhan.itunesclient.viewmodel.SearchViewModel;
import com.google.android.material.tabs.TabLayout;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
@AndroidEntryPoint
public class SearchFragment extends Fragment {

    private SearchViewModel searchViewModel;

    public SearchFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchViewModel = new ViewModelProvider(requireActivity()).get(SearchViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_search, container, false);
        ViewStateAdapter viewAdapter = new ViewStateAdapter(
                requireActivity().getSupportFragmentManager(), getLifecycle());
        final ViewPager2 pagingAdapter = rootView.findViewById(R.id.pager);
        pagingAdapter.setAdapter(viewAdapter);
        TabLayout tabLayout = rootView.findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Artist));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.Track));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pagingAdapter.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // TODO: 27.03.2022 do something
                Log.d(SearchFragment.class.getName(), "onTabUnselected");
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // TODO: 27.03.2022 do something
                Log.d(SearchFragment.class.getName(), "onTabReselected");
            }
        });
        pagingAdapter.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
        SearchView searchView = rootView.findViewById(R.id.searchBar);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchViewModel.setQuery(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private class ViewStateAdapter extends FragmentStateAdapter {

        public ViewStateAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            // Hardcoded in this order, you'll want to use lists and make sure the titles match
            switch (position) {
                case 1:
                    return new TrackFragment();
                default:
                    return new ArtistFragment();
            }
        }

        @Override
        public int getItemCount() {
            // Hardcoded, use lists
            return 2;
        }
    }

}