package com.anythink.basead.exoplayer.b;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.k.af;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes11.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2387a = 1;
    private static final int b = 2;
    private static final int c = 3;
    private static final long d = 5000000;
    private static final long e = 5000000;
    private static final long f = 200;
    private static final int g = 10;
    private static final int h = 30000;
    private static final int i = 500000;
    private long A;
    private long B;
    private int C;
    private int D;
    private long E;
    private long F;
    private long G;
    private long H;
    private final a j;
    private final long[] k;
    private AudioTrack l;
    private int m;
    private int n;
    private i o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f2388q;
    private long r;
    private long s;
    private long t;
    private Method u;
    private long v;
    private boolean w;
    private boolean x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j, long j2, long j3, long j4);
    }

    @Retention(RetentionPolicy.SOURCE)
    private @interface b {
    }

    public j(a aVar) {
        this.j = (a) com.anythink.basead.exoplayer.k.a.a(aVar);
        if (af.f2668a >= 18) {
            try {
                this.u = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.k = new long[10];
    }

    public final void a(AudioTrack audioTrack, int i2, int i3, int i4) {
        this.l = audioTrack;
        this.m = i3;
        this.n = i4;
        this.o = new i(audioTrack);
        this.p = audioTrack.getSampleRate();
        this.f2388q = af.f2668a < 23 && (i2 == 5 || i2 == 6);
        boolean b2 = af.b(i2);
        this.x = b2;
        this.r = b2 ? g(i4 / i3) : -9223372036854775807L;
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.w = false;
        this.E = -9223372036854775807L;
        this.F = -9223372036854775807L;
        this.v = 0L;
    }

    public final long a(boolean z) {
        long j;
        if (this.l.getPlayState() == 3) {
            long h2 = h();
            if (h2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.t >= 30000) {
                    long[] jArr = this.k;
                    int i2 = this.C;
                    jArr[i2] = h2 - nanoTime;
                    this.C = (i2 + 1) % 10;
                    int i3 = this.D;
                    if (i3 < 10) {
                        this.D = i3 + 1;
                    }
                    this.t = nanoTime;
                    this.s = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.D;
                        if (i4 >= i5) {
                            break;
                        }
                        this.s += this.k[i4] / i5;
                        i4++;
                    }
                }
                if (!this.f2388q) {
                    if (this.o.a(nanoTime)) {
                        long f2 = this.o.f();
                        long g2 = this.o.g();
                        if (Math.abs(f2 - nanoTime) > 5000000) {
                            this.j.b(g2, f2, nanoTime, h2);
                            this.o.a();
                        } else if (Math.abs(g(g2) - h2) > 5000000) {
                            this.j.a(g2, f2, nanoTime, h2);
                            this.o.a();
                        } else {
                            this.o.b();
                        }
                    }
                    f(nanoTime);
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.o.c()) {
            long g3 = g(this.o.g());
            return !this.o.d() ? g3 : g3 + (nanoTime2 - this.o.f());
        }
        if (this.D == 0) {
            j = h();
        } else {
            j = nanoTime2 + this.s;
        }
        return !z ? j - this.v : j;
    }

    public final void a() {
        this.o.e();
    }

    public final boolean b() {
        return this.l.getPlayState() == 3;
    }

    public final boolean a(long j) {
        a aVar;
        int playState = this.l.getPlayState();
        if (this.f2388q) {
            if (playState == 2) {
                this.w = false;
                return false;
            }
            if (playState == 1 && i() == 0) {
                return false;
            }
        }
        boolean z = this.w;
        boolean e2 = e(j);
        this.w = e2;
        if (z && !e2 && playState != 1 && (aVar = this.j) != null) {
            aVar.a(this.n, com.anythink.basead.exoplayer.b.a(this.r));
        }
        return true;
    }

    public final int b(long j) {
        return this.n - ((int) (j - (i() * this.m)));
    }

    public final boolean c(long j) {
        return this.F != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.F >= 200;
    }

    public final void d(long j) {
        this.G = i();
        this.E = SystemClock.elapsedRealtime() * 1000;
        this.H = j;
    }

    public final boolean e(long j) {
        return j > i() || g();
    }

    public final boolean c() {
        f();
        if (this.E != -9223372036854775807L) {
            return false;
        }
        this.o.e();
        return true;
    }

    public final void d() {
        f();
        this.l = null;
        this.o = null;
    }

    private void e() {
        long h2 = h();
        if (h2 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.t >= 30000) {
            long[] jArr = this.k;
            int i2 = this.C;
            jArr[i2] = h2 - nanoTime;
            this.C = (i2 + 1) % 10;
            int i3 = this.D;
            if (i3 < 10) {
                this.D = i3 + 1;
            }
            this.t = nanoTime;
            this.s = 0L;
            int i4 = 0;
            while (true) {
                int i5 = this.D;
                if (i4 >= i5) {
                    break;
                }
                this.s += this.k[i4] / i5;
                i4++;
            }
        }
        if (this.f2388q) {
            return;
        }
        if (this.o.a(nanoTime)) {
            long f2 = this.o.f();
            long g2 = this.o.g();
            if (Math.abs(f2 - nanoTime) > 5000000) {
                this.j.b(g2, f2, nanoTime, h2);
                this.o.a();
            } else if (Math.abs(g(g2) - h2) > 5000000) {
                this.j.a(g2, f2, nanoTime, h2);
                this.o.a();
            } else {
                this.o.b();
            }
        }
        f(nanoTime);
    }

    private void a(long j, long j2) {
        if (this.o.a(j)) {
            long f2 = this.o.f();
            long g2 = this.o.g();
            if (Math.abs(f2 - j) > 5000000) {
                this.j.b(g2, f2, j, j2);
                this.o.a();
            } else if (Math.abs(g(g2) - j2) > 5000000) {
                this.j.a(g2, f2, j, j2);
                this.o.a();
            } else {
                this.o.b();
            }
        }
    }

    private void f(long j) {
        Method method;
        if (!this.x || (method = this.u) == null || j - this.y < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) method.invoke(this.l, null)).intValue() * 1000) - this.r;
            this.v = intValue;
            long max = Math.max(intValue, 0L);
            this.v = max;
            if (max > 5000000) {
                this.j.a(max);
                this.v = 0L;
            }
        } catch (Exception unused) {
            this.u = null;
        }
        this.y = j;
    }

    private long g(long j) {
        return (j * 1000000) / this.p;
    }

    private void f() {
        this.s = 0L;
        this.D = 0;
        this.C = 0;
        this.t = 0L;
    }

    private boolean g() {
        return this.f2388q && this.l.getPlayState() == 2 && i() == 0;
    }

    private static boolean a(int i2) {
        if (af.f2668a < 23) {
            return i2 == 5 || i2 == 6;
        }
        return false;
    }

    private long h() {
        return g(i());
    }

    private long i() {
        if (this.E != -9223372036854775807L) {
            return Math.min(this.H, this.G + ((((SystemClock.elapsedRealtime() * 1000) - this.E) * this.p) / 1000000));
        }
        int playState = this.l.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.l.getPlaybackHeadPosition() & BodyPartID.bodyIdMax;
        if (this.f2388q) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.B = this.z;
            }
            playbackHeadPosition += this.B;
        }
        if (af.f2668a <= 28) {
            if (playbackHeadPosition == 0 && this.z > 0 && playState == 3) {
                if (this.F == -9223372036854775807L) {
                    this.F = SystemClock.elapsedRealtime();
                }
                return this.z;
            }
            this.F = -9223372036854775807L;
        }
        if (this.z > playbackHeadPosition) {
            this.A++;
        }
        this.z = playbackHeadPosition;
        return playbackHeadPosition + (this.A << 32);
    }
}
