package com.hihonor.push.sdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f10125a;
    public Bundle b;
    public Bundle c;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(Parcel parcel) {
        this.f10125a = parcel.readString();
        this.b = parcel.readBundle(Bundle.class.getClassLoader());
        this.c = parcel.readBundle(Bundle.class.getClassLoader());
    }

    public b(String str, Bundle bundle, Bundle bundle2) {
        this.f10125a = str;
        this.b = bundle;
        this.c = bundle2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10125a);
        parcel.writeBundle(this.b);
        parcel.writeBundle(this.c);
    }
}
