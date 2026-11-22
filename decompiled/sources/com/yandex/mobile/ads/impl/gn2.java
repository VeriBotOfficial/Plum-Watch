package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gn2 implements SkipInfo {

    /* renamed from: a, reason: collision with root package name */
    private final od2 f15615a;

    public gn2(od2 skipInfo) {
        Intrinsics.checkNotNullParameter(skipInfo, "skipInfo");
        this.f15615a = skipInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gn2) && Intrinsics.areEqual(this.f15615a, ((gn2) obj).f15615a);
    }

    public final int hashCode() {
        return this.f15615a.hashCode();
    }

    public final String toString() {
        return "YandexSkipInfo(skipInfo=" + this.f15615a + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.SkipInfo
    public final long getSkipOffset() {
        return this.f15615a.a();
    }
}
