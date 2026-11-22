package com.vivo.push.g;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* compiled from: PushSecurityManager.java */
/* loaded from: classes2.dex */
public final class b {
    private static volatile b c;

    /* renamed from: a, reason: collision with root package name */
    private a f14085a;
    private Context b;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }

    private b() {
    }

    public final synchronized a a(Context context) {
        a aVar = this.f14085a;
        if (aVar != null) {
            return aVar;
        }
        if (context == null) {
            return null;
        }
        if (aVar == null) {
            this.b = ContextDelegate.getContext(context.getApplicationContext());
            this.f14085a = new c(this.b);
        }
        return this.f14085a;
    }
}
