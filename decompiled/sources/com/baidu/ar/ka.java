package com.baidu.ar;

import android.content.Context;
import android.opengl.Matrix;

/* loaded from: classes12.dex */
public class ka extends g1 {
    public float[] g;
    public float[] h;
    public float[] i;
    public float[] j;
    public long k;
    public int l;

    public ka(Context context) {
        super("IMU", com.baidu.ar.vps.marker.a.Local3Dof.f7285a);
        this.k = 20L;
        float[] fArr = new float[16];
        this.g = fArr;
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(this.g, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        this.h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(this.h, 0, 180.0f, 0.0f, 0.0f, 1.0f);
        float[] fArr3 = new float[16];
        this.i = fArr3;
        Matrix.multiplyMM(fArr3, 0, this.h, 0, this.g, 0);
    }

    @Override // com.baidu.ar.g1, com.baidu.ar.g6
    public boolean d() {
        return this.f6940a;
    }

    public float[] d(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[8], 0.0f, fArr[1], fArr[5], fArr[9], 0.0f, fArr[2], fArr[6], fArr[10], 0.0f, fArr[3], fArr[7], fArr[11], 1.0f};
        this.f6940a = true;
        this.l++;
        float[] fArr3 = new float[16];
        this.j = fArr3;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(this.j, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr4 = new float[16];
        Matrix.multiplyMM(fArr4, 0, this.j, 0, fArr2, 0);
        Matrix.multiplyMM(this.c, 0, this.i, 0, fArr4, 0);
        v vVar = this.e;
        if (vVar != null && this.l >= this.k) {
            vVar.a();
            this.e = null;
        }
        u6 u6Var = this.f;
        if (u6Var != null) {
            u6Var.a(this);
        }
        return this.c;
    }
}
