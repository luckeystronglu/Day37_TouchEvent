package com.qf.touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Ken on 2016/10/18.9:48
 */
public class MyView3 extends View {

    public MyView3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->View3的事件分发方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->View3的事件分发方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->View3的事件分发方法ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->View3的事件处理方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->View3的事件处理方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->View3的事件处理方法ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
