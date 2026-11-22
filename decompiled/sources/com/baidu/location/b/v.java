package com.baidu.location.b;

import android.location.Location;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private static long f7591a;
    private static com.baidu.location.f.a b;
    private static Location c;
    private static String d;
    private static String e;

    public static String a() {
        return d;
    }

    public static void a(long j) {
        f7591a = j;
    }

    public static void a(Location location) {
        c = location;
    }

    public static void a(com.baidu.location.f.a aVar) {
        b = aVar;
    }

    public static void a(String str) {
        d = str;
    }

    public static long b() {
        return f7591a;
    }

    public static void b(String str) {
        e = str;
    }

    public static com.baidu.location.f.a c() {
        return b;
    }

    public static Location d() {
        return c;
    }

    public static String e() {
        return e;
    }
}
