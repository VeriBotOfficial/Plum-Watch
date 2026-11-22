package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n92 {

    /* renamed from: a, reason: collision with root package name */
    private final a f16321a;
    private String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        private static final /* synthetic */ a[] p;
        private final String b;

        static {
            a aVar = new a(0, "SUCCESS", "success");
            c = aVar;
            a aVar2 = new a(1, "APPLICATION_INACTIVE", "application_inactive");
            d = aVar2;
            a aVar3 = new a(2, "INCONSISTENT_ASSET_VALUE", "inconsistent_asset_value");
            e = aVar3;
            a aVar4 = new a(3, "NO_AD_VIEW", "no_ad_view");
            f = aVar4;
            a aVar5 = new a(4, "NO_VISIBLE_ADS", "no_visible_ads");
            g = aVar5;
            a aVar6 = new a(5, "NO_VISIBLE_REQUIRED_ASSETS", "no_visible_required_assets");
            h = aVar6;
            a aVar7 = new a(6, "NOT_ADDED_TO_HIERARCHY", "not_added_to_hierarchy");
            i = aVar7;
            a aVar8 = new a(7, "NOT_VISIBLE_FOR_PERCENT", "not_visible_for_percent");
            j = aVar8;
            a aVar9 = new a(8, "REQUIRED_ASSET_CAN_NOT_BE_VISIBLE", "required_asset_can_not_be_visible");
            k = aVar9;
            a aVar10 = new a(9, "REQUIRED_ASSET_IS_NOT_SUBVIEW", "required_asset_is_not_subview");
            l = aVar10;
            a aVar11 = new a(10, "SUPERVIEW_HIDDEN", "superview_hidden");
            m = aVar11;
            a aVar12 = new a(11, "TOO_SMALL", "too_small");
            n = aVar12;
            a aVar13 = new a(12, "VISIBLE_AREA_TOO_SMALL", "visible_area_too_small");
            o = aVar13;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
            p = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) p.clone();
        }

        private a(int i2, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    public n92(a status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f16321a = status;
    }

    public final a b() {
        return this.f16321a;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
