package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: ZoomOutGestureDetectorAbstract.java */
/* loaded from: classes11.dex */
public class u1 extends o1 {
    private static final PointF w = new PointF();

    /* renamed from: q, reason: collision with root package name */
    private final a f1899q;
    private boolean r;
    private PointF s;
    private PointF t;
    private PointF u;
    private PointF v;

    /* compiled from: ZoomOutGestureDetectorAbstract.java */
    public interface a {
        void a(u1 u1Var);
    }

    /* compiled from: ZoomOutGestureDetectorAbstract.java */
    public static class b implements a {
    }

    public u1(Context context, a aVar) {
        super(context);
        this.u = new PointF();
        this.v = new PointF();
        this.f1899q = aVar;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i != 5) {
            return;
        }
        c();
        this.c = MotionEvent.obtain(motionEvent);
        this.g = 0L;
        b(motionEvent);
        boolean b2 = b(motionEvent, i2, i3);
        this.r = b2;
        if (b2) {
            return;
        }
        this.f1899q.getClass();
        this.b = true;
    }

    @Override // com.amap.api.col.p0003sl.o1, com.amap.api.col.p0003sl.p1
    protected void b(MotionEvent motionEvent) {
        PointF pointF;
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.c;
        this.s = p1.a(motionEvent);
        this.t = p1.a(motionEvent2);
        if (this.c.getPointerCount() != motionEvent.getPointerCount()) {
            pointF = w;
        } else {
            PointF pointF2 = this.s;
            float f = pointF2.x;
            PointF pointF3 = this.t;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.v = pointF;
        PointF pointF4 = this.u;
        pointF4.x += pointF.x;
        pointF4.y += pointF.y;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void c() {
        super.c();
        this.r = false;
        PointF pointF = this.u;
        pointF.x = 0.0f;
        PointF pointF2 = this.v;
        pointF2.x = 0.0f;
        pointF.y = 0.0f;
        pointF2.y = 0.0f;
    }

    public float d() {
        return this.u.x;
    }

    public float e() {
        return this.u.y;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent) {
        if (i == 3) {
            c();
        } else {
            if (i != 6) {
                return;
            }
            b(motionEvent);
            if (!this.r) {
                this.f1899q.a(this);
            }
            c();
        }
    }
}
