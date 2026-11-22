package com.xmly.businesssdk.network.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EcologicalBenefitQualification.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/xmly/businesssdk/network/bean/EcoBenefitSubscribe;", "", "itemId", "", "itemName", "", "itemDesc", "(JLjava/lang/String;Ljava/lang/String;)V", "getItemDesc", "()Ljava/lang/String;", "getItemId", "()J", "getItemName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EcoBenefitSubscribe {

    @SerializedName("item_desc")
    private final String itemDesc;

    @SerializedName(FirebaseAnalytics.Param.ITEM_ID)
    private final long itemId;

    @SerializedName(FirebaseAnalytics.Param.ITEM_NAME)
    private final String itemName;

    public EcoBenefitSubscribe() {
        this(0L, null, null, 7, null);
    }

    public EcoBenefitSubscribe(long j, String str, String str2) {
        this.itemId = j;
        this.itemName = str;
        this.itemDesc = str2;
    }

    public static /* synthetic */ EcoBenefitSubscribe copy$default(EcoBenefitSubscribe ecoBenefitSubscribe, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ecoBenefitSubscribe.itemId;
        }
        if ((i & 2) != 0) {
            str = ecoBenefitSubscribe.itemName;
        }
        if ((i & 4) != 0) {
            str2 = ecoBenefitSubscribe.itemDesc;
        }
        return ecoBenefitSubscribe.copy(j, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemDesc() {
        return this.itemDesc;
    }

    public final EcoBenefitSubscribe copy(long itemId, String itemName, String itemDesc) {
        return new EcoBenefitSubscribe(itemId, itemName, itemDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoBenefitSubscribe)) {
            return false;
        }
        EcoBenefitSubscribe ecoBenefitSubscribe = (EcoBenefitSubscribe) other;
        return this.itemId == ecoBenefitSubscribe.itemId && Intrinsics.areEqual(this.itemName, ecoBenefitSubscribe.itemName) && Intrinsics.areEqual(this.itemDesc, ecoBenefitSubscribe.itemDesc);
    }

    public final String getItemDesc() {
        return this.itemDesc;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.itemId) * 31;
        String str = this.itemName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemDesc;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("EcoBenefitSubscribe(itemId=").append(this.itemId).append(", itemName=").append(this.itemName).append(", itemDesc="), this.itemDesc, ')');
    }

    public /* synthetic */ EcoBenefitSubscribe(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
