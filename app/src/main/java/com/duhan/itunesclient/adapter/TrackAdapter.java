package com.duhan.itunesclient.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.duhan.itunesclient.R;
import com.duhan.itunesclient.data.Track;

public class TrackAdapter extends BaseAdapter<Track, TrackAdapter.ViewHolder> {
    private final OnItemClickListener<Track> onClickListener;

    public TrackAdapter(OnItemClickListener<Track> onClickListener) {
        super(new DiffUtil.ItemCallback<Track>() {
            @Override
            public boolean areItemsTheSame(@NonNull Track oldItem, @NonNull Track newItem) {
                return oldItem.hashCode() == newItem.hashCode();
            }

            @Override
            public boolean areContentsTheSame(@NonNull Track oldItem, @NonNull Track newItem) {
                return oldItem.equals(newItem);
            }
        });
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.track_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position), onClickListener);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView trackName;
        private final TextView trackKind;
        private final TextView trackArtist;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            trackName = itemView.findViewById(R.id.trackName);
            trackKind = itemView.findViewById(R.id.trackKind);
            trackArtist = itemView.findViewById(R.id.trackArtist);

        }

        public void bind(Track track, OnItemClickListener<Track> listener) {
            trackName.setText(track.getTrackName());
            trackKind.setText(track.getKind());
            trackArtist.setText(track.getArtistName());
            itemView.setOnClickListener(view -> listener.onItemClick(track));
        }
    }
}
