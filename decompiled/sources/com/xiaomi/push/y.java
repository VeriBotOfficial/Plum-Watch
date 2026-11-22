package com.xiaomi.push;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static int f14829a;

    /* renamed from: a, reason: collision with other field name */
    public static final String f1125a;

    /* renamed from: a, reason: collision with other field name */
    public static boolean f1126a;

    static {
        String str = ab.f14415a ? "ONEBOX" : "@SHIP.TO.2A2FE0D7@";
        f1125a = str;
        f1126a = false;
        f14829a = 1;
        if (str.equalsIgnoreCase("SANDBOX")) {
            f14829a = 2;
        } else if (str.equalsIgnoreCase("ONEBOX")) {
            f14829a = 3;
        } else {
            f14829a = 1;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12500a() {
        return f14829a == 2;
    }

    public static boolean b() {
        return f14829a == 3;
    }

    public static int a() {
        return f14829a;
    }

    public static void a(int i) {
        f14829a = i;
    }
}
