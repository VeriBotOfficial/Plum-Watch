package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2109a;
    private String b;
    private String c;
    private LatLonPoint d;
    private String e;
    private List<DistrictItem> f;
    private String[] g;

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
        this.f = new ArrayList();
        this.g = new String[0];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String[] districtBoundary() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DistrictItem.class != obj.getClass()) {
            return false;
        }
        DistrictItem districtItem = (DistrictItem) obj;
        String str = this.b;
        if (str == null) {
            if (districtItem.b != null) {
                return false;
            }
        } else if (!str.equals(districtItem.b)) {
            return false;
        }
        LatLonPoint latLonPoint = this.d;
        if (latLonPoint == null) {
            if (districtItem.d != null) {
                return false;
            }
        } else if (!latLonPoint.equals(districtItem.d)) {
            return false;
        }
        String str2 = this.f2109a;
        if (str2 == null) {
            if (districtItem.f2109a != null) {
                return false;
            }
        } else if (!str2.equals(districtItem.f2109a)) {
            return false;
        }
        if (!Arrays.equals(this.g, districtItem.g)) {
            return false;
        }
        List<DistrictItem> list = this.f;
        if (list == null) {
            if (districtItem.f != null) {
                return false;
            }
        } else if (!list.equals(districtItem.f)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (districtItem.e != null) {
                return false;
            }
        } else if (!str3.equals(districtItem.e)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null) {
            if (districtItem.c != null) {
                return false;
            }
        } else if (!str4.equals(districtItem.c)) {
            return false;
        }
        return true;
    }

    public String getAdcode() {
        return this.b;
    }

    public LatLonPoint getCenter() {
        return this.d;
    }

    public String getCitycode() {
        return this.f2109a;
    }

    public String getLevel() {
        return this.e;
    }

    public String getName() {
        return this.c;
    }

    public List<DistrictItem> getSubDistrict() {
        return this.f;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        LatLonPoint latLonPoint = this.d;
        int hashCode2 = (hashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
        String str2 = this.f2109a;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Arrays.hashCode(this.g)) * 31;
        List<DistrictItem> list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.c;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public void setAdcode(String str) {
        this.b = str;
    }

    public void setCenter(LatLonPoint latLonPoint) {
        this.d = latLonPoint;
    }

    public void setCitycode(String str) {
        this.f2109a = str;
    }

    public void setDistrictBoundary(String[] strArr) {
        this.g = strArr;
    }

    public void setLevel(String str) {
        this.e = str;
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setSubDistrict(ArrayList<DistrictItem> arrayList) {
        this.f = arrayList;
    }

    public String toString() {
        return "DistrictItem [mCitycode=" + this.f2109a + ", mAdcode=" + this.b + ", mName=" + this.c + ", mCenter=" + this.d + ", mLevel=" + this.e + ", mDistricts=" + this.f + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2109a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeTypedList(this.f);
        parcel.writeInt(this.g.length);
        parcel.writeStringArray(this.g);
    }

    public DistrictItem(String str, String str2, String str3, LatLonPoint latLonPoint, String str4) {
        this.f = new ArrayList();
        this.g = new String[0];
        this.c = str;
        this.f2109a = str2;
        this.b = str3;
        this.d = latLonPoint;
        this.e = str4;
    }

    public DistrictItem(Parcel parcel) {
        this.f = new ArrayList();
        this.g = new String[0];
        this.f2109a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
        this.e = parcel.readString();
        this.f = parcel.createTypedArrayList(CREATOR);
        int readInt = parcel.readInt();
        if (readInt <= 0 || readInt > 52428800) {
            return;
        }
        String[] strArr = new String[readInt];
        this.g = strArr;
        parcel.readStringArray(strArr);
    }
}
