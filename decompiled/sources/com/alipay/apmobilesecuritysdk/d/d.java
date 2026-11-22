package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class d {
    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            com.alipay.sdk.m.f0.e a2 = com.alipay.sdk.m.f0.e.a();
            com.alipay.sdk.m.f0.b a3 = com.alipay.sdk.m.f0.b.a(APSecuritySdk.getInstance(context));
            hashMap = new HashMap();
            hashMap.put("AE1", a2.b());
            hashMap.put("AE2", a2.c() ? "1" : "0");
            hashMap.put("AE3", a2.a(context) ? "1" : "0");
            hashMap.put("AE4", a2.d());
            hashMap.put("AE5", a2.e());
            hashMap.put("AE6", a2.f());
            hashMap.put("AE7", a2.g());
            hashMap.put("AE8", a2.h());
            hashMap.put("AE9", a2.i());
            hashMap.put("AE10", a2.j());
            hashMap.put("AE11", a2.k());
            hashMap.put("AE12", a2.l());
            hashMap.put("AE13", a2.m());
            hashMap.put("AE14", a2.n());
            hashMap.put("AE15", a2.o());
            hashMap.put("AE21", a3.f());
        }
        return hashMap;
    }

    public static synchronized Map<String, String> b(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap();
            try {
                hashMap.put("AE16", com.alipay.apmobilesecuritysdk.c.c.a(context).a());
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }
}
