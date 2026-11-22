package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3671xd extends Me implements Wk {
    public AbstractC3671xd(Oa oa, String str) {
        super(oa, str);
    }

    public final String c(String str, String str2) {
        return this.f17974a.getString(f(str), str2);
    }

    public final Wk d(String str, String str2) {
        return (Wk) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f17974a.a(f(str));
    }

    public abstract String f(String str);

    public Wk g(String str) {
        return (Wk) d(f(str));
    }

    public AbstractC3671xd(Oa oa) {
        this(oa, null);
    }

    public final Wk d(String str, int i) {
        return (Wk) b(f(str), i);
    }

    public final int c(String str, int i) {
        return this.f17974a.getInt(f(str), i);
    }

    public final Wk d(String str, long j) {
        return (Wk) b(f(str), j);
    }

    public final Wk d(String str, boolean z) {
        return (Wk) b(f(str), z);
    }

    public final long c(String str, long j) {
        return this.f17974a.getLong(f(str), j);
    }

    public final boolean c(String str, boolean z) {
        return this.f17974a.getBoolean(f(str), z);
    }
}
