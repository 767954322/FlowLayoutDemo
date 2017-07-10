package com.homechart.app.flowlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mStrList = new ArrayList<>();
    private FlowLayout mFlowLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout = (FlowLayout) findViewById(R.id.fl_flowlayout);
        mStrList.clear();
        initList();
        initFlowLayout();
    }

    private void initList() {
        mStrList.add("张三");
        mStrList.add("李四");
        mStrList.add("王麻子");
        mStrList.add("小李飞刀");
        mStrList.add("神");
        mStrList.add("时代在进步");
        mStrList.add("冯六");
        mStrList.add("秦始皇");
        mStrList.add("心心相印");
        mStrList.add("？");
        mStrList.add("结束");
    }

    private void initFlowLayout() {
        mFlowLayout.setColorful(false);
        mFlowLayout.setListData(mStrList);
        mFlowLayout.setOnTagClickListener(new FlowLayout.OnTagClickListener() {
            @Override
            public void TagClick(String text) {
                Toast.makeText(MainActivity.this, "点击了：" + text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
