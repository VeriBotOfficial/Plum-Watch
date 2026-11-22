package com.xmly.businesssdk.network.bean;

import com.autonavi.aps.amapapi.config.Const;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcologicalBenefitQualification.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, d2 = {"Lcom/xmly/businesssdk/network/bean/EcoBenefitData;", "", "thirdDeviceId", "", "benefitType", "", Const.STR_PROCESS_TAG, "Lcom/xmly/businesssdk/network/bean/EcoBenefitActivity;", "subscribe", "Lcom/xmly/businesssdk/network/bean/EcoBenefitSubscribe;", "token", "status", "benefitXmUser", "Lcom/xmly/businesssdk/network/bean/BenefitXmUser;", "(Ljava/lang/String;ILcom/xmly/businesssdk/network/bean/EcoBenefitActivity;Lcom/xmly/businesssdk/network/bean/EcoBenefitSubscribe;Ljava/lang/String;ILcom/xmly/businesssdk/network/bean/BenefitXmUser;)V", "getActivity", "()Lcom/xmly/businesssdk/network/bean/EcoBenefitActivity;", "getBenefitType", "()I", "getBenefitXmUser", "()Lcom/xmly/businesssdk/network/bean/BenefitXmUser;", "getStatus", "getSubscribe", "()Lcom/xmly/businesssdk/network/bean/EcoBenefitSubscribe;", "getThirdDeviceId", "()Ljava/lang/String;", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EcoBenefitData {

    @SerializedName("ecological_benefit_activity")
    private final EcoBenefitActivity activity;

    @SerializedName("benefit_type")
    private final int benefitType;

    @SerializedName("benefit_xm_user")
    private final BenefitXmUser benefitXmUser;

    @SerializedName("ecological_benefit_status")
    private final int status;

    @SerializedName("ecological_benefit_subscribe")
    private final EcoBenefitSubscribe subscribe;

    @SerializedName("third_device_id")
    private final String thirdDeviceId;

    @SerializedName("ecological_benefit_token")
    private final String token;

    public EcoBenefitData() {
        this(null, 0, null, null, null, 0, null, 127, null);
    }

    public EcoBenefitData(String str, int i, EcoBenefitActivity ecoBenefitActivity, EcoBenefitSubscribe ecoBenefitSubscribe, String str2, int i2, BenefitXmUser benefitXmUser) {
        this.thirdDeviceId = str;
        this.benefitType = i;
        this.activity = ecoBenefitActivity;
        this.subscribe = ecoBenefitSubscribe;
        this.token = str2;
        this.status = i2;
        this.benefitXmUser = benefitXmUser;
    }

    public static /* synthetic */ EcoBenefitData copy$default(EcoBenefitData ecoBenefitData, String str, int i, EcoBenefitActivity ecoBenefitActivity, EcoBenefitSubscribe ecoBenefitSubscribe, String str2, int i2, BenefitXmUser benefitXmUser, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = ecoBenefitData.thirdDeviceId;
        }
        if ((i3 & 2) != 0) {
            i = ecoBenefitData.benefitType;
        }
        if ((i3 & 4) != 0) {
            ecoBenefitActivity = ecoBenefitData.activity;
        }
        if ((i3 & 8) != 0) {
            ecoBenefitSubscribe = ecoBenefitData.subscribe;
        }
        if ((i3 & 16) != 0) {
            str2 = ecoBenefitData.token;
        }
        if ((i3 & 32) != 0) {
            i2 = ecoBenefitData.status;
        }
        if ((i3 & 64) != 0) {
            benefitXmUser = ecoBenefitData.benefitXmUser;
        }
        int i4 = i2;
        BenefitXmUser benefitXmUser2 = benefitXmUser;
        String str3 = str2;
        EcoBenefitActivity ecoBenefitActivity2 = ecoBenefitActivity;
        return ecoBenefitData.copy(str, i, ecoBenefitActivity2, ecoBenefitSubscribe, str3, i4, benefitXmUser2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getThirdDeviceId() {
        return this.thirdDeviceId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBenefitType() {
        return this.benefitType;
    }

    /* renamed from: component3, reason: from getter */
    public final EcoBenefitActivity getActivity() {
        return this.activity;
    }

    /* renamed from: component4, reason: from getter */
    public final EcoBenefitSubscribe getSubscribe() {
        return this.subscribe;
    }

    /* renamed from: component5, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component7, reason: from getter */
    public final BenefitXmUser getBenefitXmUser() {
        return this.benefitXmUser;
    }

    public final EcoBenefitData copy(String thirdDeviceId, int benefitType, EcoBenefitActivity activity, EcoBenefitSubscribe subscribe, String token, int status, BenefitXmUser benefitXmUser) {
        return new EcoBenefitData(thirdDeviceId, benefitType, activity, subscribe, token, status, benefitXmUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoBenefitData)) {
            return false;
        }
        EcoBenefitData ecoBenefitData = (EcoBenefitData) other;
        return Intrinsics.areEqual(this.thirdDeviceId, ecoBenefitData.thirdDeviceId) && this.benefitType == ecoBenefitData.benefitType && Intrinsics.areEqual(this.activity, ecoBenefitData.activity) && Intrinsics.areEqual(this.subscribe, ecoBenefitData.subscribe) && Intrinsics.areEqual(this.token, ecoBenefitData.token) && this.status == ecoBenefitData.status && Intrinsics.areEqual(this.benefitXmUser, ecoBenefitData.benefitXmUser);
    }

    public final EcoBenefitActivity getActivity() {
        return this.activity;
    }

    public final int getBenefitType() {
        return this.benefitType;
    }

    public final BenefitXmUser getBenefitXmUser() {
        return this.benefitXmUser;
    }

    public final int getStatus() {
        return this.status;
    }

    public final EcoBenefitSubscribe getSubscribe() {
        return this.subscribe;
    }

    public final String getThirdDeviceId() {
        return this.thirdDeviceId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.thirdDeviceId;
        int a2 = b.a(this.benefitType, (str == null ? 0 : str.hashCode()) * 31, 31);
        EcoBenefitActivity ecoBenefitActivity = this.activity;
        int hashCode = (a2 + (ecoBenefitActivity == null ? 0 : ecoBenefitActivity.hashCode())) * 31;
        EcoBenefitSubscribe ecoBenefitSubscribe = this.subscribe;
        int hashCode2 = (hashCode + (ecoBenefitSubscribe == null ? 0 : ecoBenefitSubscribe.hashCode())) * 31;
        String str2 = this.token;
        int a3 = b.a(this.status, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        BenefitXmUser benefitXmUser = this.benefitXmUser;
        return a3 + (benefitXmUser != null ? benefitXmUser.hashCode() : 0);
    }

    public String toString() {
        return c.a("EcoBenefitData(thirdDeviceId=").append(this.thirdDeviceId).append(", benefitType=").append(this.benefitType).append(", activity=").append(this.activity).append(", subscribe=").append(this.subscribe).append(", token=").append(this.token).append(", status=").append(this.status).append(", benefitXmUser=").append(this.benefitXmUser).append(')').toString();
    }

    public /* synthetic */ EcoBenefitData(String str, int i, EcoBenefitActivity ecoBenefitActivity, EcoBenefitSubscribe ecoBenefitSubscribe, String str2, int i2, BenefitXmUser benefitXmUser, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : ecoBenefitActivity, (i3 & 8) != 0 ? null : ecoBenefitSubscribe, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : benefitXmUser);
    }
}
