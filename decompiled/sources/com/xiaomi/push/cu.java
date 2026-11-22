package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
public class cu {

    /* renamed from: a, reason: collision with root package name */
    private static cm f14502a;

    /* renamed from: a, reason: collision with other field name */
    private static cn f302a;

    public static void a(Context context, fb fbVar) {
        if (m11986b(context)) {
            if (f14502a == null) {
                f14502a = new cm(context);
            }
            if (f302a == null) {
                f302a = new cn(context);
            }
            cm cmVar = f14502a;
            fbVar.a(cmVar, cmVar);
            cn cnVar = f302a;
            fbVar.b(cnVar, cnVar);
            a("startStats");
        }
    }

    public static void b(Context context, fb fbVar) {
        cm cmVar = f14502a;
        if (cmVar != null) {
            fbVar.a(cmVar);
            f14502a = null;
        }
        cn cnVar = f302a;
        if (cnVar != null) {
            fbVar.b(cnVar);
            f302a = null;
        }
        a("stopStats");
    }

    /* renamed from: b, reason: collision with other method in class */
    private static boolean m11986b(Context context) {
        return cl.a(context);
    }

    public static void a(Context context) {
        a("onSendMsg");
        if (m11986b(context)) {
            cx.a(context, System.currentTimeMillis(), m11985a(context));
        }
    }

    public static void b(Context context) {
        a("onReceiveMsg");
        if (m11986b(context)) {
            cx.b(context, System.currentTimeMillis(), m11985a(context));
        }
    }

    public static void c(Context context) {
        a("onPing");
        if (m11986b(context)) {
            cx.c(context, System.currentTimeMillis(), m11985a(context));
        }
    }

    public static void d(Context context) {
        a("onPong");
        if (m11986b(context)) {
            cx.d(context, System.currentTimeMillis(), m11985a(context));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m11985a(Context context) {
        return i.m12352b(context);
    }

    static void a(String str) {
        cl.a("Push-PowerStats", str);
    }
}
