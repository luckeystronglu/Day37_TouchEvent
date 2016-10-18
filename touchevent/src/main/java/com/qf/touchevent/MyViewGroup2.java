package com.qf.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by Ken on 2016/10/18.9:48
 * 第二个布局
 */
public class MyViewGroup2 extends FrameLayout {

    public MyViewGroup2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->ViewGroup2的事件分发方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->ViewGroup2的事件分发方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->ViewGroup2的事件分发方法ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->ViewGroup2的事件拦截方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->ViewGroup2的事件拦截方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->ViewGroup2的事件拦截方法ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->ViewGroup2的事件处理方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->ViewGroup2的事件处理方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->ViewGroup2的事件处理方法ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
