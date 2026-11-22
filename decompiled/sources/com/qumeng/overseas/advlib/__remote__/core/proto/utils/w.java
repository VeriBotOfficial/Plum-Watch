package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12865a = "MIUI";
    public static final String b = "EMUI";
    public static final String c = "FLYME";
    public static final String d = "OPPO";
    public static final String e = "SMARTISAN";
    public static final String f = "VIVO";
    public static final String g = "QIKU";
    private static final String h = "RomUtils";
    private static final String i = "ro.miui.ui.version.name";
    private static final String j = "ro.build.version.emui";
    private static final String k = "ro.build.version.opporom";
    private static final String l = "ro.smartisan.version";
    private static final String m = "ro.vivo.os.version";
    private static String n;
    private static String o;

    public static String a() {
        if (n == null) {
            a("");
        }
        return n;
    }

    public static String b() {
        if (o == null) {
            a("");
        }
        return o;
    }

    public static boolean c() {
        return a(g) || a("360");
    }

    public static boolean d() {
        return a(b);
    }

    public static boolean e() {
        return a(c);
    }

    public static boolean f() {
        return a(f12865a);
    }

    public static boolean g() {
        return a(d);
    }

    public static boolean h() {
        return a(e);
    }

    public static boolean i() {
        return a(f);
    }

    public static boolean a(String str) {
        String str2 = n;
        if (str2 != null) {
            return str2.equals(str);
        }
        String b2 = b(i);
        o = b2;
        if (TextUtils.isEmpty(b2)) {
            String str3 = Build.MANUFACTURER;
            if (!"xiaomi".equalsIgnoreCase(str3)) {
                String b3 = b("ro.build.version.emui");
                o = b3;
                if (TextUtils.isEmpty(b3) && !r.a()) {
                    String b4 = b(k);
                    o = b4;
                    if (TextUtils.isEmpty(b4) && !r.c()) {
                        String b5 = b(m);
                        o = b5;
                        if (TextUtils.isEmpty(b5) && !r.e()) {
                            String b6 = b(l);
                            o = b6;
                            if (!TextUtils.isEmpty(b6)) {
                                n = e;
                            } else {
                                String str4 = Build.DISPLAY;
                                o = str4;
                                if (str4.toUpperCase().contains(c)) {
                                    n = c;
                                } else {
                                    o = "unknown";
                                    n = str3.toUpperCase();
                                }
                            }
                        } else {
                            n = f;
                        }
                    } else {
                        n = d;
                    }
                } else {
                    n = b;
                }
                return n.equals(str);
            }
        }
        n = f12865a;
        return n.equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r6) {
        /*
            java.lang.String r0 = "Unable to read prop "
            java.lang.String r1 = "getprop "
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.StringBuilder r1 = r4.append(r6)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.Process r1 = r3.exec(r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            r1 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3e
            java.lang.String r1 = r3.readLine()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L5d
            r3.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L5d
            r3.close()     // Catch: java.io.IOException -> L35
            return r1
        L35:
            r6 = move-exception
            r6.printStackTrace()
            return r1
        L3a:
            r1 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L5f
        L3e:
            r1 = move-exception
            r3 = r2
        L40:
            java.lang.String r4 = "RomUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r6 = r5.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5d
            android.util.Log.e(r4, r6, r1)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r6 = move-exception
            r6.printStackTrace()
        L5c:
            return r2
        L5d:
            r6 = move-exception
            r2 = r3
        L5f:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.core.proto.utils.w.b(java.lang.String):java.lang.String");
    }

    public static boolean a(List<String> list) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (a(it.next())) {
                return true;
            }
        }
        return false;
    }
}
