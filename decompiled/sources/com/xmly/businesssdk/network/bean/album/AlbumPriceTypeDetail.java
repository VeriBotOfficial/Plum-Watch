package com.xmly.businesssdk.network.bean.album;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AlbumPriceTypeDetail implements Serializable, Parcelable {
    public static final Parcelable.Creator<AlbumPriceTypeDetail> CREATOR = new Parcelable.Creator<AlbumPriceTypeDetail>() { // from class: com.xmly.businesssdk.network.bean.album.AlbumPriceTypeDetail.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumPriceTypeDetail createFromParcel(Parcel parcel) {
            return new AlbumPriceTypeDetail(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumPriceTypeDetail[] newArray(int i) {
            return new AlbumPriceTypeDetail[i];
        }
    };
    private static final long serialVersionUID = -564294848137252590L;

    @SerializedName("discounted_price")
    private float discountedPrice;

    @SerializedName("price")
    private float price;

    @SerializedName("price_type")
    private int priceType;

    @SerializedName("price_unit")
    private String priceUnit;

    public AlbumPriceTypeDetail() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDiscountedPrice() {
        return this.discountedPrice;
    }

    public float getPrice() {
        return this.price;
    }

    public int getPriceType() {
        return this.priceType;
    }

    public String getPriceUnit() {
        return this.priceUnit;
    }

    public String getPriceUnitToRMB() {
        if (!TextUtils.isEmpty(this.priceUnit)) {
            this.priceUnit = this.priceUnit.replace("喜点", "元");
        }
        return this.priceUnit;
    }

    public void readFromParcel(Parcel parcel) {
        this.priceType = parcel.readInt();
        this.price = parcel.readFloat();
        this.discountedPrice = parcel.readFloat();
        this.priceUnit = parcel.readString();
    }

    public void setDiscountedPrice(float f) {
        this.discountedPrice = f;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    public void setPriceType(int i) {
        this.priceType = i;
    }

    public void setPriceUnit(String str) {
        this.priceUnit = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priceType);
        parcel.writeFloat(this.price);
        parcel.writeFloat(this.discountedPrice);
        parcel.writeString(this.priceUnit);
    }

    public AlbumPriceTypeDetail(Parcel parcel) {
        this.priceType = parcel.readInt();
        this.price = parcel.readFloat();
        this.discountedPrice = parcel.readFloat();
        this.priceUnit = parcel.readString();
    }
}
