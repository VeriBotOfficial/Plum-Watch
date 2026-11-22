package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class el1 extends ti0 {
    public static final Parcelable.Creator<el1> CREATOR = new a();
    public final String c;
    public final byte[] d;

    final class a implements Parcelable.Creator<el1> {
        @Override // android.os.Parcelable.Creator
        public final el1 createFromParcel(Parcel parcel) {
            return new el1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final el1[] newArray(int i) {
            return new el1[i];
        }

        a() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0
    public final String toString() {
        return this.b + ": owner=" + this.c;
    }

    el1(Parcel parcel) {
        super("PRIV");
        this.c = (String) f92.a(parcel.readString());
        this.d = (byte[]) f92.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && el1.class == obj.getClass()) {
            el1 el1Var = (el1) obj;
            if (f92.a(this.c, el1Var.c) && Arrays.equals(this.d, el1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        return Arrays.hashCode(this.d) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public el1(String str, byte[] bArr) {
        super("PRIV");
        this.c = str;
        this.d = bArr;
    }
}
