package com.hihonor.push.sdk;

import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final class u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f10161a;
    public final /* synthetic */ Callable b;

    public u0(m0 m0Var, Callable callable) {
        this.f10161a = m0Var;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f10161a.a((m0) this.b.call());
        } catch (Exception e) {
            this.f10161a.a(e);
        }
    }
}
