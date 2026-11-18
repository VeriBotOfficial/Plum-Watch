package com.amap.api.col.p0003sl;

/* JADX INFO: compiled from: UpdateStrategy.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    mc f1779a;

    public mc() {
    }

    public void a(boolean z) {
        mc mcVar = this.f1779a;
        if (mcVar != null) {
            mcVar.a(z);
        }
    }

    public boolean b() {
        mc mcVar = this.f1779a;
        if (mcVar != null ? mcVar.b() : true) {
            return c();
        }
        return false;
    }

    protected abstract boolean c();

    public mc(mc mcVar) {
        this.f1779a = mcVar;
    }

    public int a() {
        mc mcVar = this.f1779a;
        return Math.min(Integer.MAX_VALUE, mcVar != null ? mcVar.a() : Integer.MAX_VALUE);
    }

    public void a(int r2) {
        mc mcVar = this.f1779a;
        if (mcVar != null) {
            mcVar.a(r2);
        }
    }
}
