package com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.callback.OnCheckedChangeListener;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.callback.OnItemChildClickListener;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.callback.OnItemChildLongClickListener;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.BaseViewHolder;

public class BaseAdapter<K extends BaseViewHolder> extends RecyclerView.Adapter<K> implements IRecyclerView{

    private OnCheckedChangeListener onCheckedChangeListener;

    private OnItemChildClickListener onItemChildClickListener;
    private OnItemChildLongClickListener onItemChildLongClickListener;

    @NonNull
    @Override
    public K onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull K holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getHeaderLayoutCount() {
        return 0;
    }

    public OnCheckedChangeListener getOnCheckedChangeListener() {
        return onCheckedChangeListener;
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public OnItemChildClickListener getOnItemChildClickListener() {
        return onItemChildClickListener;
    }

    public void setOnItemChildClickListener(OnItemChildClickListener onItemChildClickListener) {
        this.onItemChildClickListener = onItemChildClickListener;
    }

    public OnItemChildLongClickListener getOnItemChildLongClickListener() {
        return onItemChildLongClickListener;
    }

    public void setOnItemChildLongClickListener(OnItemChildLongClickListener onItemChildLongClickListener) {
        this.onItemChildLongClickListener = onItemChildLongClickListener;
    }
}
