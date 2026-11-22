package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AIVipPayLink.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001J\u0013\u0010)\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006-"}, d2 = {"Lcom/wakeup/common/network/entity/user/AIVipPayLink;", "", "orderStatus", "", "callStatus", "", "callErrorReason", "", "payType", "orderNo", "agreeNo", "paySign", "token", "body", "wxPayParams", "<init>", "(IZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderStatus", "()I", "getCallStatus", "()Z", "getCallErrorReason", "()Ljava/lang/String;", "getPayType", "getOrderNo", "getAgreeNo", "getPaySign", "getToken", "getBody", "getWxPayParams", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AIVipPayLink {
    private final String agreeNo;
    private final String body;
    private final String callErrorReason;
    private final boolean callStatus;
    private final String orderNo;
    private final int orderStatus;
    private final String paySign;
    private final int payType;
    private final String token;
    private final String wxPayParams;

    public static /* synthetic */ AIVipPayLink copy$default(AIVipPayLink aIVipPayLink, int i, boolean z, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aIVipPayLink.orderStatus;
        }
        if ((i3 & 2) != 0) {
            z = aIVipPayLink.callStatus;
        }
        if ((i3 & 4) != 0) {
            str = aIVipPayLink.callErrorReason;
        }
        if ((i3 & 8) != 0) {
            i2 = aIVipPayLink.payType;
        }
        if ((i3 & 16) != 0) {
            str2 = aIVipPayLink.orderNo;
        }
        if ((i3 & 32) != 0) {
            str3 = aIVipPayLink.agreeNo;
        }
        if ((i3 & 64) != 0) {
            str4 = aIVipPayLink.paySign;
        }
        if ((i3 & 128) != 0) {
            str5 = aIVipPayLink.token;
        }
        if ((i3 & 256) != 0) {
            str6 = aIVipPayLink.body;
        }
        if ((i3 & 512) != 0) {
            str7 = aIVipPayLink.wxPayParams;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str2;
        String str13 = str3;
        return aIVipPayLink.copy(i, z, str, i2, str12, str13, str10, str11, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* renamed from: component10, reason: from getter */
    public final String getWxPayParams() {
        return this.wxPayParams;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCallStatus() {
        return this.callStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCallErrorReason() {
        return this.callErrorReason;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgreeNo() {
        return this.agreeNo;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPaySign() {
        return this.paySign;
    }

    /* renamed from: component8, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final AIVipPayLink copy(int orderStatus, boolean callStatus, String callErrorReason, int payType, String orderNo, String agreeNo, String paySign, String token, String body, String wxPayParams) {
        Intrinsics.checkNotNullParameter(callErrorReason, "callErrorReason");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(wxPayParams, "wxPayParams");
        return new AIVipPayLink(orderStatus, callStatus, callErrorReason, payType, orderNo, agreeNo, paySign, token, body, wxPayParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIVipPayLink)) {
            return false;
        }
        AIVipPayLink aIVipPayLink = (AIVipPayLink) other;
        return this.orderStatus == aIVipPayLink.orderStatus && this.callStatus == aIVipPayLink.callStatus && Intrinsics.areEqual(this.callErrorReason, aIVipPayLink.callErrorReason) && this.payType == aIVipPayLink.payType && Intrinsics.areEqual(this.orderNo, aIVipPayLink.orderNo) && Intrinsics.areEqual(this.agreeNo, aIVipPayLink.agreeNo) && Intrinsics.areEqual(this.paySign, aIVipPayLink.paySign) && Intrinsics.areEqual(this.token, aIVipPayLink.token) && Intrinsics.areEqual(this.body, aIVipPayLink.body) && Intrinsics.areEqual(this.wxPayParams, aIVipPayLink.wxPayParams);
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.orderStatus) * 31) + Boolean.hashCode(this.callStatus)) * 31) + this.callErrorReason.hashCode()) * 31) + Integer.hashCode(this.payType)) * 31) + this.orderNo.hashCode()) * 31) + this.agreeNo.hashCode()) * 31) + this.paySign.hashCode()) * 31) + this.token.hashCode()) * 31) + this.body.hashCode()) * 31) + this.wxPayParams.hashCode();
    }

    public String toString() {
        return "AIVipPayLink(orderStatus=" + this.orderStatus + ", callStatus=" + this.callStatus + ", callErrorReason=" + this.callErrorReason + ", payType=" + this.payType + ", orderNo=" + this.orderNo + ", agreeNo=" + this.agreeNo + ", paySign=" + this.paySign + ", token=" + this.token + ", body=" + this.body + ", wxPayParams=" + this.wxPayParams + Separators.RPAREN;
    }

    public AIVipPayLink(int i, boolean z, String callErrorReason, int i2, String orderNo, String agreeNo, String paySign, String token, String body, String wxPayParams) {
        Intrinsics.checkNotNullParameter(callErrorReason, "callErrorReason");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        Intrinsics.checkNotNullParameter(paySign, "paySign");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(wxPayParams, "wxPayParams");
        this.orderStatus = i;
        this.callStatus = z;
        this.callErrorReason = callErrorReason;
        this.payType = i2;
        this.orderNo = orderNo;
        this.agreeNo = agreeNo;
        this.paySign = paySign;
        this.token = token;
        this.body = body;
        this.wxPayParams = wxPayParams;
    }

    public final int getOrderStatus() {
        return this.orderStatus;
    }

    public final boolean getCallStatus() {
        return this.callStatus;
    }

    public final String getCallErrorReason() {
        return this.callErrorReason;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final String getPaySign() {
        return this.paySign;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getWxPayParams() {
        return this.wxPayParams;
    }
}
