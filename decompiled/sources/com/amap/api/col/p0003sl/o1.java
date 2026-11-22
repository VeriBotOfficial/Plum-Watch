package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: AbstractTwoFingerGestureDetector.java */
/* loaded from: classes11.dex */
public abstract class o1 extends p1 {
    private final float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    public o1(Context context) {
        super(context);
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.j = ViewConfiguration.get(context).getScaledEdgeSlop();
    }

    public PointF a(int i) {
        return i == 0 ? new PointF(this.m, this.n) : new PointF(this.o, this.p);
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void b(MotionEvent motionEvent) {
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.c;
        int pointerCount = motionEvent2.getPointerCount();
        int pointerCount2 = motionEvent.getPointerCount();
        if (pointerCount2 == 2 && pointerCount2 == pointerCount) {
            float x = motionEvent2.getX(0);
            float y = motionEvent2.getY(0);
            float x2 = motionEvent2.getX(1);
            float y2 = motionEvent2.getY(1);
            float x3 = motionEvent.getX(0);
            float y3 = motionEvent.getY(0);
            float x4 = motionEvent.getX(1);
            float y4 = motionEvent.getY(1);
            this.m = x3 - x;
            this.n = y3 - y;
            this.o = x4 - x2;
            this.p = y4 - y2;
        }
    }

    protected boolean b(MotionEvent motionEvent, int i, int i2) {
        int i3;
        int i4 = this.h;
        if (i4 != 0 && (i3 = this.i) != 0) {
            float f = this.j;
            this.k = i4 - f;
            this.l = i3 - f;
        } else {
            float f2 = this.f1824a.getResources().getDisplayMetrics().widthPixels;
            float f3 = this.j;
            this.k = f2 - f3;
            this.l = r0.heightPixels - f3;
        }
        float f4 = this.j;
        float f5 = this.k;
        float f6 = this.l;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float x = 1 < motionEvent.getPointerCount() ? motionEvent.getX(1) + ((i + motionEvent.getX()) - motionEvent.getRawX()) : 0.0f;
        float y = 1 < motionEvent.getPointerCount() ? motionEvent.getY(1) + ((i2 + motionEvent.getY()) - motionEvent.getRawY()) : 0.0f;
        boolean z = rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6;
        boolean z2 = x < f4 || y < f4 || x > f5 || y > f6;
        return (z && z2) || z || z2;
    }
}
