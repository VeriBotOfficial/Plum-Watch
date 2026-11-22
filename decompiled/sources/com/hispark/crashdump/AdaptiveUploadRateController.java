package com.hispark.crashdump;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* compiled from: ProtocolBoardFileUploader.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/hispark/crashdump/AdaptiveUploadRateController;", "", "initialRateBytesPerSecond", "", "minRateBytesPerSecond", "maxRateBytesPerSecond", "probeStepBytesPerSecond", "probeSuccessWindows", "congestionDecreasePercent", "backoffBaseMs", "", "backoffMaxMs", "<init>", "(IIIIIIJJ)V", ViewProps.ENABLED, "", "normalizedMinRate", "normalizedMaxRate", "currentRate", "consecutiveRepeatCount", "successfulForwardWindowCount", "onWindowRequest", "Lcom/hispark/crashdump/AdaptiveUploadRateController$WindowDecision;", "requestedEnd", "maxTransferredBytes", "onSuccessfulForwardWindow", "Lcom/hispark/crashdump/AdaptiveUploadRateController$ProbeDecision;", "currentRateBytesPerSecond", "WindowDecision", "ProbeDecision", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdaptiveUploadRateController {
    private final long backoffBaseMs;
    private final long backoffMaxMs;
    private final int congestionDecreasePercent;
    private int consecutiveRepeatCount;
    private int currentRate;
    private final boolean enabled;
    private final int normalizedMaxRate;
    private final int normalizedMinRate;
    private final int probeStepBytesPerSecond;
    private final int probeSuccessWindows;
    private int successfulForwardWindowCount;

    public AdaptiveUploadRateController(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.probeStepBytesPerSecond = i4;
        this.probeSuccessWindows = i5;
        this.congestionDecreasePercent = i6;
        this.backoffBaseMs = j;
        this.backoffMaxMs = j2;
        boolean z = i > 0;
        this.enabled = z;
        int coerceAtLeast = z ? RangesKt.coerceAtLeast(i2, 1) : i;
        this.normalizedMinRate = coerceAtLeast;
        int max = z ? Math.max(i3, coerceAtLeast) : i;
        this.normalizedMaxRate = max;
        this.currentRate = z ? RangesKt.coerceIn(i, coerceAtLeast, max) : i;
    }

    public /* synthetic */ AdaptiveUploadRateController(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, (i7 & 64) != 0 ? 100L : j, (i7 & 128) != 0 ? 2000L : j2);
    }

    /* compiled from: ProtocolBoardFileUploader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/hispark/crashdump/AdaptiveUploadRateController$WindowDecision;", "", "isRepeatedCompletedWindow", "", "consecutiveRepeatCount", "", "oldRateBytesPerSecond", "rateBytesPerSecond", "rateChanged", "backoffMs", "", "<init>", "(ZIIIZJ)V", "()Z", "getConsecutiveRepeatCount", "()I", "getOldRateBytesPerSecond", "getRateBytesPerSecond", "getRateChanged", "getBackoffMs", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WindowDecision {
        private final long backoffMs;
        private final int consecutiveRepeatCount;
        private final boolean isRepeatedCompletedWindow;
        private final int oldRateBytesPerSecond;
        private final int rateBytesPerSecond;
        private final boolean rateChanged;

        public static /* synthetic */ WindowDecision copy$default(WindowDecision windowDecision, boolean z, int i, int i2, int i3, boolean z2, long j, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = windowDecision.isRepeatedCompletedWindow;
            }
            if ((i4 & 2) != 0) {
                i = windowDecision.consecutiveRepeatCount;
            }
            if ((i4 & 4) != 0) {
                i2 = windowDecision.oldRateBytesPerSecond;
            }
            if ((i4 & 8) != 0) {
                i3 = windowDecision.rateBytesPerSecond;
            }
            if ((i4 & 16) != 0) {
                z2 = windowDecision.rateChanged;
            }
            if ((i4 & 32) != 0) {
                j = windowDecision.backoffMs;
            }
            long j2 = j;
            boolean z3 = z2;
            int i5 = i2;
            return windowDecision.copy(z, i, i5, i3, z3, j2);
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
        public final int getOldRateBytesPerSecond() {
            return this.oldRateBytesPerSecond;
        }

        /* renamed from: component4, reason: from getter */
        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getRateChanged() {
            return this.rateChanged;
        }

        /* renamed from: component6, reason: from getter */
        public final long getBackoffMs() {
            return this.backoffMs;
        }

        public final WindowDecision copy(boolean isRepeatedCompletedWindow, int consecutiveRepeatCount, int oldRateBytesPerSecond, int rateBytesPerSecond, boolean rateChanged, long backoffMs) {
            return new WindowDecision(isRepeatedCompletedWindow, consecutiveRepeatCount, oldRateBytesPerSecond, rateBytesPerSecond, rateChanged, backoffMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WindowDecision)) {
                return false;
            }
            WindowDecision windowDecision = (WindowDecision) other;
            return this.isRepeatedCompletedWindow == windowDecision.isRepeatedCompletedWindow && this.consecutiveRepeatCount == windowDecision.consecutiveRepeatCount && this.oldRateBytesPerSecond == windowDecision.oldRateBytesPerSecond && this.rateBytesPerSecond == windowDecision.rateBytesPerSecond && this.rateChanged == windowDecision.rateChanged && this.backoffMs == windowDecision.backoffMs;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.isRepeatedCompletedWindow) * 31) + Integer.hashCode(this.consecutiveRepeatCount)) * 31) + Integer.hashCode(this.oldRateBytesPerSecond)) * 31) + Integer.hashCode(this.rateBytesPerSecond)) * 31) + Boolean.hashCode(this.rateChanged)) * 31) + Long.hashCode(this.backoffMs);
        }

        public String toString() {
            return "WindowDecision(isRepeatedCompletedWindow=" + this.isRepeatedCompletedWindow + ", consecutiveRepeatCount=" + this.consecutiveRepeatCount + ", oldRateBytesPerSecond=" + this.oldRateBytesPerSecond + ", rateBytesPerSecond=" + this.rateBytesPerSecond + ", rateChanged=" + this.rateChanged + ", backoffMs=" + this.backoffMs + ')';
        }

        public WindowDecision(boolean z, int i, int i2, int i3, boolean z2, long j) {
            this.isRepeatedCompletedWindow = z;
            this.consecutiveRepeatCount = i;
            this.oldRateBytesPerSecond = i2;
            this.rateBytesPerSecond = i3;
            this.rateChanged = z2;
            this.backoffMs = j;
        }

        public final boolean isRepeatedCompletedWindow() {
            return this.isRepeatedCompletedWindow;
        }

        public final int getConsecutiveRepeatCount() {
            return this.consecutiveRepeatCount;
        }

        public final int getOldRateBytesPerSecond() {
            return this.oldRateBytesPerSecond;
        }

        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        public final boolean getRateChanged() {
            return this.rateChanged;
        }

        public final long getBackoffMs() {
            return this.backoffMs;
        }
    }

    /* compiled from: ProtocolBoardFileUploader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/hispark/crashdump/AdaptiveUploadRateController$ProbeDecision;", "", "rateIncreased", "", "oldRateBytesPerSecond", "", "rateBytesPerSecond", "successfulForwardWindows", "<init>", "(ZIII)V", "getRateIncreased", "()Z", "getOldRateBytesPerSecond", "()I", "getRateBytesPerSecond", "getSuccessfulForwardWindows", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProbeDecision {
        private final int oldRateBytesPerSecond;
        private final int rateBytesPerSecond;
        private final boolean rateIncreased;
        private final int successfulForwardWindows;

        public static /* synthetic */ ProbeDecision copy$default(ProbeDecision probeDecision, boolean z, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z = probeDecision.rateIncreased;
            }
            if ((i4 & 2) != 0) {
                i = probeDecision.oldRateBytesPerSecond;
            }
            if ((i4 & 4) != 0) {
                i2 = probeDecision.rateBytesPerSecond;
            }
            if ((i4 & 8) != 0) {
                i3 = probeDecision.successfulForwardWindows;
            }
            return probeDecision.copy(z, i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRateIncreased() {
            return this.rateIncreased;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOldRateBytesPerSecond() {
            return this.oldRateBytesPerSecond;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSuccessfulForwardWindows() {
            return this.successfulForwardWindows;
        }

        public final ProbeDecision copy(boolean rateIncreased, int oldRateBytesPerSecond, int rateBytesPerSecond, int successfulForwardWindows) {
            return new ProbeDecision(rateIncreased, oldRateBytesPerSecond, rateBytesPerSecond, successfulForwardWindows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProbeDecision)) {
                return false;
            }
            ProbeDecision probeDecision = (ProbeDecision) other;
            return this.rateIncreased == probeDecision.rateIncreased && this.oldRateBytesPerSecond == probeDecision.oldRateBytesPerSecond && this.rateBytesPerSecond == probeDecision.rateBytesPerSecond && this.successfulForwardWindows == probeDecision.successfulForwardWindows;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.rateIncreased) * 31) + Integer.hashCode(this.oldRateBytesPerSecond)) * 31) + Integer.hashCode(this.rateBytesPerSecond)) * 31) + Integer.hashCode(this.successfulForwardWindows);
        }

        public String toString() {
            return "ProbeDecision(rateIncreased=" + this.rateIncreased + ", oldRateBytesPerSecond=" + this.oldRateBytesPerSecond + ", rateBytesPerSecond=" + this.rateBytesPerSecond + ", successfulForwardWindows=" + this.successfulForwardWindows + ')';
        }

        public ProbeDecision(boolean z, int i, int i2, int i3) {
            this.rateIncreased = z;
            this.oldRateBytesPerSecond = i;
            this.rateBytesPerSecond = i2;
            this.successfulForwardWindows = i3;
        }

        public final boolean getRateIncreased() {
            return this.rateIncreased;
        }

        public final int getOldRateBytesPerSecond() {
            return this.oldRateBytesPerSecond;
        }

        public final int getRateBytesPerSecond() {
            return this.rateBytesPerSecond;
        }

        public final int getSuccessfulForwardWindows() {
            return this.successfulForwardWindows;
        }
    }

    public final WindowDecision onWindowRequest(long requestedEnd, long maxTransferredBytes) {
        if (!this.enabled || maxTransferredBytes <= 0 || requestedEnd > maxTransferredBytes) {
            this.consecutiveRepeatCount = 0;
            int i = this.currentRate;
            return new WindowDecision(false, 0, i, i, false, 0L);
        }
        this.consecutiveRepeatCount++;
        this.successfulForwardWindowCount = 0;
        int i2 = this.currentRate;
        this.currentRate = (int) RangesKt.coerceAtMost(RangesKt.coerceAtLeast((i2 * (100 - RangesKt.coerceIn(this.congestionDecreasePercent, 1, 99))) / 100, this.normalizedMinRate), this.normalizedMaxRate);
        long coerceAtLeast = RangesKt.coerceAtLeast(this.backoffBaseMs, 0L);
        int coerceAtMost = RangesKt.coerceAtMost(this.consecutiveRepeatCount - 1, 30);
        for (int i3 = 0; i3 < coerceAtMost; i3++) {
            coerceAtLeast = RangesKt.coerceAtMost(coerceAtLeast * 2, this.backoffMaxMs);
        }
        long coerceAtMost2 = RangesKt.coerceAtMost(coerceAtLeast, RangesKt.coerceAtLeast(this.backoffMaxMs, 0L));
        int i4 = this.consecutiveRepeatCount;
        int i5 = this.currentRate;
        return new WindowDecision(true, i4, i2, i5, i5 != i2, coerceAtMost2);
    }

    public final ProbeDecision onSuccessfulForwardWindow() {
        if (!this.enabled || this.probeStepBytesPerSecond <= 0 || this.currentRate >= this.normalizedMaxRate) {
            this.consecutiveRepeatCount = 0;
            this.successfulForwardWindowCount = 0;
            int i = this.currentRate;
            return new ProbeDecision(false, i, i, this.successfulForwardWindowCount);
        }
        this.consecutiveRepeatCount = 0;
        this.successfulForwardWindowCount++;
        int coerceAtLeast = RangesKt.coerceAtLeast(this.probeSuccessWindows, 1);
        if (this.successfulForwardWindowCount < coerceAtLeast) {
            int i2 = this.currentRate;
            return new ProbeDecision(false, i2, i2, this.successfulForwardWindowCount);
        }
        this.successfulForwardWindowCount = 0;
        int i3 = this.currentRate;
        this.currentRate = (int) RangesKt.coerceAtMost(i3 + this.probeStepBytesPerSecond, this.normalizedMaxRate);
        int i4 = this.currentRate;
        return new ProbeDecision(i4 != i3, i3, i4, coerceAtLeast);
    }

    /* renamed from: currentRateBytesPerSecond, reason: from getter */
    public final int getCurrentRate() {
        return this.currentRate;
    }
}
