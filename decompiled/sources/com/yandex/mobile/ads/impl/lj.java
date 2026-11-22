package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lj<T extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16128a;
    private final ViewGroup b;
    private final jr0<T> c;
    private final hr0<T> d;
    private final kj<T> e;

    public /* synthetic */ lj(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, list, onPreDrawListener, new jr0(list), new hr0(), new kj(onPreDrawListener));
    }

    public lj(Context context, ViewGroup container, List<fr0<T>> designs, ViewTreeObserver.OnPreDrawListener preDrawListener, jr0<T> layoutDesignProvider, hr0<T> layoutDesignCreator, kj<T> layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f16128a = context;
        this.b = container;
        this.c = layoutDesignProvider;
        this.d = layoutDesignCreator;
        this.e = layoutDesignBinder;
    }

    public final boolean a(gz1 gz1Var) {
        T a2;
        fr0<T> a3 = this.c.a(this.f16128a);
        if (a3 == null || (a2 = this.d.a(this.b, a3)) == null) {
            return false;
        }
        this.e.a(this.b, a2, a3, gz1Var);
        return true;
    }

    public final void a() {
        this.e.a();
    }
}
