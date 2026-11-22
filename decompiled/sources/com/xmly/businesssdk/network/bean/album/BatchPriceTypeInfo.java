package com.xmly.businesssdk.network.bean.album;

import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchAlbumInfo.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/xmly/businesssdk/network/bean/album/BatchPriceTypeInfo;", "", "priceType", "", "price", "", "discountedPrice", "priceUnit", "isPromote", "", "isPromoteCompat", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getDiscountedPrice", "()Ljava/lang/String;", "()Z", "getPrice", "getPriceType", "()I", "getPriceUnit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BatchPriceTypeInfo {

    @SerializedName("discounted_price")
    private final String discountedPrice;

    @SerializedName("is_promote")
    private final boolean isPromote;

    @SerializedName("isPromote")
    private final boolean isPromoteCompat;

    @SerializedName("price")
    private final String price;

    @SerializedName("price_type")
    private final int priceType;

    @SerializedName("price_unit")
    private final String priceUnit;

    public BatchPriceTypeInfo() {
        this(0, null, null, null, false, false, 63, null);
    }

    public BatchPriceTypeInfo(int i, String price, String discountedPrice, String priceUnit, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountedPrice, "discountedPrice");
        Intrinsics.checkNotNullParameter(priceUnit, "priceUnit");
        this.priceType = i;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.priceUnit = priceUnit;
        this.isPromote = z;
        this.isPromoteCompat = z2;
    }

    public static /* synthetic */ BatchPriceTypeInfo copy$default(BatchPriceTypeInfo batchPriceTypeInfo, int i, String str, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = batchPriceTypeInfo.priceType;
        }
        if ((i2 & 2) != 0) {
            str = batchPriceTypeInfo.price;
        }
        if ((i2 & 4) != 0) {
            str2 = batchPriceTypeInfo.discountedPrice;
        }
        if ((i2 & 8) != 0) {
            str3 = batchPriceTypeInfo.priceUnit;
        }
        if ((i2 & 16) != 0) {
            z = batchPriceTypeInfo.isPromote;
        }
        if ((i2 & 32) != 0) {
            z2 = batchPriceTypeInfo.isPromoteCompat;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return batchPriceTypeInfo.copy(i, str, str2, str3, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPriceType() {
        return this.priceType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPromote() {
        return this.isPromote;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPromoteCompat() {
        return this.isPromoteCompat;
    }

    public final BatchPriceTypeInfo copy(int priceType, String price, String discountedPrice, String priceUnit, boolean isPromote, boolean isPromoteCompat) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(discountedPrice, "discountedPrice");
        Intrinsics.checkNotNullParameter(priceUnit, "priceUnit");
        return new BatchPriceTypeInfo(priceType, price, discountedPrice, priceUnit, isPromote, isPromoteCompat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BatchPriceTypeInfo)) {
            return false;
        }
        BatchPriceTypeInfo batchPriceTypeInfo = (BatchPriceTypeInfo) other;
        return this.priceType == batchPriceTypeInfo.priceType && Intrinsics.areEqual(this.price, batchPriceTypeInfo.price) && Intrinsics.areEqual(this.discountedPrice, batchPriceTypeInfo.discountedPrice) && Intrinsics.areEqual(this.priceUnit, batchPriceTypeInfo.priceUnit) && this.isPromote == batchPriceTypeInfo.isPromote && this.isPromoteCompat == batchPriceTypeInfo.isPromoteCompat;
    }

    public final String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getPriceType() {
        return this.priceType;
    }

    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = a.a(this.priceUnit, a.a(this.discountedPrice, a.a(this.price, Integer.hashCode(this.priceType) * 31, 31), 31), 31);
        boolean z = this.isPromote;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a2 + i) * 31;
        boolean z2 = this.isPromoteCompat;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isPromote() {
        return this.isPromote;
    }

    public final boolean isPromoteCompat() {
        return this.isPromoteCompat;
    }

    public String toString() {
        return c.a("BatchPriceTypeInfo(priceType=").append(this.priceType).append(", price=").append(this.price).append(", discountedPrice=").append(this.discountedPrice).append(", priceUnit=").append(this.priceUnit).append(", isPromote=").append(this.isPromote).append(", isPromoteCompat=").append(this.isPromoteCompat).append(')').toString();
    }

    public /* synthetic */ BatchPriceTypeInfo(int i, String str, String str2, String str3, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "0" : str, (i2 & 4) != 0 ? "0" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }
}
