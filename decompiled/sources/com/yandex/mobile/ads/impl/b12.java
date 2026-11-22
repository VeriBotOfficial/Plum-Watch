package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b12 {

    /* renamed from: a, reason: collision with root package name */
    private final xj0 f15060a;
    private final String b;

    public b12(xj0 imageValue, String title) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15060a = imageValue;
        this.b = title;
    }

    public final xj0 a() {
        return this.f15060a;
    }

    public final String b() {
        return this.b;
    }
}
