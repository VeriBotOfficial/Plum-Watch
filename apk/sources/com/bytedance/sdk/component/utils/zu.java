package com.bytedance.sdk.component.utils;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes15.dex */
public class zu {
    private static final fxn fxn = new kg();

    private static class fxn {
        private fxn() {
        }

        public void fxn(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    private static class kg extends fxn {
        private kg() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.zu.fxn
        public void fxn(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void fxn(WebView webView, String str) {
        fxn.fxn(webView, str);
    }
}
