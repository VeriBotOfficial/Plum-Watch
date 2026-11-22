package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.basead.exoplayer.g.c.d.1
        private static d a(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        private static d[] a(int i) {
            return new d[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f2506a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List<a> h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    /* synthetic */ d(Parcel parcel, byte b) {
        this(parcel);
    }

    private d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f2506a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    private d(Parcel parcel) {
        this.f2506a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a.a(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }

    static d a(s sVar, long j, ac acVar) {
        List list;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        boolean z5;
        int i4;
        long j3;
        long h = sVar.h();
        boolean z6 = (sVar.d() & 128) != 0;
        List emptyList = Collections.emptyList();
        long j4 = -9223372036854775807L;
        if (z6) {
            list = emptyList;
            j2 = -9223372036854775807L;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int d = sVar.d();
            boolean z7 = (d & 128) != 0;
            boolean z8 = (d & 64) != 0;
            boolean z9 = (d & 32) != 0;
            boolean z10 = (d & 16) != 0;
            long a2 = (!z8 || z10) ? -9223372036854775807L : g.a(sVar, j);
            if (!z8) {
                int d2 = sVar.d();
                ArrayList arrayList = new ArrayList(d2);
                int i5 = 0;
                while (i5 < d2) {
                    int d3 = sVar.d();
                    if (z10) {
                        i4 = d2;
                        j3 = -9223372036854775807L;
                    } else {
                        i4 = d2;
                        j3 = g.a(sVar, j);
                    }
                    arrayList.add(new a(d3, j3, acVar.a(j3), (byte) 0));
                    i5++;
                    d2 = i4;
                }
                emptyList = arrayList;
            }
            if (z9) {
                long d4 = sVar.d();
                boolean z11 = (128 & d4) != 0;
                j4 = ((((d4 & 1) << 32) | sVar.h()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
            }
            int e = sVar.e();
            long j5 = a2;
            j2 = j4;
            j4 = j5;
            i2 = sVar.d();
            i3 = sVar.d();
            i = e;
            z4 = z5;
            z = z7;
            z2 = z8;
            list = emptyList;
            z3 = z10;
        }
        return new d(h, z6, z, z2, z3, j4, acVar.a(j4), list, z4, j2, i, i2, i3);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2507a;
        public final long b;
        public final long c;

        /* synthetic */ a(int i, long j, long j2, byte b) {
            this(i, j, j2);
        }

        private a(int i, long j, long j2) {
            this.f2507a = i;
            this.b = j;
            this.c = j2;
        }

        private void b(Parcel parcel) {
            parcel.writeInt(this.f2507a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2506a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.h.get(i2);
            parcel.writeInt(aVar.f2507a);
            parcel.writeLong(aVar.b);
            parcel.writeLong(aVar.c);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }
}
