package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DrivePathV2 extends Path implements Parcelable {
    public static final Parcelable.Creator<DrivePathV2> CREATOR = new a();
    private String d;
    private List<DriveStepV2> e;
    private int f;
    private Cost g;
    private ElecConsumeInfo h;
    private List<ChargeStationInfo> i;

    static class a implements Parcelable.Creator<DrivePathV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DrivePathV2 createFromParcel(Parcel parcel) {
            return new DrivePathV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrivePathV2[] newArray(int i) {
            return null;
        }
    }

    public DrivePathV2(Parcel parcel) {
        super(parcel);
        this.e = new ArrayList();
        this.i = new ArrayList();
        this.d = parcel.readString();
        this.e = parcel.createTypedArrayList(DriveStepV2.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ChargeStationInfo> getChargeStationInfo() {
        return this.i;
    }

    public Cost getCost() {
        return this.g;
    }

    public ElecConsumeInfo getElecConsumeInfo() {
        return this.h;
    }

    public int getRestriction() {
        return this.f;
    }

    public List<DriveStepV2> getSteps() {
        return this.e;
    }

    public String getStrategy() {
        return this.d;
    }

    public void setChargeStationInfo(List<ChargeStationInfo> list) {
        this.i = list;
    }

    public void setCost(Cost cost) {
        this.g = cost;
    }

    public void setElecConsumeInfo(ElecConsumeInfo elecConsumeInfo) {
        this.h = elecConsumeInfo;
    }

    public void setRestriction(int i) {
        this.f = i;
    }

    public void setSteps(List<DriveStepV2> list) {
        this.e = list;
    }

    public void setStrategy(String str) {
        this.d = str;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.e);
    }

    public DrivePathV2() {
        this.e = new ArrayList();
        this.i = new ArrayList();
    }
}
