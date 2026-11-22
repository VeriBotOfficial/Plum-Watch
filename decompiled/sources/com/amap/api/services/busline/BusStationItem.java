package com.amap.api.services.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class BusStationItem implements Parcelable {
    public static final Parcelable.Creator<BusStationItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2090a;
    private String b;
    private LatLonPoint c;
    private String d;
    private String e;
    private List<BusLineItem> f;

    static class a implements Parcelable.Creator<BusStationItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public BusStationItem createFromParcel(Parcel parcel) {
            return new BusStationItem(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BusStationItem[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ BusStationItem(Parcel parcel, a aVar) {
        this(parcel);
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
        BusStationItem busStationItem = (BusStationItem) obj;
        String str = this.f2090a;
        if (str == null) {
            if (busStationItem.f2090a != null) {
                return false;
            }
        } else if (!str.equals(busStationItem.f2090a)) {
            return false;
        }
        return true;
    }

    public String getAdCode() {
        return this.e;
    }

    public List<BusLineItem> getBusLineItems() {
        return this.f;
    }

    public String getBusStationId() {
        return this.f2090a;
    }

    public String getBusStationName() {
        return this.b;
    }

    public String getCityCode() {
        return this.d;
    }

    public LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public int hashCode() {
        String str = this.f2090a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public void setAdCode(String str) {
        this.e = str;
    }

    public void setBusLineItems(List<BusLineItem> list) {
        this.f = list;
    }

    public void setBusStationId(String str) {
        this.f2090a = str;
    }

    public void setBusStationName(String str) {
        this.b = str;
    }

    public void setCityCode(String str) {
        this.d = str;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public String toString() {
        StringBuilder append = new StringBuilder("BusStationName: ").append(this.b).append(" LatLonPoint: ").append(this.c.toString()).append(" BusLines: ");
        List<BusLineItem> list = this.f;
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getBusLineName());
                if (i < list.size() - 1) {
                    stringBuffer.append("|");
                }
            }
        }
        return append.append(stringBuffer.toString()).append(" CityCode: ").append(this.d).append(" AdCode: ").append(this.e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.f2090a);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeList(this.f);
    }

    public BusStationItem() {
        this.f = new ArrayList();
    }

    private BusStationItem(Parcel parcel) {
        this.f = new ArrayList();
        this.b = parcel.readString();
        this.f2090a = parcel.readString();
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readArrayList(BusLineItem.class.getClassLoader());
    }
}
