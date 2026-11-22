package com.hihonor.push.sdk;

/* loaded from: classes11.dex */
public class m0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final v0<TResult> f10145a = new v0<>();

    public void a(Exception exc) {
        v0<TResult> v0Var = this.f10145a;
        synchronized (v0Var.f10163a) {
            if (!v0Var.b) {
                v0Var.b = true;
                v0Var.d = exc;
                v0Var.f10163a.notifyAll();
                v0Var.a();
            }
        }
    }

    public void a(TResult tresult) {
        v0<TResult> v0Var = this.f10145a;
        synchronized (v0Var.f10163a) {
            if (!v0Var.b) {
                v0Var.b = true;
                v0Var.c = tresult;
                v0Var.f10163a.notifyAll();
                v0Var.a();
            }
        }
    }
}
