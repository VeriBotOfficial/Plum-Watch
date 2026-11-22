package com.baidu.ar;

/* loaded from: classes12.dex */
public class w9 extends f1 {
    public u6 g;

    public w9(String str, int i) {
        super(str, i);
    }

    public void a(float f, float f2) {
        this.d = true;
        this.e = f;
        this.f = f2;
        u6 u6Var = this.g;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }

    public void a(ja jaVar) {
        this.b = true;
        this.c = jaVar;
        u6 u6Var = this.g;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }

    public void a(u6 u6Var) {
        this.g = u6Var;
    }
}
