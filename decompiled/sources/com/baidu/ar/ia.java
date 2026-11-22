package com.baidu.ar;

import android.opengl.Matrix;

/* loaded from: classes12.dex */
public class ia extends g1 {
    public float[] g;
    public float[] h;
    public float[] i;
    public long j;
    public int k;
    public boolean l;
    public float[] m;

    public ia(String str, int i) {
        super(str, i);
        this.j = 20L;
        this.l = true;
        this.m = new float[]{0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr = new float[16];
        this.g = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(this.g, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        this.h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.h, 0, 180.0f, 0.0f, 0.0f, 1.0f);
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, this.h, 0, this.g, 0);
        float[] fArr4 = new float[16];
        this.i = fArr4;
        Matrix.multiplyMM(fArr4, 0, this.h, 0, fArr3, 0);
    }

    public float[] a(int i, float[] fArr) {
        this.k++;
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.m, 0);
        float[] fArr3 = new float[16];
        this.c = fArr3;
        Matrix.multiplyMM(fArr3, 0, this.i, 0, fArr2, 0);
        boolean z = this.l;
        if (z && i == 0 && this.k >= this.j) {
            this.l = !z;
            this.f6940a = true;
            this.e.a();
            this.e = null;
        }
        u6 u6Var = this.f;
        if (u6Var != null) {
            u6Var.a(this);
        }
        return this.c;
    }

    @Override // com.baidu.ar.g1
    public void e() {
        super.e();
        this.l = true;
        this.f6940a = false;
        this.f = null;
    }
}
