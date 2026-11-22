package com.bytedance.sdk.openadsdk.dx;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* loaded from: classes14.dex */
public class jq {
    private static void kg(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            sg.fxn("WebViewSettings", "removeJavascriptInterfacesSafe error", th);
        }
    }

    private static void fxn(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            sg.fxn("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th);
        }
    }

    public static void fxn(WebView webView) {
        if (webView == null) {
            return;
        }
        kg(webView);
        WebSettings settings = webView.getSettings();
        fxn(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Throwable th) {
            sg.fxn("WebViewSettings", "setJavaScriptEnabled error", th);
        }
        try {
            settings.setSupportZoom(false);
        } catch (Throwable th2) {
            sg.fxn("WebViewSettings", "setSupportZoom error", th2);
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setSavePassword(false);
        boolean z = Build.VERSION.SDK_INT >= 28;
        try {
        } catch (Throwable th3) {
            sg.fxn("WebViewSettings", "setLayerType error", th3);
        }
        if (!z) {
            webView.setLayerType(0, null);
        } else {
            if (z) {
                webView.setLayerType(2, null);
            }
            webView.getSettings().setMixedContentMode(0);
        }
        webView.getSettings().setMixedContentMode(0);
    }
}
