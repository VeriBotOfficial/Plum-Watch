package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zb2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final uu f17504a;
    private final mb2 b;
    private final ew0 c;
    private final T d;
    private final i12 e;
    private final String f;
    private final w9 g;

    /* JADX WARN: Multi-variable type inference failed */
    public zb2(uu creative, mb2 vastVideoAd, ew0 mediaFile, Object obj, i12 i12Var, String preloadRequestId, w9 w9Var) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(vastVideoAd, "vastVideoAd");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        Intrinsics.checkNotNullParameter(preloadRequestId, "preloadRequestId");
        this.f17504a = creative;
        this.b = vastVideoAd;
        this.c = mediaFile;
        this.d = obj;
        this.e = i12Var;
        this.f = preloadRequestId;
        this.g = w9Var;
    }

    public final uu b() {
        return this.f17504a;
    }

    public final mb2 g() {
        return this.b;
    }

    public final ew0 c() {
        return this.c;
    }

    public final T d() {
        return this.d;
    }

    public final i12 f() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public final w9 a() {
        return this.g;
    }
}
