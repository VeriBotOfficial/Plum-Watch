package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes5.dex */
public final class ao2 extends g9 {
    public ao2(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
