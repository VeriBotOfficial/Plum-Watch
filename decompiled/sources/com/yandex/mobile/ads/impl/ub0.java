package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jl;
import com.yandex.mobile.ads.impl.wb0;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class ub0 extends jl {

    private static final class a implements jl.f {

        /* renamed from: a, reason: collision with root package name */
        private final ac0 f17038a;
        private final int b;
        private final wb0.a c;

        private a(int i, ac0 ac0Var) {
            this.f17038a = ac0Var;
            this.b = i;
            this.c = new wb0.a();
        }

        private long a(wz wzVar) throws IOException {
            long j;
            while (true) {
                long j2 = 6;
                if (wzVar.d() >= wzVar.b() - 6) {
                    j = 6;
                    break;
                }
                ac0 ac0Var = this.f17038a;
                int i = this.b;
                wb0.a aVar = this.c;
                long d = wzVar.d();
                byte[] bArr = new byte[2];
                wzVar.b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                    ag1 ag1Var = new ag1(16);
                    System.arraycopy(bArr, 0, ag1Var.c(), 0, 2);
                    byte[] c = ag1Var.c();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 14) {
                            j = j2;
                            break;
                        }
                        j = j2;
                        int c2 = wzVar.c(c, 2 + i2, 14 - i2);
                        if (c2 == -1) {
                            break;
                        }
                        i2 += c2;
                        j2 = j;
                    }
                    ag1Var.d(i2);
                    wzVar.c();
                    wzVar.a(false, (int) (d - wzVar.a()));
                    if (wb0.a(ag1Var, ac0Var, i, aVar)) {
                        break;
                    }
                } else {
                    wzVar.c();
                    wzVar.a(false, (int) (d - wzVar.a()));
                }
                wzVar.a(false, 1);
            }
            if (wzVar.d() < wzVar.b() - j) {
                return this.c.f17235a;
            }
            wzVar.a(false, (int) (wzVar.b() - wzVar.d()));
            return this.f17038a.j;
        }

        @Override // com.yandex.mobile.ads.impl.jl.f
        public final jl.e a(wz wzVar, long j) throws IOException {
            long a2 = wzVar.a();
            long a3 = a(wzVar);
            long d = wzVar.d();
            wzVar.a(false, Math.max(6, this.f17038a.c));
            long a4 = a(wzVar);
            long d2 = wzVar.d();
            if (a3 <= j && a4 > j) {
                return jl.e.a(d);
            }
            if (a4 <= j) {
                return jl.e.b(a4, d2);
            }
            return jl.e.a(a3, a2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(final ac0 ac0Var, int i, long j, long j2) {
        super(new jl.d() { // from class: com.yandex.mobile.ads.impl.ub0$$ExternalSyntheticLambda0
            @Override // com.yandex.mobile.ads.impl.jl.d
            public final long a(long j3) {
                return ac0.this.a(j3);
            }
        }, new a(i, ac0Var), ac0Var.b(), ac0Var.j, j, j2, ac0Var.a(), Math.max(6, ac0Var.c));
        Objects.requireNonNull(ac0Var);
    }
}
