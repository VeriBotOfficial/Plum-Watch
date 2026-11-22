package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/hispark/crashdump/BoardFileItem;", "", "fileName", "", "isFile", "", "fileSize", "", "<init>", "(Ljava/lang/String;ZI)V", "getFileName", "()Ljava/lang/String;", "()Z", "getFileSize", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoardFileItem {
    private final String fileName;
    private final int fileSize;
    private final boolean isFile;

    public static /* synthetic */ BoardFileItem copy$default(BoardFileItem boardFileItem, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = boardFileItem.fileName;
        }
        if ((i2 & 2) != 0) {
            z = boardFileItem.isFile;
        }
        if ((i2 & 4) != 0) {
            i = boardFileItem.fileSize;
        }
        return boardFileItem.copy(str, z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFile() {
        return this.isFile;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    public final BoardFileItem copy(String fileName, boolean isFile, int fileSize) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new BoardFileItem(fileName, isFile, fileSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardFileItem)) {
            return false;
        }
        BoardFileItem boardFileItem = (BoardFileItem) other;
        return Intrinsics.areEqual(this.fileName, boardFileItem.fileName) && this.isFile == boardFileItem.isFile && this.fileSize == boardFileItem.fileSize;
    }

    public int hashCode() {
        return (((this.fileName.hashCode() * 31) + Boolean.hashCode(this.isFile)) * 31) + Integer.hashCode(this.fileSize);
    }

    public String toString() {
        return "BoardFileItem(fileName=" + this.fileName + ", isFile=" + this.isFile + ", fileSize=" + this.fileSize + ')';
    }

    public BoardFileItem(String fileName, boolean z, int i) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
        this.isFile = z;
        this.fileSize = i;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean isFile() {
        return this.isFile;
    }

    public final int getFileSize() {
        return this.fileSize;
    }
}
