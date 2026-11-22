package com.hispark.clouddiag.model;

import com.wakeup.commonui.utils.PermissionsTipHelper;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileEntryReport;", "", "filePath", "", "fileName", "fileType", "fileSize", "", ApiConstants.MTIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getFileName", "getFileType", "getFileSize", "()J", "getMtime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeviceFileEntryReport {
    private final String fileName;
    private final String filePath;
    private final long fileSize;
    private final String fileType;
    private final String mtime;

    public static /* synthetic */ DeviceFileEntryReport copy$default(DeviceFileEntryReport deviceFileEntryReport, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceFileEntryReport.filePath;
        }
        if ((i & 2) != 0) {
            str2 = deviceFileEntryReport.fileName;
        }
        if ((i & 4) != 0) {
            str3 = deviceFileEntryReport.fileType;
        }
        if ((i & 8) != 0) {
            j = deviceFileEntryReport.fileSize;
        }
        if ((i & 16) != 0) {
            str4 = deviceFileEntryReport.mtime;
        }
        String str5 = str4;
        String str6 = str3;
        return deviceFileEntryReport.copy(str, str2, str6, j, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMtime() {
        return this.mtime;
    }

    public final DeviceFileEntryReport copy(String filePath, String fileName, String fileType, long fileSize, String mtime) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        return new DeviceFileEntryReport(filePath, fileName, fileType, fileSize, mtime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceFileEntryReport)) {
            return false;
        }
        DeviceFileEntryReport deviceFileEntryReport = (DeviceFileEntryReport) other;
        return Intrinsics.areEqual(this.filePath, deviceFileEntryReport.filePath) && Intrinsics.areEqual(this.fileName, deviceFileEntryReport.fileName) && Intrinsics.areEqual(this.fileType, deviceFileEntryReport.fileType) && this.fileSize == deviceFileEntryReport.fileSize && Intrinsics.areEqual(this.mtime, deviceFileEntryReport.mtime);
    }

    public int hashCode() {
        int hashCode = ((((((this.filePath.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.fileType.hashCode()) * 31) + Long.hashCode(this.fileSize)) * 31;
        String str = this.mtime;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DeviceFileEntryReport(filePath=" + this.filePath + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", mtime=" + this.mtime + ')';
    }

    public DeviceFileEntryReport(String filePath, String fileName, String fileType, long j, String str) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.filePath = filePath;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = j;
        this.mtime = str;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public /* synthetic */ DeviceFileEntryReport(String str, String str2, String str3, long j, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? PermissionsTipHelper.PERMISSIONS_FLAG_FILE : str3, j, (i & 16) != 0 ? null : str4);
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getMtime() {
        return this.mtime;
    }
}
