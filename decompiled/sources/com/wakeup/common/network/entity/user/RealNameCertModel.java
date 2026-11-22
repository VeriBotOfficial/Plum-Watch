package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealNameCertModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jc\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00062"}, d2 = {"Lcom/wakeup/common/network/entity/user/RealNameCertModel;", "", "idName", "", "idType", "idNo", "phoneNo", "email", "idCardFrontUrl", "idCardBackUrl", "passportUrl", "verifyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdName", "()Ljava/lang/String;", "setIdName", "(Ljava/lang/String;)V", "getIdType", "setIdType", "getIdNo", "setIdNo", "getPhoneNo", "setPhoneNo", "getEmail", "setEmail", "getIdCardFrontUrl", "setIdCardFrontUrl", "getIdCardBackUrl", "setIdCardBackUrl", "getPassportUrl", "setPassportUrl", "getVerifyCode", "setVerifyCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RealNameCertModel {
    private String email;
    private String idCardBackUrl;
    private String idCardFrontUrl;
    private String idName;
    private String idNo;
    private String idType;
    private String passportUrl;
    private String phoneNo;
    private String verifyCode;

    public RealNameCertModel() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ RealNameCertModel copy$default(RealNameCertModel realNameCertModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = realNameCertModel.idName;
        }
        if ((i & 2) != 0) {
            str2 = realNameCertModel.idType;
        }
        if ((i & 4) != 0) {
            str3 = realNameCertModel.idNo;
        }
        if ((i & 8) != 0) {
            str4 = realNameCertModel.phoneNo;
        }
        if ((i & 16) != 0) {
            str5 = realNameCertModel.email;
        }
        if ((i & 32) != 0) {
            str6 = realNameCertModel.idCardFrontUrl;
        }
        if ((i & 64) != 0) {
            str7 = realNameCertModel.idCardBackUrl;
        }
        if ((i & 128) != 0) {
            str8 = realNameCertModel.passportUrl;
        }
        if ((i & 256) != 0) {
            str9 = realNameCertModel.verifyCode;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return realNameCertModel.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdName() {
        return this.idName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIdType() {
        return this.idType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdNo() {
        return this.idNo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhoneNo() {
        return this.phoneNo;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIdCardFrontUrl() {
        return this.idCardFrontUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIdCardBackUrl() {
        return this.idCardBackUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPassportUrl() {
        return this.passportUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public final RealNameCertModel copy(String idName, String idType, String idNo, String phoneNo, String email, String idCardFrontUrl, String idCardBackUrl, String passportUrl, String verifyCode) {
        Intrinsics.checkNotNullParameter(idName, "idName");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(idNo, "idNo");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(idCardFrontUrl, "idCardFrontUrl");
        Intrinsics.checkNotNullParameter(idCardBackUrl, "idCardBackUrl");
        Intrinsics.checkNotNullParameter(passportUrl, "passportUrl");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        return new RealNameCertModel(idName, idType, idNo, phoneNo, email, idCardFrontUrl, idCardBackUrl, passportUrl, verifyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealNameCertModel)) {
            return false;
        }
        RealNameCertModel realNameCertModel = (RealNameCertModel) other;
        return Intrinsics.areEqual(this.idName, realNameCertModel.idName) && Intrinsics.areEqual(this.idType, realNameCertModel.idType) && Intrinsics.areEqual(this.idNo, realNameCertModel.idNo) && Intrinsics.areEqual(this.phoneNo, realNameCertModel.phoneNo) && Intrinsics.areEqual(this.email, realNameCertModel.email) && Intrinsics.areEqual(this.idCardFrontUrl, realNameCertModel.idCardFrontUrl) && Intrinsics.areEqual(this.idCardBackUrl, realNameCertModel.idCardBackUrl) && Intrinsics.areEqual(this.passportUrl, realNameCertModel.passportUrl) && Intrinsics.areEqual(this.verifyCode, realNameCertModel.verifyCode);
    }

    public int hashCode() {
        return (((((((((((((((this.idName.hashCode() * 31) + this.idType.hashCode()) * 31) + this.idNo.hashCode()) * 31) + this.phoneNo.hashCode()) * 31) + this.email.hashCode()) * 31) + this.idCardFrontUrl.hashCode()) * 31) + this.idCardBackUrl.hashCode()) * 31) + this.passportUrl.hashCode()) * 31) + this.verifyCode.hashCode();
    }

    public String toString() {
        return "RealNameCertModel(idName=" + this.idName + ", idType=" + this.idType + ", idNo=" + this.idNo + ", phoneNo=" + this.phoneNo + ", email=" + this.email + ", idCardFrontUrl=" + this.idCardFrontUrl + ", idCardBackUrl=" + this.idCardBackUrl + ", passportUrl=" + this.passportUrl + ", verifyCode=" + this.verifyCode + Separators.RPAREN;
    }

    public RealNameCertModel(String idName, String idType, String idNo, String phoneNo, String email, String idCardFrontUrl, String idCardBackUrl, String passportUrl, String verifyCode) {
        Intrinsics.checkNotNullParameter(idName, "idName");
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(idNo, "idNo");
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(idCardFrontUrl, "idCardFrontUrl");
        Intrinsics.checkNotNullParameter(idCardBackUrl, "idCardBackUrl");
        Intrinsics.checkNotNullParameter(passportUrl, "passportUrl");
        Intrinsics.checkNotNullParameter(verifyCode, "verifyCode");
        this.idName = idName;
        this.idType = idType;
        this.idNo = idNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.idCardFrontUrl = idCardFrontUrl;
        this.idCardBackUrl = idCardBackUrl;
        this.passportUrl = passportUrl;
        this.verifyCode = verifyCode;
    }

    public /* synthetic */ RealNameCertModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9);
    }

    public final String getIdName() {
        return this.idName;
    }

    public final void setIdName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idName = str;
    }

    public final String getIdType() {
        return this.idType;
    }

    public final void setIdType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idType = str;
    }

    public final String getIdNo() {
        return this.idNo;
    }

    public final void setIdNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idNo = str;
    }

    public final String getPhoneNo() {
        return this.phoneNo;
    }

    public final void setPhoneNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNo = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final String getIdCardFrontUrl() {
        return this.idCardFrontUrl;
    }

    public final void setIdCardFrontUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idCardFrontUrl = str;
    }

    public final String getIdCardBackUrl() {
        return this.idCardBackUrl;
    }

    public final void setIdCardBackUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idCardBackUrl = str;
    }

    public final String getPassportUrl() {
        return this.passportUrl;
    }

    public final void setPassportUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passportUrl = str;
    }

    public final String getVerifyCode() {
        return this.verifyCode;
    }

    public final void setVerifyCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verifyCode = str;
    }
}
