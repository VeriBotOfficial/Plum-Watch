package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class ah0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final bh0 f15009a;
    private final xj2 b;

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        this.f15009a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        this.f15009a.a(i);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        xj2 xj2Var = this.b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (xj2Var.a(context, error)) {
            handler.proceed();
        } else {
            this.f15009a.a(-11);
            super.onReceivedSslError(view, handler, error);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        bh0 bh0Var = this.f15009a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bh0Var.a(context, url);
        return true;
    }

    public /* synthetic */ ah0(bh0 bh0Var) {
        this(bh0Var, dt1.b());
    }

    public ah0(bh0 webViewClientListener, xj2 webViewSslErrorHandler) {
        Intrinsics.checkNotNullParameter(webViewClientListener, "webViewClientListener");
        Intrinsics.checkNotNullParameter(webViewSslErrorHandler, "webViewSslErrorHandler");
        this.f15009a = webViewClientListener;
        this.b = webViewSslErrorHandler;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f15009a.a(error.getErrorCode());
    }
}
