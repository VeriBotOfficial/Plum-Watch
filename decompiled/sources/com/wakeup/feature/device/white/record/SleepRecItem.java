package com.wakeup.feature.device.white.record;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepRecHistoryAdapter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/device/white/record/SleepRecItem;", "", "path", "", "timeMs", "", "durationSec", "", "<init>", "(Ljava/lang/String;JD)V", "getPath", "()Ljava/lang/String;", "getTimeMs", "()J", "getDurationSec", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepRecItem {
    private final double durationSec;
    private final String path;
    private final long timeMs;

    public static /* synthetic */ SleepRecItem copy$default(SleepRecItem sleepRecItem, String str, long j, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepRecItem.path;
        }
        if ((i & 2) != 0) {
            j = sleepRecItem.timeMs;
        }
        if ((i & 4) != 0) {
            d = sleepRecItem.durationSec;
        }
        return sleepRecItem.copy(str, j, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final double getDurationSec() {
        return this.durationSec;
    }

    public final SleepRecItem copy(String path, long timeMs, double durationSec) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new SleepRecItem(path, timeMs, durationSec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRecItem)) {
            return false;
        }
        SleepRecItem sleepRecItem = (SleepRecItem) other;
        return Intrinsics.areEqual(this.path, sleepRecItem.path) && this.timeMs == sleepRecItem.timeMs && Double.compare(this.durationSec, sleepRecItem.durationSec) == 0;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Long.hashCode(this.timeMs)) * 31) + Double.hashCode(this.durationSec);
    }

    public String toString() {
        return "SleepRecItem(path=" + this.path + ", timeMs=" + this.timeMs + ", durationSec=" + this.durationSec + Separators.RPAREN;
    }

    public SleepRecItem(String path, long j, double d) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.timeMs = j;
        this.durationSec = d;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final double getDurationSec() {
        return this.durationSec;
    }
}
