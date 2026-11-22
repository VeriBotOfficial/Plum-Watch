package com.anythink.basead.exoplayer;

import com.anythink.basead.exoplayer.h.s;

/* loaded from: classes11.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final s.a f2726a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    r(s.a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f2726a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public final r a() {
        return new r(this.f2726a.a(-1), this.b, this.c, this.d, this.e, this.f, this.g);
    }

    private r a(long j) {
        return new r(this.f2726a, j, this.c, this.d, this.e, this.f, this.g);
    }
}
