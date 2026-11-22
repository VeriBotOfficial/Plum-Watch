package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: BaseGestureDetector.java */
/* loaded from: classes11.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f1824a;
    protected boolean b;
    protected MotionEvent c;
    protected MotionEvent d;
    protected float e;
    protected float f;
    protected long g;
    protected int h = 0;
    protected int i = 0;

    public p1(Context context) {
        this.f1824a = context;
    }

    public void a(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    protected abstract void a(int i, MotionEvent motionEvent);

    protected abstract void a(int i, MotionEvent motionEvent, int i2, int i3);

    protected void b(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.c;
        MotionEvent motionEvent3 = this.d;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
            this.d = null;
        }
        this.d = MotionEvent.obtain(motionEvent);
        this.g = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.e = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }

    protected void c() {
        MotionEvent motionEvent = this.c;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.c = null;
        }
        MotionEvent motionEvent2 = this.d;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.d = null;
        }
        this.b = false;
    }

    public boolean a(MotionEvent motionEvent, int i, int i2) {
        int action = motionEvent.getAction() & 255;
        if (!this.b) {
            a(action, motionEvent, i, i2);
            return true;
        }
        a(action, motionEvent);
        return true;
    }

    public static PointF a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f2 += motionEvent.getX(i);
            f += motionEvent.getY(i);
        }
        float f3 = pointerCount;
        return new PointF(f2 / f3, f / f3);
    }

    public MotionEvent a() {
        return this.d;
    }

    public long b() {
        return this.g;
    }
}
