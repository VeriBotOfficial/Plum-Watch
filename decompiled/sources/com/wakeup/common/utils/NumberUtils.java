package com.wakeup.common.utils;

import androidx.camera.core.processing.util.GLUtils;
import com.wakeup.common.log.LogUtils;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes2.dex */
public class NumberUtils {
    private static final String TAG = "NumberUtils";

    private NumberUtils() {
    }

    public static int parseInt(String num) {
        return parseInt(num, 0);
    }

    public static int parseInt(String num, int defaultV) {
        if (num != null && num.length() != 0) {
            try {
                return Integer.parseInt(num);
            } catch (NumberFormatException unused) {
                LogUtils.e(TAG, "parseInt NumberFormatException");
            }
        }
        return defaultV;
    }

    public static long parseLong(String num) {
        try {
            return Long.parseLong(num);
        } catch (NumberFormatException unused) {
            LogUtils.e(TAG, "parseLong NumberFormatException");
            return 0L;
        }
    }

    public static float parseFloat(String num) {
        if (num != null && num.length() != 0) {
            try {
                return Float.parseFloat(num);
            } catch (NumberFormatException unused) {
                LogUtils.e(TAG, "parseFloat NumberFormatException");
            }
        }
        return 0.0f;
    }

    public static double parseDouble(String num) {
        try {
            return Double.parseDouble(num);
        } catch (NumberFormatException unused) {
            LogUtils.e(TAG, "parseDouble NumberFormatException");
            return 0.0d;
        }
    }

    public static float formatNumber(double d, int count) {
        return parseFloat(format(d, count));
    }

    public static float formatNumber(float f, int count) {
        return parseFloat(format(f, count));
    }

    public static String formatNumberToStr(float f, int count) {
        return format(f, count);
    }

    public static String formatNumberToStr(double d, int count) {
        return format(d, count);
    }

    public static int formatNumberToInt(double d) {
        return parseInt(format(d, 0));
    }

    public static int formatNumberToInt(float f) {
        return parseInt(format(f, 0));
    }

    public static String format(double d, int count) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (count == 1) {
            decimalFormat = new DecimalFormat(GLUtils.VERSION_UNKNOWN);
        } else if (count == 2) {
            decimalFormat = new DecimalFormat("0.00");
        } else if (count == 0) {
            decimalFormat = new DecimalFormat("0");
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(d);
    }

    public static long roundToNearest(int number, int place) {
        if (place > 0 && number > place) {
            return Math.round(number / place) * place;
        }
        return number;
    }
}
