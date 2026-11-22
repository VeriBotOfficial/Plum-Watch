package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2137a;
    private String b;

    static class a implements Parcelable.Creator<Photo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Photo[] newArray(int i) {
            return null;
        }
    }

    public Photo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getTitle() {
        return this.f2137a;
    }

    public String getUrl() {
        return this.b;
    }

    public void setTitle(String str) {
        this.f2137a = str;
    }

    public void setUrl(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2137a);
        parcel.writeString(this.b);
    }

    public Photo(String str, String str2) {
        this.f2137a = str;
        this.b = str2;
    }

    public Photo(Parcel parcel) {
        this.f2137a = parcel.readString();
        this.b = parcel.readString();
    }
}
