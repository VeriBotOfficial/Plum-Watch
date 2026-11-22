package com.baidu.ar;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class pe {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, String> f7122a = new HashMap();
    public static long b;

    public static void a() {
        f7122a.put("time1", String.valueOf(Math.abs(System.currentTimeMillis() - b) / 1000.0d));
    }

    public static void b() {
        f7122a.put("time2", String.valueOf(Math.abs(System.currentTimeMillis() - b) / 1000.0d));
    }

    public static void c() {
        f7122a.put("time3", String.valueOf(Math.abs(System.currentTimeMillis() - b) / 1000.0d));
    }

    public static void d() {
        f7122a.put("time4", String.valueOf(Math.abs(System.currentTimeMillis() - b) / 1000.0d));
    }

    public static void e() {
        f7122a.put("time5", String.valueOf(Math.abs(System.currentTimeMillis() - b) / 1000.0d));
    }

    public static Map<String, String> f() {
        return f7122a;
    }

    public static void g() {
        b = System.currentTimeMillis();
        f7122a.clear();
    }
}
