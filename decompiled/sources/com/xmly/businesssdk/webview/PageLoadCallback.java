package com.xmly.businesssdk.webview;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BusinessWebViewClient.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\u001c\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0013"}, d2 = {"Lcom/xmly/businesssdk/webview/PageLoadCallback;", "", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onSchemeError", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "shouldOverrideUrlLoading", "", "request", "Landroid/webkit/WebResourceRequest;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface PageLoadCallback {

    /* compiled from: BusinessWebViewClient.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onSchemeError(PageLoadCallback pageLoadCallback, String url, Exception error) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    void onPageFinished(WebView view, String url);

    void onPageStarted(WebView view, String url, Bitmap favicon);

    void onSchemeError(String url, Exception error);

    boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request);

    boolean shouldOverrideUrlLoading(WebView view, String url);
}
