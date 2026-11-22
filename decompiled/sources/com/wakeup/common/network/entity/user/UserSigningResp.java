package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSigningResp.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/user/UserSigningResp;", "", "payType", "", "thirdPartyCallPayParam", "", "orderNo", "agreeNo", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPayType", "()I", "getThirdPartyCallPayParam", "()Ljava/lang/String;", "getOrderNo", "getAgreeNo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserSigningResp {
    private final String agreeNo;
    private final String orderNo;
    private final int payType;
    private final String thirdPartyCallPayParam;

    public static /* synthetic */ UserSigningResp copy$default(UserSigningResp userSigningResp, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userSigningResp.payType;
        }
        if ((i2 & 2) != 0) {
            str = userSigningResp.thirdPartyCallPayParam;
        }
        if ((i2 & 4) != 0) {
            str2 = userSigningResp.orderNo;
        }
        if ((i2 & 8) != 0) {
            str3 = userSigningResp.agreeNo;
        }
        return userSigningResp.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getThirdPartyCallPayParam() {
        return this.thirdPartyCallPayParam;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final UserSigningResp copy(int payType, String thirdPartyCallPayParam, String orderNo, String agreeNo) {
        Intrinsics.checkNotNullParameter(thirdPartyCallPayParam, "thirdPartyCallPayParam");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        return new UserSigningResp(payType, thirdPartyCallPayParam, orderNo, agreeNo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSigningResp)) {
            return false;
        }
        UserSigningResp userSigningResp = (UserSigningResp) other;
        return this.payType == userSigningResp.payType && Intrinsics.areEqual(this.thirdPartyCallPayParam, userSigningResp.thirdPartyCallPayParam) && Intrinsics.areEqual(this.orderNo, userSigningResp.orderNo) && Intrinsics.areEqual(this.agreeNo, userSigningResp.agreeNo);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.payType) * 31) + this.thirdPartyCallPayParam.hashCode()) * 31) + this.orderNo.hashCode()) * 31) + this.agreeNo.hashCode();
    }

    public String toString() {
        return "UserSigningResp(payType=" + this.payType + ", thirdPartyCallPayParam=" + this.thirdPartyCallPayParam + ", orderNo=" + this.orderNo + ", agreeNo=" + this.agreeNo + Separators.RPAREN;
    }

    public UserSigningResp(int i, String thirdPartyCallPayParam, String orderNo, String agreeNo) {
        Intrinsics.checkNotNullParameter(thirdPartyCallPayParam, "thirdPartyCallPayParam");
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(agreeNo, "agreeNo");
        this.payType = i;
        this.thirdPartyCallPayParam = thirdPartyCallPayParam;
        this.orderNo = orderNo;
        this.agreeNo = agreeNo;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final String getThirdPartyCallPayParam() {
        return this.thirdPartyCallPayParam;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }
}
