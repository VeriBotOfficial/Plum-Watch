package com.anythink.basead.exoplayer.j;

import android.net.Uri;

/* loaded from: classes11.dex */
public final class z implements h {

    /* renamed from: a, reason: collision with root package name */
    private final h f2660a;
    private final g b;
    private boolean c;
    private long d;

    public z(h hVar, g gVar) {
        this.f2660a = (h) com.anythink.basead.exoplayer.k.a.a(hVar);
        this.b = (g) com.anythink.basead.exoplayer.k.a.a(gVar);
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final long a(k kVar) {
        long a2 = this.f2660a.a(kVar);
        this.d = a2;
        if (a2 == 0) {
            return 0L;
        }
        if (kVar.g == -1 && this.d != -1) {
            kVar = new k(kVar.c, kVar.e, kVar.f, this.d, kVar.h, kVar.i);
        }
        this.c = true;
        this.b.a(kVar);
        return this.d;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final int a(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int a2 = this.f2660a.a(bArr, i, i2);
        if (a2 > 0) {
            this.b.a(bArr, i, a2);
            long j = this.d;
            if (j != -1) {
                this.d = j - a2;
            }
        }
        return a2;
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final Uri a() {
        return this.f2660a.a();
    }

    @Override // com.anythink.basead.exoplayer.j.h
    public final void b() {
        try {
            this.f2660a.b();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
    }
}
