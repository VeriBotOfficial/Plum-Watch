package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.k01;

/* loaded from: classes5.dex */
public final class re implements k01.b {
    public static final Parcelable.Creator<re> CREATOR = new a();
    public final int b;
    public final String c;

    final class a implements Parcelable.Creator<re> {
        @Override // android.os.Parcelable.Creator
        public final re createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new re(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final re[] newArray(int i) {
            return new re[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.b + ",url=" + this.c + Separators.RPAREN;
    }

    public re(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }
}
