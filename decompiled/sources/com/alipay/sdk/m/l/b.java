package com.alipay.sdk.m.l;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f1402a = false;
    public static volatile String b;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        c a2 = c.a(c.DOUBLE_REQUEST.c());
        return a(a2.c(), a2.b(), "");
    }

    public static boolean c() {
        return f1402a;
    }

    public static String d() {
        return b;
    }

    public static String e() {
        c a2 = c.a(c.PARAMS_ERROR.c());
        return a(a2.c(), a2.b(), "");
    }

    public static void a(boolean z) {
        f1402a = z;
    }

    public static String a() {
        c a2 = c.a(c.CANCELED.c());
        return a(a2.c(), a2.b(), "");
    }

    public static String a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("resultStatus={");
        sb.append(i).append("};memo={").append(str).append("};result={").append(str2).append("}");
        return sb.toString();
    }
}
