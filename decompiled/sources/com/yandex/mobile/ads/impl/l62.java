package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l62 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16082a;
    private final String b;
    private final na2 c;

    public l62(String event, String trackingUrl, na2 na2Var) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(trackingUrl, "trackingUrl");
        this.f16082a = event;
        this.b = trackingUrl;
        this.c = na2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l62)) {
            return false;
        }
        l62 l62Var = (l62) obj;
        return Intrinsics.areEqual(this.f16082a, l62Var.f16082a) && Intrinsics.areEqual(this.b, l62Var.b) && Intrinsics.areEqual(this.c, l62Var.c);
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, this.f16082a.hashCode() * 31, 31);
        na2 na2Var = this.c;
        return a2 + (na2Var == null ? 0 : na2Var.hashCode());
    }

    public final String toString() {
        return "TrackingEvent(event=" + this.f16082a + ", trackingUrl=" + this.b + ", offset=" + this.c + Separators.RPAREN;
    }

    public final String a() {
        return this.f16082a;
    }

    public final String c() {
        return this.b;
    }

    public final na2 b() {
        return this.c;
    }
}
