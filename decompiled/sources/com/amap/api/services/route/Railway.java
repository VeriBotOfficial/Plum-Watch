package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2169a;
    private String b;

    static class a implements Parcelable.Creator<Railway> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Railway createFromParcel(Parcel parcel) {
            return new Railway(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Railway[] newArray(int i) {
            return new Railway[i];
        }
    }

    public Railway() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getID() {
        return this.f2169a;
    }

    public String getName() {
        return this.b;
    }

    public void setID(String str) {
        this.f2169a = str;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2169a);
        parcel.writeString(this.b);
    }

    protected Railway(Parcel parcel) {
        this.f2169a = parcel.readString();
        this.b = parcel.readString();
    }
}
