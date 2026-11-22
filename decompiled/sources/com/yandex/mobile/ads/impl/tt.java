package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tt {

    /* renamed from: a, reason: collision with root package name */
    private final Function0<Bitmap> f16993a;
    private final String b;
    private final int c;
    private final int d;

    public tt(Function0<Bitmap> getBitmap, String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(getBitmap, "getBitmap");
        this.f16993a = getBitmap;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt)) {
            return false;
        }
        tt ttVar = (tt) obj;
        return Intrinsics.areEqual(this.f16993a, ttVar.f16993a) && Intrinsics.areEqual(this.b, ttVar.b) && this.c == ttVar.c && this.d == ttVar.d;
    }

    public final int hashCode() {
        int hashCode = this.f16993a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.d) + dy1.a(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "CoreNativeAdImage(getBitmap=" + this.f16993a + ", sizeType=" + this.b + ", width=" + this.c + ", height=" + this.d + Separators.RPAREN;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final Bitmap a() {
        return this.f16993a.invoke();
    }
}
