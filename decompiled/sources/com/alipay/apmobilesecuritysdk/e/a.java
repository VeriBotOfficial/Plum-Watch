package com.alipay.apmobilesecuritysdk.e;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class a {
    private static b a(String str) {
        try {
            if (com.alipay.sdk.m.d0.a.a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
        } catch (Exception e) {
            com.alipay.apmobilesecuritysdk.c.a.a(e);
            return null;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
        }
    }

    public static synchronized void a(Context context, b bVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", bVar.f1296a);
                jSONObject.put("deviceInfoHash", bVar.b);
                jSONObject.put("timestamp", bVar.c);
                String jSONObject2 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", CommonUrlParts.DEVICE_ID, jSONObject2);
                com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Exception e) {
                com.alipay.apmobilesecuritysdk.c.a.a(e);
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", CommonUrlParts.DEVICE_ID, "");
            com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx", "");
        }
    }

    public static synchronized b c(Context context) {
        b a2;
        synchronized (a.class) {
            String a3 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", CommonUrlParts.DEVICE_ID);
            if (com.alipay.sdk.m.d0.a.a(a3)) {
                a3 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            }
            a2 = a(a3);
        }
        return a2;
    }

    public static synchronized b d(Context context) {
        synchronized (a.class) {
            String a2 = com.alipay.apmobilesecuritysdk.f.a.a(context, "vkeyid_profiles_v3", CommonUrlParts.DEVICE_ID);
            if (com.alipay.sdk.m.d0.a.a(a2)) {
                return null;
            }
            return a(a2);
        }
    }

    public static synchronized b e(Context context) {
        synchronized (a.class) {
            String a2 = com.alipay.apmobilesecuritysdk.f.a.a("wxcasxx_v3", "wxcasxx");
            if (com.alipay.sdk.m.d0.a.a(a2)) {
                return null;
            }
            return a(a2);
        }
    }
}
