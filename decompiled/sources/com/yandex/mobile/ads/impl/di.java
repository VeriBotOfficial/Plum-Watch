package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private final kx1 f15282a;

    public di(kx1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f15282a = sensitiveModeChecker;
    }

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean b = this.f15282a.b(context);
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        return (b || a2 == null || !a2.X()) ? false : true;
    }
}
