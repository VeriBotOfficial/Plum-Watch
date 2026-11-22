package com.anythink.core.basead;

import android.content.Context;
import com.anythink.core.common.d.u;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.af;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f3557a;

    private b() {
    }

    public static b a() {
        if (f3557a == null) {
            synchronized (b.class) {
                if (f3557a == null) {
                    f3557a = new b();
                }
            }
        }
        return f3557a;
    }

    public static void a(Context context, String str, String str2) {
        af.b(context, u.b.e, str, str2);
    }

    public static String a(Context context, String str) {
        return af.c(context, u.b.e, str, "");
    }

    public static void b(Context context, String str) {
        af.a(context, u.b.e, str);
    }

    public static String a(x xVar) {
        if (xVar == null) {
            return "";
        }
        return a(xVar.b, xVar.c, xVar.f);
    }

    public static String a(String str, String str2, int i) {
        return str + "_" + str2 + "_" + i;
    }
}
