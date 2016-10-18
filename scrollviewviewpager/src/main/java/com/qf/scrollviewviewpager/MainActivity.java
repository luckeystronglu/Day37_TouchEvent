package com.qf.scrollviewviewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyAdapter myAdapter;
    private int[] datas = {R.mipmap.p1, R.mipmap.p2, R.mipmap.p3, R.mipmap.p4, R.mipmap.p5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.vp);
        myAdapter = new MyAdapter(this, datas);
        viewPager.setAdapter(myAdapter);

    }

    class MyAdapter extends PagerAdapter{

        private List<ImageView> ivList;

        public MyAdapter(Context context, int[] datas){
            ivList = new ArrayList<>();
            for (int data : datas) {
                ImageView iv = new ImageView(context);
                iv.setImageResource(data);
                iv.setScaleType(ImageView.ScaleType.FIT_XY);
                ivList.add(iv);
            }

        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(ivList.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(ivList.get(position));
            return ivList.get(position);
        }

        @Override
        public int getCount() {
            return ivList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
