package com.amap.api.col.p0003sl;

/* compiled from: AbstractCityStateImp.java */
/* loaded from: classes11.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    protected int f1581a;
    protected z1 b;

    public c3(int i, z1 z1Var) {
        this.f1581a = i;
        this.b = z1Var;
    }

    public boolean a(c3 c3Var) {
        return c3Var.f1581a == this.f1581a;
    }

    public void b(c3 c3Var) {
        String str = this.f1581a + " ==> " + c3Var.f1581a + "   " + getClass() + "==>" + c3Var.getClass();
    }

    public void c() {
        String str = "Wrong call delete()  State: " + this.f1581a + "  " + getClass();
    }

    public abstract void d();

    public int e() {
        return this.f1581a;
    }

    public void f() {
        String str = "Wrong call hasNew()  State: " + this.f1581a + "  " + getClass();
    }

    public void g() {
        String str = "Wrong call pause()  State: " + this.f1581a + "  " + getClass();
    }

    public void h() {
        String str = "Wrong call start()  State: " + this.f1581a + "  " + getClass();
    }

    public void a(int i) {
        String str = "Wrong call fail()  State: " + this.f1581a + "  " + getClass();
    }

    public void a() {
        String str = "Wrong call complete()  State: " + this.f1581a + "  " + getClass();
    }

    public void b() {
        String str = "Wrong call continueDownload()  State: " + this.f1581a + "  " + getClass();
    }
}
