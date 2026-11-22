package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DriveStepV2 implements Parcelable {
    public static final Parcelable.Creator<DriveStepV2> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2165a;
    private String b;
    private String c;
    private List<LatLonPoint> d;
    private List<RouteSearchCity> e;
    private List<TMC> f;
    private int g;
    private Cost h;
    private Navi i;

    static class a implements Parcelable.Creator<DriveStepV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DriveStepV2 createFromParcel(Parcel parcel) {
            return new DriveStepV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DriveStepV2[] newArray(int i) {
            return null;
        }
    }

    public DriveStepV2(Parcel parcel) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = -1;
        this.f2165a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
        this.e = parcel.createTypedArrayList(RouteSearchCity.CREATOR);
        this.f = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Cost getCostDetail() {
        return this.h;
    }

    public String getInstruction() {
        return this.f2165a;
    }

    public Navi getNavi() {
        return this.i;
    }

    public String getOrientation() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.d;
    }

    public String getRoad() {
        return this.c;
    }

    public List<RouteSearchCity> getRouteSearchCityList() {
        return this.e;
    }

    public int getStepDistance() {
        return this.g;
    }

    public List<TMC> getTMCs() {
        return this.f;
    }

    public void setCostDetail(Cost cost) {
        this.h = cost;
    }

    public void setInstruction(String str) {
        this.f2165a = str;
    }

    public void setNavi(Navi navi) {
        this.i = navi;
    }

    public void setOrientation(String str) {
        this.b = str;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.d = list;
    }

    public void setRoad(String str) {
        this.c = str;
    }

    public void setRouteSearchCityList(List<RouteSearchCity> list) {
        this.e = list;
    }

    public void setStepDistance(int i) {
        this.g = i;
    }

    public void setTMCs(List<TMC> list) {
        this.f = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2165a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeTypedList(this.f);
    }

    public DriveStepV2() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = -1;
    }
}
