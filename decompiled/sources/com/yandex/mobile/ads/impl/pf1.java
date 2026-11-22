package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pf1 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16560a;
    private final gz1 b;
    private final gz1 c;

    public pf1(Context appContext, rb0 portraitSizeInfo, rb0 landscapeSizeInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(portraitSizeInfo, "portraitSizeInfo");
        Intrinsics.checkNotNullParameter(landscapeSizeInfo, "landscapeSizeInfo");
        this.f16560a = appContext;
        this.b = portraitSizeInfo;
        this.c = landscapeSizeInfo;
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ks.a(context) == kf1.c ? this.c.a(context) : this.b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ks.a(context) == kf1.c ? this.c.b(context) : this.b.b(context);
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ks.a(context) == kf1.c ? this.c.c(context) : this.b.c(context);
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ks.a(context) == kf1.c ? this.c.d(context) : this.b.d(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf1)) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        return Intrinsics.areEqual(this.f16560a, pf1Var.f16560a) && Intrinsics.areEqual(this.b, pf1Var.b) && Intrinsics.areEqual(this.c, pf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16560a.hashCode() * 31)) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int getWidth() {
        if (ks.a(this.f16560a) == kf1.c) {
            return this.c.getWidth();
        }
        return this.b.getWidth();
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final int getHeight() {
        if (ks.a(this.f16560a) == kf1.c) {
            return this.c.getHeight();
        }
        return this.b.getHeight();
    }

    @Override // com.yandex.mobile.ads.impl.gz1
    public final gz1.a a() {
        if (ks.a(this.f16560a) == kf1.c) {
            return this.c.a();
        }
        return this.b.a();
    }

    public final String toString() {
        if (ks.a(this.f16560a) == kf1.c) {
            return this.c.toString();
        }
        return this.b.toString();
    }
}
