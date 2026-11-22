package com.hispark.crashdump;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010J\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010L\u001a\u00020\u0016HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010:Jú\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0012HÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010/\u001a\u0004\b1\u0010.R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:¨\u0006Y"}, d2 = {"Lcom/hispark/crashdump/DumpUploadRecord;", "", "id", "", "deviceSn", "deviceAddress", "artifactRemotePath", "localFilePath", "fileName", "fileSize", "", "fileHash", "version", "hardwareModel", "chipModel", "dumpTime", "dumpType", "rebootCause", "", "rebootCount", "exceptionRebootCount", "status", "Lcom/hispark/crashdump/DumpUploadStatus;", "retryCount", "uploadSource", "lastError", "createdAt", "uploadedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hispark/crashdump/DumpUploadStatus;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;)V", "getId", "()Ljava/lang/String;", "getDeviceSn", "getDeviceAddress", "getArtifactRemotePath", "getLocalFilePath", "getFileName", "getFileSize", "()J", "getFileHash", MobileAdsBridge.versionMethodName, "getHardwareModel", "getChipModel", "getDumpTime", "getDumpType", "getRebootCause", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRebootCount", "getExceptionRebootCount", "getStatus", "()Lcom/hispark/crashdump/DumpUploadStatus;", "getRetryCount", "()I", "getUploadSource", "getLastError", "getCreatedAt", "getUploadedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/hispark/crashdump/DumpUploadStatus;ILjava/lang/String;Ljava/lang/String;JLjava/lang/Long;)Lcom/hispark/crashdump/DumpUploadRecord;", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpUploadRecord {
    private final String artifactRemotePath;
    private final String chipModel;
    private final long createdAt;
    private final String deviceAddress;
    private final String deviceSn;
    private final String dumpTime;
    private final String dumpType;
    private final Integer exceptionRebootCount;
    private final String fileHash;
    private final String fileName;
    private final long fileSize;
    private final String hardwareModel;
    private final String id;
    private final String lastError;
    private final String localFilePath;
    private final Integer rebootCause;
    private final Integer rebootCount;
    private final int retryCount;
    private final DumpUploadStatus status;
    private final String uploadSource;
    private final Long uploadedAt;
    private final String version;

    public static /* synthetic */ DumpUploadRecord copy$default(DumpUploadRecord dumpUploadRecord, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, Integer num3, DumpUploadStatus dumpUploadStatus, int i, String str13, String str14, long j2, Long l, int i2, Object obj) {
        Long l2;
        long j3;
        String str15 = (i2 & 1) != 0 ? dumpUploadRecord.id : str;
        String str16 = (i2 & 2) != 0 ? dumpUploadRecord.deviceSn : str2;
        String str17 = (i2 & 4) != 0 ? dumpUploadRecord.deviceAddress : str3;
        String str18 = (i2 & 8) != 0 ? dumpUploadRecord.artifactRemotePath : str4;
        String str19 = (i2 & 16) != 0 ? dumpUploadRecord.localFilePath : str5;
        String str20 = (i2 & 32) != 0 ? dumpUploadRecord.fileName : str6;
        long j4 = (i2 & 64) != 0 ? dumpUploadRecord.fileSize : j;
        String str21 = (i2 & 128) != 0 ? dumpUploadRecord.fileHash : str7;
        String str22 = (i2 & 256) != 0 ? dumpUploadRecord.version : str8;
        String str23 = (i2 & 512) != 0 ? dumpUploadRecord.hardwareModel : str9;
        String str24 = (i2 & 1024) != 0 ? dumpUploadRecord.chipModel : str10;
        String str25 = (i2 & 2048) != 0 ? dumpUploadRecord.dumpTime : str11;
        String str26 = (i2 & 4096) != 0 ? dumpUploadRecord.dumpType : str12;
        String str27 = str15;
        Integer num4 = (i2 & 8192) != 0 ? dumpUploadRecord.rebootCause : num;
        Integer num5 = (i2 & 16384) != 0 ? dumpUploadRecord.rebootCount : num2;
        Integer num6 = (i2 & 32768) != 0 ? dumpUploadRecord.exceptionRebootCount : num3;
        DumpUploadStatus dumpUploadStatus2 = (i2 & 65536) != 0 ? dumpUploadRecord.status : dumpUploadStatus;
        int i3 = (i2 & 131072) != 0 ? dumpUploadRecord.retryCount : i;
        String str28 = (i2 & 262144) != 0 ? dumpUploadRecord.uploadSource : str13;
        String str29 = (i2 & 524288) != 0 ? dumpUploadRecord.lastError : str14;
        Integer num7 = num5;
        long j5 = (i2 & 1048576) != 0 ? dumpUploadRecord.createdAt : j2;
        if ((i2 & 2097152) != 0) {
            j3 = j5;
            l2 = dumpUploadRecord.uploadedAt;
        } else {
            l2 = l;
            j3 = j5;
        }
        return dumpUploadRecord.copy(str27, str16, str17, str18, str19, str20, j4, str21, str22, str23, str24, str25, str26, num4, num7, num6, dumpUploadStatus2, i3, str28, str29, j3, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    /* renamed from: component11, reason: from getter */
    public final String getChipModel() {
        return this.chipModel;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDumpTime() {
        return this.dumpTime;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDumpType() {
        return this.dumpType;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getRebootCause() {
        return this.rebootCause;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getRebootCount() {
        return this.rebootCount;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getExceptionRebootCount() {
        return this.exceptionRebootCount;
    }

    /* renamed from: component17, reason: from getter */
    public final DumpUploadStatus getStatus() {
        return this.status;
    }

    /* renamed from: component18, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* renamed from: component19, reason: from getter */
    public final String getUploadSource() {
        return this.uploadSource;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* renamed from: component20, reason: from getter */
    public final String getLastError() {
        return this.lastError;
    }

    /* renamed from: component21, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component22, reason: from getter */
    public final Long getUploadedAt() {
        return this.uploadedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArtifactRemotePath() {
        return this.artifactRemotePath;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component7, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFileHash() {
        return this.fileHash;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final DumpUploadRecord copy(String id2, String deviceSn, String deviceAddress, String artifactRemotePath, String localFilePath, String fileName, long fileSize, String fileHash, String version, String hardwareModel, String chipModel, String dumpTime, String dumpType, Integer rebootCause, Integer rebootCount, Integer exceptionRebootCount, DumpUploadStatus status, int retryCount, String uploadSource, String lastError, long createdAt, Long uploadedAt) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(artifactRemotePath, "artifactRemotePath");
        Intrinsics.checkNotNullParameter(localFilePath, "localFilePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(uploadSource, "uploadSource");
        return new DumpUploadRecord(id2, deviceSn, deviceAddress, artifactRemotePath, localFilePath, fileName, fileSize, fileHash, version, hardwareModel, chipModel, dumpTime, dumpType, rebootCause, rebootCount, exceptionRebootCount, status, retryCount, uploadSource, lastError, createdAt, uploadedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpUploadRecord)) {
            return false;
        }
        DumpUploadRecord dumpUploadRecord = (DumpUploadRecord) other;
        return Intrinsics.areEqual(this.id, dumpUploadRecord.id) && Intrinsics.areEqual(this.deviceSn, dumpUploadRecord.deviceSn) && Intrinsics.areEqual(this.deviceAddress, dumpUploadRecord.deviceAddress) && Intrinsics.areEqual(this.artifactRemotePath, dumpUploadRecord.artifactRemotePath) && Intrinsics.areEqual(this.localFilePath, dumpUploadRecord.localFilePath) && Intrinsics.areEqual(this.fileName, dumpUploadRecord.fileName) && this.fileSize == dumpUploadRecord.fileSize && Intrinsics.areEqual(this.fileHash, dumpUploadRecord.fileHash) && Intrinsics.areEqual(this.version, dumpUploadRecord.version) && Intrinsics.areEqual(this.hardwareModel, dumpUploadRecord.hardwareModel) && Intrinsics.areEqual(this.chipModel, dumpUploadRecord.chipModel) && Intrinsics.areEqual(this.dumpTime, dumpUploadRecord.dumpTime) && Intrinsics.areEqual(this.dumpType, dumpUploadRecord.dumpType) && Intrinsics.areEqual(this.rebootCause, dumpUploadRecord.rebootCause) && Intrinsics.areEqual(this.rebootCount, dumpUploadRecord.rebootCount) && Intrinsics.areEqual(this.exceptionRebootCount, dumpUploadRecord.exceptionRebootCount) && this.status == dumpUploadRecord.status && this.retryCount == dumpUploadRecord.retryCount && Intrinsics.areEqual(this.uploadSource, dumpUploadRecord.uploadSource) && Intrinsics.areEqual(this.lastError, dumpUploadRecord.lastError) && this.createdAt == dumpUploadRecord.createdAt && Intrinsics.areEqual(this.uploadedAt, dumpUploadRecord.uploadedAt);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.id.hashCode() * 31) + this.deviceSn.hashCode()) * 31) + this.deviceAddress.hashCode()) * 31) + this.artifactRemotePath.hashCode()) * 31) + this.localFilePath.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31) + this.fileHash.hashCode()) * 31) + this.version.hashCode()) * 31) + this.hardwareModel.hashCode()) * 31;
        String str = this.chipModel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dumpTime;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dumpType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.rebootCause;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rebootCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.exceptionRebootCount;
        int hashCode7 = (((((((hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.retryCount)) * 31) + this.uploadSource.hashCode()) * 31;
        String str4 = this.lastError;
        int hashCode8 = (((hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.createdAt)) * 31;
        Long l = this.uploadedAt;
        return hashCode8 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DumpUploadRecord(id=");
        sb.append(this.id).append(", deviceSn=").append(this.deviceSn).append(", deviceAddress=").append(this.deviceAddress).append(", artifactRemotePath=").append(this.artifactRemotePath).append(", localFilePath=").append(this.localFilePath).append(", fileName=").append(this.fileName).append(", fileSize=").append(this.fileSize).append(", fileHash=").append(this.fileHash).append(", version=").append(this.version).append(", hardwareModel=").append(this.hardwareModel).append(", chipModel=").append(this.chipModel).append(", dumpTime=");
        sb.append(this.dumpTime).append(", dumpType=").append(this.dumpType).append(", rebootCause=").append(this.rebootCause).append(", rebootCount=").append(this.rebootCount).append(", exceptionRebootCount=").append(this.exceptionRebootCount).append(", status=").append(this.status).append(", retryCount=").append(this.retryCount).append(", uploadSource=").append(this.uploadSource).append(", lastError=").append(this.lastError).append(", createdAt=").append(this.createdAt).append(", uploadedAt=").append(this.uploadedAt).append(')');
        return sb.toString();
    }

    public DumpUploadRecord(String id2, String deviceSn, String deviceAddress, String artifactRemotePath, String localFilePath, String fileName, long j, String fileHash, String version, String hardwareModel, String str, String str2, String str3, Integer num, Integer num2, Integer num3, DumpUploadStatus status, int i, String uploadSource, String str4, long j2, Long l) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(deviceSn, "deviceSn");
        Intrinsics.checkNotNullParameter(deviceAddress, "deviceAddress");
        Intrinsics.checkNotNullParameter(artifactRemotePath, "artifactRemotePath");
        Intrinsics.checkNotNullParameter(localFilePath, "localFilePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(hardwareModel, "hardwareModel");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(uploadSource, "uploadSource");
        this.id = id2;
        this.deviceSn = deviceSn;
        this.deviceAddress = deviceAddress;
        this.artifactRemotePath = artifactRemotePath;
        this.localFilePath = localFilePath;
        this.fileName = fileName;
        this.fileSize = j;
        this.fileHash = fileHash;
        this.version = version;
        this.hardwareModel = hardwareModel;
        this.chipModel = str;
        this.dumpTime = str2;
        this.dumpType = str3;
        this.rebootCause = num;
        this.rebootCount = num2;
        this.exceptionRebootCount = num3;
        this.status = status;
        this.retryCount = i;
        this.uploadSource = uploadSource;
        this.lastError = str4;
        this.createdAt = j2;
        this.uploadedAt = l;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final String getDeviceAddress() {
        return this.deviceAddress;
    }

    public final String getArtifactRemotePath() {
        return this.artifactRemotePath;
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getFileHash() {
        return this.fileHash;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getHardwareModel() {
        return this.hardwareModel;
    }

    public final String getChipModel() {
        return this.chipModel;
    }

    public final String getDumpTime() {
        return this.dumpTime;
    }

    public final String getDumpType() {
        return this.dumpType;
    }

    public final Integer getRebootCause() {
        return this.rebootCause;
    }

    public final Integer getRebootCount() {
        return this.rebootCount;
    }

    public final Integer getExceptionRebootCount() {
        return this.exceptionRebootCount;
    }

    public final DumpUploadStatus getStatus() {
        return this.status;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getUploadSource() {
        return this.uploadSource;
    }

    public final String getLastError() {
        return this.lastError;
    }

    public /* synthetic */ DumpUploadRecord(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, Integer num3, DumpUploadStatus dumpUploadStatus, int i, String str13, String str14, long j2, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, j, str7, str8, str9, str10, str11, str12, num, num2, num3, dumpUploadStatus, i, str13, (i2 & 524288) != 0 ? null : str14, (i2 & 1048576) != 0 ? System.currentTimeMillis() : j2, (i2 & 2097152) != 0 ? null : l);
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final Long getUploadedAt() {
        return this.uploadedAt;
    }
}
