package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;

/* loaded from: classes11.dex */
public class SubPoiItemV2 implements Parcelable {
    public static final Parcelable.Creator<SubPoiItemV2> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2150a;
    private String b;
    private LatLonPoint c;
    private String d;
    private String e;
    private String f;

    static class a implements Parcelable.Creator<SubPoiItemV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public SubPoiItemV2 createFromParcel(Parcel parcel) {
            return new SubPoiItemV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ SubPoiItemV2[] newArray(int i) {
            return null;
        }
    }

    public SubPoiItemV2(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f2150a = str;
        this.c = latLonPoint;
        this.b = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLonPoint getLatLonPoint() {
        return this.c;
    }

    public String getPoiId() {
        return this.f2150a;
    }

    public String getSnippet() {
        return this.d;
    }

    public String getSubTypeDes() {
        return this.e;
    }

    public String getTitle() {
        return this.b;
    }

    public String getTypeCode() {
        return this.f;
    }

    public void setLatLonPoint(LatLonPoint latLonPoint) {
        this.c = latLonPoint;
    }

    public void setPoiId(String str) {
        this.f2150a = str;
    }

    public void setSnippet(String str) {
        this.d = str;
    }

    public void setSubTypeDes(String str) {
        this.e = str;
    }

    public void setTitle(String str) {
        this.b = str;
    }

    public void setTypeCode(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2150a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }

    public SubPoiItemV2(Parcel parcel) {
        this.f2150a = parcel.readString();
        this.b = parcel.readString();
        this.c = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
    }
}
