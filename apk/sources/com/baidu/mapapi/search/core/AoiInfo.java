package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class AoiInfo implements Parcelable {
    public static final Parcelable.Creator<AoiInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8064a;
    private String b;
    private String c;
    private AoiType d;
    private int e;
    private int f;
    private int g;

    public enum AoiType {
        AOI_TYPE_UNKNOWN(0),
        AOI_TYPE_AIRPORT(1),
        AOI_TYPE_RAILWAT_STATION(2),
        AOI_TYPE_SHOPPINGMALL(3),
        AOI_TYPE_GAS_STATION(4),
        AOI_TYPE_SCHOOL(5),
        AOI_TYPE_HOSPITAL(6),
        AOI_TYPE_RESIDENTIAL_DISTRICT(7),
        AOI_TYPE_SCENIC_AREA(8),
        AOI_TYPE_PARK(9),
        AOI_TYPE_FREEWAY_SERVICE(10),
        AOI_TYPE_WATER(11);

        private final int b;

        AoiType(int r3) {
            this.b = r3;
        }

        public int toInt() {
            return this.b;
        }

        public static AoiType valueOf(int r0) {
            switch (r0) {
                case 1:
                    return AOI_TYPE_AIRPORT;
                case 2:
                    return AOI_TYPE_RAILWAT_STATION;
                case 3:
                    return AOI_TYPE_SHOPPINGMALL;
                case 4:
                    return AOI_TYPE_GAS_STATION;
                case 5:
                    return AOI_TYPE_SCHOOL;
                case 6:
                    return AOI_TYPE_HOSPITAL;
                case 7:
                    return AOI_TYPE_RESIDENTIAL_DISTRICT;
                case 8:
                    return AOI_TYPE_SCENIC_AREA;
                case 9:
                    return AOI_TYPE_PARK;
                case 10:
                    return AOI_TYPE_FREEWAY_SERVICE;
                case 11:
                    return AOI_TYPE_WATER;
                default:
                    return AOI_TYPE_UNKNOWN;
            }
        }
    }

    static class a implements Parcelable.Creator<AoiInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiInfo createFromParcel(Parcel parcel) {
            return new AoiInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AoiInfo[] newArray(int r1) {
            return new AoiInfo[r1];
        }
    }

    public AoiInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAoiName() {
        return this.b;
    }

    public AoiType getAoiType() {
        return this.d;
    }

    public int getNearestDistance() {
        return this.e;
    }

    public int getOrder() {
        return this.f;
    }

    public String getPolygon() {
        return this.c;
    }

    public int getRelation() {
        return this.g;
    }

    public String getUid() {
        return this.f8064a;
    }

    public void setAoiName(String str) {
        this.b = str;
    }

    public void setAoiType(AoiType aoiType) {
        this.d = aoiType;
    }

    public void setNearestDistance(int r1) {
        this.e = r1;
    }

    public void setOrder(int r1) {
        this.f = r1;
    }

    public void setPolygon(String str) {
        this.c = str;
    }

    public void setRelation(int r1) {
        this.g = r1;
    }

    public void setUid(String str) {
        this.f8064a = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiInfo: \n; uid = ");
        stringBuffer.append(this.f8064a);
        stringBuffer.append("; polygon = ").append(this.c);
        stringBuffer.append("; aoiName = ").append(this.b);
        stringBuffer.append("; aoiType = ").append(this.d);
        stringBuffer.append("; nearestDistance= ").append(this.e);
        stringBuffer.append("; order= ").append(this.f);
        stringBuffer.append("; relation= ").append(this.g);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f8064a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeInt(this.d.ordinal());
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }

    protected AoiInfo(Parcel parcel) {
        this.c = parcel.readString();
        this.b = parcel.readString();
    }
}
