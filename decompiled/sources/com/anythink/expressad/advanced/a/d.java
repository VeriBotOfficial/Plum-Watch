package com.anythink.expressad.advanced.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4596a = "d";
    private WebView b;
    private int c;

    public d(WebView webView) {
        this.b = webView;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.b, 0);
                return;
            }
            if (com.anythink.expressad.foundation.g.a.ca) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    a(this.b, 0);
                    return;
                }
                if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                    if (activeNetworkInfo.getType() == 1) {
                        a(this.b, 9);
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager == null) {
                        a(this.b, 0);
                        return;
                    }
                    int networkType = telephonyManager.getNetworkType();
                    this.c = networkType;
                    int a2 = n.a(networkType);
                    this.c = a2;
                    a(this.b, a2);
                    return;
                }
                return;
            }
            a(this.b, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void a() {
        this.b = null;
    }

    private static void a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.m, i);
                h.a();
                h.a(webView, NativeAdvancedJsUtils.l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
