package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class io extends ti0 {
    public static final Parcelable.Creator<io> CREATOR = new a();
    public final String c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    private final ti0[] h;

    final class a implements Parcelable.Creator<io> {
        @Override // android.os.Parcelable.Creator
        public final io createFromParcel(Parcel parcel) {
            return new io(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final io[] newArray(int i) {
            return new io[i];
        }

        a() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    io(Parcel parcel) {
        super("CHAP");
        this.c = (String) f92.a(parcel.readString());
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ti0[readInt];
        for (int i = 0; i < readInt; i++) {
            this.h[i] = (ti0) parcel.readParcelable(ti0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && io.class == obj.getClass()) {
            io ioVar = (io) obj;
            if (this.d == ioVar.d && this.e == ioVar.e && this.f == ioVar.f && this.g == ioVar.g && f92.a(this.c, ioVar.c) && Arrays.equals(this.h, ioVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.d + 527) * 31) + this.e) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (ti0 ti0Var : this.h) {
            parcel.writeParcelable(ti0Var, 0);
        }
    }

    public io(String str, int i, int i2, long j, long j2, ti0[] ti0VarArr) {
        super("CHAP");
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = ti0VarArr;
    }
}
