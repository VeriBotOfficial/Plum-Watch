package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class r7 implements Runnable {
    private dh0 b;

    @Override // java.lang.Runnable
    public final void run() {
        dh0 dh0Var = this.b;
        if (dh0Var != null) {
            dh0Var.a(w7.l());
        }
    }

    public final void a(dh0 dh0Var) {
        this.b = dh0Var;
    }
}
