package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wg2<V extends View, T> {

    /* renamed from: a, reason: collision with root package name */
    private final vg2<V, T> f17249a;

    public wg2(vg2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f17249a = viewAdapter;
    }

    public final void a() {
        V b = this.f17249a.b();
        if (b == null) {
            return;
        }
        this.f17249a.a(b);
    }

    public final void a(ig<?> asset, yg2 viewConfigurator, T t) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        if (this.f17249a.b() == null) {
            return;
        }
        this.f17249a.a(asset, viewConfigurator, t);
    }

    public final void b() {
        this.f17249a.a();
    }

    public final void b(T t) {
        V b = this.f17249a.b();
        if (b == null) {
            return;
        }
        this.f17249a.b(b, t);
        b.setVisibility(0);
    }

    public final boolean a(T t) {
        V b = this.f17249a.b();
        return b != null && this.f17249a.a(b, t);
    }
}
