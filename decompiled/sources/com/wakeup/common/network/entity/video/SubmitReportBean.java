package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SubmitReportBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003JK\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016¨\u0006+"}, d2 = {"Lcom/wakeup/common/network/entity/video/SubmitReportBean;", "", "categoryId", "", "pushId", "scene", "", "reportType", "reportFiles", "", "reportDetailDesc", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCategoryId", "()I", "setCategoryId", "(I)V", "getPushId", "setPushId", "getScene", "()Ljava/lang/String;", "setScene", "(Ljava/lang/String;)V", "getReportType", "setReportType", "getReportFiles", "()Ljava/util/List;", "setReportFiles", "(Ljava/util/List;)V", "getReportDetailDesc", "setReportDetailDesc", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SubmitReportBean {
    private int categoryId;
    private int pushId;
    private String reportDetailDesc;
    private List<String> reportFiles;
    private String reportType;
    private String scene;

    public static /* synthetic */ SubmitReportBean copy$default(SubmitReportBean submitReportBean, int i, int i2, String str, String str2, List list, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = submitReportBean.categoryId;
        }
        if ((i3 & 2) != 0) {
            i2 = submitReportBean.pushId;
        }
        if ((i3 & 4) != 0) {
            str = submitReportBean.scene;
        }
        if ((i3 & 8) != 0) {
            str2 = submitReportBean.reportType;
        }
        if ((i3 & 16) != 0) {
            list = submitReportBean.reportFiles;
        }
        if ((i3 & 32) != 0) {
            str3 = submitReportBean.reportDetailDesc;
        }
        List list2 = list;
        String str4 = str3;
        return submitReportBean.copy(i, i2, str, str2, list2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPushId() {
        return this.pushId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScene() {
        return this.scene;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReportType() {
        return this.reportType;
    }

    public final List<String> component5() {
        return this.reportFiles;
    }

    /* renamed from: component6, reason: from getter */
    public final String getReportDetailDesc() {
        return this.reportDetailDesc;
    }

    public final SubmitReportBean copy(int categoryId, int pushId, String scene, String reportType, List<String> reportFiles, String reportDetailDesc) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportFiles, "reportFiles");
        Intrinsics.checkNotNullParameter(reportDetailDesc, "reportDetailDesc");
        return new SubmitReportBean(categoryId, pushId, scene, reportType, reportFiles, reportDetailDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitReportBean)) {
            return false;
        }
        SubmitReportBean submitReportBean = (SubmitReportBean) other;
        return this.categoryId == submitReportBean.categoryId && this.pushId == submitReportBean.pushId && Intrinsics.areEqual(this.scene, submitReportBean.scene) && Intrinsics.areEqual(this.reportType, submitReportBean.reportType) && Intrinsics.areEqual(this.reportFiles, submitReportBean.reportFiles) && Intrinsics.areEqual(this.reportDetailDesc, submitReportBean.reportDetailDesc);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.categoryId) * 31) + Integer.hashCode(this.pushId)) * 31) + this.scene.hashCode()) * 31) + this.reportType.hashCode()) * 31) + this.reportFiles.hashCode()) * 31) + this.reportDetailDesc.hashCode();
    }

    public String toString() {
        return "SubmitReportBean(categoryId=" + this.categoryId + ", pushId=" + this.pushId + ", scene=" + this.scene + ", reportType=" + this.reportType + ", reportFiles=" + this.reportFiles + ", reportDetailDesc=" + this.reportDetailDesc + Separators.RPAREN;
    }

    public SubmitReportBean(int i, int i2, String scene, String reportType, List<String> reportFiles, String reportDetailDesc) {
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportFiles, "reportFiles");
        Intrinsics.checkNotNullParameter(reportDetailDesc, "reportDetailDesc");
        this.categoryId = i;
        this.pushId = i2;
        this.scene = scene;
        this.reportType = reportType;
        this.reportFiles = reportFiles;
        this.reportDetailDesc = reportDetailDesc;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(int i) {
        this.categoryId = i;
    }

    public final int getPushId() {
        return this.pushId;
    }

    public final void setPushId(int i) {
        this.pushId = i;
    }

    public final String getScene() {
        return this.scene;
    }

    public final void setScene(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scene = str;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final void setReportType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reportType = str;
    }

    public final List<String> getReportFiles() {
        return this.reportFiles;
    }

    public final void setReportFiles(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.reportFiles = list;
    }

    public final String getReportDetailDesc() {
        return this.reportDetailDesc;
    }

    public final void setReportDetailDesc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reportDetailDesc = str;
    }
}
