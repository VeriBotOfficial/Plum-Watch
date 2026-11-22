package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class w22 implements Comparable<w22>, Parcelable {
    public static final Parcelable.Creator<w22> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;

    final class a implements Parcelable.Creator<w22> {
        @Override // android.os.Parcelable.Creator
        public final w22 createFromParcel(Parcel parcel) {
            return new w22(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final w22[] newArray(int i) {
            return new w22[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.b + "." + this.c + "." + this.d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(w22 w22Var) {
        w22 w22Var2 = w22Var;
        int i = this.b - w22Var2.b;
        if (i != 0) {
            return i;
        }
        int i2 = this.c - w22Var2.c;
        return i2 == 0 ? this.d - w22Var2.d : i2;
    }

    public w22(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w22.class == obj.getClass()) {
            w22 w22Var = (w22) obj;
            if (this.b == w22Var.b && this.c == w22Var.c && this.d == w22Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    w22(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
