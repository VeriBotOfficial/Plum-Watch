package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.v11;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class hp0 {

    /* renamed from: a, reason: collision with root package name */
    private static final v11 f15715a;
    private static final String b;
    private static boolean c;

    static {
        int i = v11.d;
        f15715a = v11.a.a();
        b = "YandexAds";
        c = true;
    }

    @JvmStatic
    public static final void b(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (c || l11.f16068a.a()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a2 = a(format2);
            if (c) {
                Log.i(b, a2);
            }
            if (l11.f16068a.a()) {
                f15715a.a(k11.b, b, a2);
            }
        }
    }

    @JvmStatic
    public static final void c(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (c || l11.f16068a.a()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a2 = a(format2);
            if (c) {
                Log.w(b, a2);
            }
            if (l11.f16068a.a()) {
                f15715a.a(k11.c, b, a2);
            }
        }
    }

    private static String a(String str) {
        return "[Integration] " + str;
    }

    @JvmStatic
    public static final void a(boolean z) {
        c = z;
    }

    @JvmStatic
    public static final void a(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (c || l11.f16068a.a()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            String a2 = a(format2);
            if (c) {
                Log.e(b, a2);
            }
            if (l11.f16068a.a()) {
                f15715a.a(k11.d, b, a2);
            }
        }
    }
}
