package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class RouteStep implements Parcelable {
    public static final Parcelable.Creator<RouteStep> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    int f8077a;
    int b;
    String c;
    int d;
    protected List<LatLng> mWayPoints;

    static class a implements Parcelable.Creator<RouteStep> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteStep createFromParcel(Parcel parcel) {
            return new RouteStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteStep[] newArray(int i) {
            return new RouteStep[i];
        }
    }

    protected RouteStep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f8077a;
    }

    public int getDuration() {
        return this.b;
    }

    public String getName() {
        return this.c;
    }

    public int getTransType() {
        return this.d;
    }

    public List<LatLng> getWayPoints() {
        return this.mWayPoints;
    }

    public void setDistance(int i) {
        this.f8077a = i;
    }

    public void setDuration(int i) {
        this.b = i;
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setTransType(int i) {
        this.d = i;
    }

    public void setWayPoints(List<LatLng> list) {
        this.mWayPoints = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8077a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeString(this.c);
        parcel.writeList(this.mWayPoints);
    }

    protected RouteStep(Parcel parcel) {
        this.f8077a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.c = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mWayPoints = arrayList;
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        if (this.mWayPoints.size() == 0) {
            this.mWayPoints = null;
        }
    }
}
