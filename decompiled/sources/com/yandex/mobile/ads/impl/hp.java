package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hp implements Parcelable {
    public static final Parcelable.Creator<hp> CREATOR = new a();
    private final int b;
    private final String c;

    public static final class a implements Parcelable.Creator<hp> {
        @Override // android.os.Parcelable.Creator
        public final hp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new hp(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final hp[] newArray(int i) {
            return new hp[i];
        }
    }

    public hp(int i, String rewardType) {
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        this.b = i;
        this.c = rewardType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return this.b == hpVar.b && Intrinsics.areEqual(this.c, hpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ClientSideReward(rewardAmount=" + this.b + ", rewardType=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.b);
        out.writeString(this.c);
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }
}
