package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public abstract class vg2<V extends View, T> {
    static final /* synthetic */ KProperty<Object>[] b = {ta.a(vg2.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final go1 f17161a;

    public vg2(V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f17161a = ho1.a(view);
    }

    public void a() {
    }

    public void a(V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    public abstract boolean a(V v, T t);

    public abstract void b(V v, T t);

    public final V b() {
        return (V) this.f17161a.getValue(this, b[0]);
    }

    public final boolean c() {
        V view = b();
        if (view == null || wh2.d(view)) {
            return false;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        return view.getWidth() >= 1 && view.getHeight() >= 1;
    }

    public void a(ig<?> asset, yg2 viewConfigurator, T t) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        V b2 = b();
        if (b2 == null) {
            return;
        }
        viewConfigurator.a(b2, asset);
        viewConfigurator.a(asset, new xg2(b2));
    }
}
