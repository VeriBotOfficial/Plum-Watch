package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hf {
    public static boolean a(df appMetricaIdentifiers) {
        Intrinsics.checkNotNullParameter(appMetricaIdentifiers, "appMetricaIdentifiers");
        String a2 = appMetricaIdentifiers.a();
        String b = appMetricaIdentifiers.b();
        String c = appMetricaIdentifiers.c();
        if (!(c == null || c.length() == 0)) {
            if (!(a2 == null || a2.length() == 0)) {
                if (!(b == null || b.length() == 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
