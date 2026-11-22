package com.qumeng.overseas.advlib.__remote__.utils;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes17.dex */
public class r {
    public static boolean a(String str, String str2) {
        boolean z;
        Matcher b = b(str, str2);
        if (b == null) {
            return false;
        }
        try {
            z = b.find();
        } catch (Throwable th) {
            n.a("RegexUtils", "find error -->> " + th.getMessage(), new Object[0]);
            th.printStackTrace();
            z = false;
        }
        n.a("RegexUtils", "find -->> regex = " + str + " ; target = " + str2 + " ; ret = " + z, new Object[0]);
        return z;
    }

    private static Matcher b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return Pattern.compile(str).matcher(str2);
        } catch (Throwable th) {
            n.a("RegexUtils", "getMatcher error -->> " + th.getMessage(), new Object[0]);
            th.printStackTrace();
            return null;
        }
    }

    public static String c(String str, String str2) {
        return a(str, str2, 0);
    }

    public static boolean d(String str, String str2) {
        Matcher b = b(str, str2);
        if (b == null) {
            return false;
        }
        try {
            return b.matches();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Matcher e(String str, String str2) {
        return b(str, str2);
    }

    public static String a(String str, String str2, int i) {
        String str3;
        Matcher b;
        try {
            b = b(str, str2);
        } catch (Throwable th) {
            n.a("RegexUtils", "group error -->> " + th.getMessage(), new Object[0]);
            th.printStackTrace();
        }
        if (b != null && b.find()) {
            str3 = b.group(i);
            n.a("RegexUtils", "group -->> regex = " + str + " ; target = " + str2 + " ; ret = " + str3, new Object[0]);
            return str3;
        }
        str3 = "";
        n.a("RegexUtils", "group -->> regex = " + str + " ; target = " + str2 + " ; ret = " + str3, new Object[0]);
        return str3;
    }

    public static Matcher a(Pattern pattern, String str) {
        try {
            return pattern.matcher(str);
        } catch (Throwable th) {
            n.a("RegexUtils", "getMatcher error -->> " + th.getMessage(), new Object[0]);
            th.printStackTrace();
            return null;
        }
    }
}
