package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/ai/OssMap;", "", "bucketName", "", "fileName", "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBucketName", "()Ljava/lang/String;", "getFileName", "getFilePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OssMap {
    private final String bucketName;
    private final String fileName;
    private final String filePath;

    public static /* synthetic */ OssMap copy$default(OssMap ossMap, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ossMap.bucketName;
        }
        if ((i & 2) != 0) {
            str2 = ossMap.fileName;
        }
        if ((i & 4) != 0) {
            str3 = ossMap.filePath;
        }
        return ossMap.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBucketName() {
        return this.bucketName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final OssMap copy(String bucketName, String fileName, String filePath) {
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new OssMap(bucketName, fileName, filePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OssMap)) {
            return false;
        }
        OssMap ossMap = (OssMap) other;
        return Intrinsics.areEqual(this.bucketName, ossMap.bucketName) && Intrinsics.areEqual(this.fileName, ossMap.fileName) && Intrinsics.areEqual(this.filePath, ossMap.filePath);
    }

    public int hashCode() {
        return (((this.bucketName.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.filePath.hashCode();
    }

    public String toString() {
        return "OssMap(bucketName=" + this.bucketName + ", fileName=" + this.fileName + ", filePath=" + this.filePath + Separators.RPAREN;
    }

    public OssMap(String bucketName, String fileName, String filePath) {
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.bucketName = bucketName;
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }
}
