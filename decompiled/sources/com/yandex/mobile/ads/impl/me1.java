package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class me1 {
    private static final Object c = new Object();
    private static volatile me1 d;
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ve1 f16231a;
    private boolean b;

    public static final class a {
        @JvmStatic
        public static me1 a() {
            me1 me1Var;
            me1 me1Var2 = me1.d;
            if (me1Var2 != null) {
                return me1Var2;
            }
            synchronized (me1.c) {
                me1Var = me1.d;
                if (me1Var == null) {
                    me1Var = new me1();
                    me1.d = me1Var;
                }
            }
            return me1Var;
        }
    }

    /* synthetic */ me1() {
        this(new ve1());
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (c) {
            if (this.f16231a.a(context) && !this.b) {
                ye1.a(context);
                this.b = true;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private me1(ve1 ve1Var) {
        this.f16231a = ve1Var;
    }
}
