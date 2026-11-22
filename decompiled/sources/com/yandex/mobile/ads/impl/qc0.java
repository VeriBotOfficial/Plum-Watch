package com.yandex.mobile.ads.impl;

import android.opengl.Matrix;

/* loaded from: classes5.dex */
final class qc0 {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f16652a = new float[16];
    private final float[] b = new float[16];
    private final h52<float[]> c = new h52<>();
    private boolean d;

    public final void b(long j, float[] fArr) {
        this.c.a(fArr, j);
    }

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    public final void a(long j, float[] fArr) {
        float[] b = this.c.b(j);
        if (b == null) {
            return;
        }
        float[] fArr2 = this.b;
        float f = b[0];
        float f2 = -b[1];
        float f3 = -b[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr2, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            Matrix.setIdentityM(fArr2, 0);
        }
        if (!this.d) {
            a(this.f16652a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f16652a, 0, this.b, 0);
    }

    public final void a() {
        this.c.a();
        this.d = false;
    }
}
