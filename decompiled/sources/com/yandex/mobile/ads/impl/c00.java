package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.DefaultLoadControl;

/* loaded from: classes5.dex */
public final class c00 implements cs0 {

    /* renamed from: a, reason: collision with root package name */
    private final dz f15148a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void b() {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        this.f15148a.d();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final dz c() {
        return this.f15148a;
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void d() {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        this.f15148a.d();
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final void f() {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
    }

    public c00() {
        this(new dz());
    }

    protected c00(dz dzVar) {
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f15148a = dzVar;
        long j = 50000;
        this.b = f92.a(j);
        this.c = f92.a(j);
        this.d = f92.a(2500);
        this.e = f92.a(5000);
        this.f = -1;
        this.j = 13107200;
        this.g = false;
        this.h = f92.a(0);
        this.i = false;
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final long e() {
        return this.h;
    }

    private static void a(int i, int i2, String str, String str2) {
        hg.a(str + " cannot be less than " + str2, i >= i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.cs0
    public final void a(yo1[] yo1VarArr, h70[] h70VarArr) {
        int i = this.f;
        if (i == -1) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < yo1VarArr.length) {
                    if (h70VarArr[i2] != null) {
                        switch (yo1VarArr[i2].m()) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i4 = DefaultLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
                                i3 += i4;
                                break;
                            case 1:
                                i3 += i4;
                                break;
                            case 2:
                                i4 = DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        this.j = i;
        this.f15148a.a(i);
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final boolean a() {
        return this.i;
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final boolean a(long j, float f) {
        boolean z = true;
        boolean z2 = this.f15148a.c() >= this.j;
        long j2 = this.b;
        if (f > 1.0f) {
            int i = f92.f15466a;
            if (f != 1.0f) {
                j2 = Math.round(j2 * f);
            }
            j2 = Math.min(j2, this.c);
        }
        if (j < Math.max(j2, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && j < 500000) {
                et0.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    @Override // com.yandex.mobile.ads.impl.cs0
    public final boolean a(long j, float f, boolean z, long j2) {
        int i = f92.f15466a;
        if (f != 1.0f) {
            j = Math.round(j / f);
        }
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        if (j3 <= 0 || j >= j3) {
            return true;
        }
        return !this.g && this.f15148a.c() >= this.j;
    }
}
