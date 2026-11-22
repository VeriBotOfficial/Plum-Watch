package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Yd {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18153a;

    public Yd() {
        HashMap hashMap = new HashMap();
        this.f18153a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", com.anythink.expressad.f.a.b.h);
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", com.anythink.expressad.f.a.b.cZ);
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f18153a.containsKey(str) ? (String) this.f18153a.get(str) : str;
    }
}
