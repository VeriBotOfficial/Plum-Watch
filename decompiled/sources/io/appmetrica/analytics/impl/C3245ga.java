package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3245ga {
    public static volatile C3245ga c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f18289a;
    public final HashMap b = new HashMap();

    public C3245ga(Context context) {
        this.f18289a = context;
    }

    public static C3245ga a(Context context) {
        if (c == null) {
            synchronized (C3245ga.class) {
                if (c == null) {
                    c = new C3245ga(context);
                }
            }
        }
        return c;
    }

    public final D9 a(String str) {
        if (!this.b.containsKey(str)) {
            synchronized (this) {
                if (!this.b.containsKey(str)) {
                    this.b.put(str, new D9(this.f18289a, str));
                }
            }
        }
        return (D9) this.b.get(str);
    }
}
