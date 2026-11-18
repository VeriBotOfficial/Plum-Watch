package com.anythink.core.common.v;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public final class ah {
    private static String a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int r3 = Math.abs(length2 - length);
        StringBuilder sb = new StringBuilder(str);
        for (int r2 = 0; r2 < r3; r2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static boolean a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int r2 = 0; r2 < length; r2++) {
            if (!Character.isDigit(charSequence.charAt(r2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(String str) {
        return str.matches("[\\u4e00-\\u9fa5]+");
    }

    public static String a(String str) {
        byte[] bytes = str.getBytes();
        for (int r0 = 0; r0 < bytes.length; r0++) {
            bytes[r0] = (byte) (bytes[r0] - 3);
        }
        return new String(bytes);
    }
}
