package com.amap.api.maps.offlinemap;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class OfflineMapProvince extends Province {
    public static final Parcelable.Creator<OfflineMapProvince> CREATOR = new a();
    private String e;
    private int f;
    private long g;
    private String h;
    private int i;
    private ArrayList<OfflineMapCity> j;

    static class a implements Parcelable.Creator<OfflineMapProvince> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public OfflineMapProvince createFromParcel(Parcel parcel) {
            return new OfflineMapProvince(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public OfflineMapProvince[] newArray(int i) {
            return new OfflineMapProvince[i];
        }
    }

    public OfflineMapProvince() {
        this.f = 6;
        this.i = 0;
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<OfflineMapCity> getCityList() {
        ArrayList<OfflineMapCity> arrayList = this.j;
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public int getCompleteCode() {
        return this.i;
    }

    public ArrayList<OfflineMapCity> getDownloadedCityList() {
        ArrayList<OfflineMapCity> arrayList = new ArrayList<>();
        ArrayList<OfflineMapCity> arrayList2 = this.j;
        if (arrayList2 != null) {
            Iterator<OfflineMapCity> it = arrayList2.iterator();
            while (it.hasNext()) {
                OfflineMapCity next = it.next();
                if (next.getState() != 6) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public long getSize() {
        return this.g;
    }

    public int getState() {
        return this.f;
    }

    public String getUrl() {
        return this.e;
    }

    public String getVersion() {
        return this.h;
    }

    public void setCityList(ArrayList<OfflineMapCity> arrayList) {
        this.j = arrayList;
    }

    public void setCompleteCode(int i) {
        this.i = i;
    }

    public void setSize(long j) {
        this.g = j;
    }

    public void setState(int i) {
        this.f = i;
    }

    public void setUrl(String str) {
        this.e = str;
    }

    public void setVersion(String str) {
        this.h = str;
    }

    @Override // com.amap.api.maps.offlinemap.Province, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeTypedList(this.j);
    }

    public OfflineMapProvince(Parcel parcel) {
        super(parcel);
        this.f = 6;
        this.i = 0;
        this.e = parcel.readString();
        this.f = parcel.readInt();
        this.g = parcel.readLong();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.createTypedArrayList(OfflineMapCity.CREATOR);
    }
}
