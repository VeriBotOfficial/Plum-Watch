package com.alipay.apmobilesecuritysdk.e;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f1300a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static Map<String, String> f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (i.class) {
            String str2 = "apdidTokenCache" + str;
            if (f.containsKey(str2)) {
                String str3 = f.get(str2);
                if (com.alipay.sdk.m.d0.a.b(str3)) {
                    return str3;
                }
            }
            return "";
        }
    }

    public static synchronized void a() {
        synchronized (i.class) {
        }
    }

    public static synchronized void a(b bVar) {
        synchronized (i.class) {
            if (bVar != null) {
                b(bVar.f1296a);
                c(bVar.b);
                d(bVar.c);
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (i.class) {
            if (cVar != null) {
                b(cVar.f1297a);
                c(cVar.b);
                e(cVar.d);
                f(cVar.e);
                d(cVar.c);
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f.containsKey(str3)) {
                f.remove(str3);
            }
            f.put(str3, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r1 < 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean a(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Class<com.alipay.apmobilesecuritysdk.e.i> r0 = com.alipay.apmobilesecuritysdk.e.i.class
            monitor-enter(r0)
            long r1 = com.alipay.apmobilesecuritysdk.e.h.a(r5)     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L10
        Ld:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
        L10:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L24
            long r5 = com.alipay.apmobilesecuritysdk.e.h.h(r5, r6)     // Catch: java.lang.Throwable -> L24
            long r3 = r3 - r5
            long r5 = java.lang.Math.abs(r3)     // Catch: java.lang.Throwable -> L24
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L28
            monitor-exit(r0)
            r5 = 1
            return r5
        L24:
            r5 = move-exception
            com.alipay.apmobilesecuritysdk.c.a.a(r5)     // Catch: java.lang.Throwable -> L2b
        L28:
            monitor-exit(r0)
            r5 = 0
            return r5
        L2b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.e.i.a(android.content.Context, java.lang.String):boolean");
    }

    public static synchronized String b() {
        String str;
        synchronized (i.class) {
            str = f1300a;
        }
        return str;
    }

    public static void b(String str) {
        f1300a = str;
    }

    public static synchronized String c() {
        String str;
        synchronized (i.class) {
            str = b;
        }
        return str;
    }

    public static void c(String str) {
        b = str;
    }

    public static synchronized String d() {
        String str;
        synchronized (i.class) {
            str = d;
        }
        return str;
    }

    public static void d(String str) {
        c = str;
    }

    public static synchronized String e() {
        String str;
        synchronized (i.class) {
            str = e;
        }
        return str;
    }

    public static void e(String str) {
        d = str;
    }

    public static synchronized String f() {
        String str;
        synchronized (i.class) {
            str = c;
        }
        return str;
    }

    public static void f(String str) {
        e = str;
    }

    public static synchronized c g() {
        c cVar;
        synchronized (i.class) {
            cVar = new c(f1300a, b, c, d, e);
        }
        return cVar;
    }

    public static void h() {
        f.clear();
        f1300a = "";
        b = "";
        d = "";
        e = "";
        c = "";
    }
}
