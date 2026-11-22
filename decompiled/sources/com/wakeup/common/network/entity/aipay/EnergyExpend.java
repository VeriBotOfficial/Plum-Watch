package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/EnergyExpend;", "", "couponId", "", "orderNo", "", "price", "functionId", "consumeTime", "", "<init>", "(ILjava/lang/String;IIJ)V", "getCouponId", "()I", "getOrderNo", "()Ljava/lang/String;", "getPrice", "getFunctionId", "getConsumeTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EnergyExpend {
    private final long consumeTime;
    private final int couponId;
    private final int functionId;
    private final String orderNo;
    private final int price;

    public static /* synthetic */ EnergyExpend copy$default(EnergyExpend energyExpend, int i, String str, int i2, int i3, long j, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = energyExpend.couponId;
        }
        if ((i4 & 2) != 0) {
            str = energyExpend.orderNo;
        }
        if ((i4 & 4) != 0) {
            i2 = energyExpend.price;
        }
        if ((i4 & 8) != 0) {
            i3 = energyExpend.functionId;
        }
        if ((i4 & 16) != 0) {
            j = energyExpend.consumeTime;
        }
        long j2 = j;
        return energyExpend.copy(i, str, i2, i3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCouponId() {
        return this.couponId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFunctionId() {
        return this.functionId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getConsumeTime() {
        return this.consumeTime;
    }

    public final EnergyExpend copy(int couponId, String orderNo, int price, int functionId, long consumeTime) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        return new EnergyExpend(couponId, orderNo, price, functionId, consumeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergyExpend)) {
            return false;
        }
        EnergyExpend energyExpend = (EnergyExpend) other;
        return this.couponId == energyExpend.couponId && Intrinsics.areEqual(this.orderNo, energyExpend.orderNo) && this.price == energyExpend.price && this.functionId == energyExpend.functionId && this.consumeTime == energyExpend.consumeTime;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.couponId) * 31) + this.orderNo.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.functionId)) * 31) + Long.hashCode(this.consumeTime);
    }

    public String toString() {
        return "EnergyExpend(couponId=" + this.couponId + ", orderNo=" + this.orderNo + ", price=" + this.price + ", functionId=" + this.functionId + ", consumeTime=" + this.consumeTime + Separators.RPAREN;
    }

    public EnergyExpend(int i, String orderNo, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        this.couponId = i;
        this.orderNo = orderNo;
        this.price = i2;
        this.functionId = i3;
        this.consumeTime = j;
    }

    public final int getCouponId() {
        return this.couponId;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getFunctionId() {
        return this.functionId;
    }

    public final long getConsumeTime() {
        return this.consumeTime;
    }
}
