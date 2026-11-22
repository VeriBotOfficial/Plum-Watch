package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;

/* loaded from: classes5.dex */
public final class ao0 {
    private static final Object e = new Object();
    private static volatile ao0 f;
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f15027a;
    private boolean b;
    private boolean c;
    private Set<String> d;

    public static final class a {
        @JvmStatic
        public static ao0 a() {
            if (ao0.f == null) {
                synchronized (ao0.e) {
                    if (ao0.f == null) {
                        ao0.f = new ao0(0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            ao0 ao0Var = ao0.f;
            if (ao0Var != null) {
                return ao0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private ao0() {
        this.f15027a = true;
        this.b = true;
        this.c = true;
        this.d = SetsKt.emptySet();
    }

    public final void b(boolean z) {
        this.f15027a = z;
    }

    public final boolean e() {
        return this.f15027a;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final Set<String> c() {
        return this.d;
    }

    public /* synthetic */ ao0(int i) {
        this();
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void c(boolean z) {
        this.b = z;
    }
}
