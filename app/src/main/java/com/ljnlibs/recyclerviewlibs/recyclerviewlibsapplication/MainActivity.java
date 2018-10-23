package com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.mulitFetchTest.TestHolder0;
import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.mulitFetchTest.TestHolder1;
import com.ljnlibs.recyclerviewlibs.recyclerviewlibsapplication.mulitFetchTest.TestHolder2;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.BaseAdapterManager;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.BaseData;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.bean.MulitItemBean;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.manager.myAdapter.MyMultiItemFetchLoadAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.adapter.BaseAdapter;
import com.ljnlibs.recyclerviewlibs.rlviewlibrary.recyclerview.callback.OnItemChildClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemChildClickListener {

    private RecyclerView base_rl_view;

    private List<BaseData> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base_rl_view = findViewById(R.id.base_rl_view);
        base_rl_view.setLayoutManager(new LinearLayoutManager(this));
        List<MulitItemBean> holderList = new ArrayList<>();
        holderList.add(new MulitItemBean(0, TestHolder0.class, R.layout.test_holder_0));
        holderList.add(new MulitItemBean(1, TestHolder1.class, R.layout.test_holder_1));
        holderList.add(new MulitItemBean(2, TestHolder2.class, R.layout.test_holder_2));
        initData();

        MyMultiItemFetchLoadAdapter adapter = BaseAdapterManager.getInstance().creatMultiFetchAdapter(base_rl_view,dataList,holderList);
        //所有注册了点击事件的处理（点击事件在TestHolder中注册）
        adapter.setOnItemChildClickListener(this);
        base_rl_view.setAdapter(adapter);

    }

    private void initData(){
        dataList.clear();
        for(int i = 0; i<30; i++){

            String name = "test_"+i+"86";
            String content = "content_"+i+"86";
            int type = i%3;
            int viewType = 0;
           switch (type){
               case 0:
                   viewType = 0;
                   dataList.add(new TestData(""+i, viewType, name,content));
                   break;
               case 1:
                   viewType = 1;
                   dataList.add(new TestData1(""+i, viewType, name,content));
                   break;
               case 2:
                   viewType = 2;
                   dataList.add(new TestData2(""+i, viewType, name,content));
                   break;
           }

        }
    }

    @Override
    public boolean onItemChildClick(BaseAdapter adapter, View view, int position) {
        String itemkey = dataList.get(position).getItemKey();
        Toast.makeText(this, itemkey, Toast.LENGTH_SHORT).show();
        System.out.println("onItemChildClick   : "+itemkey);
        return true;
    }

    public class TestData extends BaseData{

        private String name;
        private String content;

        public TestData(String itemKey, int viewType, String name, String content) {
            super(itemKey, viewType);
            this.name = name;
            this.content = content;
        }

        public TestData(String name, String content) {
            this.name = name;
            this.content = content;
        }

        public TestData() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public class TestData1 extends BaseData{

        private String name1;
        private String content1;

        public TestData1(String itemKey, int viewType, String name1, String content1) {
            super(itemKey, viewType);
            this.name1 = name1;
            this.content1 = content1;
        }

        public TestData1(String name1, String content1) {
            this.name1 = name1;
            this.content1 = content1;
        }

        public TestData1() {
        }

        public String getName1() {
            return name1;
        }

        public void setName1(String name) {
            this.name1 = name;
        }

        public String getContent1() {
            return content1;
        }

        public void setContent1(String content1) {
            this.content1 = content1;
        }
    }
    public class TestData2 extends BaseData{

        private String name2;
        private String content2;

        public TestData2(String itemKey, int viewType, String name2, String content2) {
            super(itemKey, viewType);
            this.name2 = name2;
            this.content2 = content2;
        }

        public TestData2(String name2, String content2) {
            this.name2 = name2;
            this.content2 = content2;
        }

        public TestData2() {
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        public String getContent2() {
            return content2;
        }

        public void setContent2(String content2) {
            this.content2 = content2;
        }
    }
}
