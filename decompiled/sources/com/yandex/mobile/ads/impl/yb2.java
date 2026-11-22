package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class yb2 {
    public static String a(long j, zc2 adPodInfo, mb2 videoAd) {
        Intrinsics.checkNotNullParameter(adPodInfo, "adPodInfo");
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        int a2 = adPodInfo.a();
        String g = videoAd.g();
        if (g == null) {
            g = String.valueOf(wi0.a());
        }
        return "ad_break_#" + j + "|position_" + a2 + "|video_ad_#" + g;
    }
}
