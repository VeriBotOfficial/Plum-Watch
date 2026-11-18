package com.mbridge.msdk.mbsignalcommon.windvane;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

/* JADX INFO: compiled from: IWebViewListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface c {
    void a(WebView webView);

    void a(WebView webView, int r2);

    void a(WebView webView, int r2, String str, String str2);

    void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void a(WebView webView, String str);

    void a(WebView webView, String str, Bitmap bitmap);

    void b(WebView webView, int r2);

    boolean b(WebView webView, String str);

    void c(WebView webView, int r2);
}
