package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes11.dex */
public class TruckPath implements Parcelable {
    public static final Parcelable.Creator<TruckPath> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private float f2204a;
    private long b;
    private String c;
    private float d;
    private float e;
    private int f;
    private int g;
    private List<TruckStep> h;

    static class a implements Parcelable.Creator<TruckPath> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TruckPath createFromParcel(Parcel parcel) {
            return new TruckPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TruckPath[] newArray(int i) {
            return new TruckPath[i];
        }
    }

    public TruckPath() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f2204a;
    }

    public long getDuration() {
        return this.b;
    }

    public int getRestriction() {
        return this.g;
    }

    public List<TruckStep> getSteps() {
        return this.h;
    }

    public String getStrategy() {
        return this.c;
    }

    public float getTollDistance() {
        return this.e;
    }

    public float getTolls() {
        return this.d;
    }

    public int getTotalTrafficlights() {
        return this.f;
    }

    public void setDistance(float f) {
        this.f2204a = f;
    }

    public void setDuration(long j) {
        this.b = j;
    }

    public void setRestriction(int i) {
        this.g = i;
    }

    public void setSteps(List<TruckStep> list) {
        this.h = list;
    }

    public void setStrategy(String str) {
        this.c = str;
    }

    public void setTollDistance(float f) {
        this.e = f;
    }

    public void setTolls(float f) {
        this.d = f;
    }

    public void setTotalTrafficlights(int i) {
        this.f = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f2204a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeTypedList(this.h);
    }

    protected TruckPath(Parcel parcel) {
        this.f2204a = parcel.readFloat();
        this.b = parcel.readLong();
        this.c = parcel.readString();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createTypedArrayList(TruckStep.CREATOR);
    }
}
