package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wj2 implements Runnable {
    private final int b;
    private final String c;
    private final eh0 d;

    public wj2(int i, String str, eh0 htmlWebViewRenderer) {
        Intrinsics.checkNotNullParameter(htmlWebViewRenderer, "htmlWebViewRenderer");
        this.b = i;
        this.c = str;
        this.d = htmlWebViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.b, this.c);
    }
}
