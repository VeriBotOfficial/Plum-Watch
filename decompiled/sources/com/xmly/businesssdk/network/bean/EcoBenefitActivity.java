package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcologicalBenefitQualification.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/network/bean/EcoBenefitActivity;", "", "activityCode", "", "activityName", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityCode", "()Ljava/lang/String;", "getActivityName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EcoBenefitActivity {

    @SerializedName("activity_code")
    private final String activityCode;

    @SerializedName("activity_name")
    private final String activityName;

    /* JADX WARN: Multi-variable type inference failed */
    public EcoBenefitActivity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public EcoBenefitActivity(String str, String str2) {
        this.activityCode = str;
        this.activityName = str2;
    }

    public static /* synthetic */ EcoBenefitActivity copy$default(EcoBenefitActivity ecoBenefitActivity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecoBenefitActivity.activityCode;
        }
        if ((i & 2) != 0) {
            str2 = ecoBenefitActivity.activityName;
        }
        return ecoBenefitActivity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActivityCode() {
        return this.activityCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    public final EcoBenefitActivity copy(String activityCode, String activityName) {
        return new EcoBenefitActivity(activityCode, activityName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoBenefitActivity)) {
            return false;
        }
        EcoBenefitActivity ecoBenefitActivity = (EcoBenefitActivity) other;
        return Intrinsics.areEqual(this.activityCode, ecoBenefitActivity.activityCode) && Intrinsics.areEqual(this.activityName, ecoBenefitActivity.activityName);
    }

    public final String getActivityCode() {
        return this.activityCode;
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public int hashCode() {
        String str = this.activityCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.activityName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("EcoBenefitActivity(activityCode=").append(this.activityCode).append(", activityName="), this.activityName, ')');
    }

    public /* synthetic */ EcoBenefitActivity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
