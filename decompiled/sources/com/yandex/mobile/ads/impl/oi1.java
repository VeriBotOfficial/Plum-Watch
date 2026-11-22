package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oi1 implements rj1 {

    /* renamed from: a, reason: collision with root package name */
    private final Player f16455a;
    private final ui1 b;

    public oi1(Player player, ui1 playerStateHolder) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        this.f16455a = player;
        this.b = playerStateHolder;
    }

    @Override // com.yandex.mobile.ads.impl.rj1
    public final long a() {
        Timeline b = this.b.b();
        return this.f16455a.getContentPosition() - (!b.isEmpty() ? b.getPeriod(0, this.b.a()).getPositionInWindowMs() : 0L);
    }
}
