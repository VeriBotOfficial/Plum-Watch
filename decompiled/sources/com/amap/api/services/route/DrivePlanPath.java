package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DrivePlanPath implements Parcelable {
    public static final Parcelable.Creator<DrivePlanPath> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    float f2162a;
    int b;
    private List<DrivePlanStep> c;

    static class a implements Parcelable.Creator<DrivePlanPath> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DrivePlanPath createFromParcel(Parcel parcel) {
            return new DrivePlanPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DrivePlanPath[] newArray(int i) {
            return null;
        }
    }

    public DrivePlanPath(Parcel parcel) {
        this.c = new ArrayList();
        this.f2162a = parcel.readFloat();
        this.b = parcel.readInt();
        this.c = parcel.createTypedArrayList(DrivePlanStep.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f2162a;
    }

    public List<DrivePlanStep> getSteps() {
        return this.c;
    }

    public float getTrafficLights() {
        return this.b;
    }

    public void setDistance(float f) {
        this.f2162a = f;
    }

    public void setSteps(List<DrivePlanStep> list) {
        this.c = list;
    }

    public void setTrafficLights(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f2162a);
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.c);
    }

    public DrivePlanPath() {
        this.c = new ArrayList();
    }
}
