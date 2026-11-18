package com.blankj.utilcode.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes15.dex */
public final class NumberUtils {
    private static final ThreadLocal<DecimalFormat> DF_THREAD_LOCAL = new ThreadLocal<DecimalFormat>() { // from class: com.blankj.utilcode.util.NumberUtils.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return (DecimalFormat) NumberFormat.getInstance();
        }
    };

    public static DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }

    private NumberUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String format(float f, int r3) {
        return format(f, false, 1, r3, true);
    }

    public static String format(float f, int r3, boolean z) {
        return format(f, false, 1, r3, z);
    }

    public static String format(float f, int r2, int r3, boolean z) {
        return format(f, false, r2, r3, z);
    }

    public static String format(float f, boolean z, int r3) {
        return format(f, z, 1, r3, true);
    }

    public static String format(float f, boolean z, int r3, boolean z2) {
        return format(f, z, 1, r3, z2);
    }

    public static String format(float f, boolean z, int r8, int r9, boolean z2) {
        return format(float2Double(f), z, r8, r9, z2);
    }

    public static String format(double d, int r8) {
        return format(d, false, 1, r8, true);
    }

    public static String format(double d, int r8, boolean z) {
        return format(d, false, 1, r8, z);
    }

    public static String format(double d, int r8, int r9, boolean z) {
        return format(d, false, r8, r9, z);
    }

    public static String format(double d, boolean z, int r9) {
        return format(d, z, 1, r9, true);
    }

    public static String format(double d, boolean z, int r9, boolean z2) {
        return format(d, z, 1, r9, z2);
    }

    public static String format(double d, boolean z, int r4, int r5, boolean z2) {
        DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z);
        safeDecimalFormat.setRoundingMode(z2 ? RoundingMode.HALF_UP : RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(r4);
        safeDecimalFormat.setMinimumFractionDigits(r5);
        safeDecimalFormat.setMaximumFractionDigits(r5);
        return safeDecimalFormat.format(d);
    }

    public static double float2Double(float f) {
        return new BigDecimal(String.valueOf(f)).doubleValue();
    }
}
