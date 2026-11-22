package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import com.umeng.analytics.AnalyticsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00064"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/CardEnergy;", "", "couponId", "", "orderNo", "", "orderName", "delStatus", "price", "currentBalance", "functionIds", AnalyticsConfig.RTD_START_TIME, "expireTime", "orderTime", "", "chargeNumber", "chargeType", "<init>", "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIJII)V", "getCouponId", "()I", "getOrderNo", "()Ljava/lang/String;", "getOrderName", "getDelStatus", "getPrice", "getCurrentBalance", "getFunctionIds", "getStartTime", "getExpireTime", "getOrderTime", "()J", "getChargeNumber", "getChargeType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardEnergy {
    private final int chargeNumber;
    private final int chargeType;
    private final int couponId;
    private final int currentBalance;
    private final int delStatus;
    private final int expireTime;
    private final String functionIds;
    private final String orderName;
    private final String orderNo;
    private final long orderTime;
    private final int price;
    private final int startTime;

    public static /* synthetic */ CardEnergy copy$default(CardEnergy cardEnergy, int i, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, long j, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = cardEnergy.couponId;
        }
        return cardEnergy.copy(i, (i9 & 2) != 0 ? cardEnergy.orderNo : str, (i9 & 4) != 0 ? cardEnergy.orderName : str2, (i9 & 8) != 0 ? cardEnergy.delStatus : i2, (i9 & 16) != 0 ? cardEnergy.price : i3, (i9 & 32) != 0 ? cardEnergy.currentBalance : i4, (i9 & 64) != 0 ? cardEnergy.functionIds : str3, (i9 & 128) != 0 ? cardEnergy.startTime : i5, (i9 & 256) != 0 ? cardEnergy.expireTime : i6, (i9 & 512) != 0 ? cardEnergy.orderTime : j, (i9 & 1024) != 0 ? cardEnergy.chargeNumber : i7, (i9 & 2048) != 0 ? cardEnergy.chargeType : i8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCouponId() {
        return this.couponId;
    }

    /* renamed from: component10, reason: from getter */
    public final long getOrderTime() {
        return this.orderTime;
    }

    /* renamed from: component11, reason: from getter */
    public final int getChargeNumber() {
        return this.chargeNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final int getChargeType() {
        return this.chargeType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderName() {
        return this.orderName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDelStatus() {
        return this.delStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCurrentBalance() {
        return this.currentBalance;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFunctionIds() {
        return this.functionIds;
    }

    /* renamed from: component8, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* renamed from: component9, reason: from getter */
    public final int getExpireTime() {
        return this.expireTime;
    }

    public final CardEnergy copy(int couponId, String orderNo, String orderName, int delStatus, int price, int currentBalance, String functionIds, int startTime, int expireTime, long orderTime, int chargeNumber, int chargeType) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderName, "orderName");
        Intrinsics.checkNotNullParameter(functionIds, "functionIds");
        return new CardEnergy(couponId, orderNo, orderName, delStatus, price, currentBalance, functionIds, startTime, expireTime, orderTime, chargeNumber, chargeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardEnergy)) {
            return false;
        }
        CardEnergy cardEnergy = (CardEnergy) other;
        return this.couponId == cardEnergy.couponId && Intrinsics.areEqual(this.orderNo, cardEnergy.orderNo) && Intrinsics.areEqual(this.orderName, cardEnergy.orderName) && this.delStatus == cardEnergy.delStatus && this.price == cardEnergy.price && this.currentBalance == cardEnergy.currentBalance && Intrinsics.areEqual(this.functionIds, cardEnergy.functionIds) && this.startTime == cardEnergy.startTime && this.expireTime == cardEnergy.expireTime && this.orderTime == cardEnergy.orderTime && this.chargeNumber == cardEnergy.chargeNumber && this.chargeType == cardEnergy.chargeType;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.couponId) * 31) + this.orderNo.hashCode()) * 31) + this.orderName.hashCode()) * 31) + Integer.hashCode(this.delStatus)) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.currentBalance)) * 31) + this.functionIds.hashCode()) * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.expireTime)) * 31) + Long.hashCode(this.orderTime)) * 31) + Integer.hashCode(this.chargeNumber)) * 31) + Integer.hashCode(this.chargeType);
    }

    public String toString() {
        return "CardEnergy(couponId=" + this.couponId + ", orderNo=" + this.orderNo + ", orderName=" + this.orderName + ", delStatus=" + this.delStatus + ", price=" + this.price + ", currentBalance=" + this.currentBalance + ", functionIds=" + this.functionIds + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ", orderTime=" + this.orderTime + ", chargeNumber=" + this.chargeNumber + ", chargeType=" + this.chargeType + Separators.RPAREN;
    }

    public CardEnergy(int i, String orderNo, String orderName, int i2, int i3, int i4, String functionIds, int i5, int i6, long j, int i7, int i8) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(orderName, "orderName");
        Intrinsics.checkNotNullParameter(functionIds, "functionIds");
        this.couponId = i;
        this.orderNo = orderNo;
        this.orderName = orderName;
        this.delStatus = i2;
        this.price = i3;
        this.currentBalance = i4;
        this.functionIds = functionIds;
        this.startTime = i5;
        this.expireTime = i6;
        this.orderTime = j;
        this.chargeNumber = i7;
        this.chargeType = i8;
    }

    public final int getCouponId() {
        return this.couponId;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getOrderName() {
        return this.orderName;
    }

    public final int getDelStatus() {
        return this.delStatus;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getCurrentBalance() {
        return this.currentBalance;
    }

    public final String getFunctionIds() {
        return this.functionIds;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getExpireTime() {
        return this.expireTime;
    }

    public final long getOrderTime() {
        return this.orderTime;
    }

    public final int getChargeNumber() {
        return this.chargeNumber;
    }

    public final int getChargeType() {
        return this.chargeType;
    }
}
