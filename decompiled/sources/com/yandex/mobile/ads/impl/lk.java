package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class lk implements xg0 {

    /* renamed from: a, reason: collision with root package name */
    private final yf1 f16133a;

    public lk(yf1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f16133a = parentHtmlWebView;
        parentHtmlWebView.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.xg0
    public void a(String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f16133a.b(htmlResponse);
    }

    public void a(dh0 htmlWebViewListener) {
        Intrinsics.checkNotNullParameter(htmlWebViewListener, "htmlWebViewListener");
        this.f16133a.setHtmlWebViewListener(htmlWebViewListener);
    }

    @Override // com.yandex.mobile.ads.impl.xg0
    public void invalidate() {
        this.f16133a.d();
    }
}
