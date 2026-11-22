package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final w11 f17289a;

    public /* synthetic */ ww1() {
        this(new w11());
    }

    public ww1(w11 mobileAdsVersionInfoProvider) {
        Intrinsics.checkNotNullParameter(mobileAdsVersionInfoProvider, "mobileAdsVersionInfoProvider");
        this.f17289a = mobileAdsVersionInfoProvider;
    }

    public final String a() {
        this.f17289a.getClass();
        gb2 a2 = w11.a();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d.%d%d", Arrays.copyOf(new Object[]{Integer.valueOf(a2.a()), Integer.valueOf(a2.b()), Integer.valueOf(a2.c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String b() {
        this.f17289a.getClass();
        gb2 a2 = w11.a();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(a2.a()), Integer.valueOf(a2.b()), Integer.valueOf(a2.c())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
