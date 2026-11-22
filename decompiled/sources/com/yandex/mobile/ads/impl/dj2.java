package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.mw0;

@Deprecated
/* loaded from: classes5.dex */
public class dj2 implements k01.b {
    public static final Parcelable.Creator<dj2> CREATOR = new a();
    public final String b;
    public final String c;

    final class a implements Parcelable.Creator<dj2> {
        @Override // android.os.Parcelable.Creator
        public final dj2 createFromParcel(Parcel parcel) {
            return new dj2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final dj2[] newArray(int i) {
            return new dj2[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "VC: " + this.b + "=" + this.c;
    }

    protected dj2(Parcel parcel) {
        this.b = (String) f92.a(parcel.readString());
        this.c = (String) f92.a(parcel.readString());
    }

    @Override // com.yandex.mobile.ads.impl.k01.b
    public final void a(mw0.a aVar) {
        String str = this.b;
        str.getClass();
        str.hashCode();
        switch (str) {
            case "ALBUM":
                aVar.b(this.c);
                break;
            case "TITLE":
                aVar.i(this.c);
                break;
            case "DESCRIPTION":
                aVar.f(this.c);
                break;
            case "ALBUMARTIST":
                aVar.a(this.c);
                break;
            case "ARTIST":
                aVar.c(this.c);
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dj2 dj2Var = (dj2) obj;
            if (this.b.equals(dj2Var.b) && this.c.equals(dj2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public dj2(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final int hashCode() {
        return this.c.hashCode() + v3.a(this.b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
