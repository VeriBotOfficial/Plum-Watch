package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r31 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<ViewPager2> f16724a;

    public r31(ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f16724a = new WeakReference<>(viewPager);
    }

    public final void a() {
        ViewPager2 viewPager2 = this.f16724a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        }
    }

    public final void b() {
        ViewPager2 viewPager2 = this.f16724a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
