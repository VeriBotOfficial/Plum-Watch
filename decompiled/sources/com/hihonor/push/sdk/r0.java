package com.hihonor.push.sdk;

/* loaded from: classes11.dex */
public final class r0<TResult> implements j0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public l0<TResult> f10155a;
    public final Object b = new Object();

    public r0(l0<TResult> l0Var) {
        this.f10155a = l0Var;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(v0<TResult> v0Var) {
        synchronized (this.b) {
            l0<TResult> l0Var = this.f10155a;
            if (l0Var != null) {
                l0Var.a(v0Var);
            }
        }
    }
}
