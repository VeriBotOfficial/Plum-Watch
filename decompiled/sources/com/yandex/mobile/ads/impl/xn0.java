package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xn0 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    private final ht f17353a;
    private final String b;
    private final int c;
    private final int d;
    private final String e;
    private final Integer f;
    private final String g;

    public xn0(ht adBreakPosition, String url, int i, int i2, String str, Integer num, String str2) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17353a = adBreakPosition;
        this.b = url;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = num;
        this.g = str2;
    }

    public final ht a() {
        return this.f17353a;
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final String getUrl() {
        return this.b;
    }

    public final int getAdWidth() {
        return this.c;
    }

    public final int getAdHeight() {
        return this.d;
    }

    public final String getMediaType() {
        return this.e;
    }

    public final Integer getBitrate() {
        return this.f;
    }

    public final String getApiFramework() {
        return this.g;
    }
}
