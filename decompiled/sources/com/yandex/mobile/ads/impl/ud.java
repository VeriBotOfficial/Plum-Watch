package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ud {

    /* renamed from: a, reason: collision with root package name */
    private final vd f17043a;

    public /* synthetic */ ud() {
        this(new vd());
    }

    public ud(vd androidSdkApiProvider) {
        Intrinsics.checkNotNullParameter(androidSdkApiProvider, "androidSdkApiProvider");
        this.f17043a = androidSdkApiProvider;
    }

    public final boolean a() {
        this.f17043a.getClass();
        int a2 = vd.a();
        this.f17043a.getClass();
        return a2 >= 21;
    }
}
