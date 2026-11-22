package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j10 {

    /* renamed from: a, reason: collision with root package name */
    private final l10 f15871a;
    private final vs0 b;
    private final us1 c;

    public j10() {
        this(0);
    }

    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.b.a(context);
    }

    public final String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String lowerCase = this.f15871a.a(context).name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.b.c(context);
    }

    public final List<String> d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.b.b(context);
    }

    public /* synthetic */ j10(int i) {
        this(new l10(), new vs0());
    }

    public j10(l10 deviceTypeProvider, vs0 localeProvider) {
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        Intrinsics.checkNotNullParameter(localeProvider, "localeProvider");
        this.f15871a = deviceTypeProvider;
        this.b = localeProvider;
        this.c = us1.f17083a;
    }

    public static String a() {
        return Build.MANUFACTURER;
    }

    public static String b() {
        return Build.VERSION.RELEASE;
    }

    public final boolean c() {
        this.c.getClass();
        return us1.a();
    }
}
