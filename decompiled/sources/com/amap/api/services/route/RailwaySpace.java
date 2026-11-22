package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class RailwaySpace implements Parcelable {
    public static final Parcelable.Creator<RailwaySpace> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2170a;
    private float b;

    static class a implements Parcelable.Creator<RailwaySpace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RailwaySpace createFromParcel(Parcel parcel) {
            return new RailwaySpace(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RailwaySpace[] newArray(int i) {
            return new RailwaySpace[i];
        }
    }

    public RailwaySpace(String str, float f) {
        this.f2170a = str;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCode() {
        return this.f2170a;
    }

    public float getCost() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2170a);
        parcel.writeFloat(this.b);
    }

    protected RailwaySpace(Parcel parcel) {
        this.f2170a = parcel.readString();
        this.b = parcel.readFloat();
    }
}
