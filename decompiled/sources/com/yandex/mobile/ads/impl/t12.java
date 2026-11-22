package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class t12 extends r12 {
    public static final Parcelable.Creator<t12> CREATOR = new a();
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final List<b> i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    final class a implements Parcelable.Creator<t12> {
        @Override // android.os.Parcelable.Creator
        public final t12 createFromParcel(Parcel parcel) {
            return new t12(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final t12[] newArray(int i) {
            return new t12[i];
        }

        a() {
        }
    }

    private t12(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    static t12 a(ag1 ag1Var, long j, p52 p52Var) {
        boolean z;
        List list;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j3;
        int i;
        int i2;
        int i3;
        long j4;
        boolean z5;
        boolean z6;
        long j5;
        long v = ag1Var.v();
        boolean z7 = (ag1Var.t() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z7) {
            z = z7;
            list = emptyList;
            j2 = -9223372036854775807L;
            z2 = false;
            z3 = false;
            z4 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            j4 = v;
            z5 = false;
        } else {
            int t = ag1Var.t();
            boolean z8 = (t & 128) != 0;
            boolean z9 = (t & 64) != 0;
            boolean z10 = (t & 32) != 0;
            boolean z11 = (t & 16) != 0;
            long a2 = (!z9 || z11) ? -9223372036854775807L : g52.a(j, ag1Var);
            if (!z9) {
                int t2 = ag1Var.t();
                ArrayList arrayList = new ArrayList(t2);
                for (int i4 = 0; i4 < t2; i4++) {
                    int t3 = ag1Var.t();
                    long a3 = !z11 ? g52.a(j, ag1Var) : -9223372036854775807L;
                    arrayList.add(new b(t3, a3, p52Var.b(a3)));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long t4 = ag1Var.t();
                boolean z12 = (128 & t4) != 0;
                j5 = ((((t4 & 1) << 32) | ag1Var.v()) * 1000) / 90;
                z6 = z12;
            } else {
                z6 = false;
                j5 = -9223372036854775807L;
            }
            int z13 = ag1Var.z();
            int t5 = ag1Var.t();
            i = z13;
            z = z7;
            z2 = z11;
            z4 = z6;
            z3 = z8;
            long j6 = a2;
            i3 = ag1Var.t();
            i2 = t5;
            j2 = j6;
            list = emptyList;
            j4 = v;
            z5 = z9;
            j3 = j5;
        }
        return new t12(j4, z, z3, z5, z2, j2, p52Var.b(j2), list, z4, j3, i, i2, i3);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16923a;
        public final long b;
        public final long c;

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i, long j, long j2) {
            this.f16923a = i;
            this.b = j;
            this.c = j2;
        }
    }

    private t12(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.i.get(i2);
            parcel.writeInt(bVar.f16923a);
            parcel.writeLong(bVar.b);
            parcel.writeLong(bVar.c);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }
}
