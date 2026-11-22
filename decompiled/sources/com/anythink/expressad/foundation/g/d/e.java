package com.anythink.expressad.foundation.g.d;

import com.qumeng.overseas.advlib.__remote__.core.proto.utils.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class e {
    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    private static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    private static String c(String str) {
        return str == null ? "" : str;
    }

    private static String d(String str) {
        if (b(str)) {
            return str;
        }
        char charAt = str.charAt(0);
        return (!Character.isLetter(charAt) || Character.isUpperCase(charAt)) ? str : new StringBuilder(str.length()).append(Character.toUpperCase(charAt)).append(str.substring(1)).toString();
    }

    private static String e(String str) {
        if (b(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException occurred. ", e);
        }
    }

    private static String a(String str, String str2) {
        if (b(str) || str.getBytes().length == str.length()) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str2;
        }
    }

    private static String f(String str) {
        if (b(str)) {
            return "";
        }
        Matcher matcher = Pattern.compile(".*<[\\s]*a[\\s]*.*>(.+?)<[\\s]*/a[\\s]*>.*", 2).matcher(str);
        return matcher.matches() ? matcher.group(1) : str;
    }

    private static String g(String str) {
        if (b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 12288) {
                charArray[i] = ' ';
            } else if (c >= 65281 && c <= 65374) {
                charArray[i] = (char) (c - 65248);
            } else {
                charArray[i] = c;
            }
        }
        return new String(charArray);
    }

    private static String h(String str) {
        if (b(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == ' ') {
                charArray[i] = z.f12869a;
            } else if (c >= '!' && c <= '~') {
                charArray[i] = (char) (c + 65248);
            } else {
                charArray[i] = c;
            }
        }
        return new String(charArray);
    }

    private static String a(long j) {
        if (j <= 0) {
            return "0M";
        }
        return String.format("%.1f", Float.valueOf((j / 1024.0f) / 1024.0f)) + "M";
    }
}
