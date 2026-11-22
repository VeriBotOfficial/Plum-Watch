package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ji1 {

    /* renamed from: a, reason: collision with root package name */
    private final b70 f15914a;

    public ji1(b70 playerProvider) {
        Intrinsics.checkNotNullParameter(playerProvider, "playerProvider");
        this.f15914a = playerProvider;
    }

    public final void a() {
        Player a2 = this.f15914a.a();
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(false);
    }

    public final void b() {
        Player a2 = this.f15914a.a();
        if (a2 == null) {
            return;
        }
        a2.setPlayWhenReady(true);
    }
}
