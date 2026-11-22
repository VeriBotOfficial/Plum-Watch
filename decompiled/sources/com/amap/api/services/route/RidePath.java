package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class RidePath extends Path implements Parcelable {
    public static final Parcelable.Creator<RidePath> CREATOR = new a();
    private List<RideStep> d;

    static class a implements Parcelable.Creator<RidePath> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RidePath createFromParcel(Parcel parcel) {
            return new RidePath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RidePath[] newArray(int i) {
            return null;
        }
    }

    public RidePath(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.d = parcel.createTypedArrayList(RideStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<RideStep> getSteps() {
        return this.d;
    }

    public void setSteps(List<RideStep> list) {
        this.d = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.d);
    }

    public RidePath() {
        this.d = new ArrayList();
    }
}
