package com.alipay.sdk.m.d;

import android.content.Context;

/* loaded from: classes11.dex */
public class f implements com.alipay.sdk.m.c.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1373a = false;

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f1373a) {
            com.alipay.sdk.m.m0.a.e(context);
            this.f1373a = true;
        }
        boolean a2 = com.alipay.sdk.m.m0.a.a();
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(a2));
        if (a2) {
            return com.alipay.sdk.m.m0.a.b(context);
        }
        return null;
    }
}
