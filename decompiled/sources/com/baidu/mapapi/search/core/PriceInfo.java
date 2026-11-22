package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class PriceInfo implements Parcelable {
    public static final Parcelable.Creator<PriceInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f8071a;
    private double b;

    static class a implements Parcelable.Creator<PriceInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PriceInfo createFromParcel(Parcel parcel) {
            return new PriceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PriceInfo[] newArray(int i) {
            return new PriceInfo[i];
        }
    }

    public PriceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getTicketPrice() {
        return this.b;
    }

    public int getTicketType() {
        return this.f8071a;
    }

    public void setTicketPrice(double d) {
        this.b = d;
    }

    public void setTicketType(int i) {
        this.f8071a = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8071a);
        parcel.writeDouble(this.b);
    }

    protected PriceInfo(Parcel parcel) {
        this.f8071a = parcel.readInt();
        this.b = parcel.readDouble();
    }
}
