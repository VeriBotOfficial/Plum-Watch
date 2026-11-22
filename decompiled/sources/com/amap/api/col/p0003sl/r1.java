package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: MoveGestureDetector.java */
/* loaded from: classes11.dex */
public class r1 extends p1 {
    private static final PointF o = new PointF();
    private final a j;
    private PointF k;
    private PointF l;
    private PointF m;
    private PointF n;

    /* compiled from: MoveGestureDetector.java */
    public interface a {
        boolean a(r1 r1Var);

        boolean b(r1 r1Var);

        void c(r1 r1Var);
    }

    public r1(Context context, a aVar) {
        super(context);
        this.m = new PointF();
        this.n = new PointF();
        this.j = aVar;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 0) {
            c();
            this.c = MotionEvent.obtain(motionEvent);
            this.g = 0L;
            b(motionEvent);
            return;
        }
        if (i == 2) {
            this.b = this.j.a(this);
            return;
        }
        if (i != 5) {
            return;
        }
        MotionEvent motionEvent2 = this.c;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.c = MotionEvent.obtain(motionEvent);
        b(motionEvent);
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void b(MotionEvent motionEvent) {
        PointF pointF;
        super.b(motionEvent);
        MotionEvent motionEvent2 = this.c;
        this.k = p1.a(motionEvent);
        this.l = p1.a(motionEvent2);
        boolean z = this.c.getPointerCount() != motionEvent.getPointerCount();
        if (z) {
            pointF = o;
        } else {
            PointF pointF2 = this.k;
            float f = pointF2.x;
            PointF pointF3 = this.l;
            pointF = new PointF(f - pointF3.x, pointF2.y - pointF3.y);
        }
        this.n = pointF;
        if (z) {
            this.c.recycle();
            this.c = MotionEvent.obtain(motionEvent);
        }
        PointF pointF4 = this.m;
        float f2 = pointF4.x;
        PointF pointF5 = this.n;
        pointF4.x = f2 + pointF5.x;
        pointF4.y += pointF5.y;
    }

    public PointF d() {
        return this.n;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent) {
        if (i != 1) {
            if (i == 2) {
                b(motionEvent);
                if (this.e / this.f <= 0.67f || motionEvent.getPointerCount() > 1 || !this.j.b(this)) {
                    return;
                }
                this.c.recycle();
                this.c = MotionEvent.obtain(motionEvent);
                return;
            }
            if (i != 3) {
                return;
            }
        }
        this.j.c(this);
        c();
    }
}
