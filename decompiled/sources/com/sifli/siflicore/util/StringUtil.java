package com.sifli.siflicore.util;

/* loaded from: classes14.dex */
public final class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static String paddingHexStringToLen(String str, int i) {
        if (str == null) {
            return null;
        }
        while (str.length() < i) {
            str = str + "0";
        }
        return str;
    }
}
