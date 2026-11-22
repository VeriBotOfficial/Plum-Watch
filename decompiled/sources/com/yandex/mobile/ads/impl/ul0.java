package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ul0 {
    private static final Object b = new Object();
    private static volatile ul0 c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<View, ft> f17065a;

    public static final class a {
        @JvmStatic
        public static ul0 a() {
            if (ul0.c == null) {
                synchronized (ul0.b) {
                    if (ul0.c == null) {
                        ul0.c = new ul0(0);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            ul0 ul0Var = ul0.c;
            if (ul0Var != null) {
                return ul0Var;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    private ul0() {
        this.f17065a = new WeakHashMap<>();
    }

    public /* synthetic */ ul0(int i) {
        this();
    }

    public final ft a(View view) {
        ft ftVar;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (b) {
            ftVar = this.f17065a.get(view);
        }
        return ftVar;
    }

    public final void a(View view, ft instreamAdBinder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (b) {
            this.f17065a.put(view, instreamAdBinder);
        }
    }

    public final boolean a(ft instreamAdBinder) {
        boolean z;
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (b) {
            Set<Map.Entry<View, ft>> entrySet = this.f17065a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
            Iterator<Map.Entry<View, ft>> it = entrySet.iterator();
            z = false;
            while (it.hasNext()) {
                if (instreamAdBinder == it.next().getValue()) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
