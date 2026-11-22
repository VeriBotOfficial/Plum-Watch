package com.amap.api.fence;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.location.DPoint;
import java.util.List;

/* loaded from: classes11.dex */
public class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2002a;
    private String b;
    private String c;
    private List<DPoint> d;

    static class a implements Parcelable.Creator<DistrictItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DistrictItem createFromParcel(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DistrictItem[] newArray(int i) {
            return new DistrictItem[i];
        }
    }

    public DistrictItem() {
        this.f2002a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public static Parcelable.Creator<DistrictItem> getCreator() {
        return CREATOR;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdcode() {
        return this.c;
    }

    public String getCitycode() {
        return this.b;
    }

    public String getDistrictName() {
        return this.f2002a;
    }

    public List<DPoint> getPolyline() {
        return this.d;
    }

    public void setAdcode(String str) {
        this.c = str;
    }

    public void setCitycode(String str) {
        this.b = str;
    }

    public void setDistrictName(String str) {
        this.f2002a = str;
    }

    public void setPolyline(List<DPoint> list) {
        this.d = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2002a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeTypedList(this.d);
    }

    protected DistrictItem(Parcel parcel) {
        this.f2002a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.f2002a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createTypedArrayList(DPoint.CREATOR);
    }
}
