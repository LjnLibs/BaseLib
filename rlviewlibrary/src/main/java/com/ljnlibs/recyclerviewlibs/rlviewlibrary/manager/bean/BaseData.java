package com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean;

public class BaseData {
    //根据ItemKey获取对应的Holder对象，若填同样的值时，即全部公用一个Holder。如果都用唯一值时，View与Holder一一对应。
    private String itemKey;

    //根据此值获取对应的Holder类型
    private int viewType;

    public BaseData(String itemKey, int viewType) {
        this.itemKey = itemKey;
        this.viewType = viewType;
    }

    public BaseData() {
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }
}
