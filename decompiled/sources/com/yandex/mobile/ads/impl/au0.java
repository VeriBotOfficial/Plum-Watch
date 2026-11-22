package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class au0 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f15041a;

    public /* synthetic */ au0() {
        this(new j10(0));
    }

    public au0(j10 deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f15041a = deviceInfoProvider;
    }

    public final boolean a() {
        this.f15041a.getClass();
        return StringsKt.equals("Xiaomi", j10.a(), true);
    }
}
