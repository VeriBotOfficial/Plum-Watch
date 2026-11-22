package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tw {

    /* renamed from: a, reason: collision with root package name */
    private final List<rw> f16998a;

    public tw(ArrayList adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f16998a = adapters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw) && Intrinsics.areEqual(this.f16998a, ((tw) obj).f16998a);
    }

    public final int hashCode() {
        return this.f16998a.hashCode();
    }

    public final String toString() {
        return "DebugPanelAdaptersData(adapters=" + this.f16998a + Separators.RPAREN;
    }

    public final List<rw> a() {
        return this.f16998a;
    }
}
