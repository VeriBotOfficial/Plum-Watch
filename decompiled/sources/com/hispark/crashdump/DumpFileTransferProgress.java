package com.hispark.crashdump;

import kotlin.Metadata;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/hispark/crashdump/DumpFileTransferProgress;", "", "transferredBytes", "", "totalBytes", "rateBytesPerSecond", "progressPercent", "", "<init>", "(JJJD)V", "getTransferredBytes", "()J", "getTotalBytes", "getRateBytesPerSecond", "getProgressPercent", "()D", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpFileTransferProgress {
    private final double progressPercent;
    private final long rateBytesPerSecond;
    private final long totalBytes;
    private final long transferredBytes;

    public static /* synthetic */ DumpFileTransferProgress copy$default(DumpFileTransferProgress dumpFileTransferProgress, long j, long j2, long j3, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dumpFileTransferProgress.transferredBytes;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = dumpFileTransferProgress.totalBytes;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = dumpFileTransferProgress.rateBytesPerSecond;
        }
        return dumpFileTransferProgress.copy(j4, j5, j3, (i & 8) != 0 ? dumpFileTransferProgress.progressPercent : d);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTransferredBytes() {
        return this.transferredBytes;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component3, reason: from getter */
    public final long getRateBytesPerSecond() {
        return this.rateBytesPerSecond;
    }

    /* renamed from: component4, reason: from getter */
    public final double getProgressPercent() {
        return this.progressPercent;
    }

    public final DumpFileTransferProgress copy(long transferredBytes, long totalBytes, long rateBytesPerSecond, double progressPercent) {
        return new DumpFileTransferProgress(transferredBytes, totalBytes, rateBytesPerSecond, progressPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpFileTransferProgress)) {
            return false;
        }
        DumpFileTransferProgress dumpFileTransferProgress = (DumpFileTransferProgress) other;
        return this.transferredBytes == dumpFileTransferProgress.transferredBytes && this.totalBytes == dumpFileTransferProgress.totalBytes && this.rateBytesPerSecond == dumpFileTransferProgress.rateBytesPerSecond && Double.compare(this.progressPercent, dumpFileTransferProgress.progressPercent) == 0;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.transferredBytes) * 31) + Long.hashCode(this.totalBytes)) * 31) + Long.hashCode(this.rateBytesPerSecond)) * 31) + Double.hashCode(this.progressPercent);
    }

    public String toString() {
        return "DumpFileTransferProgress(transferredBytes=" + this.transferredBytes + ", totalBytes=" + this.totalBytes + ", rateBytesPerSecond=" + this.rateBytesPerSecond + ", progressPercent=" + this.progressPercent + ')';
    }

    public DumpFileTransferProgress(long j, long j2, long j3, double d) {
        this.transferredBytes = j;
        this.totalBytes = j2;
        this.rateBytesPerSecond = j3;
        this.progressPercent = d;
    }

    public final long getTransferredBytes() {
        return this.transferredBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final long getRateBytesPerSecond() {
        return this.rateBytesPerSecond;
    }

    public final double getProgressPercent() {
        return this.progressPercent;
    }
}
