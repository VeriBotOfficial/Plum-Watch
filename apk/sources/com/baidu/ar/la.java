package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class la {
    public static la f;
    public static la g;
    public static la h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7065a;
    public int b;
    public float[] c;
    public float[] d;
    public boolean e;

    static {
        la laVar = new la();
        f = laVar;
        laVar.f7065a = 1280;
        laVar.b = 720;
        laVar.c = new float[]{1110.8284f, 0.0f, 640.0f, 0.0f, 1111.2183f, 360.0f, 0.0f, 0.0f, 1.0f};
        laVar.d = new float[]{1.0E-5f, 0.0f, 0.0f, 0.0f, 0.0f};
        la laVar2 = new la();
        g = laVar2;
        laVar2.f7065a = 640;
        laVar2.b = 480;
        f.e = true;
        laVar2.c = new float[]{594.25995f, 0.0f, 313.4141f, 0.0f, 594.826f, 237.53111f, 0.0f, 0.0f, 1.0f};
        laVar2.d = new float[]{0.184825f, -0.433983f, -0.003168f, -0.010542f, 0.0f};
        la laVar3 = new la();
        h = laVar3;
        laVar3.f7065a = 640;
        laVar3.b = 360;
        laVar3.c = new float[]{585.7661f, 0.0f, 310.29126f, 0.0f, 585.70685f, 174.72643f, 0.0f, 0.0f, 1.0f};
        laVar3.d = new float[]{0.170531f, -0.380857f, -0.005316f, 0.011078f, 0.0f};
    }

    public la() {
    }

    public la(int r1, int r2) {
        this.f7065a = r1;
        this.b = r2;
    }

    public static la a(int r5, int r6) {
        la laVar;
        la laVar2 = new la(r5, r6);
        float f2 = r5;
        float f3 = f2 / r6;
        la laVar3 = f;
        if (Math.abs(f3 - (laVar3.f7065a / laVar3.b)) < 0.03d) {
            laVar = f;
        } else {
            la laVar4 = g;
            if (Math.abs(f3 - (laVar4.f7065a / laVar4.b)) >= 0.03d) {
                return laVar2;
            }
            laVar = g;
        }
        laVar2.a(laVar, f2 / laVar.f7065a);
        return laVar2;
    }

    public static la a(int r4, int r5, boolean z) {
        if (!z) {
            return a(r4, r5);
        }
        la laVar = new la(r4, r5);
        float f2 = r4;
        la laVar2 = h;
        if (Math.abs((f2 / r5) - (laVar2.f7065a / laVar2.b)) < 0.03d) {
            la laVar3 = h;
            laVar.a(laVar3, f2 / laVar3.f7065a);
        }
        return laVar;
    }

    public final void a(la laVar, float f2) {
        this.c = new float[9];
        this.d = new float[5];
        for (int r2 = 0; r2 < 8; r2++) {
            this.c[r2] = laVar.c[r2] * f2;
        }
        for (int r1 = 0; r1 < 5; r1++) {
            this.d[r1] = laVar.d[r1];
        }
    }

    public float[] a() {
        return this.c;
    }

    public float[] b() {
        return this.d;
    }

    public float c() {
        return 1.0f;
    }
}
