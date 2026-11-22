package com.wakeup.howear.view.webview;

import android.gov.nist.core.Separators;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: SparkMerchantTransferHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/wakeup/howear/view/webview/SparkMerchantTransferHolder;", "", "<init>", "()V", "pendingWebView", "Landroid/webkit/WebView;", "getPendingWebView", "()Landroid/webkit/WebView;", "setPendingWebView", "(Landroid/webkit/WebView;)V", "dispatch", "", "errCode", "", "errMsg", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SparkMerchantTransferHolder {
    public static final SparkMerchantTransferHolder INSTANCE = new SparkMerchantTransferHolder();
    private static volatile WebView pendingWebView;

    private SparkMerchantTransferHolder() {
    }

    public final WebView getPendingWebView() {
        return pendingWebView;
    }

    public final void setPendingWebView(WebView webView) {
        pendingWebView = webView;
    }

    public final void dispatch(int errCode, String errMsg) {
        final WebView webView = pendingWebView;
        if (webView == null) {
            return;
        }
        pendingWebView = null;
        if (errMsg == null) {
            errMsg = "";
        }
        final String str = "if(window.__onMerchantTransferResp) window.__onMerchantTransferResp(" + errCode + ", '" + StringsKt.replace$default(errMsg, Separators.QUOTE, "\\'", false, 4, (Object) null) + "');";
        webView.post(new Runnable() { // from class: com.wakeup.howear.view.webview.SparkMerchantTransferHolder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript(str, null);
            }
        });
    }
}
