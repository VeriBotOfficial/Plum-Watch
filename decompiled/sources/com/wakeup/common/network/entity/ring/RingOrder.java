package com.wakeup.common.network.entity.ring;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RingOrder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/wakeup/common/network/entity/ring/RingOrder;", "", "orderNo", "", "paySign", "payType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getOrderNo", "()Ljava/lang/String;", "getPaySign", "getPayType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RingOrder {
    private final String orderNo;
    private final String paySign;
    private final int payType;

    public static /* synthetic */ RingOrder copy$default(RingOrder ringOrder, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ringOrder.orderNo;
        }
        if ((i2 & 2) != 0) {
            str2 = ringOrder.paySign;
        }
        if ((i2 & 4) != 0) {
            i = ringOrder.payType;
        }
        return ringOrder.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaySign() {
        return this.paySign;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    public final RingOrder copy(String orderNo, String paySign, int payType) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        return new RingOrder(orderNo, paySign, payType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RingOrder)) {
            return false;
        }
        RingOrder ringOrder = (RingOrder) other;
        return Intrinsics.areEqual(this.orderNo, ringOrder.orderNo) && Intrinsics.areEqual(this.paySign, ringOrder.paySign) && this.payType == ringOrder.payType;
    }

    public int hashCode() {
        return (((this.orderNo.hashCode() * 31) + this.paySign.hashCode()) * 31) + Integer.hashCode(this.payType);
    }

    public String toString() {
        return "RingOrder(orderNo=" + this.orderNo + ", paySign=" + this.paySign + ", payType=" + this.payType + Separators.RPAREN;
    }

    public RingOrder(String orderNo, String paySign, int i) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        this.orderNo = orderNo;
        this.paySign = paySign;
        this.payType = i;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getPaySign() {
        return this.paySign;
    }

    public final int getPayType() {
        return this.payType;
    }
}
