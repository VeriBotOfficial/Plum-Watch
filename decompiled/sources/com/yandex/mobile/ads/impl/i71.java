package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.v62;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class i71 implements ViewTreeObserver.OnGlobalLayoutListener {
    static final /* synthetic */ KProperty<Object>[] d = {ta.a(i71.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final v62.a f15787a;
    private final go1 b;
    private Integer c;

    public i71(View view, v62.a trackingListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f15787a = trackingListener;
        this.b = ho1.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.b.getValue(this, d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.b.getValue(this, d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = (View) this.b.getValue(this, d[0]);
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f15787a.a();
            } else {
                this.f15787a.b();
            }
        }
    }
}
