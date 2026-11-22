package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v50 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f17124a = SetsKt.setOf("sysconst-update");

    public final boolean a(String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !this.f17124a.contains(param);
    }
}
