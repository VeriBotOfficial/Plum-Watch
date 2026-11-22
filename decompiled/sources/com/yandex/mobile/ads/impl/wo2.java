package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.autonavi.aps.amapapi.config.Const;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class wo2 {
    private wo2() {
    }

    public static void a(WebView webView) {
        a(webView, "finishSession", new Object[0]);
    }

    public static void b(WebView webView) {
        a(webView, "publishImpressionEvent", new Object[0]);
    }

    public static void a(WebView webView, float f) {
        a(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public static void b(WebView webView, JSONObject jSONObject) {
        a(webView, "publishLoadedEvent", jSONObject);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            a(webView, "publishMediaEvent", str, jSONObject);
        } else {
            a(webView, "publishMediaEvent", str);
        }
    }

    public static void b(WebView webView, String str) {
        a(webView, "setState", str);
    }

    public static void a(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        a(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }

    static void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append(Separators.LPAREN);
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "\"\"";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith(Const.STR_MART_JSON_BEGIN)) {
                                sb.append('\"').append(obj).append('\"');
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(",");
                    }
                    sb.append(obj);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new vo2(webView, sb2));
            }
        }
    }

    public static void a(WebView webView, JSONObject jSONObject) {
        a(webView, "init", jSONObject);
    }

    public static void a(WebView webView, String str) {
        a(webView, "setNativeViewHierarchy", str);
    }
}
