package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17058a;

    public uj0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17058a = context.getApplicationContext();
    }

    public final String a(int i, int i2) {
        Context context = this.f17058a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int a2 = wh2.a(context, i);
        Context context2 = this.f17058a;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int a3 = wh2.a(context2, i2);
        String str = "width = " + i + ", height = " + i2 + ", widthDip = " + a2 + ", heightDip = " + a3;
        sp0.a(new Object[0]);
        if (a2 >= 320 || a3 >= 240) {
            return "large";
        }
        if (a2 < 160 && a3 < 160) {
            return "small";
        }
        return "medium";
    }
}
