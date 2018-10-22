package com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.mulitFetchTest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.MainActivity;
import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.R;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.BaseMulitItemHolder;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.myAdapter.MyMultiItemFetchLoadAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.BaseViewHolder;

public class TestHolder0 extends BaseMulitItemHolder<MyMultiItemFetchLoadAdapter, BaseViewHolder, MainActivity.TestData> {


    private View view;


    public TestHolder0(MyMultiItemFetchLoadAdapter adapter) {
        super(adapter);
    }

    @Override
    public void convert(BaseViewHolder holder, MainActivity.TestData data, int position, boolean isScrolling) {
        view = holder.getConvertView();
        TextView name = findViewById(R.id.test_name);
        TextView content = findViewById(R.id.test_content);
        name.setText(data.getName());
        content.setText(data.getContent());

    }

    // 根据layout id查找对应的控件
    protected <T extends View> T findViewById(int id) {
        return (T) view.findViewById(id);
    }
}
