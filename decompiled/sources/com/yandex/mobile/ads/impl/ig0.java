package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ig0 {
    private static final ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap<>();
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, Boolean> f15812a = b;

    public final boolean a(int i, String host) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(host, "host");
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.f15812a;
        Boolean bool = concurrentHashMap.get(host);
        if (bool == null) {
            w82.f17229a.getClass();
            Intrinsics.checkNotNullParameter(host, "host");
            try {
                Result.Companion companion = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(Boolean.valueOf(InetAddress.getByName(host).isReachable(i)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m14063isFailureimpl(m14057constructorimpl)) {
                m14057constructorimpl = null;
            }
            Boolean bool2 = (Boolean) m14057constructorimpl;
            bool = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            Boolean putIfAbsent = concurrentHashMap.putIfAbsent(host, bool);
            if (putIfAbsent != null) {
                bool = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(bool, "getOrPut(...)");
        return bool.booleanValue();
    }
}
