package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    private final c3 f16729a;

    public r5(pe2 videoDurationHolder, c3 adBreakTimingProvider) {
        Intrinsics.checkNotNullParameter(videoDurationHolder, "videoDurationHolder");
        Intrinsics.checkNotNullParameter(adBreakTimingProvider, "adBreakTimingProvider");
        this.f16729a = adBreakTimingProvider;
    }

    public final AdPlaybackState a(et instreamAd, Object obj) {
        Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
        List<gt> a2 = instreamAd.a();
        if (a2.isEmpty() || obj == null) {
            AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
            Intrinsics.checkNotNull(adPlaybackState);
            return adPlaybackState;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<gt> it = a2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            long a3 = this.f16729a.a(it.next().b());
            if (a3 == Long.MIN_VALUE) {
                z = true;
            } else if (a3 != -1) {
                arrayList.add(Long.valueOf(Util.msToUs(a3)));
            }
        }
        int size = z ? arrayList.size() + 1 : arrayList.size();
        long[] jArr = new long[size];
        if (z) {
            jArr[size - 1] = Long.MIN_VALUE;
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            jArr[i] = ((Number) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr, 0, arrayList.size());
        return new AdPlaybackState(obj, Arrays.copyOf(jArr, size));
    }
}
