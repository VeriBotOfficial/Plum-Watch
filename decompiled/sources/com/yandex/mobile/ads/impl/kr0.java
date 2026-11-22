package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kr0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16045a;
    private final ViewGroup b;
    private final jr0<V> c;
    private final hr0<V> d;
    private final gr0<V> e;

    public kr0(Context context, ViewGroup container, ArrayList designs, jr0 layoutDesignProvider, hr0 layoutDesignCreator, gr0 layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f16045a = context;
        this.b = container;
        this.c = layoutDesignProvider;
        this.d = layoutDesignCreator;
        this.e = layoutDesignBinder;
    }

    public final boolean a() {
        V a2;
        fr0<V> a3 = this.c.a(this.f16045a);
        if (a3 == null || (a2 = this.d.a(this.b, a3)) == null) {
            return false;
        }
        this.e.a(this.b, a2, a3);
        return true;
    }

    public final void b() {
        this.e.a(this.b);
    }
}
