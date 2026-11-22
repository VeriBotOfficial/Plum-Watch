package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class z21 extends ah0 {
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z21(bh0 webViewClientListener) {
        super(webViewClientListener);
        Intrinsics.checkNotNullParameter(webViewClientListener, "webViewClientListener");
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Uri url;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String str = this.c;
        if (str == null || str.length() <= 0 || (url = request.getUrl()) == null || !Intrinsics.areEqual("mraid.js", url.getLastPathSegment())) {
            return super.shouldInterceptRequest(view, request);
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    public final void a(String str) {
        this.c = str;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return super.shouldInterceptRequest(view, url);
    }
}
