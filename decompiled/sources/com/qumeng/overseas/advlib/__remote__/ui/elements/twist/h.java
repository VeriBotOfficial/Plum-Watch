package com.qumeng.overseas.advlib.__remote__.ui.elements.twist;

import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.math.BigDecimal;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes17.dex */
public class h {
    public static final float o = 1.0E-9f;
    private static final float p = 1.0E-9f;

    /* renamed from: q, reason: collision with root package name */
    public static final long f13134q = 1;
    public static final long r = 1;
    public static final float s = 0.98f;
    private float i;
    private Timer k;
    private b l;
    private boolean m;
    private double n;

    /* renamed from: a, reason: collision with root package name */
    private final float[] f13135a = new float[3];
    private float[] b = new float[9];
    private final float[] c = new float[3];
    private final float[] d = new float[3];
    private final float[] e = new float[3];
    private final float[] f = new float[3];
    private final float[] g = new float[3];
    private final float[] h = new float[9];
    private boolean j = true;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.m) {
                n.c(g.y0, "停止角度计算", new Object[0]);
                return;
            }
            double doubleValue = BigDecimal.valueOf(Math.abs(Math.toDegrees(h.this.g[2]))).setScale(2, 4).doubleValue();
            if (Math.toDegrees(h.this.g[1]) >= -75.0d && Math.toDegrees(h.this.g[1]) <= 0.0d) {
                h.this.n = doubleValue;
            }
            h.this.l.degree(h.this.n);
            com.qumeng.overseas.advlib.__remote__.utils.j.a(this, 15L);
        }
    }

    interface b {
        void degree(double d);
    }

    class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            double d;
            double d2;
            double d3;
            if (h.this.c[0] < -1.5707963267948966d) {
                d = 0.9800000190734863d;
                if (h.this.f[0] > 0.0d) {
                    d2 = -1.5707963267948966d;
                    h.this.g[0] = (float) (((h.this.c[0] + 6.283185307179586d) * 0.9800000190734863d) + (h.this.f[0] * 0.01999998f));
                    h.this.g[0] = (float) (r1[0] - (((double) h.this.g[0]) > 3.141592653589793d ? 6.283185307179586d : 0.0d));
                    d3 = 3.141592653589793d;
                    if (h.this.c[1] >= d2 && h.this.f[1] > 0.0d) {
                        h.this.g[1] = (float) (((h.this.c[1] + 6.283185307179586d) * d) + (h.this.f[1] * 0.01999998f));
                        h.this.g[1] = (float) (r1[1] - (((double) h.this.g[1]) > d3 ? 6.283185307179586d : 0.0d));
                    } else if (h.this.f[1] < d2 || h.this.c[1] <= 0.0d) {
                        h.this.g[1] = (h.this.c[1] * 0.98f) + (h.this.f[1] * 0.01999998f);
                    } else {
                        h.this.g[1] = (float) ((h.this.c[1] * 0.98f) + (0.01999998f * (h.this.f[1] + 6.283185307179586d)));
                        h.this.g[1] = (float) (r1[1] - (((double) h.this.g[1]) > d3 ? 6.283185307179586d : 0.0d));
                    }
                    if (h.this.c[2] >= d2 && h.this.f[2] > 0.0d) {
                        h.this.g[2] = (float) (((h.this.c[2] + 6.283185307179586d) * d) + (0.01999998f * h.this.f[2]));
                        h.this.g[2] = (float) (r1[2] - (((double) h.this.g[2]) <= d3 ? 0.0d : 6.283185307179586d));
                    } else if (h.this.f[2] < d2 || h.this.c[2] <= 0.0d) {
                        h.this.g[2] = (h.this.c[2] * 0.98f) + (0.01999998f * h.this.f[2]);
                    } else {
                        h.this.g[2] = (float) ((h.this.c[2] * 0.98f) + (0.01999998f * (h.this.f[2] + 6.283185307179586d)));
                        h.this.g[2] = (float) (r1[2] - (((double) h.this.g[2]) <= d3 ? 0.0d : 6.283185307179586d));
                    }
                    h hVar = h.this;
                    hVar.b = hVar.a(hVar.g);
                    System.arraycopy(h.this.g, 0, h.this.c, 0, 3);
                }
            } else {
                d = 0.9800000190734863d;
            }
            d2 = -1.5707963267948966d;
            if (h.this.f[0] >= -1.5707963267948966d || h.this.c[0] <= 0.0d) {
                d3 = 3.141592653589793d;
                h.this.g[0] = (h.this.c[0] * 0.98f) + (h.this.f[0] * 0.01999998f);
            } else {
                d3 = 3.141592653589793d;
                h.this.g[0] = (float) ((h.this.c[0] * 0.98f) + (0.01999998f * (h.this.f[0] + 6.283185307179586d)));
                h.this.g[0] = (float) (r1[0] - (((double) h.this.g[0]) > 3.141592653589793d ? 6.283185307179586d : 0.0d));
            }
            if (h.this.c[1] >= d2) {
            }
            if (h.this.f[1] < d2) {
            }
            h.this.g[1] = (h.this.c[1] * 0.98f) + (h.this.f[1] * 0.01999998f);
            if (h.this.c[2] >= d2) {
            }
            if (h.this.f[2] < d2) {
            }
            h.this.g[2] = (h.this.c[2] * 0.98f) + (0.01999998f * h.this.f[2]);
            h hVar2 = h.this;
            hVar2.b = hVar2.a(hVar2.g);
            System.arraycopy(h.this.g, 0, h.this.c, 0, 3);
        }
    }

    private void c() {
        float[] fArr = this.c;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        float[] fArr2 = this.b;
        fArr2[0] = 1.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 1.0f;
        fArr2[5] = 0.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 0.0f;
        fArr2[8] = 1.0f;
    }

    public void d() {
        this.j = false;
        this.m = true;
        Timer timer = this.k;
        if (timer != null) {
            timer.cancel();
            this.k.purge();
        }
    }

    public void b(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            System.arraycopy(sensorEvent.values, 0, this.e, 0, 3);
            b();
        } else if (type == 2) {
            System.arraycopy(sensorEvent.values, 0, this.d, 0, 3);
        } else {
            if (type != 4) {
                return;
            }
            a(sensorEvent);
        }
    }

    public void a(b bVar) {
        this.l = bVar;
    }

    private void a(float[] fArr, float[] fArr2, float f) {
        float[] fArr3 = new float[3];
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3) + (f4 * f4));
        if (sqrt > 1.0E-9f) {
            fArr3[0] = fArr[0] / sqrt;
            fArr3[1] = fArr[1] / sqrt;
            fArr3[2] = fArr[2] / sqrt;
        }
        double d = sqrt * f;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        fArr2[0] = fArr3[0] * sin;
        fArr2[1] = fArr3[1] * sin;
        fArr2[2] = sin * fArr3[2];
        fArr2[3] = cos;
    }

    public void b() {
        if (SensorManager.getRotationMatrix(this.h, null, this.e, this.d)) {
            SensorManager.getOrientation(this.h, this.f);
        }
    }

    public void a(SensorEvent sensorEvent) {
        if (this.j) {
            float[] a2 = a(this.f);
            SensorManager.getOrientation(a2, new float[3]);
            this.b = a(this.b, a2);
            this.j = false;
        }
        float[] fArr = new float[4];
        float f = this.i;
        if (f != 0.0f) {
            System.arraycopy(sensorEvent.values, 0, this.f13135a, 0, 3);
            a(this.f13135a, fArr, ((sensorEvent.timestamp - f) * 1.0E-9f) / 2.0f);
        }
        this.i = sensorEvent.timestamp;
        float[] fArr2 = new float[9];
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        float[] a3 = a(this.b, fArr2);
        this.b = a3;
        SensorManager.getOrientation(a3, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float[] a(float[] fArr) {
        float sin = (float) Math.sin(fArr[1]);
        float cos = (float) Math.cos(fArr[1]);
        float sin2 = (float) Math.sin(fArr[2]);
        float cos2 = (float) Math.cos(fArr[2]);
        float sin3 = (float) Math.sin(fArr[0]);
        float cos3 = (float) Math.cos(fArr[0]);
        return a(new float[]{cos3, sin3, 0.0f, -sin3, cos3, 0.0f, 0.0f, 0.0f, 1.0f}, a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, cos, sin, 0.0f, -sin, cos}, new float[]{cos2, 0.0f, sin2, 0.0f, 1.0f, 0.0f, -sin2, 0.0f, cos2}));
    }

    private float[] a(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[3];
        float f5 = fArr[2];
        float f6 = fArr2[6];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr2[1];
        float f9 = fArr2[4];
        float f10 = fArr2[7];
        float f11 = (f * f8) + (f3 * f9) + (f5 * f10);
        float f12 = fArr2[2];
        float f13 = fArr2[5];
        float f14 = fArr2[8];
        float f15 = (f * f12) + (f3 * f13) + (f5 * f14);
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = (f16 * f2) + (f17 * f4) + (f18 * f6);
        float f20 = (f16 * f8) + (f17 * f9) + (f18 * f10);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr[6];
        float f23 = fArr[7];
        float f24 = (f2 * f22) + (f4 * f23);
        float f25 = fArr[8];
        return new float[]{f7, f11, f15, f19, f20, f21, f24 + (f6 * f25), (f8 * f22) + (f9 * f23) + (f10 * f25), (f22 * f12) + (f23 * f13) + (f25 * f14)};
    }

    public void a() {
        c();
        this.m = false;
        this.j = true;
        Timer timer = new Timer();
        this.k = timer;
        timer.scheduleAtFixedRate(new c(), 1L, 1L);
        com.qumeng.overseas.advlib.__remote__.utils.j.a(new a(), 800L);
    }
}
