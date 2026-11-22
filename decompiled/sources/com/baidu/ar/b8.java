package com.baidu.ar;

import android.opengl.Matrix;
import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes12.dex */
public class b8 implements f6 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f6805a = new float[16];
    public Vector4f b = new Vector4f();
    public Vector4f c = new Vector4f();
    public float[] d = new float[16];

    @Override // com.baidu.ar.f6
    public void a(float[] fArr, float[] fArr2, float[] fArr3) {
        this.f6805a = fArr;
        this.b = td.a(fArr2);
        this.c = td.a(fArr3);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] b = u8.b(fArr4);
        Vector4f c = u8.c(fArr4);
        float[] fArr5 = new float[16];
        Matrix.multiplyMM(fArr5, 0, this.f6805a, 0, b, 0);
        c.add(u8.b(this.c));
        float[] fArr6 = new float[4];
        Matrix.multiplyMV(fArr6, 0, this.f6805a, 0, c.toArray(), 0);
        Vector4f a2 = td.a(fArr6);
        a2.add(this.b);
        fArr5[12] = a2.getX();
        fArr5[13] = a2.getY();
        fArr5[14] = a2.getZ();
        this.d = fArr5;
    }

    @Override // com.baidu.ar.f6
    public float[] a() {
        return this.d;
    }

    @Override // com.baidu.ar.f6
    public float[] a(float[] fArr) {
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, this.d, 0, fArr, 0);
        return fArr2;
    }
}
