package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jc0;
import com.yandex.mobile.ads.impl.p72;

/* loaded from: classes5.dex */
public final class vi0 implements b50 {
    private a62 b;
    private boolean c;
    private int e;
    private int f;

    /* renamed from: a, reason: collision with root package name */
    private final ag1 f17165a = new ag1(10);
    private long d = -9223372036854775807L;

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(ag1 ag1Var) {
        if (this.b != null) {
            if (this.c) {
                int a2 = ag1Var.a();
                int i = this.f;
                if (i < 10) {
                    int min = Math.min(a2, 10 - i);
                    System.arraycopy(ag1Var.c(), ag1Var.d(), this.f17165a.c(), this.f, min);
                    if (this.f + min == 10) {
                        this.f17165a.e(0);
                        if (73 == this.f17165a.t() && 68 == this.f17165a.t() && 51 == this.f17165a.t()) {
                            this.f17165a.f(3);
                            this.e = this.f17165a.s() + 10;
                        } else {
                            et0.d("Id3Reader", "Discarding invalid ID3 tag");
                            this.c = false;
                            return;
                        }
                    }
                }
                int min2 = Math.min(a2, this.e - this.f);
                this.b.a(min2, ag1Var);
                this.f += min2;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void b() {
        int i;
        a62 a62Var = this.b;
        if (a62Var != null) {
            if (this.c && (i = this.e) != 0 && this.f == i) {
                long j = this.d;
                if (j != -9223372036854775807L) {
                    a62Var.a(j, 1, i, 0, null);
                }
                this.c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(b80 b80Var, p72.d dVar) {
        dVar.a();
        a62 a2 = b80Var.a(dVar.c(), 5);
        this.b = a2;
        a2.a(new jc0.a().b(dVar.b()).e("application/id3").a());
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.b50
    public final void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
