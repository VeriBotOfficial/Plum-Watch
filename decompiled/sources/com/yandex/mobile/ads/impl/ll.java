package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    private final List<xb2> f16137a;
    private final ft b;
    private final WeakReference<ViewGroup> c;
    private final tl0 d;
    private t70 e;

    public ll(ViewGroup adViewGroup, List<xb2> friendlyOverlays, ft binder, WeakReference<ViewGroup> adViewGroupReference, tl0 binderPrivate, t70 t70Var) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(adViewGroupReference, "adViewGroupReference");
        Intrinsics.checkNotNullParameter(binderPrivate, "binderPrivate");
        this.f16137a = friendlyOverlays;
        this.b = binder;
        this.c = adViewGroupReference;
        this.d = binderPrivate;
        this.e = t70Var;
    }

    public final void b() {
        t70 t70Var;
        ViewGroup viewGroup = this.c.get();
        if (viewGroup != null && (t70Var = this.e) != null) {
            viewGroup.removeView(t70Var);
        }
        this.e = null;
        ft ftVar = this.b;
        ftVar.a((fm2) null);
        ftVar.e();
        ftVar.invalidateAdPlayer();
        ftVar.a();
    }

    public final void c() {
        this.d.a();
    }

    public final void d() {
        this.d.b();
    }

    public final void a() {
        ViewGroup viewGroup = this.c.get();
        if (viewGroup != null) {
            if (this.e == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.e = new t70(context);
                viewGroup.addView(this.e, new ViewGroup.LayoutParams(-1, -1));
            }
            t70 t70Var = this.e;
            if (t70Var != null) {
                this.d.a(t70Var, this.f16137a);
            }
        }
    }

    public final void a(nb2 nb2Var) {
        this.b.a(nb2Var);
    }
}
