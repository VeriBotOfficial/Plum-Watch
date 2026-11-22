package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.lr;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pw1 {
    private static final Object j = new Object();
    private static volatile pw1 k;
    public static final /* synthetic */ int l = 0;

    /* renamed from: a, reason: collision with root package name */
    private ju1 f16602a;
    private Boolean b;
    private Boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Integer h;
    private boolean i;

    public static final class a {
        @JvmStatic
        public static pw1 a() {
            pw1 pw1Var;
            pw1 pw1Var2 = pw1.k;
            if (pw1Var2 != null) {
                return pw1Var2;
            }
            synchronized (pw1.j) {
                pw1Var = pw1.k;
                if (pw1Var == null) {
                    pw1Var = new pw1(0);
                    pw1.k = pw1Var;
                }
            }
            return pw1Var;
        }
    }

    public static void c() {
        synchronized (j) {
        }
    }

    public final void b(boolean z) {
        synchronized (j) {
            this.d = z;
            this.e = z;
            this.f = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void c(boolean z) {
        synchronized (j) {
            this.c = Boolean.valueOf(z);
            Unit unit = Unit.INSTANCE;
        }
    }

    private pw1() {
        this.f = true;
        this.g = true;
    }

    public /* synthetic */ pw1(int i) {
        this();
    }

    public final Integer e() {
        Integer num;
        synchronized (j) {
            num = this.h;
        }
        return num;
    }

    public final void e(boolean z) {
        synchronized (j) {
            this.i = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (j) {
            z = this.i;
        }
        return z;
    }

    public final void d(boolean z) {
        synchronized (j) {
            this.g = z;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean h() {
        boolean z;
        synchronized (j) {
            z = this.d;
        }
        return z;
    }

    public final boolean i() {
        boolean z;
        synchronized (j) {
            z = this.e;
        }
        return z;
    }

    public final boolean k() {
        boolean z;
        synchronized (j) {
            z = this.f;
        }
        return z;
    }

    public final Boolean j() {
        Boolean bool;
        synchronized (j) {
            bool = this.b;
        }
        return bool;
    }

    public final Boolean f() {
        Boolean bool;
        synchronized (j) {
            bool = this.c;
        }
        return bool;
    }

    public final void f(boolean z) {
        synchronized (j) {
            this.b = Boolean.valueOf(z);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (j) {
            z = this.g;
        }
        return z;
    }

    public final ju1 a(Context context) {
        ju1 ju1Var;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (j) {
            if (this.f16602a == null) {
                lr.f16157a.getClass();
                this.f16602a = lr.a.a(context).a();
            }
            ju1Var = this.f16602a;
        }
        return ju1Var;
    }

    public final void a(Context context, ju1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        synchronized (j) {
            this.f16602a = sdkConfiguration;
            lr.f16157a.getClass();
            lr.a.a(context).a(sdkConfiguration);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(Integer num) {
        synchronized (j) {
            this.h = num;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a(boolean z) {
        synchronized (j) {
            this.d = z;
            this.f = z;
            Unit unit = Unit.INSTANCE;
        }
    }
}
