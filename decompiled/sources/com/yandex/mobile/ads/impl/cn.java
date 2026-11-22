package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15207a;

    public final Bitmap a(xj0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        o82 c = id1.c.a(this.f15207a).c();
        String f = imageValue.f();
        Bitmap a2 = c.a(f);
        if (a2 == null || a2.getWidth() != 1 || a2.getHeight() != 1) {
            return a2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a2, imageValue.g(), imageValue.a(), false);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        c.a(f, createScaledBitmap);
        return createScaledBitmap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ cn(android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cn.<init>(android.content.Context):void");
    }

    public cn(Context context, Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f15207a = appContext;
    }
}
