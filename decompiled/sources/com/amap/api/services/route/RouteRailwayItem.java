package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RouteRailwayItem extends Railway implements Parcelable {
    public static final Parcelable.Creator<RouteRailwayItem> CREATOR = new a();
    private String c;
    private String d;
    private float e;
    private String f;
    private RailwayStationItem g;
    private RailwayStationItem h;
    private List<RailwayStationItem> i;
    private List<Railway> j;
    private List<RailwaySpace> k;

    static class a implements Parcelable.Creator<RouteRailwayItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RouteRailwayItem createFromParcel(Parcel parcel) {
            return new RouteRailwayItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public RouteRailwayItem[] newArray(int i) {
            return new RouteRailwayItem[i];
        }
    }

    public RouteRailwayItem() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Railway> getAlters() {
        return this.j;
    }

    public RailwayStationItem getArrivalstop() {
        return this.h;
    }

    public RailwayStationItem getDeparturestop() {
        return this.g;
    }

    public float getDistance() {
        return this.e;
    }

    public List<RailwaySpace> getSpaces() {
        return this.k;
    }

    public String getTime() {
        return this.c;
    }

    public String getTrip() {
        return this.d;
    }

    public String getType() {
        return this.f;
    }

    public List<RailwayStationItem> getViastops() {
        return this.i;
    }

    public void setAlters(List<Railway> list) {
        this.j = list;
    }

    public void setArrivalstop(RailwayStationItem railwayStationItem) {
        this.h = railwayStationItem;
    }

    public void setDeparturestop(RailwayStationItem railwayStationItem) {
        this.g = railwayStationItem;
    }

    public void setDistance(float f) {
        this.e = f;
    }

    public void setSpaces(List<RailwaySpace> list) {
        this.k = list;
    }

    public void setTime(String str) {
        this.c = str;
    }

    public void setTrip(String str) {
        this.d = str;
    }

    public void setType(String str) {
        this.f = str;
    }

    public void setViastops(List<RailwayStationItem> list) {
        this.i = list;
    }

    @Override // com.amap.api.services.route.Railway, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.k);
    }

    protected RouteRailwayItem(Parcel parcel) {
        super(parcel);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readFloat();
        this.f = parcel.readString();
        this.g = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.h = (RailwayStationItem) parcel.readParcelable(RailwayStationItem.class.getClassLoader());
        this.i = parcel.createTypedArrayList(RailwayStationItem.CREATOR);
        this.j = parcel.createTypedArrayList(Railway.CREATOR);
        this.k = parcel.createTypedArrayList(RailwaySpace.CREATOR);
    }
}
