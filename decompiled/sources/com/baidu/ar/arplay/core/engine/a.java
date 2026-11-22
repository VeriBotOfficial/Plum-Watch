package com.baidu.ar.arplay.core.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import androidx.core.view.MotionEventCompat;
import com.baidu.ar.w4;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes12.dex */
public class a {
    public c b;
    public f m;
    public f n;
    public f o;
    public f p;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public int g = 0;
    public int h = 0;
    public d i = d.EStatSingFingerCandidate;
    public f j = null;
    public Map<Integer, Vector<Float>> k = new HashMap();
    public boolean l = true;

    /* renamed from: q, reason: collision with root package name */
    public double f6776q = -1.0d;
    public boolean r = true;
    public boolean s = false;
    public e t = e.ESWIPE_RIGHT;

    /* renamed from: a, reason: collision with root package name */
    public w4 f6775a = new w4();

    /* renamed from: com.baidu.ar.arplay.core.engine.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0322a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6777a;

        static {
            int[] iArr = new int[d.values().length];
            f6777a = iArr;
            try {
                iArr[d.EStatSingFingerCandidate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6777a[d.EStatTwoFingersCandidate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6777a[d.EStatScroll.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6777a[d.EStatSwipe.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6777a[d.EStatTwoFingersScroll.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6777a[d.EStatPinchAndUnpinch.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6777a[d.EStatTwoFingersRotate.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6777a[d.EStatLongPress.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6777a[d.EScrollAfterLongPress.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6777a[d.EStatPinch.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6777a[d.EStatUnPinch.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6777a[d.EStatUnknown.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum b {
        EGESTURE_CLICK,
        EGESTURE_DOUBLE_CLICK,
        EGESTURE_LONG_PRESS,
        EGESTURE_SWIPE,
        EGESTURE_SINGLE_FINGER_SCROLL,
        EGESTURE_TWO_FINGER_SCROLL,
        EGESTURE_TWO_FINGER_PINCH,
        EGESTURE_TWO_FINGER_UNPINCH,
        EGESTURE_TWO_FINGER_ROTATE,
        EGESTURE_CLEAR
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            super.handleMessage(message);
            if (a.this.e) {
                return;
            }
            int i = message.what;
            if (i != 1) {
                if (i == 2 && (obj = message.obj) != null) {
                    f fVar = (f) obj;
                    a.this.a(fVar.d, fVar.f6782a, fVar.b, fVar.c);
                    return;
                }
                return;
            }
            if (a.this.i == d.EStatSingFingerCandidate && a.this.l) {
                a.this.i = d.EStatLongPress;
                a.this.b(System.currentTimeMillis(), a.this.m.f6782a, a.this.m.b, a.this.m.c);
            }
        }
    }

    public enum d {
        EStatSingFingerCandidate,
        EStatTwoFingersCandidate,
        EStatLongPress,
        EStatScroll,
        EStatSwipe,
        EStatTwoFingersScroll,
        EStatPinch,
        EStatUnPinch,
        EScrollAfterLongPress,
        EStatPinchAndUnpinch,
        EStatTwoFingersRotate,
        EStatUnknown
    }

    public enum e {
        ESWIPE_RIGHT,
        ESWIPE_LEFT,
        ESWIPE_UP,
        ESWIPE_DOWN
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public int f6782a;
        public float b;
        public float c;
        public long d;

        public f(a aVar) {
            this.f6782a = -1;
            this.b = -1.0f;
            this.c = -1.0f;
            this.d = -1L;
        }

        public /* synthetic */ f(a aVar, C0322a c0322a) {
            this(aVar);
        }

        public void a(MotionEvent motionEvent, int i) {
            this.f6782a = motionEvent.getPointerId(i);
            this.b = motionEvent.getX(i);
            this.c = motionEvent.getY(i);
            this.d = motionEvent.getEventTime();
        }

        public String toString() {
            return "fingerId: " + this.f6782a + " && x,y: " + this.b + "," + this.c + " && time: " + this.d;
        }
    }

    public enum g {
        ETOUCH_BEGIN,
        ETOUCH_MOVE,
        ETOUCH_END,
        ETOUCH_CANCEL
    }

    public a(Looper looper) {
        C0322a c0322a = null;
        this.m = new f(this, c0322a);
        this.n = new f(this, c0322a);
        this.o = new f(this, c0322a);
        this.p = new f(this, c0322a);
        this.b = new c(looper);
        e();
    }

    public final double a(double d2, double d3, double d4, double d5) {
        double atan2 = Math.atan2(d5, d4) - Math.atan2(d3, d2);
        return atan2 > 3.141592653589793d ? atan2 - 6.283185307179586d : atan2 < -3.141592653589793d ? atan2 + 6.283185307179586d : atan2;
    }

    public final double a(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        return Math.sqrt((f6 * f6) + (f7 * f7));
    }

    public final double a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        Log.d("ARPTouchInput", String.format("vx1 %1.3f vy1 %1.3f vx2 %1.3f vy2 %1.3f", Float.valueOf(f4 - f2), Float.valueOf(f5 - f3), Float.valueOf(f8 - f6), Float.valueOf(f9 - f7)));
        double sqrt = ((r3 * r7) + (r4 * r8)) / (Math.sqrt((r3 * r3) + (r4 * r4)) * Math.sqrt((r7 * r7) + (r8 * r8)));
        try {
            sqrt = Double.parseDouble(new DecimalFormat("#.00").format(sqrt));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        double acos = Math.acos(sqrt);
        Log.d("ARPTouchInput", String.format("angle is %1.3f", Double.valueOf(Math.toDegrees(acos))));
        return acos;
    }

    public final float a(MotionEvent motionEvent) {
        return (motionEvent.getX(motionEvent.findPointerIndex(this.m.f6782a)) - this.m.b) / (motionEvent.getEventTime() - this.n.d);
    }

    public final void a() {
        a(b.EGESTURE_CLEAR.ordinal(), -1L, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public final void a(int i, float f2, float f3, float f4, float f5, long j, int i2, float f6) {
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        int i4;
        if (this.f) {
            f7 = this.g - f3;
            f9 = f4;
            f8 = -f5;
            f10 = f2;
        } else {
            f7 = f2;
            f8 = f4;
            f9 = f5;
            f10 = f3;
        }
        float[] windowSize = ARPEngine.getInstance().getWindowSize();
        if (windowSize.length == 2) {
            float f11 = windowSize[0];
            if (f11 > 0.0f) {
                float f12 = windowSize[1];
                if (f12 > 0.0f && (i3 = this.g) > 0 && (i4 = this.h) > 0) {
                    float f13 = f11 / i3;
                    float f14 = f12 / i4;
                    f7 *= f13;
                    f8 *= f13;
                    f10 *= f14;
                    f9 *= f14;
                }
            }
        }
        ARPEngine.getInstance().onTouchUpdate(i, f7, f10, f8, f9, j, i2, f6);
    }

    public void a(int i, int i2) {
        Log.d("ARPTouchInput", "setScreenWidthHight width * height = " + i + " * " + i2);
        if (this.f) {
            this.g = i2;
            this.h = i;
        } else {
            this.g = i;
            this.h = i2;
        }
    }

    public final void a(int i, long j, int i2, float f2, float f3, float f4, float f5, int i3, float f6, float f7, float f8, float f9, int i4, float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i5;
        int i6;
        if (this.f) {
            float f19 = this.g;
            f11 = f19 - f3;
            f14 = f6;
            f13 = f19 - f7;
            f12 = f2;
        } else {
            f11 = f2;
            f12 = f3;
            f13 = f6;
            f14 = f7;
        }
        float[] windowSize = ARPEngine.getInstance().getWindowSize();
        if (windowSize.length == 2) {
            float f20 = windowSize[0];
            if (f20 > 0.0f) {
                float f21 = windowSize[1];
                if (f21 > 0.0f && (i5 = this.g) > 0 && (i6 = this.h) > 0) {
                    float f22 = f20 / i5;
                    float f23 = f21 / i6;
                    f11 *= f22;
                    f13 *= f22;
                    f12 *= f23;
                    f14 *= f23;
                    f18 = f23 * f9;
                    f17 = f22 * f8;
                    f15 = f4 * f22;
                    f16 = f5 * f23;
                    ARPEngine.getInstance().onGestureUpdate(i, j, i2, f11, f12, f15, f16, i3, f13, f14, f17, f18, i4, f10);
                }
            }
        }
        f15 = f4;
        f16 = f5;
        f17 = f8;
        f18 = f9;
        ARPEngine.getInstance().onGestureUpdate(i, j, i2, f11, f12, f15, f16, i3, f13, f14, f17, f18, i4, f10);
    }

    public final void a(long j, int i, float f2, float f3) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.c()) {
            return;
        }
        a(b.EGESTURE_CLICK.ordinal(), j, i, f2, f3, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
        a();
    }

    public final void a(long j, int i, float f2, float f3, float f4, float f5) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.h()) {
            return;
        }
        a(b.EGESTURE_SINGLE_FINGER_SCROLL.ordinal(), j, i, f2, f3, f4, f5, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public final void a(long j, int i, float f2, float f3, float f4, float f5, int i2, float f6, float f7, float f8, float f9) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.b()) {
            return;
        }
        a(b.EGESTURE_TWO_FINGER_SCROLL.ordinal(), j, i, f2, f3, f4, f5, i2, f6, f7, f8, f9, -1, 0.0f);
    }

    public final void a(long j, int i, float f2, float f3, float f4, float f5, int i2, float f6, float f7, float f8, float f9, boolean z) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.f()) {
            return;
        }
        if (!this.r) {
            if ((z && !this.s) || (!z && this.s)) {
                a();
            }
            this.s = z;
        }
        int ordinal = b.EGESTURE_TWO_FINGER_UNPINCH.ordinal();
        if (z) {
            ordinal = b.EGESTURE_TWO_FINGER_PINCH.ordinal();
        }
        a(ordinal, j, i, f2, f3, f4, f5, i2, f6, f7, f8, f9, -1, 0.0f);
        if (this.r) {
            this.s = z;
        }
    }

    public final void a(long j, int i, float f2, float f3, int i2, float f4, float f5, float f6) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.g()) {
            return;
        }
        a(b.EGESTURE_TWO_FINGER_ROTATE.ordinal(), j, i, f2, f3, -1.0f, -1.0f, i2, f4, f5, -1.0f, -1.0f, -1, f6);
    }

    public final void a(long j, int i, int i2) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.i()) {
            return;
        }
        a(b.EGESTURE_SWIPE.ordinal(), j, i, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, i2, 0.0f);
        c();
    }

    public final void a(f fVar, f fVar2) {
        fVar2.f6782a = fVar.f6782a;
        fVar2.b = fVar.b;
        fVar2.c = fVar.c;
        fVar2.d = fVar.d;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public final float b(MotionEvent motionEvent) {
        return (motionEvent.getY(motionEvent.findPointerIndex(this.m.f6782a)) - this.m.c) / (motionEvent.getEventTime() - this.n.d);
    }

    public final void b() {
        ARPEngine.getInstance().onGestureUpdateWithScaleFinish(b.EGESTURE_CLEAR.ordinal(), -1L, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f, true);
    }

    public final void b(long j, int i, float f2, float f3) {
        w4 w4Var = this.f6775a;
        if (w4Var == null || !w4Var.e()) {
            return;
        }
        a(b.EGESTURE_LONG_PRESS.ordinal(), j, i, f2, f3, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0.0f);
    }

    public void b(boolean z) {
        Log.d("ARPTouchInput", "setScreenOrientationLandscape landscape = " + z);
        this.f = z;
    }

    public final float c(MotionEvent motionEvent) {
        return motionEvent.getX(motionEvent.findPointerIndex(this.m.f6782a));
    }

    public final void c() {
        this.i = d.EStatSingFingerCandidate;
        this.l = true;
        this.f6776q = -1.0d;
        this.b.removeMessages(1);
        if (this.b.hasMessages(2)) {
            return;
        }
        a();
    }

    public void c(boolean z) {
        this.c = z;
    }

    public final float d(MotionEvent motionEvent) {
        return motionEvent.getY(motionEvent.findPointerIndex(this.m.f6782a));
    }

    public void d() {
        w4 w4Var = this.f6775a;
        if (w4Var != null) {
            w4Var.j();
        }
    }

    public final float e(MotionEvent motionEvent) {
        return (motionEvent.getX(motionEvent.findPointerIndex(this.o.f6782a)) - this.p.b) / (motionEvent.getEventTime() - this.p.d);
    }

    public final void e() {
        w4 w4Var = this.f6775a;
        if (w4Var != null) {
            w4Var.k();
        }
    }

    public final float f(MotionEvent motionEvent) {
        return (motionEvent.getY(motionEvent.findPointerIndex(this.o.f6782a)) - this.p.c) / (motionEvent.getEventTime() - this.p.d);
    }

    public void f() {
        this.e = true;
        c cVar = this.b;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages(null);
            this.f6775a = null;
        }
        w4 w4Var = this.f6775a;
        if (w4Var != null) {
            w4Var.l();
            this.f6775a = null;
        }
    }

    public final float g(MotionEvent motionEvent) {
        return motionEvent.getX(motionEvent.findPointerIndex(this.o.f6782a));
    }

    public final void g() {
        if (this.b.hasMessages(2)) {
            this.b.removeMessages(2);
            f fVar = this.j;
            if (fVar != null) {
                a(fVar.d, fVar.f6782a, fVar.b, fVar.c);
                this.j = null;
            }
        }
    }

    public final float h(MotionEvent motionEvent) {
        return motionEvent.getY(motionEvent.findPointerIndex(this.o.f6782a));
    }

    public void i(MotionEvent motionEvent) {
        if (!this.d || !this.c || this.e) {
            Log.e("ARPTouchInput", "onTouchEvent mEnginSoLoaded = " + this.d + " && mUserTouchEnable = " + this.c + " && mReleased = " + this.e);
        } else {
            k(motionEvent);
            j(motionEvent);
        }
    }

    public final void j(MotionEvent motionEvent) {
        switch (C0322a.f6777a[this.i.ordinal()]) {
            case 1:
                q(motionEvent);
                break;
            case 2:
                s(motionEvent);
                break;
            case 3:
                o(motionEvent);
                break;
            case 4:
                r(motionEvent);
                break;
            case 5:
                u(motionEvent);
                break;
            case 6:
                n(motionEvent);
                break;
            case 7:
                t(motionEvent);
                break;
            case 8:
                m(motionEvent);
                break;
            case 9:
                p(motionEvent);
                break;
            case 10:
            case 11:
            case 12:
                v(motionEvent);
                break;
        }
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int ordinal;
        float f2;
        float f3;
        float f4;
        if (motionEvent.getPointerCount() <= 0) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float x = motionEvent.getX(actionIndex);
        float y = motionEvent.getY(actionIndex);
        long eventTime = motionEvent.getEventTime();
        float pressure = motionEvent.getPressure(actionIndex);
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        float x2 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        if (this.k.containsKey(Integer.valueOf(pointerId2))) {
                            Vector<Float> vector = this.k.get(Integer.valueOf(pointerId2));
                            float floatValue = x2 - vector.firstElement().floatValue();
                            float floatValue2 = y2 - vector.lastElement().floatValue();
                            vector.setElementAt(Float.valueOf(x2), 0);
                            vector.setElementAt(Float.valueOf(y2), 1);
                            f4 = floatValue;
                            f3 = floatValue2;
                        } else {
                            f3 = 0.0f;
                            f4 = 0.0f;
                        }
                        if (Math.abs(f4) > 0.1f || Math.abs(f3) > 0.1f) {
                            a(pointerId2, x2, y2, f4, f3, eventTime, g.ETOUCH_MOVE.ordinal(), motionEvent.getPressure(i2));
                        }
                    }
                    return;
                }
                if (actionMasked == 3) {
                    if (this.k.containsKey(Integer.valueOf(pointerId))) {
                        Vector<Float> vector2 = this.k.get(Integer.valueOf(pointerId));
                        f5 = x - vector2.elementAt(0).floatValue();
                        f6 = y - vector2.elementAt(1).floatValue();
                        this.k.remove(Integer.valueOf(pointerId));
                    }
                    f2 = x;
                    ordinal = g.ETOUCH_CANCEL.ordinal();
                    i = pointerId;
                    a(i, f2, y, f5, f6, eventTime, ordinal, pressure);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            f2 = x;
            i = pointerId;
            if (this.k.containsKey(Integer.valueOf(i))) {
                Vector<Float> vector3 = this.k.get(Integer.valueOf(i));
                float floatValue3 = f2 - vector3.elementAt(0).floatValue();
                float floatValue4 = y - vector3.elementAt(1).floatValue();
                this.k.remove(Integer.valueOf(i));
                f6 = floatValue4;
                f5 = floatValue3;
            }
            ordinal = g.ETOUCH_END.ordinal();
            a(i, f2, y, f5, f6, eventTime, ordinal, pressure);
        }
        i = pointerId;
        Vector<Float> vector4 = new Vector<>(2);
        vector4.add(Float.valueOf(x));
        vector4.add(Float.valueOf(y));
        this.k.put(Integer.valueOf(i), vector4);
        ordinal = g.ETOUCH_BEGIN.ordinal();
        f2 = x;
        a(i, f2, y, f5, f6, eventTime, ordinal, pressure);
    }

    public final void l(MotionEvent motionEvent) {
        f fVar;
        this.m.a(motionEvent, motionEvent.getActionIndex());
        a(this.m, this.n);
        Log.d("ARPTouchInput", "touchDownInSingleFingerCandidate() mFirstFingerTouch = " + this.m.toString());
        if (this.b.hasMessages(2) && (fVar = this.j) != null) {
            float f2 = fVar.b;
            float f3 = fVar.c;
            f fVar2 = this.m;
            if (a(f2, f3, fVar2.b, fVar2.c) > 100.0d) {
                g();
            }
        }
        this.b.sendEmptyMessageDelayed(1, 600L);
    }

    public final void m(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.i = d.EStatUnknown;
                return;
            }
        }
        f fVar = this.m;
        if (a(fVar.b, fVar.c, motionEvent.getX(), motionEvent.getY()) > 50.0d) {
            this.i = d.EScrollAfterLongPress;
            a(motionEvent.getEventTime(), this.m.f6782a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
            this.m.b = c(motionEvent);
            this.m.c = d(motionEvent);
            this.n.d = motionEvent.getEventTime();
        }
    }

    public final void n(MotionEvent motionEvent) {
        if (5 == motionEvent.getActionMasked()) {
            this.i = d.EStatUnknown;
            this.r = true;
            return;
        }
        if (6 == motionEvent.getActionMasked()) {
            this.i = d.EStatScroll;
            int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
            f fVar = this.m;
            if (action == fVar.f6782a) {
                fVar.f6782a = this.o.f6782a;
            }
            this.r = true;
            b();
            return;
        }
        if (2 != motionEvent.getActionMasked()) {
            this.i = d.EStatUnknown;
            return;
        }
        if (motionEvent.getEventTime() - this.n.d < 1 || motionEvent.getEventTime() - this.p.d < 1) {
            return;
        }
        float c2 = c(motionEvent);
        float d2 = d(motionEvent);
        float g2 = g(motionEvent);
        float h = h(motionEvent);
        double a2 = a(c2, d2, g2, h);
        a(motionEvent.getEventTime(), this.m.f6782a, c2, d2, a(motionEvent), b(motionEvent), this.o.f6782a, g2, h, e(motionEvent), f(motionEvent), a2 < this.f6776q);
        this.f6776q = a2;
        f fVar2 = this.m;
        fVar2.b = c2;
        fVar2.c = d2;
        this.n.d = motionEvent.getEventTime();
        f fVar3 = this.p;
        fVar3.b = g2;
        fVar3.c = h;
        fVar3.d = motionEvent.getEventTime();
    }

    public final void o(MotionEvent motionEvent) {
        e eVar;
        try {
            if (5 == motionEvent.getActionMasked()) {
                f fVar = this.m;
                fVar.a(motionEvent, fVar.f6782a);
                a(this.m, this.n);
                this.o.a(motionEvent, motionEvent.getActionIndex());
                a(this.o, this.p);
                this.i = d.EStatTwoFingersCandidate;
                w4 w4Var = this.f6775a;
                if (w4Var == null || !w4Var.h()) {
                    return;
                }
                a();
                return;
            }
            if (6 != motionEvent.getActionMasked()) {
                if (1 == motionEvent.getActionMasked()) {
                    c();
                    return;
                }
                if (2 == motionEvent.getActionMasked()) {
                    if (motionEvent.getEventTime() - this.n.d >= 1) {
                        float c2 = c(motionEvent);
                        float d2 = d(motionEvent);
                        a(motionEvent.getEventTime(), this.m.f6782a, c2, d2, a(motionEvent), b(motionEvent));
                        f fVar2 = this.n;
                        float f2 = c2 - fVar2.b;
                        float f3 = d2 - fVar2.c;
                        float eventTime = f2 / (motionEvent.getEventTime() - this.n.d);
                        float eventTime2 = f3 / (motionEvent.getEventTime() - this.n.d);
                        w4 w4Var2 = this.f6775a;
                        if (w4Var2 != null && w4Var2.i()) {
                            if (Math.abs(f2) > Math.abs(f3) && Math.abs(f2) > 100.0d && Math.abs(eventTime) > 20.0d) {
                                eVar = f2 > 0.0f ? e.ESWIPE_RIGHT : e.ESWIPE_LEFT;
                            } else if (Math.abs(f3) > Math.abs(f2) && Math.abs(f3) > 100.0d && Math.abs(eventTime2) > 20.0d) {
                                eVar = f3 > 0.0f ? e.ESWIPE_DOWN : e.ESWIPE_UP;
                            }
                            this.t = eVar;
                            this.i = d.EStatSwipe;
                        }
                        f fVar3 = this.n;
                        fVar3.b = c2;
                        fVar3.c = d2;
                        fVar3.d = motionEvent.getEventTime();
                        return;
                    }
                    return;
                }
            }
            this.i = d.EStatUnknown;
        } catch (Exception unused) {
            Log.e("ARPTouchInput", "Monkey event.getX Exception");
        }
    }

    public final void p(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.i = d.EStatUnknown;
                return;
            }
        }
        a(motionEvent.getEventTime(), this.m.f6782a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
        this.m.b = c(motionEvent);
        this.m.c = d(motionEvent);
        this.n.d = motionEvent.getEventTime();
    }

    public final void q(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            l(motionEvent);
            return;
        }
        if (actionMasked == 1) {
            y(motionEvent);
        } else if (actionMasked == 2) {
            w(motionEvent);
        } else {
            if (actionMasked != 5) {
                return;
            }
            x(motionEvent);
        }
    }

    public final void r(MotionEvent motionEvent) {
        if (1 == motionEvent.getActionMasked()) {
            a(motionEvent.getEventTime(), this.m.f6782a, this.t.ordinal());
        }
    }

    public final void s(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (2 != motionEvent.getActionMasked()) {
            this.i = d.EStatUnknown;
            return;
        }
        float c2 = c(motionEvent);
        float d2 = d(motionEvent);
        float g2 = g(motionEvent);
        float h = h(motionEvent);
        f fVar = this.m;
        double a2 = a(fVar.b, fVar.c, c2, d2);
        f fVar2 = this.o;
        double a3 = a(fVar2.b, fVar2.c, g2, h);
        if ((a2 > 50.0d || a3 > 50.0d) && a2 > 20.0d && a3 > 20.0d) {
            f fVar3 = this.m;
            float f4 = fVar3.b;
            float f5 = fVar3.c;
            f fVar4 = this.o;
            double a4 = a(f4, f5, c2, d2, fVar4.b, fVar4.c, g2, h);
            if (a4 >= 0.7853981633974483d) {
                if (a4 > 3.141592653589793d || a4 <= 1.5707963267948966d) {
                    f2 = c2;
                    g2 = g2;
                    h = h;
                    f3 = d2;
                } else {
                    f fVar5 = this.m;
                    float f6 = fVar5.b;
                    f fVar6 = this.o;
                    float f7 = (fVar6.b + f6) / 2.0f;
                    float f8 = fVar5.c;
                    float f9 = (fVar6.c + f8) / 2.0f;
                    double a5 = a(f7, f9, f6, f8, f6, f8, c2, d2);
                    f2 = c2;
                    f fVar7 = this.o;
                    float f10 = fVar7.b;
                    float f11 = fVar7.c;
                    g2 = g2;
                    f3 = d2;
                    h = h;
                    double a6 = a(f7, f9, f10, f11, f10, f11, g2, h);
                    if (Math.abs(a5 - 1.5707963267948966d) < 0.6283185307179586d || Math.abs(a6 - 1.5707963267948966d) < 0.6283185307179586d) {
                        this.i = d.EStatTwoFingersRotate;
                        f fVar8 = this.n;
                        fVar8.b = f2;
                        fVar8.c = f3;
                        fVar8.d = motionEvent.getEventTime();
                        f fVar9 = this.p;
                        fVar9.b = g2;
                        fVar9.c = h;
                        fVar9.d = motionEvent.getEventTime();
                    }
                }
                this.i = d.EStatPinchAndUnpinch;
                this.f6776q = a(f2, f3, g2, h);
                f fVar82 = this.n;
                fVar82.b = f2;
                fVar82.c = f3;
                fVar82.d = motionEvent.getEventTime();
                f fVar92 = this.p;
                fVar92.b = g2;
                fVar92.c = h;
                fVar92.d = motionEvent.getEventTime();
            }
            this.i = d.EStatTwoFingersScroll;
            a(motionEvent.getDownTime(), this.m.f6782a, c2, d2, a(motionEvent), b(motionEvent), this.o.f6782a, g2, h, e(motionEvent), f(motionEvent));
            d2 = d2;
            Log.d("ARPTouchInput", "EStatTwoFingersScroll");
            f2 = c2;
            g2 = g2;
            h = h;
        } else {
            f2 = c2;
        }
        f3 = d2;
        f fVar822 = this.n;
        fVar822.b = f2;
        fVar822.c = f3;
        fVar822.d = motionEvent.getEventTime();
        f fVar922 = this.p;
        fVar922.b = g2;
        fVar922.c = h;
        fVar922.d = motionEvent.getEventTime();
    }

    public final void t(MotionEvent motionEvent) {
        if (2 != motionEvent.getActionMasked()) {
            if (1 == motionEvent.getActionMasked()) {
                c();
                return;
            } else {
                this.i = d.EStatUnknown;
                return;
            }
        }
        float c2 = c(motionEvent);
        float d2 = d(motionEvent);
        float g2 = g(motionEvent);
        float h = h(motionEvent);
        float f2 = this.p.b;
        f fVar = this.m;
        a(motionEvent.getEventTime(), this.m.f6782a, c2, d2, this.o.f6782a, g2, h, (float) a(f2 - fVar.b, r1.c - fVar.c, g2 - c2, h - d2));
        f fVar2 = this.m;
        fVar2.b = c2;
        fVar2.c = d2;
        this.n.d = motionEvent.getEventTime();
        f fVar3 = this.p;
        fVar3.b = g2;
        fVar3.c = h;
        fVar3.d = motionEvent.getEventTime();
    }

    public final void u(MotionEvent motionEvent) {
        if (5 != motionEvent.getActionMasked()) {
            if (6 == motionEvent.getActionMasked()) {
                this.i = d.EStatScroll;
                int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >>> 8;
                f fVar = this.m;
                if (action == fVar.f6782a) {
                    a(this.o, fVar);
                    a(this.p, this.n);
                }
                a();
                return;
            }
            if (2 == motionEvent.getActionMasked()) {
                if (motionEvent.getEventTime() - this.n.d < 1 || motionEvent.getEventTime() - this.p.d < 1) {
                    return;
                }
                float c2 = c(motionEvent);
                float d2 = d(motionEvent);
                float g2 = g(motionEvent);
                float h = h(motionEvent);
                a(motionEvent.getEventTime(), this.m.f6782a, c2, d2, a(motionEvent), b(motionEvent), this.o.f6782a, g2, h, e(motionEvent), f(motionEvent));
                f fVar2 = this.m;
                fVar2.b = c2;
                fVar2.c = d2;
                this.n.d = motionEvent.getEventTime();
                f fVar3 = this.p;
                fVar3.b = g2;
                fVar3.c = h;
                fVar3.d = motionEvent.getEventTime();
                return;
            }
        }
        this.i = d.EStatUnknown;
    }

    public final void v(MotionEvent motionEvent) {
        if (1 == motionEvent.getActionMasked()) {
            c();
        }
    }

    public final void w(MotionEvent motionEvent) {
        f fVar = this.m;
        double a2 = a(fVar.b, fVar.c, motionEvent.getX(), motionEvent.getY());
        Log.d("ARPTouchInput", "touchMoveInSingleFingerCandidate() distance = " + a2);
        if (a2 < 20.0d) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > 600) {
                this.i = d.EStatLongPress;
                b(motionEvent.getDownTime(), this.m.f6782a, motionEvent.getX(), motionEvent.getY());
                this.b.removeMessages(1);
            }
        } else if (a2 < 50.0d) {
            this.l = false;
        } else {
            g();
            this.i = d.EStatScroll;
            a(motionEvent.getEventTime(), this.m.f6782a, motionEvent.getX(), motionEvent.getY(), a(motionEvent), b(motionEvent));
            this.b.removeMessages(1);
        }
        this.n.a(motionEvent, 0);
    }

    public final void x(MotionEvent motionEvent) {
        d dVar;
        Log.d("ARPTouchInput", "touchPointerDownInSingleFingerCandidate() mFirstFingnerInClickArea = " + this.l);
        if (this.l) {
            this.o.a(motionEvent, motionEvent.getActionIndex());
            a(this.o, this.p);
            dVar = d.EStatTwoFingersCandidate;
        } else {
            dVar = d.EStatUnknown;
        }
        this.i = dVar;
        g();
    }

    public final void y(MotionEvent motionEvent) {
        long downTime;
        int pointerId;
        f fVar = this.m;
        if (a(fVar.b, fVar.c, motionEvent.getX(), motionEvent.getY()) < 20.0d && motionEvent.getEventTime() - motionEvent.getDownTime() < 300) {
            w4 w4Var = this.f6775a;
            if (w4Var == null || !w4Var.d()) {
                downTime = motionEvent.getDownTime();
                pointerId = motionEvent.getPointerId(0);
            } else if (this.b.hasMessages(2)) {
                this.b.removeMessages(2);
                long downTime2 = motionEvent.getDownTime();
                pointerId = motionEvent.getPointerId(0);
                downTime = downTime2;
            } else {
                Message obtain = Message.obtain();
                obtain.what = 2;
                f fVar2 = new f(this, null);
                fVar2.a(motionEvent, 0);
                obtain.obj = fVar2;
                this.j = fVar2;
                this.b.sendMessageDelayed(obtain, 400L);
            }
            a(downTime, pointerId, motionEvent.getX(), motionEvent.getY());
        }
        c();
    }
}
