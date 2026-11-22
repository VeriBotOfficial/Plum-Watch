package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.impl.hv0;
import com.yandex.mobile.ads.impl.iz;
import com.yandex.mobile.ads.impl.uh;
import com.yandex.mobile.ads.impl.wh;
import com.yandex.mobile.ads.impl.zh;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class hz implements wh {
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private uh[] K;
    private ByteBuffer[] L;
    private ByteBuffer M;
    private int N;
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private ji X;
    private boolean Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private final rh f15743a;
    private boolean a0;
    private final c b;
    private boolean b0;
    private final boolean c;
    private final ho d;
    private final h72 e;
    private final uh[] f;
    private final uh[] g;
    private final ir h;
    private final zh i;
    private final ArrayDeque<i> j;
    private final boolean k;
    private final int l;
    private l m;
    private final j<wh.b> n;
    private final j<wh.e> o;
    private final iz p;

    /* renamed from: q, reason: collision with root package name */
    private mi1 f15744q;
    private wh.c r;
    private f s;
    private f t;
    private AudioTrack u;
    private ph v;
    private i w;
    private i x;
    private bi1 y;
    private ByteBuffer z;

    final class a extends Thread {
        final /* synthetic */ AudioTrack b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                this.b.flush();
                this.b.release();
            } finally {
                hz.this.h.e();
            }
        }
    }

    public interface c {
    }

    interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final iz f15745a = new iz(new iz.a());
    }

    public static final class e {
        private g b;
        private boolean c;
        private boolean d;

        /* renamed from: a, reason: collision with root package name */
        private rh f15746a = rh.d;
        private int e = 0;
        iz f = d.f15745a;

        public final e b() {
            this.d = false;
            return this;
        }

        public final e c() {
            this.c = false;
            return this;
        }

        public final e d() {
            this.e = 0;
            return this;
        }

        public final hz a() {
            if (this.b == null) {
                this.b = new g(new uh[0], new jy1(0), new n12());
            }
            return new hz(this);
        }

        public final e a(rh rhVar) {
            rhVar.getClass();
            this.f15746a = rhVar;
            return this;
        }
    }

    public static final class h extends RuntimeException {
    }

    private static final class j<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f15750a;
        private long b;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void c() {
        if (f92.f15466a < 21) {
            throw new IllegalStateException();
        }
        if (!this.V) {
            throw new IllegalStateException();
        }
        if (this.Y) {
            return;
        }
        this.Y = true;
        flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r0 != 4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[LOOP:1: B:34:0x00d4->B:36:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9 A[EDGE_INSN: B:37:0x00e9->B:38:0x00e9 BREAK  A[LOOP:1: B:34:0x00d4->B:36:0x00d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(long r15) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hz.a(long):void");
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(jc0 jc0Var, int[] iArr) throws wh.a {
        uh[] uhVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int max;
        int i8;
        int i9;
        uh[] uhVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(jc0Var.m)) {
            if (f92.e(jc0Var.B)) {
                i2 = f92.b(jc0Var.B, jc0Var.z);
                int i10 = jc0Var.B;
                if (this.c && (i10 == 536870912 || i10 == 805306368 || i10 == 4)) {
                    uhVarArr2 = this.g;
                } else {
                    uhVarArr2 = this.f;
                }
                this.e.a(jc0Var.C, jc0Var.D);
                if (f92.f15466a < 21 && jc0Var.z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i11 = 0; i11 < 6; i11++) {
                        iArr2[i11] = i11;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.d.a(iArr2);
                uh.a aVar = new uh.a(jc0Var.A, jc0Var.z, jc0Var.B);
                for (uh uhVar : uhVarArr2) {
                    try {
                        uh.a a2 = uhVar.a(aVar);
                        if (uhVar.isActive()) {
                            aVar = a2;
                        }
                    } catch (uh.b e2) {
                        throw new wh.a(e2, jc0Var);
                    }
                }
                int i12 = aVar.c;
                int i13 = aVar.f17052a;
                int a3 = f92.a(aVar.b);
                uhVarArr = uhVarArr2;
                i3 = f92.b(i12, aVar.b);
                i4 = i13;
                i5 = i12;
                i6 = a3;
                i7 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            uh[] uhVarArr3 = new uh[0];
            int i14 = jc0Var.A;
            if (a(jc0Var, this.v)) {
                String str = jc0Var.m;
                str.getClass();
                int b2 = w01.b(str, jc0Var.j);
                uhVarArr = uhVarArr3;
                i2 = -1;
                i3 = -1;
                i4 = i14;
                i5 = b2;
                i6 = f92.a(jc0Var.z);
                i7 = 1;
            } else {
                Pair<Integer, Integer> a4 = this.f15743a.a(jc0Var);
                if (a4 != null) {
                    int intValue = ((Integer) a4.first).intValue();
                    int intValue2 = ((Integer) a4.second).intValue();
                    uhVarArr = uhVarArr3;
                    i2 = -1;
                    i3 = -1;
                    i4 = i14;
                    i5 = intValue;
                    i6 = intValue2;
                    i7 = 2;
                } else {
                    throw new wh.a("Unable to configure passthrough for: " + jc0Var, jc0Var);
                }
            }
        }
        iz izVar = this.p;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i6, i5);
        if (minBufferSize != -2) {
            double d2 = this.k ? 8.0d : 1.0d;
            izVar.getClass();
            if (i7 == 0) {
                long j2 = i4;
                long j3 = 250000 * j2;
                long j4 = i3;
                int a5 = hq0.a((j3 * j4) / 1000000);
                int a6 = hq0.a(((750000 * j2) * j4) / 1000000);
                int i15 = f92.f15466a;
                max = Math.max(a5, Math.min(minBufferSize * 4, a6));
            } else if (i7 == 1) {
                switch (i5) {
                    case 5:
                        i8 = 80000;
                        break;
                    case 6:
                    case 18:
                        i8 = 768000;
                        break;
                    case 7:
                        i8 = 192000;
                        break;
                    case 8:
                        i8 = 2250000;
                        break;
                    case 9:
                        i8 = 40000;
                        break;
                    case 10:
                        i8 = 100000;
                        break;
                    case 11:
                        i8 = 16000;
                        break;
                    case 12:
                        i8 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i8 = 3062500;
                        break;
                    case 15:
                        i8 = 8000;
                        break;
                    case 16:
                        i8 = 256000;
                        break;
                    case 17:
                        i8 = 336000;
                        break;
                }
                max = hq0.a((50000000 * i8) / 1000000);
            } else if (i7 == 2) {
                int i16 = i5 == 5 ? 500000 : 250000;
                switch (i5) {
                    case 5:
                        i9 = 80000;
                        break;
                    case 6:
                    case 18:
                        i9 = 768000;
                        break;
                    case 7:
                        i9 = 192000;
                        break;
                    case 8:
                        i9 = 2250000;
                        break;
                    case 9:
                        i9 = 40000;
                        break;
                    case 10:
                        i9 = 100000;
                        break;
                    case 11:
                        i9 = 16000;
                        break;
                    case 12:
                        i9 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i9 = 3062500;
                        break;
                    case 15:
                        i9 = 8000;
                        break;
                    case 16:
                        i9 = 256000;
                        break;
                    case 17:
                        i9 = 336000;
                        break;
                }
                max = hq0.a((i16 * i9) / 1000000);
            } else {
                throw new IllegalArgumentException();
            }
            int max2 = (((Math.max(minBufferSize, (int) (max * d2)) + i3) - 1) / i3) * i3;
            if (i5 == 0) {
                throw new wh.a("Invalid output encoding (mode=" + i7 + ") for: " + jc0Var, jc0Var);
            }
            if (i6 != 0) {
                this.a0 = false;
                f fVar = new f(jc0Var, i2, i7, i3, i4, i6, i5, max2, uhVarArr);
                if (l()) {
                    this.s = fVar;
                    return;
                } else {
                    this.t = fVar;
                    return;
                }
            }
            throw new wh.a("Invalid output channel config (mode=" + i7 + ") for: " + jc0Var, jc0Var);
        }
        throw new IllegalStateException();
    }

    public static class g implements c {

        /* renamed from: a, reason: collision with root package name */
        private final uh[] f15748a;
        private final jy1 b;
        private final n12 c;

        public g(uh[] uhVarArr, jy1 jy1Var, n12 n12Var) {
            uh[] uhVarArr2 = new uh[uhVarArr.length + 2];
            this.f15748a = uhVarArr2;
            System.arraycopy(uhVarArr, 0, uhVarArr2, 0, uhVarArr.length);
            this.b = jy1Var;
            this.c = n12Var;
            uhVarArr2[uhVarArr.length] = jy1Var;
            uhVarArr2[uhVarArr.length + 1] = n12Var;
        }

        public final uh[] a() {
            return this.f15748a;
        }
    }

    @RequiresNonNull({"#1.audioProcessorChain"})
    private hz(e eVar) {
        this.f15743a = eVar.f15746a;
        g gVar = eVar.b;
        this.b = gVar;
        int i2 = f92.f15466a;
        this.c = i2 >= 21 && eVar.c;
        this.k = i2 >= 23 && eVar.d;
        this.l = i2 >= 29 ? eVar.e : 0;
        this.p = eVar.f;
        ir irVar = new ir(0);
        this.h = irVar;
        irVar.e();
        this.i = new zh(new k());
        ho hoVar = new ho();
        this.d = hoVar;
        h72 h72Var = new h72();
        this.e = h72Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new tq1(), hoVar, h72Var);
        Collections.addAll(arrayList, gVar.a());
        this.f = (uh[]) arrayList.toArray(new uh[0]);
        this.g = new uh[]{new cc0()};
        this.J = 1.0f;
        this.v = ph.h;
        this.W = 0;
        this.X = new ji();
        bi1 bi1Var = bi1.e;
        this.x = new i(bi1Var, false, 0L, 0L);
        this.y = bi1Var;
        this.R = -1;
        this.K = new uh[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque<>();
        this.n = new j<>();
        this.o = new j<>();
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final int b(jc0 jc0Var) {
        if (!"audio/raw".equals(jc0Var.m)) {
            return ((this.a0 || !a(jc0Var, this.v)) && this.f15743a.a(jc0Var) == null) ? 0 : 2;
        }
        if (!f92.e(jc0Var.B)) {
            et0.d("DefaultAudioSink", "Invalid PCM encoding: " + jc0Var.B);
            return 0;
        }
        int i2 = jc0Var.B;
        return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final long a(boolean z) {
        long j2;
        if (!l() || this.H) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.i.a(z), (j() * 1000000) / this.t.e);
        while (!this.j.isEmpty() && min >= this.j.getFirst().d) {
            this.x = this.j.remove();
        }
        i iVar = this.x;
        long j3 = min - iVar.d;
        if (iVar.f15749a.equals(bi1.e)) {
            j2 = this.x.c + j3;
        } else if (this.j.isEmpty()) {
            j2 = ((g) this.b).c.a(j3) + this.x.c;
        } else {
            i first = this.j.getFirst();
            long j4 = first.d - min;
            float f2 = this.x.f15749a.b;
            int i2 = f92.f15466a;
            if (f2 != 1.0f) {
                j4 = Math.round(j4 * f2);
            }
            j2 = first.c - j4;
        }
        return ((((g) this.b).b.i() * 1000000) / this.t.e) + j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean k() throws com.yandex.mobile.ads.impl.wh.b {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hz.k():boolean");
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void play() {
        this.U = true;
        if (l()) {
            this.i.e();
            this.u.play();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void g() {
        this.G = true;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void d() throws wh.e {
        if (!this.S && l() && h()) {
            if (!this.T) {
                this.T = true;
                this.i.c(j());
                this.u.stop();
                this.A = 0;
            }
            this.S = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h() throws com.yandex.mobile.ads.impl.wh.e {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            com.yandex.mobile.ads.impl.uh[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.b(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hz.h():boolean");
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final boolean e() {
        return l() && this.i.d(j());
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final bi1 getPlaybackParameters() {
        if (this.k) {
            return this.y;
        }
        return i().f15749a;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void f() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void setVolume(float f2) {
        if (this.J != f2) {
            this.J = f2;
            if (l()) {
                if (f92.f15466a >= 21) {
                    this.u.setVolume(this.J);
                    return;
                }
                AudioTrack audioTrack = this.u;
                float f3 = this.J;
                audioTrack.setStereoVolume(f3, f3);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void pause() {
        this.U = false;
        if (l() && this.i.c()) {
            this.u.pause();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void flush() {
        if (l()) {
            m();
            if (this.i.b()) {
                this.u.pause();
            }
            if (a(this.u)) {
                l lVar = this.m;
                lVar.getClass();
                lVar.b(this.u);
            }
            AudioTrack audioTrack = this.u;
            this.u = null;
            if (f92.f15466a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.s;
            if (fVar != null) {
                this.t = fVar;
                this.s = null;
            }
            this.i.d();
            this.h.c();
            new a(audioTrack).start();
        }
        ((j) this.o).f15750a = null;
        ((j) this.n).f15750a = null;
    }

    private void m() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i2 = 0;
        this.b0 = false;
        this.F = 0;
        this.x = new i(i().f15749a, i().b, 0L, 0L);
        this.I = 0L;
        this.w = null;
        this.j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.z = null;
        this.A = 0;
        this.e.j();
        while (true) {
            uh[] uhVarArr = this.K;
            if (i2 >= uhVarArr.length) {
                return;
            }
            uh uhVar = uhVarArr[i2];
            uhVar.flush();
            this.L[i2] = uhVar.c();
            i2++;
        }
    }

    private i i() {
        i iVar = this.w;
        if (iVar != null) {
            return iVar;
        }
        if (!this.j.isEmpty()) {
            return this.j.getLast();
        }
        return this.x;
    }

    private boolean l() {
        return this.u != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        if (this.t.c == 0) {
            return this.D / r0.d;
        }
        return this.E;
    }

    private void b(long j2) throws wh.e {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.L[i2 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = uh.f17051a;
                }
            }
            if (i2 == length) {
                a(byteBuffer, j2);
            } else {
                uh uhVar = this.K[i2];
                if (i2 > this.R) {
                    uhVar.a(byteBuffer);
                }
                ByteBuffer c2 = uhVar.c();
                this.L[i2] = c2;
                if (c2.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0275 A[RETURN] */
    @Override // com.yandex.mobile.ads.impl.wh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.nio.ByteBuffer r20, long r21, int r23) throws com.yandex.mobile.ads.impl.wh.b, com.yandex.mobile.ads.impl.wh.e {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hz.a(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class l {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15752a = new Handler();
        private final AudioTrack.StreamEventCallback b = new a();

        final class a extends AudioTrack.StreamEventCallback {
            a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i) {
                hz hzVar = hz.this;
                if (audioTrack == hzVar.u) {
                    wh.c cVar = hzVar.r;
                    if (cVar == null || !hzVar.U) {
                        return;
                    }
                    ((hv0.a) cVar).a();
                    return;
                }
                throw new IllegalStateException();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                hz hzVar = hz.this;
                if (audioTrack == hzVar.u) {
                    wh.c cVar = hzVar.r;
                    if (cVar == null || !hzVar.U) {
                        return;
                    }
                    ((hv0.a) cVar).a();
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public l() {
        }

        public final void a(AudioTrack audioTrack) {
            final Handler handler = this.f15752a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: com.yandex.mobile.ads.impl.hz$l$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.b);
        }

        public final void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.f15752a.removeCallbacksAndMessages(null);
        }
    }

    private static final class i {

        /* renamed from: a, reason: collision with root package name */
        public final bi1 f15749a;
        public final boolean b;
        public final long c;
        public final long d;

        private i(bi1 bi1Var, boolean z, long j, long j2) {
            this.f15749a = bi1Var;
            this.b = z;
            this.c = j;
            this.d = j2;
        }
    }

    private final class k implements zh.a {
        private k() {
        }

        @Override // com.yandex.mobile.ads.impl.zh.a
        public final void b(long j, long j2, long j3, long j4) {
            long j5;
            StringBuilder append = new StringBuilder("Spurious audio timestamp (system clock mismatch): ").append(j).append(", ").append(j2).append(", ").append(j3).append(", ").append(j4).append(", ");
            hz hzVar = hz.this;
            if (hzVar.t.c == 0) {
                j5 = hzVar.B / r6.b;
            } else {
                j5 = hzVar.C;
            }
            et0.d("DefaultAudioSink", append.append(j5).append(", ").append(hz.this.j()).toString());
        }

        @Override // com.yandex.mobile.ads.impl.zh.a
        public final void b(long j) {
            et0.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // com.yandex.mobile.ads.impl.zh.a
        public final void a(long j) {
            wh.c cVar = hz.this.r;
            if (cVar != null) {
                ((hv0.a) cVar).a(j);
            }
        }

        @Override // com.yandex.mobile.ads.impl.zh.a
        public final void a(long j, long j2, long j3, long j4) {
            long j5;
            StringBuilder append = new StringBuilder("Spurious audio timestamp (frame position mismatch): ").append(j).append(", ").append(j2).append(", ").append(j3).append(", ").append(j4).append(", ");
            hz hzVar = hz.this;
            if (hzVar.t.c == 0) {
                j5 = hzVar.B / r6.b;
            } else {
                j5 = hzVar.C;
            }
            et0.d("DefaultAudioSink", append.append(j5).append(", ").append(hz.this.j()).toString());
        }

        @Override // com.yandex.mobile.ads.impl.zh.a
        public final void a(int i, long j) {
            if (hz.this.r != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                hz hzVar = hz.this;
                ((hv0.a) hzVar.r).a(i, j, elapsedRealtime - hzVar.Z);
            }
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final jc0 f15747a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final uh[] i;

        private AudioTrack b(boolean z, ph phVar, int i) {
            int i2 = f92.f15466a;
            if (i2 >= 29) {
                return new AudioTrack.Builder().setAudioAttributes(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : phVar.a().f16563a).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build()).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            }
            if (i2 < 21) {
                int c = f92.c(phVar.d);
                return i == 0 ? new AudioTrack(c, this.e, this.f, this.g, this.h, 1) : new AudioTrack(c, this.e, this.f, this.g, this.h, 1, i);
            }
            return new AudioTrack(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : phVar.a().f16563a, new AudioFormat.Builder().setSampleRate(this.e).setChannelMask(this.f).setEncoding(this.g).build(), this.h, 1, i);
        }

        public f(jc0 jc0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, uh[] uhVarArr) {
            this.f15747a = jc0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = uhVarArr;
        }

        public final AudioTrack a(boolean z, ph phVar, int i) throws wh.b {
            try {
                AudioTrack b = b(z, phVar, i);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                throw new wh.b(state, this.e, this.f, this.h, this.f15747a, this.c == 1, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new wh.b(0, this.e, this.f, this.h, this.f15747a, this.c == 1, e);
            }
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, mi1 mi1Var) {
            LogSessionId a2 = mi1Var.a();
            if (a2.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void b() {
        flush();
        for (uh uhVar : this.f) {
            uhVar.b();
        }
        for (uh uhVar2 : this.g) {
            uhVar2.b();
        }
        this.U = false;
        this.a0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final boolean a() {
        if (l()) {
            return this.S && !e();
        }
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(ph phVar) {
        if (this.v.equals(phVar)) {
            return;
        }
        this.v = phVar;
        if (this.Y) {
            return;
        }
        flush();
    }

    private void b(bi1 bi1Var) {
        if (l()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(bi1Var.b).setPitch(bi1Var.c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                et0.b("DefaultAudioSink", "Failed to set playback params", e2);
            }
            bi1Var = new bi1(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            this.i.a(bi1Var.b);
        }
        this.y = bi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void b(boolean z) {
        bi1 bi1Var = i().f15749a;
        i i2 = i();
        if (bi1Var.equals(i2.f15749a) && z == i2.b) {
            return;
        }
        i iVar = new i(bi1Var, z, -9223372036854775807L, -9223372036854775807L);
        if (l()) {
            this.w = iVar;
        } else {
            this.x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(int i2) {
        if (this.W != i2) {
            this.W = i2;
            this.V = i2 != 0;
            flush();
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(ji jiVar) {
        if (this.X.equals(jiVar)) {
            return;
        }
        int i2 = jiVar.f15911a;
        float f2 = jiVar.b;
        AudioTrack audioTrack = this.u;
        if (audioTrack != null) {
            if (this.X.f15911a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.u.setAuxEffectSendLevel(f2);
            }
        }
        this.X = jiVar;
    }

    public final void a(wh.c cVar) {
        this.r = cVar;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(bi1 bi1Var) {
        float f2 = bi1Var.b;
        int i2 = f92.f15466a;
        bi1 bi1Var2 = new bi1(Math.max(0.1f, Math.min(f2, 8.0f)), Math.max(0.1f, Math.min(bi1Var.c, 8.0f)));
        if (this.k && f92.f15466a >= 23) {
            b(bi1Var2);
            return;
        }
        boolean z = i().b;
        i i3 = i();
        if (bi1Var2.equals(i3.f15749a) && z == i3.b) {
            return;
        }
        i iVar = new i(bi1Var2, z, -9223372036854775807L, -9223372036854775807L);
        if (l()) {
            this.w = iVar;
        } else {
            this.x = iVar;
        }
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final void a(mi1 mi1Var) {
        this.f15744q = mi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.wh
    public final boolean a(jc0 jc0Var) {
        return b(jc0Var) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00d6, code lost:
    
        if (r13 < r12) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.nio.ByteBuffer r12, long r13) throws com.yandex.mobile.ads.impl.wh.e {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hz.a(java.nio.ByteBuffer, long):void");
    }

    private boolean a(jc0 jc0Var, ph phVar) {
        int a2;
        int i2;
        int i3 = f92.f15466a;
        if (i3 >= 29 && this.l != 0) {
            String str = jc0Var.m;
            str.getClass();
            int b2 = w01.b(str, jc0Var.j);
            if (b2 == 0 || (a2 = f92.a(jc0Var.z)) == 0) {
                return false;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(jc0Var.A).setChannelMask(a2).setEncoding(b2).build();
            AudioAttributes audioAttributes = phVar.a().f16563a;
            if (i3 >= 31) {
                i2 = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
            } else if (AudioManager.isOffloadedPlaybackSupported(build, audioAttributes)) {
                i2 = (i3 == 30 && f92.d.startsWith("Pixel")) ? 2 : 1;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    return ((jc0Var.C != 0 || jc0Var.D != 0) && (this.l == 1)) ? false : true;
                }
                if (i2 == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    private static boolean a(AudioTrack audioTrack) {
        return f92.f15466a >= 29 && audioTrack.isOffloadedPlayback();
    }
}
