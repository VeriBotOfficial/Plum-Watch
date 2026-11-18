package com.hihonor.push.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class h extends Exception implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10138a;
    public String b;

    public static class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public h[] newArray(int r1) {
            return new h[r1];
        }
    }

    public h(int r1, String str) {
        a(r1, str);
    }

    public h(Parcel parcel) {
        this.f10138a = parcel.readInt();
        this.b = parcel.readString();
    }

    public final void a(int r1, String str) {
        this.f10138a = r1;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f10138a);
        parcel.writeString(this.b);
    }
}
