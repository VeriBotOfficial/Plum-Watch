package com.baidu.sec.privacy.f;

/* compiled from: SystemPropertiesCompat.java */
/* loaded from: classes13.dex */
public class g {
    public static String a(String str, String str2) {
        try {
            Class a2 = com.baidu.sec.privacy.b.b.a(com.baidu.sec.privacy.b.b.a()).a(g.class.getClassLoader(), "android.os.SystemProperties");
            if (a2 != null) {
                return (String) a2.getMethod("get", String.class).invoke(a2, str);
            }
        } catch (Throwable th) {
            c.a(th);
        }
        return str2;
    }
}
