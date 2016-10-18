package com.qf.day37_touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Ken on 2016/10/18.9:31
 */
public class MyLinearLayout extends LinearLayout {

    public MyLinearLayout(Context context) {
        this(context, null);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 布局中的事件分发方法
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "----->布局中的事件分发方法");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 布局中的事件拦截方法
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "----->布局中的事件拦截方法");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 布局中的事件处理方法
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "----->布局中的事件处理方法");
                break;
        }
        return true;
    }
}
