package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class WalkPath extends Path implements Parcelable {
    public static final Parcelable.Creator<WalkPath> CREATOR = new a();
    private List<WalkStep> d;

    static class a implements Parcelable.Creator<WalkPath> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public WalkPath createFromParcel(Parcel parcel) {
            return new WalkPath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WalkPath[] newArray(int i) {
            return null;
        }
    }

    public WalkPath(Parcel parcel) {
        super(parcel);
        this.d = new ArrayList();
        this.d = parcel.createTypedArrayList(WalkStep.CREATOR);
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkStep> getSteps() {
        return this.d;
    }

    public void setSteps(List<WalkStep> list) {
        this.d = list;
    }

    @Override // com.amap.api.services.route.Path, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.d);
    }

    public WalkPath() {
        this.d = new ArrayList();
    }
}
