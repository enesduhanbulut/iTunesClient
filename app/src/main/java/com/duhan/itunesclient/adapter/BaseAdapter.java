package com.duhan.itunesclient.adapter;

import androidx.annotation.NonNull;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseAdapter<T, S extends RecyclerView.ViewHolder> extends PagingDataAdapter<T, S> {

    public BaseAdapter(@NonNull DiffUtil.ItemCallback<T> diffCallback) {
        super(diffCallback);
    }

    public interface OnItemClickListener<T> {
        void onItemClick(T object);
    }

}