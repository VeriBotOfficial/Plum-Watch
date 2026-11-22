package com.amap.api.services.geocoder;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.road.Crossroad;
import com.amap.api.services.road.Road;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class RegeocodeAddress implements Parcelable {
    public static final Parcelable.Creator<RegeocodeAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2119a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private StreetNumber h;
    private String i;
    private String j;
    private String k;
    private List<RegeocodeRoad> l;
    private List<Crossroad> m;
    private List<PoiItem> n;
    private List<BusinessArea> o;
    private List<AoiItem> p;

    /* renamed from: q, reason: collision with root package name */
    private String f2120q;
    private String r;

    static class a implements Parcelable.Creator<RegeocodeAddress> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public RegeocodeAddress createFromParcel(Parcel parcel) {
            return new RegeocodeAddress(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RegeocodeAddress[] newArray(int i) {
            return null;
        }
    }

    /* synthetic */ RegeocodeAddress(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.j;
    }

    public List<AoiItem> getAois() {
        return this.p;
    }

    public String getBuilding() {
        return this.g;
    }

    public List<BusinessArea> getBusinessAreas() {
        return this.o;
    }

    public String getCity() {
        return this.c;
    }

    public String getCityCode() {
        return this.i;
    }

    public String getCountry() {
        return this.f2120q;
    }

    public String getCountryCode() {
        return this.r;
    }

    public List<Crossroad> getCrossroads() {
        return this.m;
    }

    public String getDistrict() {
        return this.d;
    }

    public String getFormatAddress() {
        return this.f2119a;
    }

    public String getNeighborhood() {
        return this.f;
    }

    public List<PoiItem> getPois() {
        return this.n;
    }

    public String getProvince() {
        return this.b;
    }

    public List<RegeocodeRoad> getRoads() {
        return this.l;
    }

    public StreetNumber getStreetNumber() {
        return this.h;
    }

    public String getTowncode() {
        return this.k;
    }

    public String getTownship() {
        return this.e;
    }

    public void setAdCode(String str) {
        this.j = str;
    }

    public void setAois(List<AoiItem> list) {
        this.p = list;
    }

    public void setBuilding(String str) {
        this.g = str;
    }

    public void setBusinessAreas(List<BusinessArea> list) {
        this.o = list;
    }

    public void setCity(String str) {
        this.c = str;
    }

    public void setCityCode(String str) {
        this.i = str;
    }

    public void setCountry(String str) {
        this.f2120q = str;
    }

    public void setCountryCode(String str) {
        this.r = str;
    }

    public void setCrossroads(List<Crossroad> list) {
        this.m = list;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setFormatAddress(String str) {
        this.f2119a = str;
    }

    public void setNeighborhood(String str) {
        this.f = str;
    }

    public void setPois(List<PoiItem> list) {
        this.n = list;
    }

    public void setProvince(String str) {
        this.b = str;
    }

    public void setRoads(List<RegeocodeRoad> list) {
        this.l = list;
    }

    public void setStreetNumber(StreetNumber streetNumber) {
        this.h = streetNumber;
    }

    public void setTowncode(String str) {
        this.k = str;
    }

    public void setTownship(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2119a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeValue(this.h);
        parcel.writeList(this.l);
        parcel.writeList(this.m);
        parcel.writeList(this.n);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeList(this.o);
        parcel.writeList(this.p);
        parcel.writeString(this.k);
        parcel.writeString(this.f2120q);
        parcel.writeString(this.r);
    }

    public RegeocodeAddress() {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
    }

    private RegeocodeAddress(Parcel parcel) {
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.f2119a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = (StreetNumber) parcel.readValue(StreetNumber.class.getClassLoader());
        this.l = parcel.readArrayList(Road.class.getClassLoader());
        this.m = parcel.readArrayList(Crossroad.class.getClassLoader());
        this.n = parcel.readArrayList(PoiItem.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.o = parcel.readArrayList(BusinessArea.class.getClassLoader());
        this.p = parcel.readArrayList(AoiItem.class.getClassLoader());
        this.k = parcel.readString();
        this.f2120q = parcel.readString();
        this.r = parcel.readString();
    }
}
