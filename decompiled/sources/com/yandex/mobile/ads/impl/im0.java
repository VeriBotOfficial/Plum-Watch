package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class im0 {
    public static final a c = new a(0);
    private static volatile im0 d;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15829a;
    private final WeakHashMap<kt, h82> b;

    public final void b(kt instreamAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f15829a) {
            this.b.remove(instreamAdPlayer);
        }
    }

    private im0() {
        this.f15829a = new Object();
        this.b = new WeakHashMap<>();
    }

    public /* synthetic */ im0(int i) {
        this();
    }

    public final h82 a(kt instreamAdPlayer) {
        h82 h82Var;
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        synchronized (this.f15829a) {
            h82Var = this.b.get(instreamAdPlayer);
        }
        return h82Var;
    }

    public final void a(kt instreamAdPlayer, h82 adBinder) {
        Intrinsics.checkNotNullParameter(instreamAdPlayer, "instreamAdPlayer");
        Intrinsics.checkNotNullParameter(adBinder, "adBinder");
        synchronized (this.f15829a) {
            this.b.put(instreamAdPlayer, adBinder);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final class a {
        public final im0 a() {
            im0 im0Var;
            im0 im0Var2 = im0.d;
            if (im0Var2 != null) {
                return im0Var2;
            }
            synchronized (this) {
                im0Var = im0.d;
                if (im0Var == null) {
                    im0Var = new im0(0);
                    im0.d = im0Var;
                }
            }
            return im0Var;
        }

        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
