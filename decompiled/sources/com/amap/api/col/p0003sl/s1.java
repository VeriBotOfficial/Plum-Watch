package com.amap.api.col.p0003sl;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.amap.api.col.p0003sl.t1;

/* compiled from: ScaleGestureDetector.java */
/* loaded from: classes11.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1866a;
    private final a b;
    private boolean c;
    private MotionEvent d;
    private MotionEvent e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    /* renamed from: q, reason: collision with root package name */
    private long f1867q;
    private final float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private boolean y;
    private int z = 0;
    private int A = 0;

    /* compiled from: ScaleGestureDetector.java */
    public interface a {
    }

    public s1(Context context, a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1866a = context;
        this.b = aVar;
        this.r = viewConfiguration.getScaledEdgeSlop();
    }

    private static float b(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawY();
        }
        return motionEvent.getY(i) + (motionEvent.getRawY() - motionEvent.getY());
    }

    private void j() {
        MotionEvent motionEvent = this.d;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.d = null;
        }
        MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
            this.e = null;
        }
        this.u = false;
        this.c = false;
        this.w = -1;
        this.x = -1;
        this.v = false;
    }

    public void a(int i, int i2) {
        this.z = i;
        this.A = i2;
    }

    public MotionEvent c() {
        return this.e;
    }

    public float d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public float f() {
        return this.h;
    }

    public float g() {
        return this.i;
    }

    public float h() {
        if (this.n == -1.0f) {
            if (this.l == -1.0f) {
                float f = this.j;
                float f2 = this.k;
                this.l = (float) Math.sqrt((f * f) + (f2 * f2));
            }
            float f3 = this.l;
            if (this.m == -1.0f) {
                float f4 = this.h;
                float f5 = this.i;
                this.m = (float) Math.sqrt((f4 * f4) + (f5 * f5));
            }
            this.n = f3 / this.m;
        }
        return this.n;
    }

    public long i() {
        return this.f1867q;
    }

    public boolean a(MotionEvent motionEvent) {
        int a2;
        int a3;
        int i;
        int a4;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            j();
        }
        boolean z = false;
        if (this.v) {
            return false;
        }
        if (this.c) {
            if (action == 1) {
                j();
                return true;
            }
            if (action == 2) {
                b(motionEvent);
                if (this.o / this.p > 0.67f) {
                    t1.a aVar = (t1.a) this.b;
                    aVar.getClass();
                    if (aVar.a((t1) this)) {
                        this.d.recycle();
                        this.d = MotionEvent.obtain(motionEvent);
                    }
                }
            } else {
                if (action == 3) {
                    t1.a aVar2 = (t1.a) this.b;
                    aVar2.getClass();
                    aVar2.c((t1) this);
                    j();
                    return true;
                }
                if (action == 5) {
                    t1.a aVar3 = (t1.a) this.b;
                    aVar3.getClass();
                    aVar3.c((t1) this);
                    int i2 = this.w;
                    int i3 = this.x;
                    j();
                    this.d = MotionEvent.obtain(motionEvent);
                    if (!this.y) {
                        i2 = i3;
                    }
                    this.w = i2;
                    this.x = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.y = false;
                    int findPointerIndex = motionEvent.findPointerIndex(this.w);
                    if (findPointerIndex < 0 || this.w == this.x) {
                        int i4 = this.w;
                        int i5 = this.x;
                        this.w = motionEvent.getPointerId(a(motionEvent, i4 != i5 ? i5 : -1, findPointerIndex));
                    }
                    b(motionEvent);
                    ((t1.a) this.b).a(this);
                    this.c = true;
                    return true;
                }
                if (action == 6) {
                    int pointerCount = motionEvent.getPointerCount();
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (pointerCount > 2) {
                        int i6 = this.w;
                        if (pointerId == i6) {
                            int a5 = a(motionEvent, this.x, actionIndex);
                            if (a5 >= 0) {
                                t1.a aVar4 = (t1.a) this.b;
                                aVar4.getClass();
                                aVar4.c((t1) this);
                                this.w = motionEvent.getPointerId(a5);
                                this.y = true;
                                this.d = MotionEvent.obtain(motionEvent);
                                b(motionEvent);
                                ((t1.a) this.b).a(this);
                                this.c = true;
                                this.d.recycle();
                                this.d = MotionEvent.obtain(motionEvent);
                                b(motionEvent);
                            }
                            z = true;
                            this.d.recycle();
                            this.d = MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                        } else {
                            if (pointerId == this.x) {
                                int a6 = a(motionEvent, i6, actionIndex);
                                if (a6 >= 0) {
                                    t1.a aVar5 = (t1.a) this.b;
                                    aVar5.getClass();
                                    aVar5.c((t1) this);
                                    this.x = motionEvent.getPointerId(a6);
                                    this.y = false;
                                    this.d = MotionEvent.obtain(motionEvent);
                                    b(motionEvent);
                                    ((t1.a) this.b).a(this);
                                    this.c = true;
                                }
                                z = true;
                            }
                            this.d.recycle();
                            this.d = MotionEvent.obtain(motionEvent);
                            b(motionEvent);
                        }
                    } else {
                        z = true;
                    }
                    if (z) {
                        b(motionEvent);
                        int i7 = this.w;
                        if (pointerId == i7) {
                            i7 = this.x;
                        }
                        int findPointerIndex2 = motionEvent.findPointerIndex(i7);
                        this.f = motionEvent.getX(findPointerIndex2);
                        this.g = motionEvent.getY(findPointerIndex2);
                        t1.a aVar6 = (t1.a) this.b;
                        aVar6.getClass();
                        aVar6.c((t1) this);
                        j();
                        this.w = i7;
                        this.y = true;
                        return true;
                    }
                }
            }
        } else {
            if (action == 0) {
                this.w = motionEvent.getPointerId(0);
                this.y = true;
                return true;
            }
            if (action == 1) {
                j();
                return true;
            }
            if (action != 2) {
                if (action != 5) {
                    if (action == 6 && this.u) {
                        int pointerCount2 = motionEvent.getPointerCount();
                        int actionIndex2 = motionEvent.getActionIndex();
                        int pointerId2 = motionEvent.getPointerId(actionIndex2);
                        if (pointerCount2 > 2) {
                            int i8 = this.w;
                            if (pointerId2 == i8) {
                                int a7 = a(motionEvent, this.x, actionIndex2);
                                if (a7 >= 0) {
                                    this.w = motionEvent.getPointerId(a7);
                                    return true;
                                }
                            } else if (pointerId2 == this.x && (a4 = a(motionEvent, i8, actionIndex2)) >= 0) {
                                this.x = motionEvent.getPointerId(a4);
                                return true;
                            }
                        } else {
                            int i9 = this.w;
                            if (pointerId2 == i9) {
                                i9 = this.x;
                            }
                            int findPointerIndex3 = motionEvent.findPointerIndex(i9);
                            if (findPointerIndex3 < 0) {
                                this.v = true;
                                if (this.c) {
                                    t1.a aVar7 = (t1.a) this.b;
                                    aVar7.getClass();
                                    aVar7.c((t1) this);
                                }
                                return false;
                            }
                            this.w = motionEvent.getPointerId(findPointerIndex3);
                            this.y = true;
                            this.x = -1;
                            this.f = motionEvent.getX(findPointerIndex3);
                            this.g = motionEvent.getY(findPointerIndex3);
                            return true;
                        }
                    }
                } else {
                    int i10 = this.z;
                    if (i10 != 0 && (i = this.A) != 0) {
                        float f = this.r;
                        this.s = i10 - f;
                        this.t = i - f;
                    } else {
                        float f2 = this.f1866a.getResources().getDisplayMetrics().widthPixels;
                        float f3 = this.r;
                        this.s = f2 - f3;
                        this.t = r0.heightPixels - f3;
                    }
                    MotionEvent motionEvent2 = this.d;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.d = MotionEvent.obtain(motionEvent);
                    this.f1867q = 0L;
                    int actionIndex3 = motionEvent.getActionIndex();
                    int findPointerIndex4 = motionEvent.findPointerIndex(this.w);
                    int pointerId3 = motionEvent.getPointerId(actionIndex3);
                    this.x = pointerId3;
                    if (findPointerIndex4 < 0 || findPointerIndex4 == actionIndex3) {
                        findPointerIndex4 = a(motionEvent, findPointerIndex4 != actionIndex3 ? pointerId3 : -1, findPointerIndex4);
                        this.w = motionEvent.getPointerId(findPointerIndex4);
                    }
                    this.y = false;
                    b(motionEvent);
                    float f4 = this.r;
                    float f5 = this.s;
                    float f6 = this.t;
                    float a8 = a(motionEvent, findPointerIndex4);
                    float b = b(motionEvent, findPointerIndex4);
                    float a9 = a(motionEvent, actionIndex3);
                    float b2 = b(motionEvent, actionIndex3);
                    boolean z2 = a8 < f4 || b < f4 || a8 > f5 || b > f6;
                    boolean z3 = a9 < f4 || b2 < f4 || a9 > f5 || b2 > f6;
                    if (z2 && z3) {
                        this.f = -1.0f;
                        this.g = -1.0f;
                        this.u = true;
                        return true;
                    }
                    if (z2) {
                        this.f = motionEvent.getX(actionIndex3);
                        this.g = motionEvent.getY(actionIndex3);
                        this.u = true;
                        return true;
                    }
                    if (z3) {
                        this.f = motionEvent.getX(findPointerIndex4);
                        this.g = motionEvent.getY(findPointerIndex4);
                        this.u = true;
                        return true;
                    }
                    this.u = false;
                    ((t1.a) this.b).a(this);
                    this.c = true;
                    return true;
                }
            } else if (this.u) {
                float f7 = this.r;
                float f8 = this.s;
                float f9 = this.t;
                int findPointerIndex5 = motionEvent.findPointerIndex(this.w);
                int findPointerIndex6 = motionEvent.findPointerIndex(this.x);
                float a10 = a(motionEvent, findPointerIndex5);
                float b3 = b(motionEvent, findPointerIndex5);
                float a11 = a(motionEvent, findPointerIndex6);
                float b4 = b(motionEvent, findPointerIndex6);
                boolean z4 = a10 < f7 || b3 < f7 || a10 > f8 || b3 > f9;
                boolean z5 = a11 < f7 || b4 < f7 || a11 > f8 || b4 > f9;
                if (z4 && (a3 = a(motionEvent, this.x, findPointerIndex5)) >= 0) {
                    this.w = motionEvent.getPointerId(a3);
                    a(motionEvent, a3);
                    b(motionEvent, a3);
                    z4 = false;
                    findPointerIndex5 = a3;
                }
                if (z5 && (a2 = a(motionEvent, this.w, findPointerIndex6)) >= 0) {
                    this.x = motionEvent.getPointerId(a2);
                    a(motionEvent, a2);
                    b(motionEvent, a2);
                    z5 = false;
                    findPointerIndex6 = a2;
                }
                if (z4 && z5) {
                    this.f = -1.0f;
                    this.g = -1.0f;
                    return true;
                }
                if (z4) {
                    this.f = motionEvent.getX(findPointerIndex6);
                    this.g = motionEvent.getY(findPointerIndex6);
                    return true;
                }
                if (z5) {
                    this.f = motionEvent.getX(findPointerIndex5);
                    this.g = motionEvent.getY(findPointerIndex5);
                    return true;
                }
                this.u = false;
                ((t1.a) this.b).a(this);
                this.c = true;
                return true;
            }
        }
        return true;
    }

    private void b(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.e;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.e = MotionEvent.obtain(motionEvent);
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        MotionEvent motionEvent3 = this.d;
        int findPointerIndex = motionEvent3.findPointerIndex(this.w);
        int findPointerIndex2 = motionEvent3.findPointerIndex(this.x);
        int findPointerIndex3 = motionEvent.findPointerIndex(this.w);
        int findPointerIndex4 = motionEvent.findPointerIndex(this.x);
        if (findPointerIndex >= 0 && findPointerIndex2 >= 0 && findPointerIndex3 >= 0 && findPointerIndex4 >= 0) {
            float x = motionEvent3.getX(findPointerIndex);
            float y = motionEvent3.getY(findPointerIndex);
            float x2 = motionEvent3.getX(findPointerIndex2);
            float y2 = motionEvent3.getY(findPointerIndex2);
            float x3 = motionEvent.getX(findPointerIndex3);
            float y3 = motionEvent.getY(findPointerIndex3);
            float x4 = motionEvent.getX(findPointerIndex4) - x3;
            float y4 = motionEvent.getY(findPointerIndex4) - y3;
            this.h = x2 - x;
            this.i = y2 - y;
            this.j = x4;
            this.k = y4;
            this.f = x3 + (x4 * 0.5f);
            this.g = y3 + (y4 * 0.5f);
            this.f1867q = motionEvent.getEventTime() - motionEvent3.getEventTime();
            this.o = motionEvent.getPressure(findPointerIndex3) + motionEvent.getPressure(findPointerIndex4);
            this.p = motionEvent3.getPressure(findPointerIndex) + motionEvent3.getPressure(findPointerIndex2);
            return;
        }
        this.v = true;
        if (this.c) {
            t1.a aVar = (t1.a) this.b;
            aVar.getClass();
            aVar.c((t1) this);
        }
    }

    public float b() {
        return this.k;
    }

    private int a(MotionEvent motionEvent, int i, int i2) {
        int pointerCount = motionEvent.getPointerCount();
        int findPointerIndex = motionEvent.findPointerIndex(i);
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i3 != i2 && i3 != findPointerIndex) {
                float f = this.r;
                float f2 = this.s;
                float f3 = this.t;
                float a2 = a(motionEvent, i3);
                float b = b(motionEvent, i3);
                if (a2 >= f && b >= f && a2 <= f2 && b <= f3) {
                    return i3;
                }
            }
        }
        return -1;
    }

    private static float a(MotionEvent motionEvent, int i) {
        if (i < 0) {
            return Float.MIN_VALUE;
        }
        if (i == 0) {
            return motionEvent.getRawX();
        }
        return motionEvent.getX(i) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public float a() {
        return this.j;
    }
}
