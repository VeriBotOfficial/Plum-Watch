package com.wakeup.common.network.entity.xunfei;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XunfeiLfaRsp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/xunfei/XFQueryOrderInfo;", "", "orderId", "", "failType", "", "status", "realDuration", "", "<init>", "(Ljava/lang/String;IIJ)V", "getOrderId", "()Ljava/lang/String;", "getFailType", "()I", "getStatus", "getRealDuration", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XFQueryOrderInfo {
    private final int failType;
    private final String orderId;
    private final long realDuration;
    private final int status;

    public static /* synthetic */ XFQueryOrderInfo copy$default(XFQueryOrderInfo xFQueryOrderInfo, String str, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = xFQueryOrderInfo.orderId;
        }
        if ((i3 & 2) != 0) {
            i = xFQueryOrderInfo.failType;
        }
        if ((i3 & 4) != 0) {
            i2 = xFQueryOrderInfo.status;
        }
        if ((i3 & 8) != 0) {
            j = xFQueryOrderInfo.realDuration;
        }
        int i4 = i2;
        return xFQueryOrderInfo.copy(str, i, i4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFailType() {
        return this.failType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRealDuration() {
        return this.realDuration;
    }

    public final XFQueryOrderInfo copy(String orderId, int failType, int status, long realDuration) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new XFQueryOrderInfo(orderId, failType, status, realDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XFQueryOrderInfo)) {
            return false;
        }
        XFQueryOrderInfo xFQueryOrderInfo = (XFQueryOrderInfo) other;
        return Intrinsics.areEqual(this.orderId, xFQueryOrderInfo.orderId) && this.failType == xFQueryOrderInfo.failType && this.status == xFQueryOrderInfo.status && this.realDuration == xFQueryOrderInfo.realDuration;
    }

    public int hashCode() {
        return (((((this.orderId.hashCode() * 31) + Integer.hashCode(this.failType)) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.realDuration);
    }

    public String toString() {
        return "XFQueryOrderInfo(orderId=" + this.orderId + ", failType=" + this.failType + ", status=" + this.status + ", realDuration=" + this.realDuration + Separators.RPAREN;
    }

    public XFQueryOrderInfo(String orderId, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.failType = i;
        this.status = i2;
        this.realDuration = j;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final int getFailType() {
        return this.failType;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getRealDuration() {
        return this.realDuration;
    }
}
