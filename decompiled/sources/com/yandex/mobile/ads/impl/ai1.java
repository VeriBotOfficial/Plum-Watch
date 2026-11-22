package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ai1 implements cd2 {

    /* renamed from: a, reason: collision with root package name */
    private final jb1 f15010a;

    public ai1(jb1 nativeVideoPlaybackEventListener) {
        Intrinsics.checkNotNullParameter(nativeVideoPlaybackEventListener, "nativeVideoPlaybackEventListener");
        this.f15010a = nativeVideoPlaybackEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.cd2
    public final void a(long j, long j2) {
        this.f15010a.a(j, j2);
    }
}
