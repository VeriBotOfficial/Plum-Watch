package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    private final x7 f15356a = new x7();

    static {
        TimeUnit.SECONDS.toMillis(10L);
    }

    public final m00 a(Context context, int i) {
        Integer g;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15356a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        return new m00(1.0f, i, (a2 == null || (g = a2.g()) == null) ? 0 : g.intValue());
    }
}
