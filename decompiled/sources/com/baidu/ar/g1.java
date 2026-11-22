package com.baidu.ar;

/* loaded from: classes12.dex */
public class g1 implements g6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6940a;
    public f6 b;
    public float[] c = new float[16];
    public int d;
    public v e;
    public u6 f;

    public g1(String str, int i) {
        this.d = i;
    }

    public void a(u6 u6Var) {
        this.f = u6Var;
    }

    public void a(v vVar) {
        this.e = vVar;
    }

    @Override // com.baidu.ar.g6
    public void b(float[] fArr) {
        if (this.b == null) {
            this.b = new b8();
        }
        this.b.a(u8.a(fArr, this.c), u8.c(fArr).toArray(), u8.c(this.c).toArray());
    }

    @Override // com.baidu.ar.g6
    public float[] b() {
        f6 f6Var = this.b;
        return f6Var != null ? f6Var.a(this.c) : this.c;
    }

    @Override // com.baidu.ar.t6
    public int c() {
        return this.d;
    }

    @Override // com.baidu.ar.g6
    public boolean d() {
        return this.f6940a;
    }

    public void e() {
        this.f6940a = false;
    }
}
