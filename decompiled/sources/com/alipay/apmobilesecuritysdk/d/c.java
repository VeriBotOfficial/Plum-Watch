package com.alipay.apmobilesecuritysdk.d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class c {
    public static Map<String, String> a(Context context) {
        com.alipay.sdk.m.f0.b a2 = com.alipay.sdk.m.f0.b.a(APSecuritySdk.getInstance(context));
        HashMap hashMap = new HashMap();
        f a3 = com.alipay.apmobilesecuritysdk.e.e.a(context);
        String a4 = a2.a(context);
        String k = a2.k(context);
        if (a3 != null) {
            if (com.alipay.sdk.m.d0.a.a(a4)) {
                a4 = a3.b();
            }
            if (com.alipay.sdk.m.d0.a.a(k)) {
                k = a3.e();
            }
        }
        String str = a4;
        String str2 = k;
        com.alipay.apmobilesecuritysdk.e.e.a(context, new f("", str, "", "", str2));
        hashMap.put("AD1", "");
        hashMap.put("AD2", str);
        hashMap.put("AD3", a2.e(context));
        hashMap.put("AD5", a2.g(context));
        hashMap.put("AD6", a2.h(context));
        hashMap.put("AD7", a2.i(context));
        hashMap.put("AD9", a2.j(context));
        hashMap.put("AD10", str2);
        hashMap.put("AD11", a2.c());
        hashMap.put("AD12", a2.d());
        hashMap.put("AD13", a2.e());
        hashMap.put("AD14", a2.g());
        hashMap.put("AD15", a2.h());
        hashMap.put("AD16", a2.i());
        hashMap.put("AD17", "");
        hashMap.put("AD19", a2.l(context));
        hashMap.put("AD20", a2.j());
        hashMap.put("AD22", "");
        hashMap.put("AD24", com.alipay.sdk.m.d0.a.g(a2.f(context)));
        hashMap.put("AD26", a2.d(context));
        hashMap.put("AD27", a2.o());
        hashMap.put("AD28", a2.q());
        hashMap.put("AD29", a2.s());
        hashMap.put("AD30", a2.p());
        hashMap.put("AD31", a2.r());
        hashMap.put("AD32", a2.m());
        hashMap.put("AD33", a2.n());
        hashMap.put("AD34", a2.p(context));
        hashMap.put("AD35", a2.q(context));
        hashMap.put("AD36", a2.m(context));
        hashMap.put("AD37", a2.l());
        hashMap.put("AD38", a2.k());
        hashMap.put("AD39", a2.b(context));
        hashMap.put("AD40", a2.c(context));
        hashMap.put("AD41", a2.a());
        hashMap.put("AD42", a2.b());
        return hashMap;
    }
}
