package com.qf.scrollviewviewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Ken on 2016/10/18.14:46
 */
public class MyViewPager extends ViewPager {

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private float bx;
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        //不让父控件拦截事件
        this.getParent().requestDisallowInterceptTouchEvent(true);

        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                bx = ev.getX();
                break;
            case MotionEvent.ACTION_MOVE:
                float ex = ev.getX();
                float mx = ex - bx;

                if((mx < 0 && this.getCurrentItem() == this.getAdapter().getCount() - 1) || (mx > 0 && this.getCurrentItem() == 0)){
                    this.getParent().requestDisallowInterceptTouchEvent(false);
                }
                break;
        }

        return super.onTouchEvent(ev);
    }
}
