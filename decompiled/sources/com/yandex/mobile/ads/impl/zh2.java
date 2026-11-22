package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zh2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f17524a;

    public zh2(ArrayList viewableUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        this.f17524a = viewableUrls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh2) && Intrinsics.areEqual(this.f17524a, ((zh2) obj).f17524a);
    }

    public final int hashCode() {
        return this.f17524a.hashCode();
    }

    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f17524a + Separators.RPAREN;
    }

    public final List<String> a() {
        return this.f17524a;
    }
}
