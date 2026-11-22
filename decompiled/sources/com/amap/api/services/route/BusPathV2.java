package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class BusPathV2 extends Path implements Parcelable {
    public static final Parcelable.Creator<BusPathV2> CREATOR = new a();
    private float d;
    private boolean e;
    private float f;
    private float g;
    private List<BusStepV2> h;

    static class a implements Parcelable.Creator<BusPathV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public BusPathV2 createFromParcel(Parcel parcel) {
            return new BusPathV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BusPathV2[] newArray(int i) {
            return null;
        }
    }

    public BusPathV2(Parcel parcel) {
        super(parcel);
        this.h = new ArrayList();
        this.d = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.e = zArr[0];
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.h = parcel.createTypedArrayList(BusStepV2.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBusDistance() {
        return this.g;
    }

    public float getCost() {
        return this.d;
    }

    public List<BusStepV2> getSteps() {
        return this.h;
    }

    public float getWalkDistance() {
        return this.f;
    }

    public boolean isNightBus() {
        return this.e;
    }

    public void setBusDistance(float f) {
        this.g = f;
    }

    public void setCost(float f) {
        this.d = f;
    }

    public void setNightBus(boolean z) {
        this.e = z;
    }

    public void setSteps(List<BusStepV2> list) {
        this.h = list;
    }

    public void setWalkDistance(float f) {
        this.f = f;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.d);
        parcel.writeBooleanArray(new boolean[]{this.e});
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeTypedList(this.h);
    }

    public BusPathV2() {
        this.h = new ArrayList();
    }
}
