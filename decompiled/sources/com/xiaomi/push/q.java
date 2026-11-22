package com.xiaomi.push;

/* loaded from: classes4.dex */
public class q {
    public static String a(String str, String str2) {
        try {
            return (String) s.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
