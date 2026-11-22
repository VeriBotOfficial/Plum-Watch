package com.amap.api.col.p0003sl;

import android.content.Context;

/* compiled from: AdiuManager.java */
/* loaded from: classes11.dex */
public class u9 {
    private static u9 c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1903a;
    private final String b = aa.a(m9.b("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private u9(Context context) {
        this.f1903a = context.getApplicationContext();
    }

    public static u9 a(Context context) {
        if (c == null) {
            synchronized (u9.class) {
                if (c == null) {
                    c = new u9(context);
                }
            }
        }
        return c;
    }

    public final void a(String str) {
        v9.a(this.f1903a).a(this.b);
        v9.a(this.f1903a).b(str);
    }

    public final synchronized void a() {
        try {
            if (d9.e == null) {
                int i = z9.h;
                y9 y9Var = new y9();
                if (d9.e == null) {
                    d9.e = y9Var;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
