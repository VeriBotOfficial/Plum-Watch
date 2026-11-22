package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class Doorway implements Parcelable {
    public static final Parcelable.Creator<Doorway> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2161a;
    private LatLonPoint b;

    static class a implements Parcelable.Creator<Doorway> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Doorway createFromParcel(Parcel parcel) {
            return new Doorway(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Doorway[] newArray(int i) {
            return null;
        }
    }

    public Doorway(Parcel parcel) {
        this.f2161a = parcel.readString();
        this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.b;
    }

    public String getName() {
        return this.f2161a;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.b = latLonPoint;
    }

    public void setName(String str) {
        this.f2161a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2161a);
        parcel.writeParcelable(this.b, i);
    }

    public Doorway() {
    }
}
