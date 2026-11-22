package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bm2 implements InstreamAdBreak {

    /* renamed from: a, reason: collision with root package name */
    private final gt f15123a;
    private final dm2 b;

    public /* synthetic */ bm2(gt gtVar) {
        this(gtVar, new dm2());
    }

    public bm2(gt adBreak, dm2 adBreakPositionAdapter) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPositionAdapter, "adBreakPositionAdapter");
        this.f15123a = adBreak;
        this.b = adBreakPositionAdapter;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final String getType() {
        return this.f15123a.e();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final InstreamAdBreakPosition getAdBreakPosition() {
        InstreamAdBreakPosition.Type type;
        dm2 dm2Var = this.b;
        ht corePosition = this.f15123a.b();
        dm2Var.getClass();
        Intrinsics.checkNotNullParameter(corePosition, "corePosition");
        int ordinal = corePosition.a().ordinal();
        if (ordinal == 0) {
            type = InstreamAdBreakPosition.Type.PERCENTS;
        } else if (ordinal == 1) {
            type = InstreamAdBreakPosition.Type.MILLISECONDS;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            type = InstreamAdBreakPosition.Type.POSITION;
        }
        return new InstreamAdBreakPosition(type, corePosition.b());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bm2) && Intrinsics.areEqual(((bm2) obj).f15123a, this.f15123a);
    }

    public final int hashCode() {
        return this.f15123a.hashCode();
    }
}
