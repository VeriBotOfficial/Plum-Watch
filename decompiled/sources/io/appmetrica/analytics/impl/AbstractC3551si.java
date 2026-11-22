package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.si, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3551si {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f18497a;
    public final String b;
    public final String c;

    public AbstractC3551si(Context context, String str, String str2) {
        this.f18497a = context;
        this.b = str;
        this.c = str2;
    }

    public final Object a() {
        int identifier = this.f18497a.getResources().getIdentifier(this.b, this.c, this.f18497a.getPackageName());
        if (identifier == 0) {
            return null;
        }
        try {
            return a(identifier);
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract Object a(int i);
}
