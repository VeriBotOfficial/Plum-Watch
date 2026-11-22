package com.baidu.ar;

/* loaded from: classes12.dex */
public class o9 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o6 f7106a;
    public static volatile n6 b;

    public static n6 a() {
        if (b != null) {
            return b;
        }
        if (c() && b == null) {
            b = (n6) ab.a("com.baidu.ar.obr.OBRCache");
        }
        return b;
    }

    public static o6 b() {
        if (f7106a != null) {
            return f7106a;
        }
        if (d() && f7106a == null) {
            f7106a = (o6) ab.a("com.baidu.ar.obr.OBRDownloader");
        }
        return f7106a;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static void e() {
        if (f7106a != null) {
            f7106a.release();
            f7106a = null;
        }
        if (b != null) {
            b.release();
            b = null;
        }
    }
}
