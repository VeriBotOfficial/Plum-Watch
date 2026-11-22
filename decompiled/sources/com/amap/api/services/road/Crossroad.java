package com.amap.api.services.road;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class Crossroad extends Road implements Parcelable {
    public static final Parcelable.Creator<Crossroad> CREATOR = new a();
    private float g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    static class a implements Parcelable.Creator<Crossroad> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Crossroad createFromParcel(Parcel parcel) {
            return new Crossroad(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Crossroad[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ Crossroad(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDirection() {
        return this.h;
    }

    public float getDistance() {
        return this.g;
    }

    public String getFirstRoadId() {
        return this.i;
    }

    public String getFirstRoadName() {
        return this.j;
    }

    public String getSecondRoadId() {
        return this.k;
    }

    public String getSecondRoadName() {
        return this.l;
    }

    public void setDirection(String str) {
        this.h = str;
    }

    public void setDistance(float f) {
        this.g = f;
    }

    public void setFirstRoadId(String str) {
        this.i = str;
    }

    public void setFirstRoadName(String str) {
        this.j = str;
    }

    public void setSecondRoadId(String str) {
        this.k = str;
    }

    public void setSecondRoadName(String str) {
        this.l = str;
    }

    @Override // com.amap.api.services.road.Road, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
    }

    public Crossroad() {
    }

    private Crossroad(Parcel parcel) {
        super(parcel);
        this.g = parcel.readFloat();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
    }
}
