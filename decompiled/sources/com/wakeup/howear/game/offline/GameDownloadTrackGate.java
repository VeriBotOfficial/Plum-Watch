package com.wakeup.howear.game.offline;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: GameDownloadTrackGate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/wakeup/howear/game/offline/GameDownloadTrackGate;", "", "<init>", "()V", ApiConstants.STARTED, "", "startedAtMs", "", "settled", "start", "nowMs", "finish", "(J)Ljava/lang/Long;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GameDownloadTrackGate {
    private boolean settled;
    private boolean started;
    private long startedAtMs;

    public final synchronized boolean start(long nowMs) {
        if (this.started) {
            return false;
        }
        this.started = true;
        this.startedAtMs = nowMs;
        return true;
    }

    public final synchronized Long finish(long nowMs) {
        if (this.started && !this.settled) {
            this.settled = true;
            return Long.valueOf(RangesKt.coerceAtLeast(nowMs - this.startedAtMs, 0L));
        }
        return null;
    }
}
