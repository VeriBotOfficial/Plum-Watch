package com.yandex.mobile.ads.impl;

import android.javax.sip.ListeningPoint;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l2 {
    private static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final ps0 f16069a;
    private volatile i2 b;

    public l2(ps0 localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f16069a = localStorage;
    }

    public final void c() {
        synchronized (c) {
            a(this, null, null, null, Integer.valueOf(b().a() + 1), 7);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void a(l2 l2Var, Boolean bool, g2 g2Var, Long l, Integer num, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            g2Var = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        l2Var.getClass();
        synchronized (c) {
            boolean booleanValue = bool != null ? bool.booleanValue() : l2Var.b().d();
            if (g2Var == null) {
                g2Var = l2Var.b().c();
            }
            i2 i2Var = new i2(booleanValue, g2Var, l != null ? l.longValue() : l2Var.b().b(), num != null ? num.intValue() : l2Var.b().a());
            l2Var.f16069a.b("AdBlockerDetected", i2Var.d());
            l2Var.f16069a.a("AdBlockerRequestPolicy", i2Var.c().name());
            l2Var.f16069a.a("AdBlockerLastUpdate", i2Var.b());
            l2Var.f16069a.a(i2Var.a(), "AdBlockerFailedRequestsCount");
            l2Var.b = i2Var;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final i2 b() {
        i2 i2Var;
        i2 i2Var2 = this.b;
        if (i2Var2 != null) {
            return i2Var2;
        }
        synchronized (c) {
            i2Var = this.b;
            if (i2Var == null) {
                boolean a2 = this.f16069a.a("AdBlockerDetected", false);
                String d = this.f16069a.d("AdBlockerRequestPolicy");
                if (d == null) {
                    d = ListeningPoint.TCP;
                }
                i2 i2Var3 = new i2(a2, g2.valueOf(d), this.f16069a.b("AdBlockerLastUpdate"), this.f16069a.b(0, "AdBlockerFailedRequestsCount"));
                this.b = i2Var3;
                i2Var = i2Var3;
            }
        }
        return i2Var;
    }

    public final void a() {
        synchronized (c) {
            a(this, null, null, null, 0, 7);
            Unit unit = Unit.INSTANCE;
        }
    }
}
