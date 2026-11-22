package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pw {

    /* renamed from: a, reason: collision with root package name */
    private final List<jw> f16601a;

    public pw(ArrayList adUnits) {
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        this.f16601a = adUnits;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw) && Intrinsics.areEqual(this.f16601a, ((pw) obj).f16601a);
    }

    public final int hashCode() {
        return this.f16601a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdUnitsData(adUnits=" + this.f16601a + Separators.RPAREN;
    }

    public final List<jw> a() {
        return this.f16601a;
    }
}
