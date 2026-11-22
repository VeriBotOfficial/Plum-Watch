package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.yandex.mobile.ads.impl.z6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o7 {
    public static d7 a(b7 sdkAdQualityConfiguration) {
        Object obj;
        Intrinsics.checkNotNullParameter(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        int g = sdkAdQualityConfiguration.g();
        boolean e = sdkAdQualityConfiguration.e();
        boolean c = sdkAdQualityConfiguration.c();
        Map<String, c7> a2 = sdkAdQualityConfiguration.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = a2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            z6.a aVar = z6.c;
            String value = (String) entry.getKey();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it2 = z6.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((z6) obj).b(), value)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork a3 = z6.a.a((z6) obj);
            if (a3 != null) {
                linkedHashMap.put(a3, new m7(((c7) entry.getValue()).a(), ((c7) entry.getValue()).b()));
            }
        }
        return new d7(g, e, c, linkedHashMap, sdkAdQualityConfiguration.f());
    }
}
