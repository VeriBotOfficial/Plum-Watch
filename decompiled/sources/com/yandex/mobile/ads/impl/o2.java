package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o2 {
    private static final long c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f16401a;
    private final Context b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Context context) {
        this(context, pw1.a.a());
        int i = pw1.l;
    }

    public final long a() {
        ju1 a2 = this.f16401a.a(this.b);
        Long c2 = a2 != null ? a2.c() : null;
        return c2 != null ? c2.longValue() : c;
    }

    public o2(Context context, pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f16401a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = applicationContext;
    }
}
