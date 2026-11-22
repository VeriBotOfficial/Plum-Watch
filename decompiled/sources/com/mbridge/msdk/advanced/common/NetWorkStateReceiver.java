package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {
    private static final String c = "NetWorkStateReceiver";

    /* renamed from: a, reason: collision with root package name */
    private WebView f11254a;
    private int b;

    public NetWorkStateReceiver(WebView webView) {
        this.f11254a = webView;
    }

    public void a() {
        this.f11254a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f11254a, 0);
                return;
            }
            if (!com.mbridge.msdk.foundation.same.a.z) {
                a(this.f11254a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f11254a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f11254a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f11254a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.b = networkType;
                int c2 = k0.c(networkType);
                this.b = c2;
                a(this.f11254a, c2);
            }
        } catch (Throwable th) {
            o0.a(c, th.getMessage());
        }
    }

    public void a(WebView webView, int i) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.m, i);
                f.a().a(webView, NativeAdvancedJsUtils.l, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                o0.a(c, th.getMessage());
            }
        }
    }
}
