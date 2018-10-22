package com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager;

import android.support.v7.widget.RecyclerView;

import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.MulitItemBean;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.myAdapter.MyMultiItemFetchLoadAdapter;

import java.util.List;

public class BaseAdapterManager {


    private static BaseAdapterManager instance;

    private BaseAdapterManager() {
    }

    public static BaseAdapterManager getInstance() {
        if(instance == null){
            synchronized (BaseAdapterManager.class){
                if(instance == null){
                    instance = new BaseAdapterManager();
                }
            }
        }
        return instance;
    }

    public <T>MyMultiItemFetchLoadAdapter creatMultiFetchAdapter(RecyclerView recyclerView, List<T> data, List<MulitItemBean> holderList){
        return new MyMultiItemFetchLoadAdapter(recyclerView, data, holderList);
    }
}
