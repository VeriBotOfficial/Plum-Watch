package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyOrder;", "", "id", "", "orderNo", "", "orderStatus", "orderPrice", "price", "orderCurrency", "orderTime", "", "<init>", "(ILjava/lang/String;IIIIJ)V", "getId", "()I", "getOrderNo", "()Ljava/lang/String;", "getOrderStatus", "getOrderPrice", "getPrice", "getOrderCurrency", "getOrderTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyOrder {
    private final int id;
    private final int orderCurrency;
    private final String orderNo;
    private final int orderPrice;
    private final int orderStatus;
    private final long orderTime;
    private final int price;

    public static /* synthetic */ AiEnergyOrder copy$default(AiEnergyOrder aiEnergyOrder, int i, String str, int i2, int i3, int i4, int i5, long j, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = aiEnergyOrder.id;
        }
        if ((i6 & 2) != 0) {
            str = aiEnergyOrder.orderNo;
        }
        if ((i6 & 4) != 0) {
            i2 = aiEnergyOrder.orderStatus;
        }
        if ((i6 & 8) != 0) {
            i3 = aiEnergyOrder.orderPrice;
        }
        if ((i6 & 16) != 0) {
            i4 = aiEnergyOrder.price;
        }
        if ((i6 & 32) != 0) {
            i5 = aiEnergyOrder.orderCurrency;
        }
        if ((i6 & 64) != 0) {
            j = aiEnergyOrder.orderTime;
        }
        long j2 = j;
        int i7 = i4;
        int i8 = i5;
        return aiEnergyOrder.copy(i, str, i2, i3, i7, i8, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrderPrice() {
        return this.orderPrice;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOrderCurrency() {
        return this.orderCurrency;
    }

    /* renamed from: component7, reason: from getter */
    public final long getOrderTime() {
        return this.orderTime;
    }

    public final AiEnergyOrder copy(int id2, String orderNo, int orderStatus, int orderPrice, int price, int orderCurrency, long orderTime) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        return new AiEnergyOrder(id2, orderNo, orderStatus, orderPrice, price, orderCurrency, orderTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEnergyOrder)) {
            return false;
        }
        AiEnergyOrder aiEnergyOrder = (AiEnergyOrder) other;
        return this.id == aiEnergyOrder.id && Intrinsics.areEqual(this.orderNo, aiEnergyOrder.orderNo) && this.orderStatus == aiEnergyOrder.orderStatus && this.orderPrice == aiEnergyOrder.orderPrice && this.price == aiEnergyOrder.price && this.orderCurrency == aiEnergyOrder.orderCurrency && this.orderTime == aiEnergyOrder.orderTime;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.id) * 31) + this.orderNo.hashCode()) * 31) + Integer.hashCode(this.orderStatus)) * 31) + Integer.hashCode(this.orderPrice)) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.orderCurrency)) * 31) + Long.hashCode(this.orderTime);
    }

    public String toString() {
        return "AiEnergyOrder(id=" + this.id + ", orderNo=" + this.orderNo + ", orderStatus=" + this.orderStatus + ", orderPrice=" + this.orderPrice + ", price=" + this.price + ", orderCurrency=" + this.orderCurrency + ", orderTime=" + this.orderTime + Separators.RPAREN;
    }

    public AiEnergyOrder(int i, String orderNo, int i2, int i3, int i4, int i5, long j) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        this.id = i;
        this.orderNo = orderNo;
        this.orderStatus = i2;
        this.orderPrice = i3;
        this.price = i4;
        this.orderCurrency = i5;
        this.orderTime = j;
    }

    public final int getId() {
        return this.id;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    public final int getOrderPrice() {
        return this.orderPrice;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getOrderCurrency() {
        return this.orderCurrency;
    }

    public final long getOrderTime() {
        return this.orderTime;
    }
}
