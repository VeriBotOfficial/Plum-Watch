package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes5.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<mf, String> f15181a = MapsKt.mapOf(TuplesKt.to(mf.c, "Network error"), TuplesKt.to(mf.d, "Invalid response"), TuplesKt.to(mf.b, "Unknown"));

    public static String a(mf mfVar) {
        String str = f15181a.get(mfVar);
        return str == null ? "Unknown" : str;
    }
}
