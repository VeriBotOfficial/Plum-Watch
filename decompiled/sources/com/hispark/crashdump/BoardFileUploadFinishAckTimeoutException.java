package com.hispark.crashdump;

import kotlin.Metadata;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/hispark/crashdump/BoardFileUploadFinishAckTimeoutException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "timeoutMs", "", "transmitId", "", "transferredBytes", "totalBytes", "<init>", "(JIJJ)V", "getTimeoutMs", "()J", "getTransmitId", "()I", "getTransferredBytes", "getTotalBytes", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardFileUploadFinishAckTimeoutException extends IllegalStateException {
    private final long timeoutMs;
    private final long totalBytes;
    private final long transferredBytes;
    private final int transmitId;

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final int getTransmitId() {
        return this.transmitId;
    }

    public final long getTransferredBytes() {
        return this.transferredBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public BoardFileUploadFinishAckTimeoutException(long j, int i, long j2, long j3) {
        super("文件上传完成确认超时：timeoutMs=" + j + ", transmitId=" + i + ", transferred=" + j2 + '/' + j3);
        this.timeoutMs = j;
        this.transmitId = i;
        this.transferredBytes = j2;
        this.totalBytes = j3;
    }
}
