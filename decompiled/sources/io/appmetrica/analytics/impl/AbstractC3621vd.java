package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3621vd {

    /* renamed from: a, reason: collision with root package name */
    public static D9 f18550a;

    public static final synchronized D9 a(Context context) {
        D9 d9;
        synchronized (AbstractC3621vd.class) {
            d9 = f18550a;
            if (d9 == null) {
                d9 = new D9(context, "uuid.dat");
                f18550a = d9;
            }
        }
        return d9;
    }
}
