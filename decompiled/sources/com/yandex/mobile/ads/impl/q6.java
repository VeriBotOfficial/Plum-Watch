package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q6 extends Throwable {
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(String description) {
        super(description);
        Intrinsics.checkNotNullParameter(description, "description");
        this.b = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6) && Intrinsics.areEqual(this.b, ((q6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AdPresentationError(description=" + this.b + Separators.RPAREN;
    }

    public final String a() {
        return this.b;
    }
}
