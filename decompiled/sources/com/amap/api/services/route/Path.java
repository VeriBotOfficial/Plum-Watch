package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private float f2168a;
    private long b;
    private List<LatLonPoint> c;

    static class a implements Parcelable.Creator<Path> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Path createFromParcel(Parcel parcel) {
            return new Path(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Path[] newArray(int i) {
            return null;
        }
    }

    public Path(Parcel parcel) {
        this.c = new ArrayList();
        this.f2168a = parcel.readFloat();
        this.b = parcel.readLong();
        this.c = parcel.createTypedArrayList(LatLonPoint.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDistance() {
        return this.f2168a;
    }

    public long getDuration() {
        return this.b;
    }

    public List<LatLonPoint> getPolyline() {
        return this.c;
    }

    public void setDistance(float f) {
        this.f2168a = f;
    }

    public void setDuration(long j) {
        this.b = j;
    }

    public void setPolyline(List<LatLonPoint> list) {
        this.c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f2168a);
        parcel.writeLong(this.b);
        parcel.writeTypedList(this.c);
    }

    public Path() {
        this.c = new ArrayList();
    }
}
