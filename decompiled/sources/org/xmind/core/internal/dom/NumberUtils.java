package org.xmind.core.internal.dom;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* loaded from: classes7.dex */
public class NumberUtils {
    private static DateFormat dateFormat;

    public static int safeParseInt(String str, int i) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    public static float safeParseFloat(String str, float f) {
        if (str != null) {
            try {
                return Float.parseFloat(str);
            } catch (Throwable unused) {
            }
        }
        return f;
    }

    public static double safeParseDouble(String str, double d) {
        if (str != null) {
            try {
                return Double.parseDouble(str);
            } catch (Throwable unused) {
            }
        }
        return d;
    }

    public static long safeParseLong(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (Throwable unused) {
            }
        }
        return j;
    }

    private static DateFormat getDateFormat() {
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateTimeInstance(2, 2);
        }
        return dateFormat;
    }

    public static String formatDate(long j) {
        return getDateFormat().format(new Date(j));
    }

    public static long parseDate(String str) {
        if (str == null) {
            return System.currentTimeMillis();
        }
        try {
            return getDateFormat().parse(str).getTime();
        } catch (ParseException unused) {
            return System.currentTimeMillis();
        }
    }
}
