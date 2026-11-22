package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jo1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class he0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15682a;

    public he0(Object fusedLocationProviderObject) {
        Intrinsics.checkNotNullParameter(fusedLocationProviderObject, "fusedLocationProviderObject");
        this.f15682a = fusedLocationProviderObject;
    }

    public final ct0 a() {
        Object a2 = jo1.a.a(this.f15682a, "getLastLocation", new Object[0]);
        if (a2 != null) {
            return new ct0(a2);
        }
        return null;
    }
}
