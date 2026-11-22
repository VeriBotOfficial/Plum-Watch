package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wu0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17284a;
    private final float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0)) {
            return false;
        }
        wu0 wu0Var = (wu0) obj;
        return Intrinsics.areEqual(this.f17284a, wu0Var.f17284a) && Float.compare(this.b, wu0Var.b) == 0;
    }

    public final int hashCode() {
        String str = this.f17284a;
        return Float.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f17284a + ", aspectRatio=" + this.b + Separators.RPAREN;
    }

    public wu0(String str, float f) {
        this.f17284a = str;
        this.b = f;
    }

    public final String b() {
        return this.f17284a;
    }

    public final float a() {
        return this.b;
    }
}
