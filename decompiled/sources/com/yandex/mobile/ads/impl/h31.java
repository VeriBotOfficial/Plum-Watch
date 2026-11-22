package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class h31 extends yn {
    static final /* synthetic */ KProperty<Object>[] g = {ta.a(h31.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    private final r31 c;
    private final k31 d;
    private final go1 e;
    private a f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a(0, "LEFT");
            b = aVar;
            a aVar2 = new a(1, "RIGHT");
            c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            d = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        private a(int i, String str) {
        }
    }

    public h31(ViewPager2 viewPager, r31 multiBannerSwiper, k31 multiBannerEventTracker) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        this.c = multiBannerSwiper;
        this.d = multiBannerEventTracker;
        this.e = ho1.a(viewPager);
        this.f = a.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        ViewPager2 viewPager2 = (ViewPager2) this.e.getValue(this, g[0]);
        if (viewPager2 != null) {
            if (wh2.b(viewPager2) > 0) {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager2.getCurrentItem();
                    if (currentItem == 0) {
                        this.f = a.b;
                    } else if (currentItem == itemCount - 1) {
                        this.f = a.c;
                    }
                } else {
                    a();
                }
                int ordinal = this.f.ordinal();
                if (ordinal == 0) {
                    this.c.a();
                } else if (ordinal == 1) {
                    this.c.b();
                }
                this.d.a();
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            a();
        }
    }
}
