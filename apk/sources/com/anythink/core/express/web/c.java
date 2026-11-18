package com.anythink.core.express.web;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes16.dex */
public interface c {
    void loadingResourceStatus(WebView webView, int r2);

    void onPageFinished(WebView webView, String str);

    void onPageStarted(WebView webView, String str, Bitmap bitmap);

    void onProgressChanged(WebView webView, int r2);

    void onReceivedError(WebView webView, int r2, String str, String str2);

    void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void onRenderProcessGone(WebView webView);

    void readyState(WebView webView, int r2);

    boolean shouldOverrideUrlLoading(WebView webView, String str);
}
