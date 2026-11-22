package com.hispark.crashdump;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: ProtocolBoardFileUploader.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/hispark/crashdump/RepeatedWindowThrottle;", "", "baseRateBytesPerSecond", "", "recoveryBytes", "", "backoffBaseMs", "backoffMaxMs", "<init>", "(IJJJ)V", "throttleLevel", "consecutiveRepeatCount", "forwardBytesSinceRecovery", "onWindowRequest", "Lcom/hispark/crashdump/RepeatedWindowThrottle$Decision;", "requestedEnd", "maxTransferredBytes", "onForwardProgress", "", ApiConstants.BYTES, "currentRateBytesPerSecond", "Decision", "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RepeatedWindowThrottle {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_THROTTLE_LEVEL = 3;

    @Deprecated
    public static final int MIN_RATE_PERCENT = 25;

    @Deprecated
    public static final int RATE_STEP_PERCENT = 25;
    private final long backoffBaseMs;
    private final long backoffMaxMs;
    private final int baseRateBytesPerSecond;
    private int consecutiveRepeatCount;
    private long forwardBytesSinceRecovery;
    private final long recoveryBytes;
    private int throttleLevel;

    public RepeatedWindowThrottle(int i, long j, long j2, long j3) {
        this.baseRateBytesPerSecond = i;
        this.backoffBaseMs = j2;
        this.backoffMaxMs = j3;
        this.recoveryBytes = RangesKt.coerceAtLeast(j, 1L);
    }

    public /* synthetic */ RepeatedWindowThrottle(int i, long j, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i2 & 4) != 0 ? 100L : j2, (i2 & 8) != 0 ? 2000L : j3);
    }

    /* compiled from: ProtocolBoardFileUploader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/hispark/crashdump/RepeatedWindowThrottle$Decision;", "", "isRepeatedCompletedWindow", "", "consecutiveRepeatCount", "", "rateBytesPerSecond", "backoffMs", "", "<init>", "(ZIIJ)V", "()Z", "getConsecutiveRepeatCount", "()I", "getRateBytesPerSecond", "getBackoffMs", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Decision {
        private final long backoffMs;
        private final int consecutiveRepeatCount;
        private final boolean isRepeatedCompletedWindow;
        private final int rateBytesPerSecond;

        public static /* synthetic */ Decision copy$default(Decision decision, boolean z, int i, int i2, long j, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = decision.isRepeatedCompletedWindow;
            }
            if ((i3 & 2) != 0) {
                i = decision.consecutiveRepeatCount;
            }
            if ((i3 & 4) != 0) {
                i2 = decision.rateBytesPerSecond;
            }
            if ((i3 & 8) != 0) {
                j = decision.backoffMs;
            }
            int i4 = i2;
            return decision.copy(z, i, i4, j);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRepeatedCompletedWindow() {
            return this.isRepeatedCompletedWindow;
        }

        /* renamed from: component2, reason: from getter */
        public final int getConsecutiveRepeatCount() {
            return this.consecutiveRepeatCount;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        /* renamed from: component4, reason: from getter */
        public final long getBackoffMs() {
            return this.backoffMs;
        }

        public final Decision copy(boolean isRepeatedCompletedWindow, int consecutiveRepeatCount, int rateBytesPerSecond, long backoffMs) {
            return new Decision(isRepeatedCompletedWindow, consecutiveRepeatCount, rateBytesPerSecond, backoffMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Decision)) {
                return false;
            }
            Decision decision = (Decision) other;
            return this.isRepeatedCompletedWindow == decision.isRepeatedCompletedWindow && this.consecutiveRepeatCount == decision.consecutiveRepeatCount && this.rateBytesPerSecond == decision.rateBytesPerSecond && this.backoffMs == decision.backoffMs;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.isRepeatedCompletedWindow) * 31) + Integer.hashCode(this.consecutiveRepeatCount)) * 31) + Integer.hashCode(this.rateBytesPerSecond)) * 31) + Long.hashCode(this.backoffMs);
        }

        public String toString() {
            return "Decision(isRepeatedCompletedWindow=" + this.isRepeatedCompletedWindow + ", consecutiveRepeatCount=" + this.consecutiveRepeatCount + ", rateBytesPerSecond=" + this.rateBytesPerSecond + ", backoffMs=" + this.backoffMs + ')';
        }

        public Decision(boolean z, int i, int i2, long j) {
            this.isRepeatedCompletedWindow = z;
            this.consecutiveRepeatCount = i;
            this.rateBytesPerSecond = i2;
            this.backoffMs = j;
        }

        public final boolean isRepeatedCompletedWindow() {
            return this.isRepeatedCompletedWindow;
        }

        public final int getConsecutiveRepeatCount() {
            return this.consecutiveRepeatCount;
        }

        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        public final long getBackoffMs() {
            return this.backoffMs;
        }
    }

    public final Decision onWindowRequest(long requestedEnd, long maxTransferredBytes) {
        if (this.baseRateBytesPerSecond <= 0 || maxTransferredBytes <= 0 || requestedEnd > maxTransferredBytes) {
            this.consecutiveRepeatCount = 0;
            return new Decision(false, 0, currentRateBytesPerSecond(), 0L);
        }
        this.consecutiveRepeatCount++;
        this.throttleLevel = RangesKt.coerceAtMost(this.throttleLevel + 1, 3);
        this.forwardBytesSinceRecovery = 0L;
        long coerceAtLeast = RangesKt.coerceAtLeast(this.backoffBaseMs, 0L);
        int coerceAtMost = RangesKt.coerceAtMost(this.consecutiveRepeatCount - 1, 30);
        for (int i = 0; i < coerceAtMost; i++) {
            coerceAtLeast = RangesKt.coerceAtMost(coerceAtLeast * 2, this.backoffMaxMs);
        }
        return new Decision(true, this.consecutiveRepeatCount, currentRateBytesPerSecond(), RangesKt.coerceAtMost(coerceAtLeast, RangesKt.coerceAtLeast(this.backoffMaxMs, 0L)));
    }

    public final void onForwardProgress(long bytes) {
        if (bytes <= 0 || this.throttleLevel == 0) {
            return;
        }
        this.forwardBytesSinceRecovery += bytes;
        while (true) {
            int i = this.throttleLevel;
            if (i <= 0) {
                return;
            }
            long j = this.forwardBytesSinceRecovery;
            long j2 = this.recoveryBytes;
            if (j < j2) {
                return;
            }
            this.forwardBytesSinceRecovery = j - j2;
            this.throttleLevel = i - 1;
        }
    }

    public final int currentRateBytesPerSecond() {
        int i = this.baseRateBytesPerSecond;
        if (i <= 0) {
            return i;
        }
        return (int) RangesKt.coerceAtMost(RangesKt.coerceAtLeast((this.baseRateBytesPerSecond * RangesKt.coerceAtLeast(100 - (this.throttleLevel * 25), 25)) / 100, 1L), 2147483647L);
    }

    /* compiled from: ProtocolBoardFileUploader.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/hispark/crashdump/RepeatedWindowThrottle$Companion;", "", "<init>", "()V", "MAX_THROTTLE_LEVEL", "", "RATE_STEP_PERCENT", "MIN_RATE_PERCENT", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
