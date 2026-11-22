package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VideoReportEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/video/VideoReportEntity;", "Ljava/io/Serializable;", "reportType", "", "reportDesc", "reportDetail", "proofRequired", "", "subType", "", "Lcom/wakeup/common/network/entity/video/SubType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getReportType", "()Ljava/lang/String;", "getReportDesc", "getReportDetail", "getProofRequired", "()Z", "getSubType", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VideoReportEntity implements Serializable {
    private final boolean proofRequired;
    private final String reportDesc;
    private final String reportDetail;
    private final String reportType;
    private final List<SubType> subType;

    public static /* synthetic */ VideoReportEntity copy$default(VideoReportEntity videoReportEntity, String str, String str2, String str3, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoReportEntity.reportType;
        }
        if ((i & 2) != 0) {
            str2 = videoReportEntity.reportDesc;
        }
        if ((i & 4) != 0) {
            str3 = videoReportEntity.reportDetail;
        }
        if ((i & 8) != 0) {
            z = videoReportEntity.proofRequired;
        }
        if ((i & 16) != 0) {
            list = videoReportEntity.subType;
        }
        List list2 = list;
        String str4 = str3;
        return videoReportEntity.copy(str, str2, str4, z, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReportType() {
        return this.reportType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReportDesc() {
        return this.reportDesc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReportDetail() {
        return this.reportDetail;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getProofRequired() {
        return this.proofRequired;
    }

    public final List<SubType> component5() {
        return this.subType;
    }

    public final VideoReportEntity copy(String reportType, String reportDesc, String reportDetail, boolean proofRequired, List<SubType> subType) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportDesc, "reportDesc");
        Intrinsics.checkNotNullParameter(reportDetail, "reportDetail");
        Intrinsics.checkNotNullParameter(subType, "subType");
        return new VideoReportEntity(reportType, reportDesc, reportDetail, proofRequired, subType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoReportEntity)) {
            return false;
        }
        VideoReportEntity videoReportEntity = (VideoReportEntity) other;
        return Intrinsics.areEqual(this.reportType, videoReportEntity.reportType) && Intrinsics.areEqual(this.reportDesc, videoReportEntity.reportDesc) && Intrinsics.areEqual(this.reportDetail, videoReportEntity.reportDetail) && this.proofRequired == videoReportEntity.proofRequired && Intrinsics.areEqual(this.subType, videoReportEntity.subType);
    }

    public int hashCode() {
        return (((((((this.reportType.hashCode() * 31) + this.reportDesc.hashCode()) * 31) + this.reportDetail.hashCode()) * 31) + Boolean.hashCode(this.proofRequired)) * 31) + this.subType.hashCode();
    }

    public String toString() {
        return "VideoReportEntity(reportType=" + this.reportType + ", reportDesc=" + this.reportDesc + ", reportDetail=" + this.reportDetail + ", proofRequired=" + this.proofRequired + ", subType=" + this.subType + Separators.RPAREN;
    }

    public VideoReportEntity(String reportType, String reportDesc, String reportDetail, boolean z, List<SubType> subType) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportDesc, "reportDesc");
        Intrinsics.checkNotNullParameter(reportDetail, "reportDetail");
        Intrinsics.checkNotNullParameter(subType, "subType");
        this.reportType = reportType;
        this.reportDesc = reportDesc;
        this.reportDetail = reportDetail;
        this.proofRequired = z;
        this.subType = subType;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final String getReportDesc() {
        return this.reportDesc;
    }

    public final String getReportDetail() {
        return this.reportDetail;
    }

    public final boolean getProofRequired() {
        return this.proofRequired;
    }

    public final List<SubType> getSubType() {
        return this.subType;
    }
}
