package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 {
    private static final Object b = new Object();
    private static volatile d1 c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<Long, c1> f15236a;

    public static final class a {
        @JvmStatic
        public static d1 a() {
            d1 d1Var;
            d1 d1Var2 = d1.c;
            if (d1Var2 != null) {
                return d1Var2;
            }
            synchronized (d1.b) {
                d1Var = d1.c;
                if (d1Var == null) {
                    d1Var = new d1(0);
                    d1.c = d1Var;
                }
            }
            return d1Var;
        }
    }

    private d1() {
        this.f15236a = new HashMap<>();
    }

    public /* synthetic */ d1(int i) {
        this();
    }

    public final c1 a(long j) {
        c1 remove;
        synchronized (b) {
            remove = this.f15236a.remove(Long.valueOf(j));
        }
        return remove;
    }

    public final void a(long j, c1 adActivityData) {
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        synchronized (b) {
            this.f15236a.put(Long.valueOf(j), adActivityData);
            Unit unit = Unit.INSTANCE;
        }
    }
}
