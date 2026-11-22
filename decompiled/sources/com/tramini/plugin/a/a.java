package com.tramini.plugin.a;

import android.text.TextUtils;
import com.tramini.plugin.a.b.a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f13690a;

    private a() {
    }

    public static a a() {
        if (f13690a == null) {
            synchronized (a.class) {
                if (f13690a == null) {
                    f13690a = new a();
                }
            }
        }
        return f13690a;
    }

    public static String b() {
        com.tramini.plugin.b.b b = com.tramini.plugin.b.c.b(com.tramini.plugin.a.b.c.a().b());
        return b != null ? a(b.o(), a.C0903a.b) : a.C0903a.b;
    }

    public static String c() {
        com.tramini.plugin.b.b b = com.tramini.plugin.b.c.b(com.tramini.plugin.a.b.c.a().b());
        return b != null ? a(b.p(), a.C0903a.c) : a.C0903a.c;
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}
