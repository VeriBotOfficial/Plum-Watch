package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nw {

    /* renamed from: a, reason: collision with root package name */
    private final List<mw> f16380a;

    public nw(List<mw> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f16380a = adapters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw) && Intrinsics.areEqual(this.f16380a, ((nw) obj).f16380a);
    }

    public final int hashCode() {
        return this.f16380a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationData(adapters=" + this.f16380a + Separators.RPAREN;
    }

    public final List<mw> a() {
        return this.f16380a;
    }
}
