package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIMusicBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AIMusicRandomBean;", "", "contentLyric", "", "status", "", "remark", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContentLyric", "()Ljava/lang/String;", "getStatus", "()I", "getRemark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIMusicRandomBean {
    private final String contentLyric;
    private final String remark;
    private final int status;

    public static /* synthetic */ AIMusicRandomBean copy$default(AIMusicRandomBean aIMusicRandomBean, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aIMusicRandomBean.contentLyric;
        }
        if ((i2 & 2) != 0) {
            i = aIMusicRandomBean.status;
        }
        if ((i2 & 4) != 0) {
            str2 = aIMusicRandomBean.remark;
        }
        return aIMusicRandomBean.copy(str, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentLyric() {
        return this.contentLyric;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final AIMusicRandomBean copy(String contentLyric, int status, String remark) {
        Intrinsics.checkNotNullParameter(contentLyric, "contentLyric");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new AIMusicRandomBean(contentLyric, status, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMusicRandomBean)) {
            return false;
        }
        AIMusicRandomBean aIMusicRandomBean = (AIMusicRandomBean) other;
        return Intrinsics.areEqual(this.contentLyric, aIMusicRandomBean.contentLyric) && this.status == aIMusicRandomBean.status && Intrinsics.areEqual(this.remark, aIMusicRandomBean.remark);
    }

    public int hashCode() {
        return (((this.contentLyric.hashCode() * 31) + Integer.hashCode(this.status)) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "AIMusicRandomBean(contentLyric=" + this.contentLyric + ", status=" + this.status + ", remark=" + this.remark + Separators.RPAREN;
    }

    public AIMusicRandomBean(String contentLyric, int i, String remark) {
        Intrinsics.checkNotNullParameter(contentLyric, "contentLyric");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.contentLyric = contentLyric;
        this.status = i;
        this.remark = remark;
    }

    public final String getContentLyric() {
        return this.contentLyric;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final int getStatus() {
        return this.status;
    }
}
