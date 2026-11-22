package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rx1 implements Parcelable {
    public static final Parcelable.Creator<rx1> CREATOR = new a();
    private final String b;

    public static final class a implements Parcelable.Creator<rx1> {
        @Override // android.os.Parcelable.Creator
        public final rx1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new rx1(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final rx1[] newArray(int i) {
            return new rx1[i];
        }
    }

    public rx1(String rewardUrl) {
        Intrinsics.checkNotNullParameter(rewardUrl, "rewardUrl");
        this.b = rewardUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx1) && Intrinsics.areEqual(this.b, ((rx1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ServerSideReward(rewardUrl=" + this.b + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
    }

    public final String c() {
        return this.b;
    }
}
