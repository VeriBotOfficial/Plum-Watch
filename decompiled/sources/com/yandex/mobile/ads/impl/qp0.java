package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class qp0 extends ti0 {
    public static final Parcelable.Creator<qp0> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;

    final class a implements Parcelable.Creator<qp0> {
        @Override // android.os.Parcelable.Creator
        public final qp0 createFromParcel(Parcel parcel) {
            return new qp0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final qp0[] newArray(int i) {
            return new qp0[i];
        }

        a() {
        }
    }

    @Override // com.yandex.mobile.ads.impl.ti0
    public final String toString() {
        return this.b + ": domain=" + this.c + ", description=" + this.d;
    }

    qp0(Parcel parcel) {
        super("----");
        this.c = (String) f92.a(parcel.readString());
        this.d = (String) f92.a(parcel.readString());
        this.e = (String) f92.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qp0.class == obj.getClass()) {
            qp0 qp0Var = (qp0) obj;
            if (f92.a(this.d, qp0Var.d) && f92.a(this.c, qp0Var.c) && f92.a(this.e, qp0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
    }

    public qp0(String str, String str2, String str3) {
        super("----");
        this.c = str;
        this.d = str2;
        this.e = str3;
    }
}
