package com.wakeup.common.network.entity.xunfei;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XunfeiLfaRsp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/xunfei/XFCreateInfo;", "", "orderId", "", "taskEstimateTime", "", "<init>", "(Ljava/lang/String;J)V", "getOrderId", "()Ljava/lang/String;", "getTaskEstimateTime", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XFCreateInfo {
    private final String orderId;
    private final long taskEstimateTime;

    public static /* synthetic */ XFCreateInfo copy$default(XFCreateInfo xFCreateInfo, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xFCreateInfo.orderId;
        }
        if ((i & 2) != 0) {
            j = xFCreateInfo.taskEstimateTime;
        }
        return xFCreateInfo.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTaskEstimateTime() {
        return this.taskEstimateTime;
    }

    public final XFCreateInfo copy(String orderId, long taskEstimateTime) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new XFCreateInfo(orderId, taskEstimateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XFCreateInfo)) {
            return false;
        }
        XFCreateInfo xFCreateInfo = (XFCreateInfo) other;
        return Intrinsics.areEqual(this.orderId, xFCreateInfo.orderId) && this.taskEstimateTime == xFCreateInfo.taskEstimateTime;
    }

    public int hashCode() {
        return (this.orderId.hashCode() * 31) + Long.hashCode(this.taskEstimateTime);
    }

    public String toString() {
        return "XFCreateInfo(orderId=" + this.orderId + ", taskEstimateTime=" + this.taskEstimateTime + Separators.RPAREN;
    }

    public XFCreateInfo(String orderId, long j) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.orderId = orderId;
        this.taskEstimateTime = j;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final long getTaskEstimateTime() {
        return this.taskEstimateTime;
    }
}
