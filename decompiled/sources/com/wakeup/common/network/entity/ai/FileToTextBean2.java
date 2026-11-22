package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/ai/FileToTextBean2;", "", "traceId", "", "bigFileSpeechTaskId", "supplierType", "", "ossMap", "Lcom/wakeup/common/network/entity/ai/OssMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/wakeup/common/network/entity/ai/OssMap;)V", "getTraceId", "()Ljava/lang/String;", "getBigFileSpeechTaskId", "getSupplierType", "()I", "getOssMap", "()Lcom/wakeup/common/network/entity/ai/OssMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileToTextBean2 {
    private final String bigFileSpeechTaskId;
    private final OssMap ossMap;
    private final int supplierType;
    private final String traceId;

    public static /* synthetic */ FileToTextBean2 copy$default(FileToTextBean2 fileToTextBean2, String str, String str2, int i, OssMap ossMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fileToTextBean2.traceId;
        }
        if ((i2 & 2) != 0) {
            str2 = fileToTextBean2.bigFileSpeechTaskId;
        }
        if ((i2 & 4) != 0) {
            i = fileToTextBean2.supplierType;
        }
        if ((i2 & 8) != 0) {
            ossMap = fileToTextBean2.ossMap;
        }
        return fileToTextBean2.copy(str, str2, i, ossMap);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBigFileSpeechTaskId() {
        return this.bigFileSpeechTaskId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSupplierType() {
        return this.supplierType;
    }

    /* renamed from: component4, reason: from getter */
    public final OssMap getOssMap() {
        return this.ossMap;
    }

    public final FileToTextBean2 copy(String traceId, String bigFileSpeechTaskId, int supplierType, OssMap ossMap) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(bigFileSpeechTaskId, "bigFileSpeechTaskId");
        Intrinsics.checkNotNullParameter(ossMap, "ossMap");
        return new FileToTextBean2(traceId, bigFileSpeechTaskId, supplierType, ossMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileToTextBean2)) {
            return false;
        }
        FileToTextBean2 fileToTextBean2 = (FileToTextBean2) other;
        return Intrinsics.areEqual(this.traceId, fileToTextBean2.traceId) && Intrinsics.areEqual(this.bigFileSpeechTaskId, fileToTextBean2.bigFileSpeechTaskId) && this.supplierType == fileToTextBean2.supplierType && Intrinsics.areEqual(this.ossMap, fileToTextBean2.ossMap);
    }

    public int hashCode() {
        return (((((this.traceId.hashCode() * 31) + this.bigFileSpeechTaskId.hashCode()) * 31) + Integer.hashCode(this.supplierType)) * 31) + this.ossMap.hashCode();
    }

    public String toString() {
        return "FileToTextBean2(traceId=" + this.traceId + ", bigFileSpeechTaskId=" + this.bigFileSpeechTaskId + ", supplierType=" + this.supplierType + ", ossMap=" + this.ossMap + Separators.RPAREN;
    }

    public FileToTextBean2(String traceId, String bigFileSpeechTaskId, int i, OssMap ossMap) {
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(bigFileSpeechTaskId, "bigFileSpeechTaskId");
        Intrinsics.checkNotNullParameter(ossMap, "ossMap");
        this.traceId = traceId;
        this.bigFileSpeechTaskId = bigFileSpeechTaskId;
        this.supplierType = i;
        this.ossMap = ossMap;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getBigFileSpeechTaskId() {
        return this.bigFileSpeechTaskId;
    }

    public final int getSupplierType() {
        return this.supplierType;
    }

    public final OssMap getOssMap() {
        return this.ossMap;
    }
}
