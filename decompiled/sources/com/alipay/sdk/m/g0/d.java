package com.alipay.sdk.m.g0;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class d {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        synchronized (d.class) {
            if (!com.alipay.sdk.m.d0.a.a(str)) {
                if (!com.alipay.sdk.m.d0.a.a(str2) && context != null) {
                    try {
                        String a2 = com.alipay.sdk.m.e0.c.a(com.alipay.sdk.m.e0.c.a(), str3);
                        HashMap hashMap = new HashMap();
                        hashMap.put(str2, a2);
                        e.a(context, str, hashMap);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
