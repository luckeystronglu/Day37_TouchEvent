package com.qf.day37_touchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

/**
 * 事件分发：
 * 隧道式向下分发，冒泡式向上处理
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 事件分发方法
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "----->activity中的事件分发方法");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 事件处理
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "----->activity中的事件处理方法");
                break;
        }
        return super.onTouchEvent(event);
    }
}
