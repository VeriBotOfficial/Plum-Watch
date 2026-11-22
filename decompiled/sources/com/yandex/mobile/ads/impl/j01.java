package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.StatFs;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class j01 {

    public static final class a {
        @JvmStatic
        public static long a(Context context, long j, long j2) {
            long j3;
            Intrinsics.checkNotNullParameter(context, "context");
            long coerceAtMost = RangesKt.coerceAtMost(j, j2);
            try {
                StatFs statFs = new StatFs(r10.a(context, "").getAbsolutePath());
                j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (IllegalArgumentException unused) {
                sp0.c(new Object[0]);
                j3 = coerceAtMost;
            }
            long j4 = 100;
            return RangesKt.coerceAtLeast(RangesKt.coerceAtMost((2 * j3) / j4, j2), RangesKt.coerceAtMost(coerceAtMost, (j3 * 50) / j4));
        }
    }

    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
