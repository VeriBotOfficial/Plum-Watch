package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class fz<V extends View, T> implements jg<T> {

    /* renamed from: a, reason: collision with root package name */
    private final vg2<V, T> f15538a;

    public fz(vg2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f15538a = viewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final void destroy() {
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final boolean d() {
        return wh2.a(this.f15538a.b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final boolean b() {
        return this.f15538a.b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final boolean e() {
        return this.f15538a.c();
    }

    public void b(T t) {
        c(t);
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final lh2 c() {
        V view = this.f15538a.b();
        if (view == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        return new lh2(view.getWidth(), view.getHeight());
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final void a() {
        V b = this.f15538a.b();
        if (b == null) {
            return;
        }
        this.f15538a.a(b);
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final void a(ig<T> asset, yg2 viewConfigurator) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f15538a.a(asset, viewConfigurator, asset.d());
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final void c(T t) {
        V b = this.f15538a.b();
        if (b == null) {
            return;
        }
        this.f15538a.b(b, t);
        b.setVisibility(0);
    }

    @Override // com.yandex.mobile.ads.impl.jg
    public final boolean a(T t) {
        V b = this.f15538a.b();
        return b != null && this.f15538a.a(b, t);
    }
}
