package com.xmly.businesssdk.network.bean.album;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PayInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<PayInfo> CREATOR = new Parcelable.Creator<PayInfo>() { // from class: com.xmly.businesssdk.network.bean.album.PayInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PayInfo createFromParcel(Parcel parcel) {
            return new PayInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PayInfo[] newArray(int i) {
            return new PayInfo[i];
        }
    };
    private static final long serialVersionUID = 1;

    @SerializedName("discounted_price")
    private String discountedPrice;

    @SerializedName("price")
    private String price;

    public PayInfo() {
    }

    public PayInfo(Parcel parcel) {
        this.price = parcel.readString();
        this.discountedPrice = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDiscountedPrice() {
        return this.discountedPrice;
    }

    public String getPrice() {
        return this.price;
    }

    public void setDiscountedPrice(String str) {
        this.discountedPrice = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.price);
        parcel.writeString(this.discountedPrice);
    }
}
