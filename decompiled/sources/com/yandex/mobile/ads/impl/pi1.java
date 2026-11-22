package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pi1 implements sj1 {

    /* renamed from: a, reason: collision with root package name */
    private final Player f16570a;
    private final vi1 b;

    public pi1(Player player, vi1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f16570a = player;
        this.b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.sj1
    public final long a() {
        Timeline b = this.b.b();
        return this.f16570a.getContentPosition() - (!b.isEmpty() ? b.getPeriod(0, this.b.a()).getPositionInWindowMs() : 0L);
    }
}
