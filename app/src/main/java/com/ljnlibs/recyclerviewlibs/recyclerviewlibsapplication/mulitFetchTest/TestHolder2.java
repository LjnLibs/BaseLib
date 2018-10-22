package com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.mulitFetchTest;

import android.view.View;
import android.widget.TextView;

import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.MainActivity;
import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.R;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.BaseMulitItemHolder;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.myAdapter.MyMultiItemFetchLoadAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.holder.BaseViewHolder;

public class TestHolder2 extends BaseMulitItemHolder<MyMultiItemFetchLoadAdapter, BaseViewHolder, MainActivity.TestData2> {


    private View view;


    public TestHolder2(MyMultiItemFetchLoadAdapter adapter) {
        super(adapter);
    }

    @Override
    public void convert(BaseViewHolder holder, MainActivity.TestData2 data2, int position, boolean isScrolling) {
        view = holder.getConvertView();
        TextView name = findViewById(R.id.test_name);
        TextView content = findViewById(R.id.test_content);
        name.setText(data2.getName2());
        content.setText(data2.getContent2());

    }

    // 根据layout id查找对应的控件
    protected <T extends View> T findViewById(int id) {
        return (T) view.findViewById(id);
    }
}
