package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class s0<TResult> implements j0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public Executor f10157a;
    public l0<TResult> b;
    public final Object c = new Object();

    public s0(Executor executor, l0<TResult> l0Var) {
        this.b = l0Var;
        this.f10157a = executor;
    }

    @Override // com.hihonor.push.sdk.j0
    public final void a(v0<TResult> v0Var) {
        this.f10157a.execute(new q0(this, v0Var));
    }
}
