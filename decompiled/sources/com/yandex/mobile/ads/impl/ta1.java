package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ta1 {

    /* renamed from: a, reason: collision with root package name */
    private final sa1 f16949a;
    private final wa1 b;

    public final void a(xe2 options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.b.a(options.a());
        this.f16949a.a(options.c());
    }

    public /* synthetic */ ta1(sa1 sa1Var) {
        this(sa1Var, new wa1(sa1Var));
    }

    public ta1(sa1 nativeVideoAdPlayer, wa1 playerVolumeManager) {
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f16949a = nativeVideoAdPlayer;
        this.b = playerVolumeManager;
    }
}
