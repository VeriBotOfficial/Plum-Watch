package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.k01;

/* loaded from: classes5.dex */
public final class t02 implements k01.b {
    public static final Parcelable.Creator<t02> CREATOR = new a();
    public final float b;
    public final int c;

    final class a implements Parcelable.Creator<t02> {
        @Override // android.os.Parcelable.Creator
        public final t02 createFromParcel(Parcel parcel) {
            return new t02(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t02[] newArray(int i) {
            return new t02[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.b + ", svcTemporalLayerCount=" + this.c;
    }

    public t02(int i, float f) {
        this.b = f;
        this.c = i;
    }

    private t02(Parcel parcel) {
        this.b = parcel.readFloat();
        this.c = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t02.class == obj.getClass()) {
            t02 t02Var = (t02) obj;
            if (this.b == t02Var.b && this.c == t02Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.b).hashCode() + 527) * 31) + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeInt(this.c);
    }
}
