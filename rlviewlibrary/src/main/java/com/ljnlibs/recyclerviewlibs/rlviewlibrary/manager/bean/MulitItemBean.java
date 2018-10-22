package com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean;

public class MulitItemBean {

    private int type;

    private Class<? extends BaseMulitItemHolder> holderClass;

    private int layoutId;

    public MulitItemBean() {
    }

    public MulitItemBean(int type, Class<? extends BaseMulitItemHolder> holderClass, int layoutId) {
        this.type = type;
        this.holderClass = holderClass;
        this.layoutId = layoutId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Class<? extends BaseMulitItemHolder> getHolderClass() {
        return holderClass;
    }

    public void setHolderClass(Class<? extends BaseMulitItemHolder> holderClass) {
        this.holderClass = holderClass;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }
}
