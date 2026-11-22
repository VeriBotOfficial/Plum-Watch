package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes5.dex */
final class ew1 implements Runnable {
    final /* synthetic */ hx0 b;
    final /* synthetic */ CustomizableMediaView c;
    final /* synthetic */ ex0 d;

    ew1(hx0 hx0Var, CustomizableMediaView customizableMediaView, ex0 ex0Var) {
        this.b = hx0Var;
        this.c = customizableMediaView;
        this.d = ex0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.c, this.d);
    }
}
