package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class v12 extends r12 {
    public static final Parcelable.Creator<v12> CREATOR = new a();
    public final List<c> b;

    final class a implements Parcelable.Creator<v12> {
        @Override // android.os.Parcelable.Creator
        public final v12 createFromParcel(Parcel parcel) {
            return new v12(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final v12[] newArray(int i) {
            return new v12[i];
        }

        a() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f17108a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Parcel parcel) {
            return new c(parcel);
        }

        private c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f17108a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(arrayList);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        private c(Parcel parcel) {
            this.f17108a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(b.a(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f17107a;
        public final long b;

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        private b(int i, long j) {
            this.f17107a = i;
            this.b = j;
        }
    }

    private v12(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.a(parcel));
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    private v12(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    static v12 a(ag1 ag1Var) {
        boolean z;
        int i;
        int i2;
        long j;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int i3;
        int i4;
        int i5;
        long j4;
        boolean z5;
        int t = ag1Var.t();
        ArrayList arrayList2 = new ArrayList(t);
        int i6 = 0;
        while (i6 < t) {
            long v = ag1Var.v();
            boolean z6 = true;
            if ((ag1Var.t() & 128) != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            if (z6) {
                i = t;
                i2 = i6;
                j = v;
                arrayList = arrayList3;
                z2 = false;
                z3 = false;
                j2 = -9223372036854775807L;
                z4 = false;
                j3 = -9223372036854775807L;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                int t2 = ag1Var.t();
                boolean z7 = (t2 & 128) != 0 ? z : false;
                boolean z8 = (t2 & 64) != 0 ? z : false;
                boolean z9 = (t2 & 32) != 0 ? z : false;
                long v2 = z8 ? ag1Var.v() : -9223372036854775807L;
                if (!z8) {
                    int t3 = ag1Var.t();
                    ArrayList arrayList4 = new ArrayList(t3);
                    int i7 = 0;
                    while (i7 < t3) {
                        arrayList4.add(new b(ag1Var.t(), ag1Var.v()));
                        i7++;
                        i6 = i6;
                        t = t;
                        v = v;
                    }
                    arrayList3 = arrayList4;
                }
                i = t;
                i2 = i6;
                j = v;
                if (z9) {
                    long t4 = ag1Var.t();
                    z5 = (128 & t4) != 0;
                    j4 = ((((t4 & 1) << 32) | ag1Var.v()) * 1000) / 90;
                } else {
                    j4 = -9223372036854775807L;
                    z5 = false;
                }
                int z10 = ag1Var.z();
                arrayList = arrayList3;
                z2 = z7;
                j2 = v2;
                j3 = j4;
                i4 = ag1Var.t();
                i5 = ag1Var.t();
                z3 = z8;
                z4 = z5;
                i3 = z10;
            }
            arrayList2.add(new c(j, z6, z2, z3, arrayList, j2, z4, j3, i3, i4, i5));
            i6 = i2 + 1;
            t = i;
        }
        return new v12(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.b.get(i2);
            parcel.writeLong(cVar.f17108a);
            parcel.writeByte(cVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                b bVar = cVar.f.get(i3);
                parcel.writeInt(bVar.f17107a);
                parcel.writeLong(bVar.b);
            }
            parcel.writeLong(cVar.e);
            parcel.writeByte(cVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.h);
            parcel.writeInt(cVar.i);
            parcel.writeInt(cVar.j);
            parcel.writeInt(cVar.k);
        }
    }
}
