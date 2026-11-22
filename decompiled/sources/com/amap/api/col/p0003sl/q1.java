package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: HoverGestureDetectorAbstract.java */
/* loaded from: classes11.dex */
public class q1 extends o1 {
    private static final PointF w = new PointF();

    /* renamed from: q, reason: collision with root package name */
    private final a f1843q;
    private boolean r;
    private PointF s;
    private PointF t;
    private PointF u;
    private PointF v;

    /* compiled from: HoverGestureDetectorAbstract.java */
    public interface a {
        boolean a(q1 q1Var);

        void b(q1 q1Var);

        boolean c(q1 q1Var);
    }

    public q1(Context context, a aVar) {
        super(context);
        this.u = new PointF();
        this.v = new PointF();
        this.f1843q = aVar;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent, int i2, int i3) {
        if (i == 2) {
            if (this.r) {
                boolean b = b(motionEvent, i2, i3);
                this.r = b;
                if (b) {
                    return;
                }
                this.b = this.f1843q.c(this);
                return;
            }
            return;
        }
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
        this.b = this.f1843q.c(this);
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
    }

    public PointF d() {
        return this.v;
    }

    @Override // com.amap.api.col.p0003sl.p1
    protected void a(int i, MotionEvent motionEvent) {
        if (i == 2) {
            b(motionEvent);
            if (this.e / this.f <= 0.67f || !this.f1843q.a(this)) {
                return;
            }
            this.c.recycle();
            this.c = MotionEvent.obtain(motionEvent);
            return;
        }
        if (i == 3) {
            if (!this.r) {
                this.f1843q.b(this);
            }
            c();
        } else {
            if (i != 6) {
                return;
            }
            b(motionEvent);
            if (!this.r) {
                this.f1843q.b(this);
            }
            c();
        }
    }
}
