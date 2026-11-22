package com.alipay.sdk.m.d;

import android.content.Context;

/* loaded from: classes11.dex */
public class i implements com.alipay.sdk.m.c.b {
    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        boolean a2 = com.alipay.sdk.m.o0.b.a();
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(a2));
        if (a2) {
            return com.alipay.sdk.m.o0.b.b(context);
        }
        return null;
    }
}
