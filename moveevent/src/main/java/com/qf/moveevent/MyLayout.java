package com.qf.moveevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Ken on 2016/10/18.14:28
 */
public class MyLayout extends LinearLayout {

    private MoveView view1, view2;

    public MyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        view1 = (MoveView) findViewById(R.id.moveview1);
        view2 = (MoveView) findViewById(R.id.moveview2);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    private float bx, by;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                bx = event.getX();
                by = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float ex = event.getX();
                float ey = event.getY();

                float mx = ex - bx;
                float my = ey - by;

                view1.move(mx, my);
                view2.move(mx, my);

                bx = ex;
                by = ey;
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }
}
