package com.applovin.impl;

/* loaded from: classes12.dex */
public enum i {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH("refresh"),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* renamed from: a, reason: collision with root package name */
    private final String f6267a;

    i(String str) {
        this.f6267a = str;
    }

    public String b() {
        return this.f6267a;
    }
}
