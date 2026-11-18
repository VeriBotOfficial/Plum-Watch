package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public class a9 {
    public static int a(Object obj, int r2) {
        if (obj == null) {
            return r2;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return r2;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return r2;
        }
    }

    public static long a(Object obj, long j) {
        if (obj == null) {
            return j;
        }
        if ((obj instanceof Long) || (obj instanceof Float)) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return j;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static String a(Object obj, String str) {
        return obj != null ? String.valueOf(obj) : str;
    }
}
