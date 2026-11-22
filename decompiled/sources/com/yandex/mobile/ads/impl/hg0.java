package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hg0 {

    /* renamed from: a, reason: collision with root package name */
    private final ct f15685a;
    private final pw1 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg0(ct ctVar) {
        this(ctVar, pw1.a.a());
        int i = pw1.l;
    }

    public hg0(ct defaultHostAccessChecker, pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(defaultHostAccessChecker, "defaultHostAccessChecker");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15685a = defaultHostAccessChecker;
        this.b = sdkSettings;
    }

    public final ct a() {
        this.b.getClass();
        pw1.c();
        return this.f15685a;
    }
}
