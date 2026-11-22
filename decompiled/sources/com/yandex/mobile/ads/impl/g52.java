package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class g52 extends r12 {
    public static final Parcelable.Creator<g52> CREATOR = new a();
    public final long b;
    public final long c;

    final class a implements Parcelable.Creator<g52> {
        @Override // android.os.Parcelable.Creator
        public final g52 createFromParcel(Parcel parcel) {
            return new g52(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final g52[] newArray(int i) {
            return new g52[i];
        }

        a() {
        }
    }

    private g52(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    static g52 a(ag1 ag1Var, long j, p52 p52Var) {
        long a2 = a(j, ag1Var);
        return new g52(a2, p52Var.b(a2));
    }

    static long a(long j, ag1 ag1Var) {
        long t = ag1Var.t();
        if ((128 & t) != 0) {
            return 8589934591L & ((((t & 1) << 32) | ag1Var.v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
    }
}
