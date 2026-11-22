package com.wakeup.howear.view.webview;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: H5AdBridge.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"evalJs", "", "webView", "Landroid/webkit/WebView;", Const.SP_KEY_FILENUM, "", "argsLiteral", "TAG", "app_wpOverseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class H5AdBridgeKt {
    private static final String TAG = "H5AdBridge";

    static /* synthetic */ void evalJs$default(WebView webView, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        evalJs(webView, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evalJs(final WebView webView, final String str, final String str2) {
        final String trimIndent = StringsKt.trimIndent("\n        (function () {\n            try {\n                var f = window['" + str + "'];\n                if (typeof f === 'function') { f(" + str2 + "); return 'invoked'; }\n                return 'no_handler:' + (typeof f);\n            } catch (e) {\n                return 'error:' + (e && e.message);\n            }\n        })();\n    ");
        webView.post(new Runnable() { // from class: com.wakeup.howear.view.webview.H5AdBridgeKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                H5AdBridgeKt.evalJs$lambda$1(str, str2, webView, trimIndent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evalJs$lambda$1(final String str, String str2, WebView webView, String str3) {
        Log.i(TAG, "[BRIDGE] evalJs → " + str + Separators.LPAREN + str2 + Separators.RPAREN);
        webView.evaluateJavascript(str3, new ValueCallback() { // from class: com.wakeup.howear.view.webview.H5AdBridgeKt$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                H5AdBridgeKt.evalJs$lambda$1$lambda$0(str, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void evalJs$lambda$1$lambda$0(String str, String str2) {
        Log.i(TAG, "[BRIDGE] evalJs " + str + " result=" + str2);
    }
}
