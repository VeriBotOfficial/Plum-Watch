package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z02 {

    /* renamed from: a, reason: collision with root package name */
    private final vr0 f17476a;
    private final String b;
    private final b12 c;

    public z02(vr0 link, String name, b12 value) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f17476a = link;
        this.b = name;
        this.c = value;
    }

    public final vr0 a() {
        return this.f17476a;
    }

    public final String b() {
        return this.b;
    }

    public final b12 c() {
        return this.c;
    }
}
