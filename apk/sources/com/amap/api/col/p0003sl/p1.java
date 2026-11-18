package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* JADX INFO: compiled from: BaseGestureDetector.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public void a(int r1, int r2) {
        this.h = r1;
        this.i = r2;
    }

    protected abstract void a(int r1, MotionEvent motionEvent);

    protected abstract void a(int r1, MotionEvent motionEvent, int r3, int r4);

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

    public boolean a(MotionEvent motionEvent, int r4, int r5) {
        int action = motionEvent.getAction() & 255;
        if (!this.b) {
            a(action, motionEvent, r4, r5);
            return true;
        }
        a(action, motionEvent);
        return true;
    }

    public static PointF a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float y = 0.0f;
        float x = 0.0f;
        for (int r3 = 0; r3 < pointerCount; r3++) {
            x += motionEvent.getX(r3);
            y += motionEvent.getY(r3);
        }
        float f = pointerCount;
        return new PointF(x / f, y / f);
    }

    public MotionEvent a() {
        return this.d;
    }

    public long b() {
        return this.g;
    }
}
