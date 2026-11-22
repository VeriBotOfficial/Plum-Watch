package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.h;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class b {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (b.class) {
            hashMap = new HashMap();
            String a2 = com.alipay.sdk.m.d0.a.a(map, "tid", "");
            String a3 = com.alipay.sdk.m.d0.a.a(map, com.alipay.sdk.m.n.b.g, "");
            String a4 = com.alipay.sdk.m.d0.a.a(map, "userId", "");
            String a5 = com.alipay.sdk.m.d0.a.a(map, "appName", "");
            String a6 = com.alipay.sdk.m.d0.a.a(map, "appKeyClient", "");
            String a7 = com.alipay.sdk.m.d0.a.a(map, "tmxSessionId", "");
            String f = h.f(context);
            String a8 = com.alipay.sdk.m.d0.a.a(map, JsonStorageKeyNames.SESSION_ID_KEY, "");
            hashMap.put("AC1", a2);
            hashMap.put("AC2", a3);
            hashMap.put("AC3", "");
            hashMap.put("AC4", f);
            hashMap.put("AC5", a4);
            hashMap.put("AC6", a7);
            hashMap.put("AC7", com.alipay.apmobilesecuritysdk.c.b.a(context));
            hashMap.put("AC8", a5);
            hashMap.put("AC9", a6);
            if (com.alipay.sdk.m.d0.a.b(a8)) {
                hashMap.put("AC10", a8);
            }
        }
        return hashMap;
    }
}
