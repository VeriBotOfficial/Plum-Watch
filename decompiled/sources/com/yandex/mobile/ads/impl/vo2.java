package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes5.dex */
final class vo2 implements Runnable {
    final /* synthetic */ WebView b;
    final /* synthetic */ String c;

    @Override // java.lang.Runnable
    public final void run() {
        this.b.loadUrl(this.c);
    }

    vo2(WebView webView, String str) {
        this.b = webView;
        this.c = str;
    }
}
