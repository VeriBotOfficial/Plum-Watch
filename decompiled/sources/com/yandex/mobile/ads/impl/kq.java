package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nq;
import com.yandex.mobile.ads.impl.ps0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kq implements iq, ps0.a {
    private static final Object j = new Object();
    private final f72 b;
    private final f72 c;
    private String d;
    private String e;
    private boolean f;
    private String g;
    private String h;
    private String i;

    public kq(lq cmpV1, mq cmpV2, ps0 preferences) {
        Intrinsics.checkNotNullParameter(cmpV1, "cmpV1");
        Intrinsics.checkNotNullParameter(cmpV2, "cmpV2");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.b = cmpV1;
        this.c = cmpV2;
        for (gq gqVar : gq.values()) {
            a(preferences, gqVar);
        }
        preferences.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.iq
    public final String b() {
        String str;
        synchronized (j) {
            str = this.d;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.iq
    public final String a() {
        String str;
        synchronized (j) {
            str = this.e;
        }
        return str;
    }

    @Override // com.yandex.mobile.ads.impl.ps0.a
    public final void a(ps0 localStorage, String key) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (j) {
            nq a2 = this.c.a(localStorage, key);
            if (a2 == null) {
                a2 = this.b.a(localStorage, key);
            }
            if (a2 != null) {
                a(a2);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (j) {
            z = this.f;
        }
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.iq
    public final String c() {
        String str;
        synchronized (j) {
            str = this.g;
        }
        return str;
    }

    public final String f() {
        String str;
        synchronized (j) {
            str = this.h;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (j) {
            str = this.i;
        }
        return str;
    }

    private final void a(ps0 ps0Var, gq gqVar) {
        nq a2 = this.c.a(ps0Var, gqVar);
        if (a2 == null) {
            a2 = this.b.a(ps0Var, gqVar);
        }
        a(a2);
    }

    private final void a(nq nqVar) {
        if (nqVar instanceof nq.b) {
            this.f = ((nq.b) nqVar).a();
            return;
        }
        if (nqVar instanceof nq.c) {
            this.d = ((nq.c) nqVar).a();
            return;
        }
        if (nqVar instanceof nq.d) {
            this.e = ((nq.d) nqVar).a();
            return;
        }
        if (nqVar instanceof nq.e) {
            this.g = ((nq.e) nqVar).a();
        } else if (nqVar instanceof nq.f) {
            this.h = ((nq.f) nqVar).a();
        } else if (nqVar instanceof nq.a) {
            this.i = ((nq.a) nqVar).a();
        }
    }
}
