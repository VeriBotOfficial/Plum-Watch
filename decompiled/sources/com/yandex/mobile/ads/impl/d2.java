package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d2 {
    private static final long b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    private final Context f15239a;

    public d2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15239a = context;
    }

    public final boolean a(i2 adBlockerState) {
        Integer b2;
        Intrinsics.checkNotNullParameter(adBlockerState, "adBlockerState");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(this.f15239a);
        if (a2 != null && a2.a()) {
            return false;
        }
        if (!adBlockerState.d() || adBlockerState.c() != g2.c || System.currentTimeMillis() - adBlockerState.b() >= b) {
            if (!adBlockerState.d()) {
                int a3 = adBlockerState.a();
                ju1 a4 = pw1.a.a().a(this.f15239a);
                if (a3 >= ((a4 == null || (b2 = a4.b()) == null) ? 5 : b2.intValue())) {
                }
            }
            return false;
        }
        return true;
    }
}
