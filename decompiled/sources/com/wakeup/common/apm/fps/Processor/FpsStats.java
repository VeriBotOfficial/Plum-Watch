package com.wakeup.common.apm.fps.Processor;

import android.gov.nist.core.Separators;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: FpsAlertProcessor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/apm/fps/Processor/FpsStats;", "", "<init>", "()V", "totalFrames", "", "totalFps", "minFps", "", "maxFps", "lock", "update", "", "fps", "getSnapshot", "Lcom/wakeup/common/apm/fps/Processor/FpsStats$Snapshot;", TimerController.RESET_COMMAND, "Snapshot", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FpsStats {
    private long totalFps;
    private long totalFrames;
    private int minFps = Integer.MAX_VALUE;
    private int maxFps = Integer.MIN_VALUE;
    private final Object lock = new Object();

    /* compiled from: FpsAlertProcessor.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/apm/fps/Processor/FpsStats$Snapshot;", "", "totalFrames", "", "averageFps", "", "minFps", "", "maxFps", "<init>", "(JDII)V", "getTotalFrames", "()J", "getAverageFps", "()D", "getMinFps", "()I", "getMaxFps", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        private final double averageFps;
        private final int maxFps;
        private final int minFps;
        private final long totalFrames;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, long j, double d, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = snapshot.totalFrames;
            }
            long j2 = j;
            if ((i3 & 2) != 0) {
                d = snapshot.averageFps;
            }
            double d2 = d;
            if ((i3 & 4) != 0) {
                i = snapshot.minFps;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = snapshot.maxFps;
            }
            return snapshot.copy(j2, d2, i4, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTotalFrames() {
            return this.totalFrames;
        }

        /* renamed from: component2, reason: from getter */
        public final double getAverageFps() {
            return this.averageFps;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinFps() {
            return this.minFps;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFps() {
            return this.maxFps;
        }

        public final Snapshot copy(long totalFrames, double averageFps, int minFps, int maxFps) {
            return new Snapshot(totalFrames, averageFps, minFps, maxFps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return this.totalFrames == snapshot.totalFrames && Double.compare(this.averageFps, snapshot.averageFps) == 0 && this.minFps == snapshot.minFps && this.maxFps == snapshot.maxFps;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.totalFrames) * 31) + Double.hashCode(this.averageFps)) * 31) + Integer.hashCode(this.minFps)) * 31) + Integer.hashCode(this.maxFps);
        }

        public String toString() {
            return "Snapshot(totalFrames=" + this.totalFrames + ", averageFps=" + this.averageFps + ", minFps=" + this.minFps + ", maxFps=" + this.maxFps + Separators.RPAREN;
        }

        public Snapshot(long j, double d, int i, int i2) {
            this.totalFrames = j;
            this.averageFps = d;
            this.minFps = i;
            this.maxFps = i2;
        }

        public final long getTotalFrames() {
            return this.totalFrames;
        }

        public final double getAverageFps() {
            return this.averageFps;
        }

        public final int getMinFps() {
            return this.minFps;
        }

        public final int getMaxFps() {
            return this.maxFps;
        }
    }

    public final void update(int fps) {
        synchronized (this.lock) {
            this.totalFrames++;
            this.totalFps += fps;
            this.minFps = Math.min(this.minFps, fps);
            this.maxFps = Math.max(this.maxFps, fps);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Snapshot getSnapshot() {
        Snapshot snapshot;
        synchronized (this.lock) {
            long j = this.totalFrames;
            snapshot = new Snapshot(this.totalFrames, j > 0 ? this.totalFps / j : 0.0d, this.minFps, this.maxFps);
        }
        return snapshot;
    }

    public final void reset() {
        synchronized (this.lock) {
            this.totalFrames = 0L;
            this.totalFps = 0L;
            this.minFps = Integer.MAX_VALUE;
            this.maxFps = Integer.MIN_VALUE;
            Unit unit = Unit.INSTANCE;
        }
    }
}
