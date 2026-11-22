package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hl {
    public final C3232fm A;
    public final Map B;
    public final I9 C;

    /* renamed from: a, reason: collision with root package name */
    public final String f17891a;
    public final String b;
    public final Ll c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final C4 n;
    public final long o;
    public final boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f17892q;
    public final String r;
    public final C3398me s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final BillingConfig x;
    public final C3661x3 y;
    public final C3461p2 z;

    public Hl(String str, String str2, Ll ll) {
        this.f17891a = str;
        this.b = str2;
        this.c = ll;
        this.d = ll.f17963a;
        this.e = ll.b;
        this.f = ll.f;
        this.g = ll.g;
        List list = ll.h;
        this.h = ll.i;
        this.i = ll.c;
        this.j = ll.d;
        String str3 = ll.e;
        this.k = ll.j;
        this.l = ll.k;
        this.m = ll.l;
        this.n = ll.m;
        this.o = ll.n;
        this.p = ll.o;
        this.f17892q = ll.p;
        this.r = ll.f17964q;
        C3331jm c3331jm = ll.r;
        this.s = ll.s;
        this.t = ll.t;
        this.u = ll.u;
        this.v = ll.v;
        this.w = ll.w;
        this.x = ll.x;
        this.y = ll.y;
        this.z = ll.z;
        this.A = ll.A;
        this.B = ll.B;
        this.C = ll.C;
    }

    public final String a() {
        return this.f17891a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.v;
    }

    public final long d() {
        return this.u;
    }

    public final String e() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f17891a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
