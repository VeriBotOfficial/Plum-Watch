package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    private final kx1 f15907a;

    public final kd a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15907a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new kd(!r1.b(context));
    }

    public final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15907a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return !r1.b(context);
    }

    public /* synthetic */ jf() {
        this(new kx1());
    }

    public jf(kx1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f15907a = sensitiveModeChecker;
    }
}
