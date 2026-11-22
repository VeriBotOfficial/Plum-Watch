package com.yandex.mobile.ads.impl;

import android.util.Log;
import com.yandex.mobile.ads.impl.v11;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class an1 {

    /* renamed from: a, reason: collision with root package name */
    private static final v11 f15021a;
    public static final /* synthetic */ int b = 0;

    static {
        int i = v11.d;
        f15021a = v11.a.a();
    }

    public static void a(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (sp0.a() || l11.f16068a.a()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            if (sp0.a()) {
                Log.w("Yandex Mobile Ads", format2);
            }
            if (l11.f16068a.a()) {
                f15021a.a(k11.c, "Yandex Mobile Ads", format2);
            }
        }
    }
}
