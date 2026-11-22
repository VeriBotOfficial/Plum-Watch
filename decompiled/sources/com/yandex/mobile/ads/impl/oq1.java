package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oq1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16478a;

        static {
            int[] iArr = new int[AdTheme.values().length];
            try {
                iArr[AdTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16478a = iArr;
        }
    }

    public static nq1 a(AdTheme adTheme) {
        Intrinsics.checkNotNullParameter(adTheme, "adTheme");
        int i = a.f16478a[adTheme.ordinal()];
        if (i == 1) {
            return nq1.d;
        }
        if (i == 2) {
            return nq1.c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
