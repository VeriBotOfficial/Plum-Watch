package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eg2 {

    /* renamed from: a, reason: collision with root package name */
    private final vi1 f15386a;
    private final me2 b;

    public eg2(vi1 playerStateHolder, me2 videoCompletedNotifier) {
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        this.f15386a = playerStateHolder;
        this.b = videoCompletedNotifier;
    }

    public final void a(Player player) {
        Intrinsics.checkNotNullParameter(player, "player");
        if (this.f15386a.c() || player.isPlayingAd()) {
            return;
        }
        this.b.c();
        boolean b = this.b.b();
        Timeline b2 = this.f15386a.b();
        if (b || b2.isEmpty()) {
            return;
        }
        b2.getPeriod(0, this.f15386a.a());
    }
}
