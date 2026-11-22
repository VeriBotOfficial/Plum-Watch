package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0012HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lcom/hispark/crashdump/DumpFileTransferUiItem;", "", "id", "", "fileName", "remotePath", "kind", "Lcom/hispark/crashdump/DumpFileTransferKind;", "status", "Lcom/hispark/crashdump/DumpFileTransferStatus;", "progress", "", "rateText", "rateBytesPerSecond", "", "transferredBytes", "totalBytes", "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hispark/crashdump/DumpFileTransferKind;Lcom/hispark/crashdump/DumpFileTransferStatus;FLjava/lang/String;JJJI)V", "getId", "()Ljava/lang/String;", "getFileName", "getRemotePath", "getKind", "()Lcom/hispark/crashdump/DumpFileTransferKind;", "getStatus", "()Lcom/hispark/crashdump/DumpFileTransferStatus;", "getProgress", "()F", "getRateText", "getRateBytesPerSecond", "()J", "getTransferredBytes", "getTotalBytes", "getOrder", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpFileTransferUiItem {
    private final String fileName;
    private final String id;
    private final DumpFileTransferKind kind;
    private final int order;
    private final float progress;
    private final long rateBytesPerSecond;
    private final String rateText;
    private final String remotePath;
    private final DumpFileTransferStatus status;
    private final long totalBytes;
    private final long transferredBytes;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component11, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemotePath() {
        return this.remotePath;
    }

    /* renamed from: component4, reason: from getter */
    public final DumpFileTransferKind getKind() {
        return this.kind;
    }

    /* renamed from: component5, reason: from getter */
    public final DumpFileTransferStatus getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRateText() {
        return this.rateText;
    }

    /* renamed from: component8, reason: from getter */
    public final long getRateBytesPerSecond() {
        return this.rateBytesPerSecond;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTransferredBytes() {
        return this.transferredBytes;
    }

    public final DumpFileTransferUiItem copy(String id2, String fileName, String remotePath, DumpFileTransferKind kind, DumpFileTransferStatus status, float progress, String rateText, long rateBytesPerSecond, long transferredBytes, long totalBytes, int order) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rateText, "rateText");
        return new DumpFileTransferUiItem(id2, fileName, remotePath, kind, status, progress, rateText, rateBytesPerSecond, transferredBytes, totalBytes, order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpFileTransferUiItem)) {
            return false;
        }
        DumpFileTransferUiItem dumpFileTransferUiItem = (DumpFileTransferUiItem) other;
        return Intrinsics.areEqual(this.id, dumpFileTransferUiItem.id) && Intrinsics.areEqual(this.fileName, dumpFileTransferUiItem.fileName) && Intrinsics.areEqual(this.remotePath, dumpFileTransferUiItem.remotePath) && this.kind == dumpFileTransferUiItem.kind && this.status == dumpFileTransferUiItem.status && Float.compare(this.progress, dumpFileTransferUiItem.progress) == 0 && Intrinsics.areEqual(this.rateText, dumpFileTransferUiItem.rateText) && this.rateBytesPerSecond == dumpFileTransferUiItem.rateBytesPerSecond && this.transferredBytes == dumpFileTransferUiItem.transferredBytes && this.totalBytes == dumpFileTransferUiItem.totalBytes && this.order == dumpFileTransferUiItem.order;
    }

    public int hashCode() {
        return (((((((((((((((((((this.id.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.remotePath.hashCode()) * 31) + this.kind.hashCode()) * 31) + this.status.hashCode()) * 31) + Float.hashCode(this.progress)) * 31) + this.rateText.hashCode()) * 31) + Long.hashCode(this.rateBytesPerSecond)) * 31) + Long.hashCode(this.transferredBytes)) * 31) + Long.hashCode(this.totalBytes)) * 31) + Integer.hashCode(this.order);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DumpFileTransferUiItem(id=");
        sb.append(this.id).append(", fileName=").append(this.fileName).append(", remotePath=").append(this.remotePath).append(", kind=").append(this.kind).append(", status=").append(this.status).append(", progress=").append(this.progress).append(", rateText=").append(this.rateText).append(", rateBytesPerSecond=").append(this.rateBytesPerSecond).append(", transferredBytes=").append(this.transferredBytes).append(", totalBytes=").append(this.totalBytes).append(", order=").append(this.order).append(')');
        return sb.toString();
    }

    public DumpFileTransferUiItem(String id2, String fileName, String remotePath, DumpFileTransferKind kind, DumpFileTransferStatus status, float f, String rateText, long j, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(rateText, "rateText");
        this.id = id2;
        this.fileName = fileName;
        this.remotePath = remotePath;
        this.kind = kind;
        this.status = status;
        this.progress = f;
        this.rateText = rateText;
        this.rateBytesPerSecond = j;
        this.transferredBytes = j2;
        this.totalBytes = j3;
        this.order = i;
    }

    public final String getId() {
        return this.id;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getRemotePath() {
        return this.remotePath;
    }

    public final DumpFileTransferKind getKind() {
        return this.kind;
    }

    public /* synthetic */ DumpFileTransferUiItem(String str, String str2, String str3, DumpFileTransferKind dumpFileTransferKind, DumpFileTransferStatus dumpFileTransferStatus, float f, String str4, long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, dumpFileTransferKind, (i2 & 16) != 0 ? DumpFileTransferStatus.PENDING : dumpFileTransferStatus, (i2 & 32) != 0 ? 0.0f : f, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? 0L : j, (i2 & 256) != 0 ? 0L : j2, (i2 & 512) != 0 ? 0L : j3, (i2 & 1024) != 0 ? 0 : i);
    }

    public final DumpFileTransferStatus getStatus() {
        return this.status;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getRateText() {
        return this.rateText;
    }

    public final long getRateBytesPerSecond() {
        return this.rateBytesPerSecond;
    }

    public final long getTransferredBytes() {
        return this.transferredBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final int getOrder() {
        return this.order;
    }
}
