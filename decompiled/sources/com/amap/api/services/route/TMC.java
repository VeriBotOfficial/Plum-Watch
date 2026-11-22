package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class TMC implements Parcelable {
    public static final Parcelable.Creator<TMC> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f2199a;
    private String b;
    private List<LatLonPoint> c;

    static class a implements Parcelable.Creator<TMC> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TMC createFromParcel(Parcel parcel) {
            return new TMC(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TMC[] newArray(int i) {
            return null;
        }
    }

    public TMC(Parcel parcel) {
        this.c = new ArrayList();
        this.f2199a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f2199a;
    }

    public List<LatLonPoint> getPolyline() {
        return this.c;
    }

    public String getStatus() {
        return this.b;
    }

    public void setDistance(int i) {
        this.f2199a = i;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.c = list;
    }

    public void setStatus(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2199a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }

    public TMC() {
        this.c = new ArrayList();
    }
}
