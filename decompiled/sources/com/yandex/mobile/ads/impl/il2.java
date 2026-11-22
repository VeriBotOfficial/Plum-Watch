package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class il2 implements AdError {

    /* renamed from: a, reason: collision with root package name */
    private final String f15827a;

    public il2(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f15827a = description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il2) && Intrinsics.areEqual(this.f15827a, ((il2) obj).f15827a);
    }

    public final int hashCode() {
        return this.f15827a.hashCode();
    }

    public final String toString() {
        return "YandexAdError(description=" + this.f15827a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.common.AdError
    public final String getDescription() {
        return this.f15827a;
    }
}
