package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.yandex.mobile.ads.impl.jl;
import java.io.IOException;

/* loaded from: classes5.dex */
final class m72 extends jl {
    public m72(p52 p52Var, long j, long j2, int i, int i2) {
        super(new jl.b(), new a(i, p52Var, i2), j, j + 1, 0L, j2, 188L, 940);
    }

    private static final class a implements jl.f {

        /* renamed from: a, reason: collision with root package name */
        private final p52 f16216a;
        private final ag1 b = new ag1();
        private final int c;
        private final int d;

        public a(int i, p52 p52Var, int i2) {
            this.c = i;
            this.f16216a = p52Var;
            this.d = i2;
        }

        @Override // com.yandex.mobile.ads.impl.jl.f
        public final void a() {
            this.b.a(f92.f);
        }

        @Override // com.yandex.mobile.ads.impl.jl.f
        public final jl.e a(wz wzVar, long j) throws IOException {
            long j2;
            long a2 = wzVar.a();
            int min = (int) Math.min(this.d, wzVar.b() - a2);
            this.b.c(min);
            wzVar.b(this.b.c(), 0, min, false);
            ag1 ag1Var = this.b;
            int e = ag1Var.e();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                if (ag1Var.a() < 188) {
                    j2 = -9223372036854775807L;
                    break;
                }
                byte[] c = ag1Var.c();
                int d = ag1Var.d();
                while (true) {
                    if (d >= e) {
                        j2 = -9223372036854775807L;
                        break;
                    }
                    j2 = -9223372036854775807L;
                    if (c[d] == 71) {
                        break;
                    }
                    d++;
                }
                int i = d + 188;
                if (i > e) {
                    break;
                }
                long a3 = q72.a(d, this.c, ag1Var);
                if (a3 != j2) {
                    long b = this.f16216a.b(a3);
                    if (b > j) {
                        if (j5 == j2) {
                            return jl.e.a(b, a2);
                        }
                        return jl.e.a(a2 + j4);
                    }
                    if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + b > j) {
                        return jl.e.a(a2 + d);
                    }
                    j5 = b;
                    j4 = d;
                }
                ag1Var.e(i);
                j3 = i;
            }
            if (j5 != j2) {
                return jl.e.b(j5, a2 + j3);
            }
            return jl.e.d;
        }
    }
}
