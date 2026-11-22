package com.luck.picture.lib.utils;

/* loaded from: classes17.dex */
public class ValueOf {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T to(Object obj, T t) {
        return obj == 0 ? t : obj;
    }

    public static String toString(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static double toDouble(Object obj) {
        return toDouble(obj, 0);
    }

    public static double toDouble(Object obj, int i) {
        if (obj == null) {
            return i;
        }
        try {
            return Double.parseDouble(obj.toString().trim());
        } catch (Exception unused) {
            return i;
        }
    }

    public static long toLong(Object obj, long j) {
        if (obj != null) {
            try {
                String trim = obj.toString().trim();
                if (trim.contains(".")) {
                    return Long.parseLong(trim.substring(0, trim.lastIndexOf(".")));
                }
                return Long.parseLong(trim);
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public static long toLong(Object obj) {
        return toLong(obj, 0L);
    }

    public static float toFloat(Object obj, long j) {
        if (obj == null) {
            return j;
        }
        try {
            return Float.parseFloat(obj.toString().trim());
        } catch (Exception unused) {
            return j;
        }
    }

    public static float toFloat(Object obj) {
        return toFloat(obj, 0L);
    }

    public static int toInt(Object obj, int i) {
        if (obj != null) {
            try {
                String trim = obj.toString().trim();
                if (trim.contains(".")) {
                    return Integer.parseInt(trim.substring(0, trim.lastIndexOf(".")));
                }
                return Integer.parseInt(trim);
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static int toInt(Object obj) {
        return toInt(obj, 0);
    }

    public static boolean toBoolean(Object obj) {
        return toBoolean(obj, false);
    }

    public static boolean toBoolean(Object obj, boolean z) {
        if (obj == null) {
            return false;
        }
        try {
            return !"false".equals(obj.toString().trim().trim());
        } catch (Exception unused) {
            return z;
        }
    }
}
