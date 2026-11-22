package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class il extends ti0 {
    public static final Parcelable.Creator<il> CREATOR = new a();
    public final byte[] c;

    final class a implements Parcelable.Creator<il> {
        @Override // android.os.Parcelable.Creator
        public final il createFromParcel(Parcel parcel) {
            return new il(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final il[] newArray(int i) {
            return new il[i];
        }

        a() {
        }
    }

    il(Parcel parcel) {
        super((String) f92.a(parcel.readString()));
        this.c = (byte[]) f92.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && il.class == obj.getClass()) {
            il ilVar = (il) obj;
            if (this.b.equals(ilVar.b) && Arrays.equals(this.c, ilVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + v3.a(this.b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public il(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
    }
}
