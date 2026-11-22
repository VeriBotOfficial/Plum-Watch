package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ms0 {
    private static final Object d = new Object();
    private static volatile ms0 e;
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final f41 f16273a;
    private final ArrayList b;
    private int c;

    public static final class a {
        @JvmStatic
        public static ms0 a() {
            ms0 ms0Var;
            ms0 ms0Var2 = ms0.e;
            if (ms0Var2 != null) {
                return ms0Var2;
            }
            synchronized (ms0.d) {
                ms0Var = ms0.e;
                if (ms0Var == null) {
                    ms0Var = new ms0();
                    ms0.e = ms0Var;
                }
            }
            return ms0Var;
        }
    }

    /* synthetic */ ms0() {
        this(new f41(f41.c));
    }

    private ms0(f41 f41Var) {
        this.f16273a = f41Var;
        this.b = new ArrayList();
    }

    public final Executor c() {
        Executor executor;
        synchronized (d) {
            if (this.b.size() < 4) {
                executor = Executors.newSingleThreadExecutor(this.f16273a);
                Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor(...)");
                this.b.add(executor);
            } else {
                ArrayList arrayList = this.b;
                int i = this.c;
                this.c = i + 1;
                executor = (Executor) arrayList.get(i);
                if (this.c == 4) {
                    this.c = 0;
                }
            }
        }
        return executor;
    }
}
