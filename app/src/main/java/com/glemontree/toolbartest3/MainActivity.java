package com.glemontree.toolbartest3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private List<String> mDatas = new ArrayList<>();
    private MyAdapter myAdapter = null;

    @BindView(R.id.id_recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initData();
        myAdapter = new MyAdapter(this, mDatas);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        mDatas.add(0, "中国");
        mDatas.add(1, "美国");
        mDatas.add(2, "印度");
        mDatas.add(3, "日本");
        mDatas.add(4, "韩国");
        mDatas.add(5, "俄罗斯");
        mDatas.add(6, "英国");
        mDatas.add(7, "德国");
        mDatas.add(8, "法国");
        mDatas.add(9, "意大利");
        mDatas.add(10, "朝鲜");
        mDatas.add(11, "柬埔寨");
        mDatas.add(12, "泰国");
        mDatas.add(13, "菲律宾");
        mDatas.add(14, "越南");
        mDatas.add(15, "老挝");
        mDatas.add(16, "缅甸");
        mDatas.add(17, "马来西亚");
        mDatas.add(18, "文莱");
        mDatas.add(19, "新加坡");
        mDatas.add(20, "印度尼西亚");
        mDatas.add(21, "伊拉克");
        mDatas.add(22, "阿富汗");
        mDatas.add(23, "伊朗");
        mDatas.add(24, "伊朗");
        mDatas.add(25, "叙利亚");
        mDatas.add(26, "以色列");
        mDatas.add(27, "土耳其");
        mDatas.add(28, "迪拜");
    }

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        private Context mContext;
        private List<String> mDatas;

        public MyAdapter(Context context, List<String> datas) {
            mContext = context;
            mDatas = datas;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
            ViewHolder viewHolder = new ViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.mTextView.setText(mDatas.get(position));
        }

        @Override
        public int getItemCount() {
            return mDatas.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            TextView mTextView;
            ViewHolder(View v) {
                super(v);
                mTextView = (TextView) v.findViewById(R.id.id_text_view);
            }
        }
    }
}
