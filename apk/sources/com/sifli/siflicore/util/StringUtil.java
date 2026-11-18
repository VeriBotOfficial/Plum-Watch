package com.sifli.siflicore.util;

/* JADX INFO: loaded from: classes11.dex */
public final class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String paddingHexStringToLen(String str, int r2) {
        if (str == null) {
            return null;
        }
        while (str.length() < r2) {
            str = str + "0";
        }
        return str;
    }
}
