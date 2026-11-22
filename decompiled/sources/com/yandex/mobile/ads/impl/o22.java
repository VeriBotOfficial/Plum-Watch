package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o22<T extends View> implements Runnable {
    private final T b;
    private final zd<T> c;

    public o22(T view, zd<T> animator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(animator, "animator");
        this.b = view;
        this.c = animator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.b);
    }
}
