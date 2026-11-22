package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j11 {
    public static final a e = new a(0);
    private static volatile j11 f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15872a = new Object();
    private volatile boolean b = true;
    private final i1 c = new i1();
    private final ug1 d = new ug1();

    public final void a(Context context) throws bp0 {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.b) {
            synchronized (this.f15872a) {
                if (this.b) {
                    if (pa.a(context)) {
                        this.c.a(context);
                        this.d.getClass();
                        ug1.a(context);
                    }
                    this.b = false;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public static final class a {
        @JvmStatic
        public final j11 a() {
            j11 j11Var;
            j11 j11Var2 = j11.f;
            if (j11Var2 != null) {
                return j11Var2;
            }
            synchronized (this) {
                j11Var = j11.f;
                if (j11Var == null) {
                    j11Var = new j11();
                    j11.f = j11Var;
                }
            }
            return j11Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
