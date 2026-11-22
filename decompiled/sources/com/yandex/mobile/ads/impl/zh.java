package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
final class zh {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a, reason: collision with root package name */
    private final a f17519a;
    private final long[] b;
    private AudioTrack c;
    private int d;
    private int e;
    private yh f;
    private int g;
    private boolean h;
    private long i;
    private float j;
    private boolean k;
    private long l;
    private long m;
    private Method n;
    private long o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f17520q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public interface a {
        void a(int i, long j);

        void a(long j);

        void a(long j, long j2, long j3, long j4);

        void b(long j);

        void b(long j, long j2, long j3, long j4);
    }

    public zh(a aVar) {
        this.f17519a = (a) hg.a(aVar);
        if (f92.f15466a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    public final boolean f(long j) {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean d = d(j);
        this.p = d;
        if (z && !d && playState != 1) {
            this.f17519a.a(this.e, f92.b(this.i));
        }
        return true;
    }

    public final int b(long j) {
        return this.e - ((int) (j - (a() * this.d)));
    }

    public final boolean e(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public final void c(long j) {
        this.z = a();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public final boolean c() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
        if (this.x != -9223372036854775807L) {
            return false;
        }
        yh yhVar = this.f;
        yhVar.getClass();
        yhVar.f();
        return true;
    }

    public final boolean d(long j) {
        if (j > a()) {
            return true;
        }
        if (!this.h) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && a() == 0;
    }

    public final void d() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.k = false;
        this.c = null;
        this.f = null;
    }

    private long a(long j) {
        return (j * 1000000) / this.g;
    }

    public final boolean b() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final void e() {
        yh yhVar = this.f;
        yhVar.getClass();
        yhVar.f();
    }

    public final long a(boolean z) {
        long j;
        float f;
        long j2;
        long j3;
        long round;
        Method method;
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long a2 = a(a());
            if (a2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.m >= 30000) {
                    long[] jArr = this.b;
                    int i = this.v;
                    jArr[i] = a2 - nanoTime;
                    this.v = (i + 1) % 10;
                    int i2 = this.w;
                    if (i2 < 10) {
                        this.w = i2 + 1;
                    }
                    this.m = nanoTime;
                    this.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.w;
                        if (i3 >= i4) {
                            break;
                        }
                        this.l = (this.b[i3] / i4) + this.l;
                        i3++;
                    }
                }
                if (!this.h) {
                    yh yhVar = this.f;
                    yhVar.getClass();
                    if (yhVar.a(nanoTime)) {
                        long c = yhVar.c();
                        long b = yhVar.b();
                        if (Math.abs(c - nanoTime) > 5000000) {
                            this.f17519a.b(b, c, nanoTime, a2);
                            yhVar.e();
                        } else if (Math.abs(a(b) - a2) > 5000000) {
                            this.f17519a.a(b, c, nanoTime, a2);
                            yhVar.e();
                        } else {
                            yhVar.a();
                        }
                    }
                    if (this.f17520q && (method = this.n) != null && nanoTime - this.r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                            int i5 = f92.f15466a;
                            long intValue = (num.intValue() * 1000) - this.i;
                            this.o = intValue;
                            long max = Math.max(intValue, 0L);
                            this.o = max;
                            if (max > 5000000) {
                                this.f17519a.b(max);
                                this.o = 0L;
                            }
                        } catch (Exception unused) {
                            this.n = null;
                        }
                        this.r = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        yh yhVar2 = this.f;
        yhVar2.getClass();
        boolean d = yhVar2.d();
        if (d) {
            long a3 = a(yhVar2.b());
            long c2 = nanoTime2 - yhVar2.c();
            float f2 = this.j;
            int i6 = f92.f15466a;
            if (f2 != 1.0f) {
                c2 = Math.round(c2 * f2);
            }
            j = c2 + a3;
        } else {
            if (this.w == 0) {
                j = a(a());
            } else {
                j = this.l + nanoTime2;
            }
            if (!z) {
                j = Math.max(0L, j - this.o);
            }
        }
        if (this.D != d) {
            this.F = this.C;
            this.E = this.B;
        }
        long j4 = nanoTime2 - this.F;
        if (j4 < 1000000) {
            long j5 = this.E;
            float f3 = this.j;
            int i7 = f92.f15466a;
            if (f3 == 1.0f) {
                f = 1.0f;
                j2 = j;
                j3 = 1000000;
                round = j4;
            } else {
                f = 1.0f;
                j2 = j;
                j3 = 1000000;
                round = Math.round(j4 * f3);
            }
            long j6 = (j4 * 1000) / j3;
            j = (((1000 - j6) * (round + j5)) + (j2 * j6)) / 1000;
        } else {
            f = 1.0f;
        }
        if (!this.k) {
            long j7 = this.B;
            if (j > j7) {
                this.k = true;
                long b2 = f92.b(j - j7);
                float f4 = this.j;
                if (f4 != f) {
                    b2 = Math.round(b2 / f4);
                }
                this.f17519a.a(System.currentTimeMillis() - f92.b(b2));
            }
        }
        this.C = nanoTime2;
        this.B = j;
        this.D = d;
        return j;
    }

    private long a() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & BodyPartID.bodyIdMax;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (f92.f15466a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final void a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new yh(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && f92.f15466a < 23 && (i == 5 || i == 6);
        boolean e = f92.e(i);
        this.f17520q = e;
        this.i = e ? a(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public final void a(float f) {
        this.j = f;
        yh yhVar = this.f;
        if (yhVar != null) {
            yhVar.f();
        }
    }
}
