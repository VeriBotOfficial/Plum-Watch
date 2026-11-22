package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class TransitResultNode implements Parcelable {
    public static final Parcelable.Creator<TransitResultNode> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f8080a;
    private String b;
    private LatLng c;
    private String d;

    static class a implements Parcelable.Creator<TransitResultNode> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitResultNode createFromParcel(Parcel parcel) {
            return new TransitResultNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitResultNode[] newArray(int i) {
            return new TransitResultNode[i];
        }
    }

    public TransitResultNode(int i, String str, LatLng latLng, String str2) {
        this.f8080a = i;
        this.b = str;
        this.c = latLng;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCityId() {
        return this.f8080a;
    }

    public String getCityName() {
        return this.b;
    }

    public LatLng getLocation() {
        return this.c;
    }

    public String getSearchWord() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8080a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeString(this.d);
    }

    protected TransitResultNode(Parcel parcel) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f8080a = parcel.readInt();
        this.b = parcel.readString();
        this.c = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.d = parcel.readString();
    }
}
