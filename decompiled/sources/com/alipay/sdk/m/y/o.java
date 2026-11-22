package com.alipay.sdk.m.y;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1496a = "resultStatus";
    public static final String b = "memo";
    public static final String c = "result";
    public static final String d = "externalSdkData";

    public static Map<String, String> a(com.alipay.sdk.m.w.a aVar, String str) {
        Map<String, String> a2 = a();
        try {
            return a(str);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.l, com.alipay.sdk.m.m.b.f1412q, th);
            return a2;
        }
    }

    public static String b(String str, String str2) {
        String str3 = null;
        try {
            for (String str4 : str.split(";")) {
                String[] split = str4.split("=", 2);
                if (split.length == 2) {
                    String trim = split[0].trim();
                    String trim2 = split[1].trim();
                    if (TextUtils.equals(trim, str2)) {
                        str3 = trim2.substring(1, trim2.length() - 1);
                    }
                }
            }
            return str3;
        } catch (Throwable th) {
            g.a(th);
            return str3;
        }
    }

    public static String c(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str.indexOf(str3) + str3.length(), str.lastIndexOf("}"));
    }

    public static Map<String, String> a() {
        com.alipay.sdk.m.l.c a2 = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.CANCELED.c());
        HashMap hashMap = new HashMap();
        hashMap.put(f1496a, Integer.toString(a2.c()));
        hashMap.put(b, a2.b());
        hashMap.put("result", "");
        return hashMap;
    }

    public static Map<String, String> a(String str) {
        String[] split = str.split(";");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            hashMap.put(substring, c(str2, substring));
        }
        return hashMap;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : Separators.QUESTION;
        } catch (Throwable th) {
            g.a(th);
            return Separators.QUESTION;
        }
    }
}
