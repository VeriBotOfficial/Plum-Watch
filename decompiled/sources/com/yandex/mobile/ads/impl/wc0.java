package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17237a;

    public wc0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17237a = context.getApplicationContext();
    }

    public final boolean a() {
        int i = pw1.l;
        pw1 a2 = pw1.a.a();
        Context context = this.f17237a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ju1 a3 = a2.a(context);
        return a3 != null && a3.d0();
    }
}
