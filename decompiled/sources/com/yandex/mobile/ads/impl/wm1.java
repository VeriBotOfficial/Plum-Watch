package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.yandex.mobile.ads.impl.jl;
import java.io.IOException;

/* loaded from: classes5.dex */
final class wm1 extends jl {
    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public wm1(p52 p52Var, long j, long j2) {
        super(new jl.b(), new a(p52Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    private static final class a implements jl.f {

        /* renamed from: a, reason: collision with root package name */
        private final p52 f17267a;
        private final ag1 b;

        private a(p52 p52Var) {
            this.f17267a = p52Var;
            this.b = new ag1();
        }

        @Override // com.yandex.mobile.ads.impl.jl.f
        public final void a() {
            this.b.a(f92.f);
        }

        @Override // com.yandex.mobile.ads.impl.jl.f
        public final jl.e a(wz wzVar, long j) throws IOException {
            long a2 = wzVar.a();
            int min = (int) Math.min(20000L, wzVar.b() - a2);
            this.b.c(min);
            wzVar.b(this.b.c(), 0, min, false);
            ag1 ag1Var = this.b;
            int i = -1;
            int i2 = -1;
            long j2 = -9223372036854775807L;
            while (ag1Var.a() >= 4) {
                if (wm1.a(ag1Var.d(), ag1Var.c()) != 442) {
                    ag1Var.f(1);
                } else {
                    ag1Var.f(4);
                    long a3 = xm1.a(ag1Var);
                    if (a3 != -9223372036854775807L) {
                        long b = this.f17267a.b(a3);
                        if (b > j) {
                            if (j2 == -9223372036854775807L) {
                                return jl.e.a(b, a2);
                            }
                            return jl.e.a(a2 + i2);
                        }
                        if (SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + b > j) {
                            return jl.e.a(a2 + ag1Var.d());
                        }
                        i2 = ag1Var.d();
                        j2 = b;
                    }
                    int e = ag1Var.e();
                    if (ag1Var.a() < 10) {
                        ag1Var.e(e);
                    } else {
                        ag1Var.f(9);
                        int t = ag1Var.t() & 7;
                        if (ag1Var.a() < t) {
                            ag1Var.e(e);
                        } else {
                            ag1Var.f(t);
                            if (ag1Var.a() < 4) {
                                ag1Var.e(e);
                            } else {
                                if (wm1.a(ag1Var.d(), ag1Var.c()) == 443) {
                                    ag1Var.f(4);
                                    int z = ag1Var.z();
                                    if (ag1Var.a() < z) {
                                        ag1Var.e(e);
                                    } else {
                                        ag1Var.f(z);
                                    }
                                }
                                while (true) {
                                    if (ag1Var.a() < 4) {
                                        break;
                                    }
                                    int a4 = wm1.a(ag1Var.d(), ag1Var.c());
                                    if (a4 == 442 || a4 == 441 || (a4 >>> 8) != 1) {
                                        break;
                                    }
                                    ag1Var.f(4);
                                    if (ag1Var.a() < 2) {
                                        ag1Var.e(e);
                                        break;
                                    }
                                    ag1Var.e(Math.min(ag1Var.e(), ag1Var.d() + ag1Var.z()));
                                }
                            }
                        }
                    }
                    i = ag1Var.d();
                }
            }
            if (j2 != -9223372036854775807L) {
                return jl.e.b(j2, a2 + i);
            }
            return jl.e.d;
        }
    }
}
