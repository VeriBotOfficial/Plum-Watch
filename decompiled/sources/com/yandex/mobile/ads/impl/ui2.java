package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ui2 {
    public static wq1 a(xc1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.f17325a;
        ar1 ar1Var = new ar1(response.b);
        Map<String, String> map = response.c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return new wq1(i, ar1Var, map);
    }
}
