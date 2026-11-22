package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n90 extends ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final b02 f16319a;
    private final o8<String> b;
    private final List<vk1> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(b02 sliderAd, o8 adResponse, ArrayList preloadedDivKitDesigns) {
        super(0);
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f16319a = sliderAd;
        this.b = adResponse;
        this.c = preloadedDivKitDesigns;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n90)) {
            return false;
        }
        n90 n90Var = (n90) obj;
        return Intrinsics.areEqual(this.f16319a, n90Var.f16319a) && Intrinsics.areEqual(this.b, n90Var.b) && Intrinsics.areEqual(this.c, n90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16319a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FeedItem(sliderAd=" + this.f16319a + ", adResponse=" + this.b + ", preloadedDivKitDesigns=" + this.c + Separators.RPAREN;
    }

    public final b02 c() {
        return this.f16319a;
    }

    public final o8<String> a() {
        return this.b;
    }

    public final List<vk1> b() {
        return this.c;
    }
}
