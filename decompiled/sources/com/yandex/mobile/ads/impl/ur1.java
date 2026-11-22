package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ur1 implements Parcelable {
    public static final Parcelable.Creator<ur1> CREATOR = new b();
    private final boolean b;
    private final hp c;
    private final rx1 d;

    public static final class b implements Parcelable.Creator<ur1> {
        @Override // android.os.Parcelable.Creator
        public final ur1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ur1(parcel.readInt() != 0, parcel.readInt() == 0 ? null : hp.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? rx1.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ur1[] newArray(int i) {
            return new ur1[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur1)) {
            return false;
        }
        ur1 ur1Var = (ur1) obj;
        return this.b == ur1Var.b && Intrinsics.areEqual(this.c, ur1Var.c) && Intrinsics.areEqual(this.d, ur1Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        hp hpVar = this.c;
        int hashCode2 = (hashCode + (hpVar == null ? 0 : hpVar.hashCode())) * 31;
        rx1 rx1Var = this.d;
        return hashCode2 + (rx1Var != null ? rx1Var.hashCode() : 0);
    }

    public final String toString() {
        return "RewardData(serverSideRewardType=" + this.b + ", clientSideReward=" + this.c + ", serverSideReward=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.b ? 1 : 0);
        hp hpVar = this.c;
        if (hpVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hpVar.writeToParcel(out, i);
        }
        rx1 rx1Var = this.d;
        if (rx1Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rx1Var.writeToParcel(out, i);
        }
    }

    public ur1(boolean z, hp hpVar, rx1 rx1Var) {
        this.b = z;
        this.c = hpVar;
        this.d = rx1Var;
    }

    public final boolean e() {
        return this.b;
    }

    public final hp c() {
        return this.c;
    }

    public final rx1 d() {
        return this.d;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f17082a;
        private hp b;
        private rx1 c;

        public final a a(hp hpVar) {
            this.b = hpVar;
            return this;
        }

        public final a a(rx1 rx1Var) {
            this.c = rx1Var;
            return this;
        }

        public final a a(boolean z) {
            this.f17082a = z;
            return this;
        }

        public final ur1 a() {
            return new ur1(this.f17082a, this.b, this.c);
        }
    }
}
