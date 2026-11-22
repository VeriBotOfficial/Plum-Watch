package com.yandex.mobile.ads.impl;

import androidx.media3.common.MimeTypes;
import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.p72;
import com.yandex.mobile.ads.impl.w;

/* loaded from: classes5.dex */
public final class v implements b50 {

    /* renamed from: a, reason: collision with root package name */
    private final zf1 f17100a;
    private final ag1 b;
    private final String c;
    private String d;
    private a62 e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private jc0 k;
    private int l;
    private long m;

    @Override // com.yandex.mobile.ads.impl.b50
    public final void b() {
    }

    public v() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(ag1 ag1Var) {
        if (this.e != null) {
            while (ag1Var.a() > 0) {
                int i = this.f;
                if (i == 0) {
                    while (ag1Var.a() > 0) {
                        if (!this.h) {
                            this.h = ag1Var.t() == 172;
                        } else {
                            int t = ag1Var.t();
                            this.h = t == 172;
                            if (t == 64 || t == 65) {
                                this.i = t == 65;
                                this.f = 1;
                                this.b.c()[0] = -84;
                                this.b.c()[1] = (byte) (this.i ? 65 : 64);
                                this.g = 2;
                            }
                        }
                    }
                } else if (i == 1) {
                    byte[] c = this.b.c();
                    int min = Math.min(ag1Var.a(), 16 - this.g);
                    ag1Var.a(c, this.g, min);
                    int i2 = this.g + min;
                    this.g = i2;
                    if (i2 == 16) {
                        this.f17100a.c(0);
                        w.a a2 = w.a(this.f17100a);
                        jc0 jc0Var = this.k;
                        if (jc0Var == null || 2 != jc0Var.z || a2.f17207a != jc0Var.A || !MimeTypes.AUDIO_AC4.equals(jc0Var.m)) {
                            jc0 a3 = new jc0.a().b(this.d).e(MimeTypes.AUDIO_AC4).c(2).l(a2.f17207a).d(this.c).a();
                            this.k = a3;
                            this.e.a(a3);
                        }
                        this.l = a2.b;
                        this.j = (a2.c * 1000000) / this.k.A;
                        this.b.e(0);
                        this.e.a(16, this.b);
                        this.f = 2;
                    }
                } else if (i == 2) {
                    int min2 = Math.min(ag1Var.a(), this.l - this.g);
                    this.e.a(min2, ag1Var);
                    int i3 = this.g + min2;
                    this.g = i3;
                    int i4 = this.l;
                    if (i3 == i4) {
                        long j = this.m;
                        if (j != -9223372036854775807L) {
                            this.e.a(j, 1, i4, 0, null);
                            this.m += this.j;
                        }
                        this.f = 0;
                    }
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public v(String str) {
        byte[] bArr = new byte[16];
        this.f17100a = new zf1(bArr);
        this.b = new ag1(bArr);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = str;
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(b80 b80Var, p72.d dVar) {
        dVar.a();
        this.d = dVar.b();
        this.e = b80Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(int i, long j) {
        if (j != -9223372036854775807L) {
            this.m = j;
        }
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }
}
