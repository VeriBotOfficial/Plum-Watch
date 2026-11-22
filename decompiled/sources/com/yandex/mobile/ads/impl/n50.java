package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n50 {

    /* renamed from: a, reason: collision with root package name */
    private final o10 f16306a = new o10();

    public final boolean a(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        o10 o10Var = this.f16306a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        o10Var.getClass();
        int a2 = o10.a(context, 144.0f);
        o10 o10Var2 = this.f16306a;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        o10Var2.getClass();
        return i5 >= a2 && i6 >= o10.a(context2, 96.0f);
    }
}
