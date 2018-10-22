package com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.myAdapter;

import android.support.v7.widget.RecyclerView;

import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.BaseData;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.BaseMulitItemHolder;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.MulitItemBean;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.adapter.BaseMultiItemFetchLoadAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.adapter.BaseMultiItemQuickAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.BaseViewHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMultiItemQuickAdapter<T extends BaseData> extends BaseMultiItemQuickAdapter<T, BaseViewHolder> {

    private Map<Class<? extends BaseMulitItemHolder>, Integer> holder2ViewType;

    public MyMultiItemQuickAdapter(RecyclerView recyclerView, List<T> data, List<MulitItemBean> holderList) {
        super(recyclerView, data);

        // view type, view holder
        holder2ViewType = new HashMap<>();

        if(holderList != null && holderList.size()>0) {
            for (MulitItemBean holder : holderList) {
                addItemType(holder.getType(), holder.getLayoutId() , holder.getHolderClass());
                holder2ViewType.put(holder.getHolderClass(), holder.getType());
            }
        }

    }

    /**
     * 根据此值获取对应的Holder类型
     * @param item
     * @return
     */
    @Override
    protected int getViewType(T item) {
        return holder2ViewType.get(item.getViewType());
    }

    /**
     * 根据ItemKey获取对应的Holder对象，若填同样的值时，即全部公用一个Holder。如果都用唯一值时，View与Holder一一对应。
     * 如果每个ItemKey设置不一样，而可以实现单独Item的刷新。
     * (BaseMulitItemHolder 存储好当前的View，通过getViewHolder(int viewType, String viewHolderKey)获取ItemHolder)
     * @param item
     * @return
     */
    @Override
    protected String getItemKey(T item) {
        return item.getItemKey();
    }
}
