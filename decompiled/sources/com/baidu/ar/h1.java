package com.baidu.ar;

import android.opengl.Matrix;

/* loaded from: classes12.dex */
public class h1 extends g1 implements z5 {
    public float[] g;

    public h1(String str, int i) {
        super(str, i);
        this.g = new float[16];
    }

    @Override // com.baidu.ar.z5
    public boolean a() {
        return false;
    }

    public float[] f() {
        if (this.b == null) {
            return this.g;
        }
        float[] fArr = new float[16];
        Matrix.invertM(fArr, 0, this.g, 0);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.b.a(), 0);
        float[] fArr3 = new float[16];
        Matrix.invertM(fArr3, 0, fArr2, 0);
        return fArr3;
    }
}
