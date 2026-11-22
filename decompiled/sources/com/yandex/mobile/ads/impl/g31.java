package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class g31 {
    static final /* synthetic */ KProperty<Object>[] g = {ta.a(g31.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final r31 f15550a;
    private final k31 b;
    private final kt0 c;
    private final go1 d;
    private jt0 e;
    private boolean f;

    public g31(ViewPager2 viewPager, r31 multiBannerSwiper, k31 multiBannerEventTracker, kt0 jobSchedulerFactory) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        Intrinsics.checkNotNullParameter(jobSchedulerFactory, "jobSchedulerFactory");
        this.f15550a = multiBannerSwiper;
        this.b = multiBannerEventTracker;
        this.c = jobSchedulerFactory;
        this.d = ho1.a(viewPager);
        this.f = true;
    }

    public final void b() {
        jt0 jt0Var = this.e;
        if (jt0Var != null) {
            jt0Var.a();
        }
        this.e = null;
    }

    public final void a() {
        b();
        this.f = false;
    }

    public final void a(long j) {
        Unit unit;
        if (j <= 0 || !this.f) {
            return;
        }
        b();
        ViewPager2 viewPager2 = (ViewPager2) this.d.getValue(this, g[0]);
        if (viewPager2 != null) {
            h31 h31Var = new h31(viewPager2, this.f15550a, this.b);
            this.c.getClass();
            jt0 jt0Var = new jt0(new Handler(Looper.getMainLooper()));
            this.e = jt0Var;
            jt0Var.a(j, h31Var);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            b();
            this.f = false;
        }
    }
}
