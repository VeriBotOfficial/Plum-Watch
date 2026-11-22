package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vo {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f17181a = new LinkedHashMap();

    public final void a(int i, uo clickConnector) {
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        this.f17181a.put(Integer.valueOf(i), clickConnector);
    }

    public final LinkedHashMap a() {
        return this.f17181a;
    }
}
