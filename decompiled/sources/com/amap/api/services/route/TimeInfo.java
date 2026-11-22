package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class TimeInfo implements Parcelable {
    public static final Parcelable.Creator<TimeInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private long f2202a;
    private List<TimeInfosElement> b;

    static class a implements Parcelable.Creator<TimeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public TimeInfo createFromParcel(Parcel parcel) {
            return new TimeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TimeInfo[] newArray(int i) {
            return null;
        }
    }

    public TimeInfo(Parcel parcel) {
        this.b = new ArrayList();
        this.f2202a = parcel.readInt();
        this.b = parcel.createTypedArrayList(TimeInfosElement.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TimeInfosElement> getElements() {
        return this.b;
    }

    public long getStartTime() {
        return this.f2202a;
    }

    public void setElements(List<TimeInfosElement> list) {
        this.b = list;
    }

    public void setStartTime(long j) {
        this.f2202a = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2202a);
        parcel.writeTypedList(this.b);
    }

    public TimeInfo() {
        this.b = new ArrayList();
    }
}
