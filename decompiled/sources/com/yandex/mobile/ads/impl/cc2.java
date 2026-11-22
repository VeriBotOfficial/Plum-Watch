package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class cc2 {

    /* renamed from: a, reason: collision with root package name */
    private final go0 f15177a;

    public cc2(go0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        this.f15177a = videoAd;
    }

    public final String a() {
        JSONObject e = this.f15177a.e();
        String optString = e != null ? e.optString("productType") : null;
        if (optString == null || optString.length() <= 0) {
            return null;
        }
        return optString;
    }
}
