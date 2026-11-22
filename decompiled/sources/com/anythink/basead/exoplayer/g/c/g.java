package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes11.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.anythink.basead.exoplayer.g.c.g.1
        private static g a(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        private static g[] a(int i) {
            return new g[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ g[] newArray(int i) {
            return new g[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), (byte) 0);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f2511a;
    public final long b;

    /* synthetic */ g(long j, long j2, byte b) {
        this(j, j2);
    }

    private g(long j, long j2) {
        this.f2511a = j;
        this.b = j2;
    }

    static g a(s sVar, long j, ac acVar) {
        long a2 = a(sVar, j);
        return new g(a2, acVar.a(a2));
    }

    static long a(s sVar, long j) {
        long d = sVar.d();
        if ((128 & d) != 0) {
            return 8589934591L & ((((d & 1) << 32) | sVar.h()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2511a);
        parcel.writeLong(this.b);
    }
}
