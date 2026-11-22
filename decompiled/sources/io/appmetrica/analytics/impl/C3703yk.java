package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3703yk {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f18599a;
    protected final Le b;
    public C3370lb c;

    public C3703yk(Le le, String str) {
        this.b = le;
        this.f18599a = str;
        C3370lb c3370lb = new C3370lb();
        try {
            String h2 = le.h(str);
            if (!TextUtils.isEmpty(h2)) {
                c3370lb = new C3370lb(h2);
            }
        } catch (Throwable unused) {
        }
        this.c = c3370lb;
    }

    public final C3703yk a(long j) {
        a(h, Long.valueOf(j));
        return this;
    }

    public final C3703yk b(long j) {
        a(e, Long.valueOf(j));
        return this;
    }

    public final Long c() {
        return this.c.a(h);
    }

    public final C3703yk d(long j) {
        a(f, Long.valueOf(j));
        return this;
    }

    public final Long e() {
        return this.c.a(g);
    }

    public final Long f() {
        return this.c.a(f);
    }

    public final Long g() {
        return this.c.a(d);
    }

    public final boolean h() {
        return this.c.length() > 0;
    }

    public final Boolean i() {
        C3370lb c3370lb = this.c;
        c3370lb.getClass();
        try {
            return Boolean.valueOf(c3370lb.getBoolean(i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final C3703yk a(boolean z) {
        a(i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.b.e(this.f18599a, this.c.toString());
        this.b.b();
    }

    public final C3703yk c(long j) {
        a(g, Long.valueOf(j));
        return this;
    }

    public final Long d() {
        return this.c.a(e);
    }

    public final C3703yk e(long j) {
        a(d, Long.valueOf(j));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.c = new C3370lb();
        b();
    }
}
