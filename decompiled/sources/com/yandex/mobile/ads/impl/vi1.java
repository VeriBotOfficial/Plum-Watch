package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vi1 {

    /* renamed from: a, reason: collision with root package name */
    private final Timeline.Period f17166a;
    private Timeline b;
    private boolean c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ vi1() {
        /*
            r3 = this;
            com.google.android.exoplayer2.Timeline$Period r0 = new com.google.android.exoplayer2.Timeline$Period
            r0.<init>()
            com.google.android.exoplayer2.Timeline r1 = com.google.android.exoplayer2.Timeline.EMPTY
            java.lang.String r2 = "EMPTY"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.vi1.<init>():void");
    }

    public vi1(Timeline.Period period, Timeline timeline, boolean z) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        this.f17166a = period;
        this.b = timeline;
        this.c = z;
    }

    public final Timeline.Period a() {
        return this.f17166a;
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
