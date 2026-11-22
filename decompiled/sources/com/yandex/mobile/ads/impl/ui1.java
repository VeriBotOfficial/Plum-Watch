package com.yandex.mobile.ads.impl;

import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ui1 {

    /* renamed from: a, reason: collision with root package name */
    private final Timeline.Period f17057a;
    private Timeline b;
    private boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ui1() {
        /*
            r3 = this;
            androidx.media3.common.Timeline$Period r0 = new androidx.media3.common.Timeline$Period
            r0.<init>()
            androidx.media3.common.Timeline r1 = androidx.media3.common.Timeline.EMPTY
            java.lang.String r2 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ui1.<init>():void");
    }

    public ui1(Timeline.Period period, Timeline timeline, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f17057a = period;
        this.b = timeline;
        this.c = z;
    }

    public final Timeline.Period a() {
        return this.f17057a;
    }

    public final Timeline b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(Timeline timeline) {
        Intrinsics.checkNotNullParameter(timeline, "<set-?>");
        this.b = timeline;
    }
}
