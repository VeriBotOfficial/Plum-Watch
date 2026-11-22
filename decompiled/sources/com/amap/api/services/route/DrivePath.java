package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DrivePath extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePath> CREATOR = new a();
    private String d;
    private float e;
    private float f;
    private int g;
    private List<DriveStep> h;
    private int i;

    static class a implements Parcelable.Creator<DrivePath> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DrivePath createFromParcel(Parcel parcel) {
            return new DrivePath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrivePath[] newArray(int i) {
            return null;
        }
    }

    public DrivePath(Parcel parcel) {
        super(parcel);
        this.h = new ArrayList();
        this.d = parcel.readString();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.h = parcel.createTypedArrayList(DriveStep.CREATOR);
        this.g = parcel.readInt();
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getRestriction() {
        return this.i;
    }

    public List<DriveStep> getSteps() {
        return this.h;
    }

    public String getStrategy() {
        return this.d;
    }

    public float getTollDistance() {
        return this.f;
    }

    public float getTolls() {
        return this.e;
    }

    public int getTotalTrafficlights() {
        return this.g;
    }

    public void setRestriction(int i) {
        this.i = i;
    }

    public void setSteps(List<DriveStep> list) {
        this.h = list;
    }

    public void setStrategy(String str) {
        this.d = str;
    }

    public void setTollDistance(float f) {
        this.f = f;
    }

    public void setTolls(float f) {
        this.e = f;
    }

    public void setTotalTrafficlights(int i) {
        this.g = i;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeTypedList(this.h);
        parcel.writeInt(this.g);
    }

    public DrivePath() {
        this.h = new ArrayList();
    }
}
