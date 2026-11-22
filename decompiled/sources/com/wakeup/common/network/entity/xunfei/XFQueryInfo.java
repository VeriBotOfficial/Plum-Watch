package com.wakeup.common.network.entity.xunfei;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XunfeiLfaRsp.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/xunfei/XFQueryInfo;", "", "orderInfo", "Lcom/wakeup/common/network/entity/xunfei/XFQueryOrderInfo;", "orderResult", "", "<init>", "(Lcom/wakeup/common/network/entity/xunfei/XFQueryOrderInfo;Ljava/lang/String;)V", "getOrderInfo", "()Lcom/wakeup/common/network/entity/xunfei/XFQueryOrderInfo;", "getOrderResult", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class XFQueryInfo {
    private final XFQueryOrderInfo orderInfo;
    private final String orderResult;

    public static /* synthetic */ XFQueryInfo copy$default(XFQueryInfo xFQueryInfo, XFQueryOrderInfo xFQueryOrderInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            xFQueryOrderInfo = xFQueryInfo.orderInfo;
        }
        if ((i & 2) != 0) {
            str = xFQueryInfo.orderResult;
        }
        return xFQueryInfo.copy(xFQueryOrderInfo, str);
    }

    /* renamed from: component1, reason: from getter */
    public final XFQueryOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderResult() {
        return this.orderResult;
    }

    public final XFQueryInfo copy(XFQueryOrderInfo orderInfo, String orderResult) {
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(orderResult, "orderResult");
        return new XFQueryInfo(orderInfo, orderResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XFQueryInfo)) {
            return false;
        }
        XFQueryInfo xFQueryInfo = (XFQueryInfo) other;
        return Intrinsics.areEqual(this.orderInfo, xFQueryInfo.orderInfo) && Intrinsics.areEqual(this.orderResult, xFQueryInfo.orderResult);
    }

    public int hashCode() {
        return (this.orderInfo.hashCode() * 31) + this.orderResult.hashCode();
    }

    public String toString() {
        return "XFQueryInfo(orderInfo=" + this.orderInfo + ", orderResult=" + this.orderResult + Separators.RPAREN;
    }

    public XFQueryInfo(XFQueryOrderInfo orderInfo, String orderResult) {
        Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
        Intrinsics.checkNotNullParameter(orderResult, "orderResult");
        this.orderInfo = orderInfo;
        this.orderResult = orderResult;
    }

    public final XFQueryOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public final String getOrderResult() {
        return this.orderResult;
    }
}
