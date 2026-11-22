package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RouteSearchCity extends SearchCity implements Parcelable {
    public static final Parcelable.Creator<RouteSearchCity> CREATOR = new a();
    List<District> d;

    static class a implements Parcelable.Creator<RouteSearchCity> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RouteSearchCity createFromParcel(Parcel parcel) {
            return new RouteSearchCity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RouteSearchCity[] newArray(int i) {
            return null;
        }
    }

    public RouteSearchCity(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.d = parcel.createTypedArrayList(District.CREATOR);
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<District> getDistricts() {
        return this.d;
    }

    public void setDistricts(List<District> list) {
        this.d = list;
    }

    @Override // com.amap.api.services.route.SearchCity, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.d);
    }

    public RouteSearchCity() {
        this.d = new ArrayList();
    }
}
