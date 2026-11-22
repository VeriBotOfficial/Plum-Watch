package com.baidu.ar;

/* loaded from: classes12.dex */
public class y2 implements s6 {
    public static final float[] d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public c7 f7342a;
    public int b;
    public int c;

    public y2(c7 c7Var, int i, int i2) {
        this.f7342a = c7Var;
        this.b = i;
        this.c = i2;
    }

    @Override // com.baidu.ar.s6
    public boolean a(float[] fArr) {
        c7 c7Var = this.f7342a;
        c7Var.a(c7Var.a((nd) null), this.b / 2, this.c / 2, d, 1000.0f);
        return true;
    }
}
