package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class f extends com.anythink.basead.exoplayer.g.c.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.basead.exoplayer.g.c.f.1
        private static f a(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        private static f[] a(int i) {
            return new f[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f2508a;

    /* synthetic */ f(Parcel parcel, byte b2) {
        this(parcel);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f2510a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<a> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private b(long j, boolean z, boolean z2, boolean z3, List<a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f2510a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        private b(Parcel parcel) {
            this.f2510a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(a.a(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        private static b b(s sVar) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            ArrayList arrayList;
            long j;
            long j2;
            boolean z3;
            long j3;
            long h = sVar.h();
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            if ((sVar.d() & 128) != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z4) {
                z2 = false;
                i = 0;
                i2 = 0;
                i3 = 0;
                arrayList = arrayList2;
                j = -9223372036854775807L;
                j2 = -9223372036854775807L;
                z3 = false;
            } else {
                int d = sVar.d();
                boolean z7 = (d & 128) != 0 ? z : false;
                boolean z8 = (d & 64) != 0 ? z : false;
                char c = ' ';
                boolean z9 = (d & 32) != 0 ? z : false;
                long h2 = z8 ? sVar.h() : -9223372036854775807L;
                if (!z8) {
                    int d2 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d2);
                    int i4 = 0;
                    while (i4 < d2) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z5 ? (byte) 1 : (byte) 0));
                        i4++;
                        c = c;
                    }
                    arrayList2 = arrayList3;
                }
                char c2 = c;
                if (z9) {
                    long d3 = sVar.d();
                    boolean z10 = (128 & d3) != 0;
                    j3 = ((((d3 & 1) << c2) | sVar.h()) * 1000) / 90;
                    z6 = z10;
                } else {
                    j3 = -9223372036854775807L;
                }
                int e = sVar.e();
                int d4 = sVar.d();
                boolean z11 = z7;
                z2 = z6;
                z5 = z11;
                i3 = sVar.d();
                long j4 = h2;
                i = e;
                i2 = d4;
                long j5 = j3;
                arrayList = arrayList2;
                z3 = z8;
                j = j4;
                j2 = j5;
            }
            return new b(h, z4, z5, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        private void b(Parcel parcel) {
            parcel.writeLong(this.f2510a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(this.f.get(i), parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private static b c(Parcel parcel) {
            return new b(parcel);
        }

        static /* synthetic */ b a(Parcel parcel) {
            return new b(parcel);
        }

        static /* synthetic */ b a(s sVar) {
            boolean z;
            boolean z2;
            int i;
            int i2;
            int i3;
            ArrayList arrayList;
            long j;
            long j2;
            boolean z3;
            long j3;
            long h = sVar.h();
            boolean z4 = true;
            boolean z5 = false;
            boolean z6 = false;
            if ((sVar.d() & 128) != 0) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z4) {
                z2 = false;
                i = 0;
                i2 = 0;
                i3 = 0;
                arrayList = arrayList2;
                j = -9223372036854775807L;
                j2 = -9223372036854775807L;
                z3 = false;
            } else {
                int d = sVar.d();
                boolean z7 = (d & 128) != 0 ? z : false;
                boolean z8 = (d & 64) != 0 ? z : false;
                char c = ' ';
                boolean z9 = (d & 32) != 0 ? z : false;
                long h2 = z8 ? sVar.h() : -9223372036854775807L;
                if (!z8) {
                    int d2 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d2);
                    int i4 = 0;
                    while (i4 < d2) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z5 ? (byte) 1 : (byte) 0));
                        i4++;
                        c = c;
                    }
                    arrayList2 = arrayList3;
                }
                char c2 = c;
                if (z9) {
                    long d3 = sVar.d();
                    boolean z10 = (128 & d3) != 0;
                    j3 = ((((d3 & 1) << c2) | sVar.h()) * 1000) / 90;
                    z6 = z10;
                } else {
                    j3 = -9223372036854775807L;
                }
                int e = sVar.e();
                int d4 = sVar.d();
                boolean z11 = z7;
                z2 = z6;
                z5 = z11;
                i3 = sVar.d();
                long j4 = h2;
                i = e;
                i2 = d4;
                long j5 = j3;
                arrayList = arrayList2;
                z3 = z8;
                j = j4;
                j2 = j5;
            }
            return new b(h, z4, z5, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        private static /* synthetic */ void a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f2510a);
            parcel.writeByte(bVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.d ? (byte) 1 : (byte) 0);
            int size = bVar.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(bVar.f.get(i), parcel);
            }
            parcel.writeLong(bVar.e);
            parcel.writeByte(bVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.j);
            parcel.writeInt(bVar.k);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2509a;
        public final long b;

        /* synthetic */ a(int i, long j, byte b) {
            this(i, j);
        }

        private a(int i, long j) {
            this.f2509a = i;
            this.b = j;
        }

        private static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private void c(Parcel parcel) {
            parcel.writeInt(this.f2509a);
            parcel.writeLong(this.b);
        }

        static /* synthetic */ a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        static /* synthetic */ void a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f2509a);
            parcel.writeLong(aVar.b);
        }
    }

    private f(List<b> list) {
        this.f2508a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.f2508a = Collections.unmodifiableList(arrayList);
    }

    static f a(s sVar) {
        int d = sVar.d();
        ArrayList arrayList = new ArrayList(d);
        for (int i = 0; i < d; i++) {
            arrayList.add(b.a(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f2508a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2508a.get(i2);
            parcel.writeLong(bVar.f2510a);
            parcel.writeByte(bVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                a.a(bVar.f.get(i3), parcel);
            }
            parcel.writeLong(bVar.e);
            parcel.writeByte(bVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.j);
            parcel.writeInt(bVar.k);
        }
    }
}
