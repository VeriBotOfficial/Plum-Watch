package com.anythink.basead.exoplayer.h;

/* loaded from: classes11.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    protected final z[] f2558a;

    public g(z[] zVarArr) {
        this.f2558a = zVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long d() {
        long j = Long.MAX_VALUE;
        for (z zVar : this.f2558a) {
            long d = zVar.d();
            if (d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final long e() {
        long j = Long.MAX_VALUE;
        for (z zVar : this.f2558a) {
            long e = zVar.e();
            if (e != Long.MIN_VALUE) {
                j = Math.min(j, e);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final void a_(long j) {
        for (z zVar : this.f2558a) {
            zVar.a_(j);
        }
    }

    @Override // com.anythink.basead.exoplayer.h.z
    public final boolean c(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                return z2;
            }
            z = false;
            for (z zVar : this.f2558a) {
                long e2 = zVar.e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= j;
                if (e2 == e || z3) {
                    z |= zVar.c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
