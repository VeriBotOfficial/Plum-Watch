package com.hihonor.push.sdk;

/* loaded from: classes11.dex */
public class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f10153a;
    public final /* synthetic */ s0 b;

    public q0(s0 s0Var, v0 v0Var) {
        this.b = s0Var;
        this.f10153a = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.b.c) {
            l0<TResult> l0Var = this.b.b;
            if (l0Var != 0) {
                l0Var.a(this.f10153a);
            }
        }
    }
}
