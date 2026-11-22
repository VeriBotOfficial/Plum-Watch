package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k50 {

    /* renamed from: a, reason: collision with root package name */
    private final d32 f15984a = new d32();

    public final String a(Context context, String rawQuery) {
        String a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rawQuery, "rawQuery");
        int i = pw1.l;
        ju1 a3 = pw1.a.a().a(context);
        return (a3 == null || !a3.c0() || (a2 = this.f15984a.a(context, rawQuery)) == null) ? rawQuery : a2;
    }
}
