package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class CloudImage implements Parcelable {
    public static final Parcelable.Creator<CloudImage> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2094a;
    private String b;
    private String c;

    static class a implements Parcelable.Creator<CloudImage> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public CloudImage createFromParcel(Parcel parcel) {
            return new CloudImage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CloudImage[] newArray(int i) {
            return new CloudImage[i];
        }
    }

    public CloudImage(String str, String str2, String str3) {
        this.f2094a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f2094a;
    }

    public String getPreurl() {
        return this.b;
    }

    public String getUrl() {
        return this.c;
    }

    public void setId(String str) {
        this.f2094a = str;
    }

    public void setPreurl(String str) {
        this.b = str;
    }

    public void setUrl(String str) {
        this.c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2094a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public CloudImage(Parcel parcel) {
        this.f2094a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
