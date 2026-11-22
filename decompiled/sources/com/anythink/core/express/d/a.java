package com.anythink.core.express.d;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.alipay.sdk.m.t.e;
import com.anythink.core.express.web.BaseWebView;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class a implements b {
    public static void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, d.c(str2));
        }
        if (webView != null) {
            if ((webView instanceof BaseWebView) && ((BaseWebView) webView).isDestroyed()) {
                return;
            }
            try {
                webView.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(e.l, "1.0.0");
            a(webView, com.anythink.core.express.a.c.b, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a(webView, com.anythink.core.express.a.c.b, "");
        } catch (Throwable unused2) {
            a(webView, com.anythink.core.express.a.c.b, "");
        }
    }
}
