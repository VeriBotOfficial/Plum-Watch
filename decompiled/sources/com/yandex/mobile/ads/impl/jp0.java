package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jp0 {

    /* renamed from: a, reason: collision with root package name */
    private final na1 f15937a;
    private final int b;

    public jp0(na1 nativeValidator, int i) {
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        this.f15937a = nativeValidator;
        this.b = i;
    }

    public final n92 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f15937a.a(context, this.b);
    }
}
