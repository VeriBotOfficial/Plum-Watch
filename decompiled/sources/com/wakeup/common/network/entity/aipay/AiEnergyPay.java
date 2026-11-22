package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyPay;", "", "payType", "", "orderNo", "", "paySign", "body", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayType", "()I", "getOrderNo", "()Ljava/lang/String;", "getPaySign", "getBody", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyPay {
    private final String body;
    private final String orderNo;
    private final String paySign;
    private final int payType;

    public static /* synthetic */ AiEnergyPay copy$default(AiEnergyPay aiEnergyPay, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aiEnergyPay.payType;
        }
        if ((i2 & 2) != 0) {
            str = aiEnergyPay.orderNo;
        }
        if ((i2 & 4) != 0) {
            str2 = aiEnergyPay.paySign;
        }
        if ((i2 & 8) != 0) {
            str3 = aiEnergyPay.body;
        }
        return aiEnergyPay.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPaySign() {
        return this.paySign;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final AiEnergyPay copy(int payType, String orderNo, String paySign, String body) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        return new AiEnergyPay(payType, orderNo, paySign, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEnergyPay)) {
            return false;
        }
        AiEnergyPay aiEnergyPay = (AiEnergyPay) other;
        return this.payType == aiEnergyPay.payType && Intrinsics.areEqual(this.orderNo, aiEnergyPay.orderNo) && Intrinsics.areEqual(this.paySign, aiEnergyPay.paySign) && Intrinsics.areEqual(this.body, aiEnergyPay.body);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.payType) * 31) + this.orderNo.hashCode()) * 31) + this.paySign.hashCode()) * 31;
        String str = this.body;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AiEnergyPay(payType=" + this.payType + ", orderNo=" + this.orderNo + ", paySign=" + this.paySign + ", body=" + this.body + Separators.RPAREN;
    }

    public AiEnergyPay(int i, String orderNo, String paySign, String str) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        this.payType = i;
        this.orderNo = orderNo;
        this.paySign = paySign;
        this.body = str;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getPaySign() {
        return this.paySign;
    }

    public final String getBody() {
        return this.body;
    }
}
