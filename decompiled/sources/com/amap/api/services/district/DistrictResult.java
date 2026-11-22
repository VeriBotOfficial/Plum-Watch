package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class DistrictResult implements Parcelable {
    public Parcelable.Creator<DistrictResult> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    private DistrictSearchQuery f2110a;
    private ArrayList<DistrictItem> b;
    private int c;
    private AMapException d;

    class a implements Parcelable.Creator<DistrictResult> {
        a(DistrictResult districtResult) {
        }

        @Override // android.os.Parcelable.Creator
        public DistrictResult createFromParcel(Parcel parcel) {
            return new DistrictResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DistrictResult[] newArray(int i) {
            return new DistrictResult[i];
        }
    }

    public DistrictResult(DistrictSearchQuery districtSearchQuery, ArrayList<DistrictItem> arrayList) {
        this.b = new ArrayList<>();
        this.CREATOR = new a(this);
        this.f2110a = districtSearchQuery;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistrictResult.class != obj.getClass()) {
            return false;
        }
        DistrictResult districtResult = (DistrictResult) obj;
        DistrictSearchQuery districtSearchQuery = this.f2110a;
        if (districtSearchQuery == null) {
            if (districtResult.f2110a != null) {
                return false;
            }
        } else if (!districtSearchQuery.equals(districtResult.f2110a)) {
            return false;
        }
        ArrayList<DistrictItem> arrayList = this.b;
        if (arrayList == null) {
            if (districtResult.b != null) {
                return false;
            }
        } else if (!arrayList.equals(districtResult.b)) {
            return false;
        }
        return true;
    }

    public AMapException getAMapException() {
        return this.d;
    }

    public ArrayList<DistrictItem> getDistrict() {
        return this.b;
    }

    public int getPageCount() {
        return this.c;
    }

    public DistrictSearchQuery getQuery() {
        return this.f2110a;
    }

    public int hashCode() {
        DistrictSearchQuery districtSearchQuery = this.f2110a;
        int hashCode = ((districtSearchQuery == null ? 0 : districtSearchQuery.hashCode()) + 31) * 31;
        ArrayList<DistrictItem> arrayList = this.b;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public void setAMapException(AMapException aMapException) {
        this.d = aMapException;
    }

    public void setDistrict(ArrayList<DistrictItem> arrayList) {
        this.b = arrayList;
    }

    public void setPageCount(int i) {
        this.c = i;
    }

    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        this.f2110a = districtSearchQuery;
    }

    public String toString() {
        return "DistrictResult [mDisQuery=" + this.f2110a + ", mDistricts=" + this.b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2110a, i);
        parcel.writeTypedList(this.b);
    }

    public DistrictResult() {
        this.b = new ArrayList<>();
        this.CREATOR = new a(this);
    }

    protected DistrictResult(Parcel parcel) {
        this.b = new ArrayList<>();
        this.CREATOR = new a(this);
        this.f2110a = (DistrictSearchQuery) parcel.readParcelable(DistrictSearchQuery.class.getClassLoader());
        this.b = parcel.createTypedArrayList(DistrictItem.CREATOR);
    }
}
