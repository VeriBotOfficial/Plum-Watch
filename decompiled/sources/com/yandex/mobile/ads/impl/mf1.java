package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mf1 implements c10 {

    /* renamed from: a, reason: collision with root package name */
    private final int f16234a;

    @Override // com.yandex.mobile.ads.impl.c10
    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f16234a == context.getResources().getConfiguration().orientation;
    }

    public mf1(int i) {
        this.f16234a = i;
    }
}
