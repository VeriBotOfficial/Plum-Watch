package com.amap.api.services.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.b6;

/* loaded from: classes11.dex */
public class DistrictSearchQuery implements Parcelable, Cloneable {
    public static final Parcelable.Creator<DistrictSearchQuery> CREATOR = new a();
    public static final String KEYWORDS_BUSINESS = "biz_area";
    public static final String KEYWORDS_CITY = "city";
    public static final String KEYWORDS_COUNTRY = "country";
    public static final String KEYWORDS_DISTRICT = "district";
    public static final String KEYWORDS_PROVINCE = "province";

    /* renamed from: a, reason: collision with root package name */
    private int f2112a;
    private int b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;

    static class a implements Parcelable.Creator<DistrictSearchQuery> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DistrictSearchQuery createFromParcel(Parcel parcel) {
            DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
            districtSearchQuery.setKeywords(parcel.readString());
            districtSearchQuery.setKeywordsLevel(parcel.readString());
            districtSearchQuery.setPageNum(parcel.readInt());
            districtSearchQuery.setPageSize(parcel.readInt());
            districtSearchQuery.setShowChild(parcel.readByte() == 1);
            districtSearchQuery.setShowBoundary(parcel.readByte() == 1);
            districtSearchQuery.setShowBusinessArea(parcel.readByte() == 1);
            districtSearchQuery.setSubDistrict(parcel.readInt());
            return districtSearchQuery;
        }

        @Override // android.os.Parcelable.Creator
        public DistrictSearchQuery[] newArray(int i) {
            return new DistrictSearchQuery[i];
        }
    }

    public DistrictSearchQuery() {
        this.f2112a = 1;
        this.b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
    }

    public boolean checkKeyWords() {
        String str = this.c;
        return (str == null || str.trim().equalsIgnoreCase("")) ? false : true;
    }

    public boolean checkLevels() {
        String str = this.d;
        if (str == null) {
            return false;
        }
        return str.trim().equals("country") || this.d.trim().equals("province") || this.d.trim().equals("city") || this.d.trim().equals("district") || this.d.trim().equals(KEYWORDS_BUSINESS);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistrictSearchQuery districtSearchQuery = (DistrictSearchQuery) obj;
        if (this.g != districtSearchQuery.g) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (districtSearchQuery.c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.c)) {
            return false;
        }
        return this.f2112a == districtSearchQuery.f2112a && this.b == districtSearchQuery.b && this.e == districtSearchQuery.e && this.h == districtSearchQuery.h;
    }

    public String getKeywords() {
        return this.c;
    }

    public String getKeywordsLevel() {
        return this.d;
    }

    public int getPageNum() {
        int i = this.f2112a;
        if (i < 1) {
            return 1;
        }
        return i;
    }

    public int getPageSize() {
        return this.b;
    }

    public int getSubDistrict() {
        return this.h;
    }

    public int hashCode() {
        int i = ((this.g ? 1231 : 1237) + 31) * 31;
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return ((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f2112a) * 31) + this.b) * 31) + (this.e ? 1231 : 1237)) * 31) + this.h;
    }

    public boolean isShowBoundary() {
        return this.g;
    }

    public boolean isShowBusinessArea() {
        return this.f;
    }

    public boolean isShowChild() {
        return this.e;
    }

    public void setKeywords(String str) {
        this.c = str;
    }

    public void setKeywordsLevel(String str) {
        this.d = str;
    }

    public void setPageNum(int i) {
        this.f2112a = i;
    }

    public void setPageSize(int i) {
        this.b = i;
    }

    public void setShowBoundary(boolean z) {
        this.g = z;
    }

    public void setShowBusinessArea(boolean z) {
        this.f = z;
    }

    public void setShowChild(boolean z) {
        this.e = z;
    }

    public void setSubDistrict(int i) {
        this.h = i;
    }

    public boolean weakEquals(DistrictSearchQuery districtSearchQuery) {
        if (this == districtSearchQuery) {
            return true;
        }
        if (districtSearchQuery == null) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (districtSearchQuery.c != null) {
                return false;
            }
        } else if (!str.equals(districtSearchQuery.c)) {
            return false;
        }
        return this.b == districtSearchQuery.b && this.e == districtSearchQuery.e && this.g == districtSearchQuery.g && this.h == districtSearchQuery.h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f2112a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.h);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DistrictSearchQuery m6889clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            b6.a(e, "DistrictSearchQuery", "clone");
        }
        DistrictSearchQuery districtSearchQuery = new DistrictSearchQuery();
        districtSearchQuery.setKeywords(this.c);
        districtSearchQuery.setKeywordsLevel(this.d);
        districtSearchQuery.setPageNum(this.f2112a);
        districtSearchQuery.setPageSize(this.b);
        districtSearchQuery.setShowChild(this.e);
        districtSearchQuery.setSubDistrict(this.h);
        districtSearchQuery.setShowBoundary(this.g);
        districtSearchQuery.setShowBusinessArea(this.f);
        return districtSearchQuery;
    }

    public DistrictSearchQuery(String str, String str2, int i) {
        this.b = 20;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = 1;
        this.c = str;
        this.d = str2;
        this.f2112a = i;
    }

    public DistrictSearchQuery(String str, String str2, int i, boolean z, int i2) {
        this(str, str2, i);
        this.e = z;
        this.b = i2;
    }
}
