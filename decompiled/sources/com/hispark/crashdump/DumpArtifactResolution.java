package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/hispark/crashdump/DumpArtifactResolution;", "", "remotePath", "", "remoteFileName", "fileSize", "", "localFileName", "packageFileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRemotePath", "()Ljava/lang/String;", "getRemoteFileName", "getFileSize", "()I", "getLocalFileName", "getPackageFileName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DumpArtifactResolution {
    private final int fileSize;
    private final String localFileName;
    private final String packageFileName;
    private final String remoteFileName;
    private final String remotePath;

    public static /* synthetic */ DumpArtifactResolution copy$default(DumpArtifactResolution dumpArtifactResolution, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dumpArtifactResolution.remotePath;
        }
        if ((i2 & 2) != 0) {
            str2 = dumpArtifactResolution.remoteFileName;
        }
        if ((i2 & 4) != 0) {
            i = dumpArtifactResolution.fileSize;
        }
        if ((i2 & 8) != 0) {
            str3 = dumpArtifactResolution.localFileName;
        }
        if ((i2 & 16) != 0) {
            str4 = dumpArtifactResolution.packageFileName;
        }
        String str5 = str4;
        int i3 = i;
        return dumpArtifactResolution.copy(str, str2, i3, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRemotePath() {
        return this.remotePath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRemoteFileName() {
        return this.remoteFileName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocalFileName() {
        return this.localFileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPackageFileName() {
        return this.packageFileName;
    }

    public final DumpArtifactResolution copy(String remotePath, String remoteFileName, int fileSize, String localFileName, String packageFileName) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(remoteFileName, "remoteFileName");
        Intrinsics.checkNotNullParameter(localFileName, "localFileName");
        Intrinsics.checkNotNullParameter(packageFileName, "packageFileName");
        return new DumpArtifactResolution(remotePath, remoteFileName, fileSize, localFileName, packageFileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DumpArtifactResolution)) {
            return false;
        }
        DumpArtifactResolution dumpArtifactResolution = (DumpArtifactResolution) other;
        return Intrinsics.areEqual(this.remotePath, dumpArtifactResolution.remotePath) && Intrinsics.areEqual(this.remoteFileName, dumpArtifactResolution.remoteFileName) && this.fileSize == dumpArtifactResolution.fileSize && Intrinsics.areEqual(this.localFileName, dumpArtifactResolution.localFileName) && Intrinsics.areEqual(this.packageFileName, dumpArtifactResolution.packageFileName);
    }

    public int hashCode() {
        return (((((((this.remotePath.hashCode() * 31) + this.remoteFileName.hashCode()) * 31) + Integer.hashCode(this.fileSize)) * 31) + this.localFileName.hashCode()) * 31) + this.packageFileName.hashCode();
    }

    public String toString() {
        return "DumpArtifactResolution(remotePath=" + this.remotePath + ", remoteFileName=" + this.remoteFileName + ", fileSize=" + this.fileSize + ", localFileName=" + this.localFileName + ", packageFileName=" + this.packageFileName + ')';
    }

    public DumpArtifactResolution(String remotePath, String remoteFileName, int i, String localFileName, String packageFileName) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(remoteFileName, "remoteFileName");
        Intrinsics.checkNotNullParameter(localFileName, "localFileName");
        Intrinsics.checkNotNullParameter(packageFileName, "packageFileName");
        this.remotePath = remotePath;
        this.remoteFileName = remoteFileName;
        this.fileSize = i;
        this.localFileName = localFileName;
        this.packageFileName = packageFileName;
    }

    public /* synthetic */ DumpArtifactResolution(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i2 & 16) != 0 ? str2 : str4);
    }

    public final String getRemotePath() {
        return this.remotePath;
    }

    public final String getRemoteFileName() {
        return this.remoteFileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getLocalFileName() {
        return this.localFileName;
    }

    public final String getPackageFileName() {
        return this.packageFileName;
    }
}
