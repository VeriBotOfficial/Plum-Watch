package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/hispark/crashdump/CrashDumpConfig;", "", "localRootDirName", "", "deleteRemoteAfterUpload", "", "preflightTimeoutMs", "", "uploadInitPath", "uploadCompletePath", "<init>", "(Ljava/lang/String;ZJLjava/lang/String;Ljava/lang/String;)V", "getLocalRootDirName", "()Ljava/lang/String;", "getDeleteRemoteAfterUpload", "()Z", "getPreflightTimeoutMs", "()J", "getUploadInitPath", "getUploadCompletePath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CrashDumpConfig {
    private final boolean deleteRemoteAfterUpload;
    private final String localRootDirName;
    private final long preflightTimeoutMs;
    private final String uploadCompletePath;
    private final String uploadInitPath;

    public CrashDumpConfig() {
        this(null, false, 0L, null, null, 31, null);
    }

    public static /* synthetic */ CrashDumpConfig copy$default(CrashDumpConfig crashDumpConfig, String str, boolean z, long j, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crashDumpConfig.localRootDirName;
        }
        if ((i & 2) != 0) {
            z = crashDumpConfig.deleteRemoteAfterUpload;
        }
        if ((i & 4) != 0) {
            j = crashDumpConfig.preflightTimeoutMs;
        }
        if ((i & 8) != 0) {
            str2 = crashDumpConfig.uploadInitPath;
        }
        if ((i & 16) != 0) {
            str3 = crashDumpConfig.uploadCompletePath;
        }
        long j2 = j;
        return crashDumpConfig.copy(str, z, j2, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLocalRootDirName() {
        return this.localRootDirName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDeleteRemoteAfterUpload() {
        return this.deleteRemoteAfterUpload;
    }

    /* renamed from: component3, reason: from getter */
    public final long getPreflightTimeoutMs() {
        return this.preflightTimeoutMs;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUploadInitPath() {
        return this.uploadInitPath;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUploadCompletePath() {
        return this.uploadCompletePath;
    }

    public final CrashDumpConfig copy(String localRootDirName, boolean deleteRemoteAfterUpload, long preflightTimeoutMs, String uploadInitPath, String uploadCompletePath) {
        Intrinsics.checkNotNullParameter(localRootDirName, "localRootDirName");
        Intrinsics.checkNotNullParameter(uploadInitPath, "uploadInitPath");
        Intrinsics.checkNotNullParameter(uploadCompletePath, "uploadCompletePath");
        return new CrashDumpConfig(localRootDirName, deleteRemoteAfterUpload, preflightTimeoutMs, uploadInitPath, uploadCompletePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashDumpConfig)) {
            return false;
        }
        CrashDumpConfig crashDumpConfig = (CrashDumpConfig) other;
        return Intrinsics.areEqual(this.localRootDirName, crashDumpConfig.localRootDirName) && this.deleteRemoteAfterUpload == crashDumpConfig.deleteRemoteAfterUpload && this.preflightTimeoutMs == crashDumpConfig.preflightTimeoutMs && Intrinsics.areEqual(this.uploadInitPath, crashDumpConfig.uploadInitPath) && Intrinsics.areEqual(this.uploadCompletePath, crashDumpConfig.uploadCompletePath);
    }

    public int hashCode() {
        return (((((((this.localRootDirName.hashCode() * 31) + Boolean.hashCode(this.deleteRemoteAfterUpload)) * 31) + Long.hashCode(this.preflightTimeoutMs)) * 31) + this.uploadInitPath.hashCode()) * 31) + this.uploadCompletePath.hashCode();
    }

    public String toString() {
        return "CrashDumpConfig(localRootDirName=" + this.localRootDirName + ", deleteRemoteAfterUpload=" + this.deleteRemoteAfterUpload + ", preflightTimeoutMs=" + this.preflightTimeoutMs + ", uploadInitPath=" + this.uploadInitPath + ", uploadCompletePath=" + this.uploadCompletePath + ')';
    }

    public CrashDumpConfig(String localRootDirName, boolean z, long j, String uploadInitPath, String uploadCompletePath) {
        Intrinsics.checkNotNullParameter(localRootDirName, "localRootDirName");
        Intrinsics.checkNotNullParameter(uploadInitPath, "uploadInitPath");
        Intrinsics.checkNotNullParameter(uploadCompletePath, "uploadCompletePath");
        this.localRootDirName = localRootDirName;
        this.deleteRemoteAfterUpload = z;
        this.preflightTimeoutMs = j;
        this.uploadInitPath = uploadInitPath;
        this.uploadCompletePath = uploadCompletePath;
    }

    public /* synthetic */ CrashDumpConfig(String str, boolean z, long j, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "crash_dump" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 8000L : j, (i & 8) != 0 ? "/offlineLog/file/upload" : str2, (i & 16) != 0 ? "/offlineLog/file/complete" : str3);
    }

    public final String getLocalRootDirName() {
        return this.localRootDirName;
    }

    public final boolean getDeleteRemoteAfterUpload() {
        return this.deleteRemoteAfterUpload;
    }

    public final long getPreflightTimeoutMs() {
        return this.preflightTimeoutMs;
    }

    public final String getUploadInitPath() {
        return this.uploadInitPath;
    }

    public final String getUploadCompletePath() {
        return this.uploadCompletePath;
    }
}
