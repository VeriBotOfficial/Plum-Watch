package com.baidu.ar;

import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes12.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7240a;
    public float b;
    public float[] c = new float[16];
    public Vector4f d = new Vector4f();
    public Vector4f e = new Vector4f();
    public float[] f = new float[4];
    public float[] g = new float[16];
    public float[] h = new float[16];

    public final void a() {
        float[] fArr = new float[16];
        Matrix.invertM(fArr, 0, this.c, 0);
        Vector4f a2 = td.a(new float[]{0.0f, 0.0f, 0.0f, 1.0f});
        a2.subtract(this.d);
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, fArr, 0, a2.toArray(), 0);
        Vector4f a3 = td.a(fArr2);
        a3.subdivide(td.a(this.f));
        a3.setY(-a3.getY());
        a3.setX(-a3.getX());
        a3.add(this.e);
        float[] fArr3 = {a3.getX(), a3.getY()};
        this.e = new Vector4f(a3.getX(), a3.getY(), 0.0f, 1.0f);
        this.d = new Vector4f(0.0f, 0.0f, 0.0f, 1.0f);
        this.f = a(fArr3);
        float[] fArr4 = new float[16];
        Matrix.invertM(fArr4, 0, this.c, 0);
        float[] fArr5 = this.f;
        float[] fArr6 = new float[16];
        Matrix.multiplyMM(fArr6, 0, u8.a(new Vector4f(1.0f / (-fArr5[0]), 1.0f / (-fArr5[1]), 1.0f, 1.0f)), 0, fArr4, 0);
        float[] fArr7 = {fArr6[0], fArr6[1], fArr6[2], fArr6[3], fArr6[4], fArr6[5], fArr6[6], fArr6[7], fArr6[8], fArr6[9], fArr6[10], fArr6[11], this.e.getX(), this.e.getY(), this.e.getZ(), 1.0f};
        this.h = fArr7;
        Matrix.invertM(this.g, 0, fArr7, 0);
    }

    public void a(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        this.c = fArr;
        this.d = td.a(fArr2);
        this.e = td.a(fArr3);
        this.f = fArr4;
        a();
        b();
    }

    public final float[] a(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float[] fArr2 = {f, f2};
        float[] fArr3 = {f, f2 + 1.0f};
        float[] fArr4 = {f + 1.0f, f2};
        return new float[]{u8.a(fArr4[0], fArr4[1], fArr2[0], fArr2[1]), u8.a(fArr3[0], fArr3[1], fArr2[0], fArr2[1]), 0.0f, 1.0f};
    }

    public final void b() {
        float[] fArr = this.g;
        float[] fArr2 = {r3[0], r3[1], r3[2], r3[3], r1[0], r1[1], r1[2], r1[3], r1[0], r1[1], r1[2], r1[3], 0.0f, 0.0f, 0.0f, 1.0f};
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        float[] f = f(new float[]{fArr2[1], fArr2[2], fArr2[3], fArr2[4]});
        float[] f2 = f(new float[]{fArr2[4], fArr2[5], fArr2[6], fArr2[7]});
        float[] f3 = f(new float[]{fArr2[8], fArr2[9], fArr2[10], fArr2[11]});
        float[] fArr3 = new float[4];
        Matrix.multiplyMV(fArr3, 0, fArr2, 0, new Vector4f(0.0f, 1.0f, 0.0f, 1.0f).toArray(), 0);
        float[] e = e(new float[]{fArr3[0], fArr3[1]});
        float f4 = e[0];
        double d = 0.0d;
        if (f4 != 0.0f || e[1] >= 0.0f) {
            if (f4 == 0.0f && e[1] > 0.0f) {
                d = 3.141592653589793d;
            } else if (f4 > 0.0f && e[1] == 0.0f) {
                d = 1.5707963267948966d;
            } else if (f4 >= 0.0f || e[1] != 0.0f) {
                if (f4 > 0.0f) {
                    if (e[1] < 0.0f) {
                        d = Math.atan(f4 / (-r3));
                    }
                }
                if (f4 > 0.0f) {
                    if (e[1] > 0.0f) {
                        d = Math.atan(r3 / f4) + 1.5707963267948966d;
                    }
                }
                if (f4 < 0.0f) {
                    if (e[1] > 0.0f) {
                        d = Math.atan((-f4) / r3) + 3.141592653589793d;
                    }
                }
                if (f4 < 0.0f) {
                    if (e[1] < 0.0f) {
                        d = Math.atan(r1 / f4) + 4.71238898038469d;
                    }
                }
            } else {
                d = 4.71238898038469d;
            }
        }
        Log.e("GeoLocalTransform", "angle: " + ((d / 3.141592653589793d) * 180.0d));
    }

    public void b(float[] fArr) {
        this.g = fArr;
        Matrix.invertM(this.h, 0, fArr, 0);
        b();
    }

    public float[] c(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[1], 0.0f, 1.0f};
        float[] fArr3 = this.g;
        Vector4f a2 = td.a(fArr2);
        v8.a(new double[]{fArr3[0], fArr3[1], fArr3[2], fArr3[3], fArr3[4], fArr3[5], fArr3[6], fArr3[7], fArr3[8], fArr3[9], fArr3[10], fArr3[11], fArr3[12], fArr3[13], fArr3[14], fArr3[15]}, a2);
        return a2.toArray();
    }

    public float[] d(float[] fArr) {
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, this.h, 0, fArr, 0);
        return new float[]{fArr2[0], fArr2[1]};
    }

    public final float[] e(float[] fArr) {
        float sqrt = (float) Math.sqrt(Math.pow(fArr[0], 2.0d) + Math.pow(fArr[1], 2.0d));
        return new float[]{fArr[0] / sqrt, fArr[1] / sqrt};
    }

    public final float[] f(float[] fArr) {
        float sqrt = (float) Math.sqrt(Math.pow(fArr[0], 2.0d) + Math.pow(fArr[1], 2.0d) + Math.pow(fArr[2], 2.0d) + Math.pow(fArr[3], 2.0d));
        return new float[]{fArr[0] / sqrt, fArr[1] / sqrt, fArr[2] / sqrt, fArr[3] / sqrt};
    }
}
