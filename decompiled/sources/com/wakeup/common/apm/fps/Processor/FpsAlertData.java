package com.wakeup.common.apm.fps.Processor;

import android.gov.nist.core.Separators;
import com.iflytek.cloud.util.AudioDetector;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FpsAlertProcessor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/wakeup/common/apm/fps/Processor/FpsAlertData;", "", "currentFps", "", "averageFps", AudioDetector.THRESHOLD, "consecutiveCount", "timestamp", "", "recentFpsHistory", "", "<init>", "(IIIIJLjava/util/List;)V", "getCurrentFps", "()I", "getAverageFps", "getThreshold", "getConsecutiveCount", "getTimestamp", "()J", "getRecentFpsHistory", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FpsAlertData {
    private final int averageFps;
    private final int consecutiveCount;
    private final int currentFps;
    private final List<Integer> recentFpsHistory;
    private final int threshold;
    private final long timestamp;

    public static /* synthetic */ FpsAlertData copy$default(FpsAlertData fpsAlertData, int i, int i2, int i3, int i4, long j, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = fpsAlertData.currentFps;
        }
        if ((i5 & 2) != 0) {
            i2 = fpsAlertData.averageFps;
        }
        if ((i5 & 4) != 0) {
            i3 = fpsAlertData.threshold;
        }
        if ((i5 & 8) != 0) {
            i4 = fpsAlertData.consecutiveCount;
        }
        if ((i5 & 16) != 0) {
            j = fpsAlertData.timestamp;
        }
        if ((i5 & 32) != 0) {
            list = fpsAlertData.recentFpsHistory;
        }
        List list2 = list;
        long j2 = j;
        return fpsAlertData.copy(i, i2, i3, i4, j2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentFps() {
        return this.currentFps;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAverageFps() {
        return this.averageFps;
    }

    /* renamed from: component3, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    /* renamed from: component4, reason: from getter */
    public final int getConsecutiveCount() {
        return this.consecutiveCount;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final List<Integer> component6() {
        return this.recentFpsHistory;
    }

    public final FpsAlertData copy(int currentFps, int averageFps, int threshold, int consecutiveCount, long timestamp, List<Integer> recentFpsHistory) {
        Intrinsics.checkNotNullParameter(recentFpsHistory, "recentFpsHistory");
        return new FpsAlertData(currentFps, averageFps, threshold, consecutiveCount, timestamp, recentFpsHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpsAlertData)) {
            return false;
        }
        FpsAlertData fpsAlertData = (FpsAlertData) other;
        return this.currentFps == fpsAlertData.currentFps && this.averageFps == fpsAlertData.averageFps && this.threshold == fpsAlertData.threshold && this.consecutiveCount == fpsAlertData.consecutiveCount && this.timestamp == fpsAlertData.timestamp && Intrinsics.areEqual(this.recentFpsHistory, fpsAlertData.recentFpsHistory);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.currentFps) * 31) + Integer.hashCode(this.averageFps)) * 31) + Integer.hashCode(this.threshold)) * 31) + Integer.hashCode(this.consecutiveCount)) * 31) + Long.hashCode(this.timestamp)) * 31) + this.recentFpsHistory.hashCode();
    }

    public String toString() {
        return "FpsAlertData(currentFps=" + this.currentFps + ", averageFps=" + this.averageFps + ", threshold=" + this.threshold + ", consecutiveCount=" + this.consecutiveCount + ", timestamp=" + this.timestamp + ", recentFpsHistory=" + this.recentFpsHistory + Separators.RPAREN;
    }

    public FpsAlertData(int i, int i2, int i3, int i4, long j, List<Integer> recentFpsHistory) {
        Intrinsics.checkNotNullParameter(recentFpsHistory, "recentFpsHistory");
        this.currentFps = i;
        this.averageFps = i2;
        this.threshold = i3;
        this.consecutiveCount = i4;
        this.timestamp = j;
        this.recentFpsHistory = recentFpsHistory;
    }

    public final int getCurrentFps() {
        return this.currentFps;
    }

    public final int getAverageFps() {
        return this.averageFps;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public final int getConsecutiveCount() {
        return this.consecutiveCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final List<Integer> getRecentFpsHistory() {
        return this.recentFpsHistory;
    }
}
