package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class kb1 implements rc2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16003a;
    private final int b;
    private final int c;

    public kb1(String url, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f16003a = url;
        this.b = i;
        this.c = i2;
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final String getUrl() {
        return this.f16003a;
    }

    public final int getAdWidth() {
        return this.b;
    }

    public final int getAdHeight() {
        return this.c;
    }
}
