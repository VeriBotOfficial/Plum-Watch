package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class r82 extends ti0 {
    public static final Parcelable.Creator<r82> CREATOR = new a();
    public final String c;
    public final String d;

    final class a implements Parcelable.Creator<r82> {
        @Override // android.os.Parcelable.Creator
        public final r82 createFromParcel(Parcel parcel) {
            return new r82(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final r82[] newArray(int i) {
            return new r82[i];
        }

        a() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0
    public final String toString() {
        return this.b + ": url=" + this.d;
    }

    r82(Parcel parcel) {
        super((String) f92.a(parcel.readString()));
        this.c = parcel.readString();
        this.d = (String) f92.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r82.class == obj.getClass()) {
            r82 r82Var = (r82) obj;
            if (this.b.equals(r82Var.b) && f92.a(this.c, r82Var.c) && f92.a(this.d, r82Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a2 = v3.a(this.b, 527, 31);
        String str = this.c;
        int hashCode = (a2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public r82(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
