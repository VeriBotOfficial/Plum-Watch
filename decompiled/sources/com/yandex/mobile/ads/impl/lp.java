package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lp implements x {

    /* renamed from: a, reason: collision with root package name */
    private final String f16155a;

    public lp(String actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f16155a = actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp) && Intrinsics.areEqual(this.f16155a, ((lp) obj).f16155a);
    }

    public final int hashCode() {
        return this.f16155a.hashCode();
    }

    public final String toString() {
        return "CloseAction(actionType=" + this.f16155a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f16155a;
    }
}
