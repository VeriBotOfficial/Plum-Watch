package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yt0 {
    private static final Object b = new Object();
    private static volatile yt0 c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f17452a;

    public static final class a {
        public static yt0 a() {
            if (yt0.c == null) {
                synchronized (yt0.b) {
                    if (yt0.c == null) {
                        yt0.c = new yt0(0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            yt0 yt0Var = yt0.c;
            if (yt0Var != null) {
                return yt0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private yt0() {
        this.f17452a = new WeakHashMap();
    }

    public /* synthetic */ yt0(int i) {
        this();
    }

    public final st0 a(t70 view) {
        st0 st0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (b) {
            st0Var = (st0) this.f17452a.get(view);
        }
        return st0Var;
    }

    public final void a(t70 view, st0 presenter) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (b) {
        }
    }

    public final boolean a(st0 presenter) {
        boolean z;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (b) {
            Iterator it = this.f17452a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(presenter, (st0) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
