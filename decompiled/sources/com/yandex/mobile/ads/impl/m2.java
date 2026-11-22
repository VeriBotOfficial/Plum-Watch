package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m2 {
    private static final Object b = new Object();
    private static volatile m2 c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final l2 f16199a;

    public static final class a {
        @JvmStatic
        public static m2 a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (m2.c == null) {
                synchronized (m2.b) {
                    if (m2.c == null) {
                        int i = rs0.b;
                        Intrinsics.checkNotNullParameter(context, "context");
                        m2.c = new m2(rs0.a(context, "YadPreferenceFile"));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            m2 m2Var = m2.c;
            if (m2Var != null) {
                return m2Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private m2(l2 l2Var) {
        this.f16199a = l2Var;
    }

    /* synthetic */ m2(ps0 ps0Var) {
        this(new l2(ps0Var));
    }

    public final l2 c() {
        return this.f16199a;
    }
}
