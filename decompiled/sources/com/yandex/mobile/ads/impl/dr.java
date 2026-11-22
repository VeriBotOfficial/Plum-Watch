package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    private final rt f15304a;
    private final int b;
    private final h41 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a(0, "FAVICON");
            b = aVar;
            a aVar2 = new a(1, "ICON");
            c = aVar2;
            a aVar3 = new a(2, "THUMB");
            d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            e = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        private a(int i, String str) {
        }
    }

    public dr(rt nativeAdAssets, int i, h41 nativeAdAdditionalViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdAdditionalViewProvider, "nativeAdAdditionalViewProvider");
        this.f15304a = nativeAdAssets;
        this.b = i;
        this.c = nativeAdAdditionalViewProvider;
    }

    public final ImageView a(View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return a(parentView, a.b, this.f15304a.e());
    }

    public final ImageView b(View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        return a(parentView, a.c, this.f15304a.g());
    }

    private final ImageView a(View container, a aVar, tt ttVar) {
        a aVar2;
        tt g = this.f15304a.g();
        tt e = this.f15304a.e();
        if (g != null) {
            aVar2 = a.c;
        } else if (e != null) {
            aVar2 = a.b;
        } else {
            aVar2 = a.d;
        }
        if (ttVar == null || aVar2 != aVar) {
            return null;
        }
        int d = ttVar.d();
        int b = ttVar.b();
        int i = this.b;
        if (i <= d && i <= b) {
            this.c.getClass();
            Intrinsics.checkNotNullParameter(container, "container");
            return (ImageView) container.findViewById(R.id.icon_large);
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        return (ImageView) container.findViewById(R.id.icon_small);
    }
}
