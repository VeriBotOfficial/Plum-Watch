package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rs0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<String, ps0> f16794a = new ConcurrentHashMap<>();
    public static final /* synthetic */ int b = 0;

    @JvmStatic
    public static final ps0 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return a(context, "YadPreferenceFile");
    }

    @JvmStatic
    public static final ps0 a(Context context, String filename) {
        ps0 putIfAbsent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        ConcurrentHashMap<String, ps0> concurrentHashMap = f16794a;
        ps0 ps0Var = concurrentHashMap.get(filename);
        if (ps0Var == null && (putIfAbsent = concurrentHashMap.putIfAbsent(filename, (ps0Var = new qs0(context, filename, new by1())))) != null) {
            ps0Var = putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(ps0Var, "getOrPut(...)");
        return ps0Var;
    }
}
