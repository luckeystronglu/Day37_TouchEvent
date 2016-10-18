package com.qf.touchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        View view3 = findViewById(R.id.view3);
//        view3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("print", "---->点击了View3");
//            }
//        });
    }

    /**
     * super:事件继续往下分发
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->activity的事件分发方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->activity的事件分发方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->activity的事件分发方法ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("print", "--------->activity的事件处理方法ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("print", "--------->activity的事件处理方法ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("print", "--------->activity的事件处理方法ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
