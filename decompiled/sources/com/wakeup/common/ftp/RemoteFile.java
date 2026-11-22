package com.wakeup.common.ftp;

import android.gov.nist.core.Separators;
import com.luck.picture.lib.config.PictureMimeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WkFtpClient.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/ftp/RemoteFile;", "", "fileName", "", "fileSize", "", "isDir", "", "path", "createTime", "<init>", "(Ljava/lang/String;JZLjava/lang/String;J)V", "getFileName", "()Ljava/lang/String;", "getFileSize", "()J", "()Z", "getPath", "getCreateTime", "isVideo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RemoteFile {
    private final long createTime;
    private final String fileName;
    private final long fileSize;
    private final boolean isDir;
    private final String path;

    public static /* synthetic */ RemoteFile copy$default(RemoteFile remoteFile, String str, long j, boolean z, String str2, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteFile.fileName;
        }
        if ((i & 2) != 0) {
            j = remoteFile.fileSize;
        }
        if ((i & 4) != 0) {
            z = remoteFile.isDir;
        }
        if ((i & 8) != 0) {
            str2 = remoteFile.path;
        }
        if ((i & 16) != 0) {
            j2 = remoteFile.createTime;
        }
        return remoteFile.copy(str, j, z, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDir() {
        return this.isDir;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final RemoteFile copy(String fileName, long fileSize, boolean isDir, String path, long createTime) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(path, "path");
        return new RemoteFile(fileName, fileSize, isDir, path, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteFile)) {
            return false;
        }
        RemoteFile remoteFile = (RemoteFile) other;
        return Intrinsics.areEqual(this.fileName, remoteFile.fileName) && this.fileSize == remoteFile.fileSize && this.isDir == remoteFile.isDir && Intrinsics.areEqual(this.path, remoteFile.path) && this.createTime == remoteFile.createTime;
    }

    public int hashCode() {
        return (((((((this.fileName.hashCode() * 31) + Long.hashCode(this.fileSize)) * 31) + Boolean.hashCode(this.isDir)) * 31) + this.path.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "RemoteFile(fileName=" + this.fileName + ", fileSize=" + this.fileSize + ", isDir=" + this.isDir + ", path=" + this.path + ", createTime=" + this.createTime + Separators.RPAREN;
    }

    public RemoteFile(String fileName, long j, boolean z, String path, long j2) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(path, "path");
        this.fileName = fileName;
        this.fileSize = j;
        this.isDir = z;
        this.path = path;
        this.createTime = j2;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final boolean isDir() {
        return this.isDir;
    }

    public final String getPath() {
        return this.path;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final boolean isVideo() {
        return StringsKt.endsWith(this.fileName, PictureMimeType.AVI, true) || StringsKt.endsWith(this.fileName, PictureMimeType.MP4, true);
    }
}
