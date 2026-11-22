package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes17.dex */
public class ShadeView extends View {
    private float downx;
    private float downy;
    private boolean enable;
    private boolean isFling;
    private Path mPath;
    private float mPreX;
    private float mPreY;
    private Paint paint;

    public ShadeView(Context context) {
        super(context);
        this.mPath = new Path();
        this.enable = true;
        this.paint = new Paint();
        this.isFling = false;
        init();
    }

    private void init() {
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(-1);
        this.paint.setStrokeWidth(30.0f);
        this.paint.setDither(true);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isFling() {
        return this.isFling;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isEnable()) {
            canvas.drawPath(this.mPath, this.paint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnable()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.mPath.moveTo(motionEvent.getX(), motionEvent.getY());
                float x = motionEvent.getX();
                this.mPreX = x;
                this.downx = x;
                float y = motionEvent.getY();
                this.mPreY = y;
                this.downy = y;
                ((View) getParent()).onTouchEvent(motionEvent);
                getParent().requestDisallowInterceptTouchEvent(true);
                this.isFling = false;
                setBackgroundColor(Color.parseColor("#32000000"));
                return true;
            }
            if (action == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.downx;
                float f2 = y2 - this.downy;
                this.isFling = Math.sqrt((double) ((f * f) + (f2 * f2))) > 100.0d;
                setBackgroundColor(Color.parseColor("#00000000"));
                reset();
            } else if (action == 2) {
                this.mPath.quadTo(this.mPreX, this.mPreY, (this.mPreX + motionEvent.getX()) / 2.0f, (this.mPreY + motionEvent.getY()) / 2.0f);
                this.mPreX = motionEvent.getX();
                this.mPreY = motionEvent.getY();
                invalidate();
            } else if (action == 3) {
                setBackgroundColor(Color.parseColor("#00000000"));
                reset();
            }
            ((View) getParent()).onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void reset() {
        this.mPath.reset();
        postInvalidate();
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public ShadeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPath = new Path();
        this.enable = true;
        this.paint = new Paint();
        this.isFling = false;
        init();
    }
}
