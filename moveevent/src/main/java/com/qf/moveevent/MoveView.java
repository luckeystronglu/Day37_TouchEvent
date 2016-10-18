package com.qf.moveevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ken on 2016/10/18.14:24
 */
public class MoveView extends View {

    private float cx = 50, cy = 50;
    private float radius = 50;
    private Paint paint;

    public MoveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(cx, cy, radius, paint);
    }

    public void move(float mx, float my){
        cx += mx;
        cy += my;
        invalidate();
    }
}
