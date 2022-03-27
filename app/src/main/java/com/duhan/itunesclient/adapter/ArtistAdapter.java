package com.duhan.itunesclient.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.duhan.itunesclient.R;
import com.duhan.itunesclient.data.Artist;

public class ArtistAdapter extends BaseAdapter<Artist, ArtistAdapter.ViewHolder> {
    private final OnItemClickListener<Artist> onClickListener;

    public ArtistAdapter(OnItemClickListener<Artist> onClickListener) {
        super(new DiffUtil.ItemCallback<Artist>() {
            @Override
            public boolean areItemsTheSame(@NonNull Artist oldItem, @NonNull Artist newItem) {
                return oldItem.hashCode() == newItem.hashCode();
            }

            @Override
            public boolean areContentsTheSame(@NonNull Artist oldItem, @NonNull Artist newItem) {
                return oldItem.equals(newItem);
            }
        });
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position), onClickListener);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView artistName;
        private final TextView artistGenre;
        private final TextView artistType;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            artistName = itemView.findViewById(R.id.artistName);
            artistGenre = itemView.findViewById(R.id.artistGenre);
            artistType = itemView.findViewById(R.id.artistType);


        }

        public void bind(Artist artist, OnItemClickListener<Artist> listener) {
            artistName.setText(artist.getArtistName());
            artistGenre.setText(artist.getPrimaryGenreName());
            artistType.setText(artist.getArtistType());
            itemView.setOnClickListener(view -> listener.onItemClick(artist));
        }
    }
}
