package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class PoiItemExtension implements Parcelable {
    public static final Parcelable.Creator<PoiItemExtension> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f2138a;
    private String b;

    static class a implements Parcelable.Creator<PoiItemExtension> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PoiItemExtension createFromParcel(Parcel parcel) {
            return new PoiItemExtension(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PoiItemExtension[] newArray(int i) {
            return new PoiItemExtension[i];
        }
    }

    public PoiItemExtension(String str, String str2) {
        this.f2138a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOpentime() {
        return this.f2138a;
    }

    public String getmRating() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2138a);
        parcel.writeString(this.b);
    }

    protected PoiItemExtension(Parcel parcel) {
        this.f2138a = parcel.readString();
        this.b = parcel.readString();
    }
}
