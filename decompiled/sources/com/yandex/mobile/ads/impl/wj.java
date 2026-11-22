package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wj implements xj {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17257a;
    private final boolean b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj(Map map) {
        this(map, nf0.a((Map<String, String>) map, vh0.f0, true), nf0.a((Map<String, String>) map, vh0.g0, true));
        nf0.a((Map<String, String>) map, vh0.e0, true);
    }

    @Override // com.yandex.mobile.ads.impl.xj
    public final boolean b() {
        return this.f17257a;
    }

    public wj(Map headers, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17257a = z;
        this.b = z2;
    }

    @Override // com.yandex.mobile.ads.impl.xj
    public final boolean a() {
        return this.b;
    }
}
