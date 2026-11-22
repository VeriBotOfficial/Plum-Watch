package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpUploader.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/hispark/crashdump/DumpUploadInitRequest;", "", "device", "Lcom/hispark/crashdump/DumpDevicePayload;", "type", "", "fileSize", "", "logType", "", "<init>", "(Lcom/hispark/crashdump/DumpDevicePayload;Ljava/lang/String;JI)V", "getDevice", "()Lcom/hispark/crashdump/DumpDevicePayload;", "getType", "()Ljava/lang/String;", "getFileSize", "()J", "getLogType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpUploadInitRequest {
    private final DumpDevicePayload device;
    private final long fileSize;
    private final int logType;
    private final String type;

    public static /* synthetic */ DumpUploadInitRequest copy$default(DumpUploadInitRequest dumpUploadInitRequest, DumpDevicePayload dumpDevicePayload, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dumpDevicePayload = dumpUploadInitRequest.device;
        }
        if ((i2 & 2) != 0) {
            str = dumpUploadInitRequest.type;
        }
        if ((i2 & 4) != 0) {
            j = dumpUploadInitRequest.fileSize;
        }
        if ((i2 & 8) != 0) {
            i = dumpUploadInitRequest.logType;
        }
        int i3 = i;
        return dumpUploadInitRequest.copy(dumpDevicePayload, str, j, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final DumpDevicePayload getDevice() {
        return this.device;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLogType() {
        return this.logType;
    }

    public final DumpUploadInitRequest copy(DumpDevicePayload device, String type, long fileSize, int logType) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DumpUploadInitRequest(device, type, fileSize, logType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpUploadInitRequest)) {
            return false;
        }
        DumpUploadInitRequest dumpUploadInitRequest = (DumpUploadInitRequest) other;
        return Intrinsics.areEqual(this.device, dumpUploadInitRequest.device) && Intrinsics.areEqual(this.type, dumpUploadInitRequest.type) && this.fileSize == dumpUploadInitRequest.fileSize && this.logType == dumpUploadInitRequest.logType;
    }

    public int hashCode() {
        return (((((this.device.hashCode() * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + Integer.hashCode(this.logType);
    }

    public String toString() {
        return "DumpUploadInitRequest(device=" + this.device + ", type=" + this.type + ", fileSize=" + this.fileSize + ", logType=" + this.logType + ')';
    }

    public DumpUploadInitRequest(DumpDevicePayload device, String type, long j, int i) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(type, "type");
        this.device = device;
        this.type = type;
        this.fileSize = j;
        this.logType = i;
    }

    public final DumpDevicePayload getDevice() {
        return this.device;
    }

    public /* synthetic */ DumpUploadInitRequest(DumpDevicePayload dumpDevicePayload, String str, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dumpDevicePayload, (i2 & 2) != 0 ? "dump" : str, j, (i2 & 8) != 0 ? 2 : i);
    }

    public final String getType() {
        return this.type;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getLogType() {
        return this.logType;
    }
}
