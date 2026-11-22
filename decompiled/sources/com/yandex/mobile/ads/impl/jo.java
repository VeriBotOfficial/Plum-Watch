package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class jo extends ti0 {
    public static final Parcelable.Creator<jo> CREATOR = new a();
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String[] f;
    private final ti0[] g;

    final class a implements Parcelable.Creator<jo> {
        @Override // android.os.Parcelable.Creator
        public final jo createFromParcel(Parcel parcel) {
            return new jo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final jo[] newArray(int i) {
            return new jo[i];
        }

        a() {
        }
    }

    jo(Parcel parcel) {
        super("CTOC");
        this.c = (String) f92.a(parcel.readString());
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = (String[]) f92.a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.g = new ti0[readInt];
        for (int i = 0; i < readInt; i++) {
            this.g[i] = (ti0) parcel.readParcelable(ti0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jo.class == obj.getClass()) {
            jo joVar = (jo) obj;
            if (this.d == joVar.d && this.e == joVar.e && f92.a(this.c, joVar.c) && Arrays.equals(this.f, joVar.f) && Arrays.equals(this.g, joVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.d ? 1 : 0) + 527) * 31) + (this.e ? 1 : 0)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (ti0 ti0Var : this.g) {
            parcel.writeParcelable(ti0Var, 0);
        }
    }

    public jo(String str, boolean z, boolean z2, String[] strArr, ti0[] ti0VarArr) {
        super("CTOC");
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = strArr;
        this.g = ti0VarArr;
    }
}
