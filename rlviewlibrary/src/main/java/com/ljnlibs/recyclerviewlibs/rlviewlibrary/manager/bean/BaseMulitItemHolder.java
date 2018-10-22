package com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean;

import android.support.v7.widget.RecyclerView;

import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.BaseViewHolder;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.RecyclerViewHolder;

public abstract class BaseMulitItemHolder<T extends RecyclerView.Adapter, V extends BaseViewHolder, K> extends RecyclerViewHolder<T,V,K> {


    public BaseMulitItemHolder(T adapter) {
        super(adapter);
    }
}
