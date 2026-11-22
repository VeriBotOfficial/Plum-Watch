package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.yandex.mobile.ads.impl.ex1;

/* loaded from: classes5.dex */
final class al0 implements hx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f15016a;
    private final gt0 b;
    private final gt0 c;
    private long d;

    @Override // com.yandex.mobile.ads.impl.ex1
    public final boolean b() {
        return true;
    }

    public al0(long j, long j2, long j3) {
        this.d = j;
        this.f15016a = j3;
        gt0 gt0Var = new gt0();
        this.b = gt0Var;
        gt0 gt0Var2 = new gt0();
        this.c = gt0Var2;
        gt0Var.a(0L);
        gt0Var2.a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a() {
        return this.f15016a;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final long c() {
        return this.d;
    }

    @Override // com.yandex.mobile.ads.impl.ex1
    public final ex1.a b(long j) {
        int a2 = f92.a(this.b, j);
        long a3 = this.b.a(a2);
        gx1 gx1Var = new gx1(a3, this.c.a(a2));
        if (a3 != j && a2 != this.b.a() - 1) {
            int i = a2 + 1;
            return new ex1.a(gx1Var, new gx1(this.b.a(i), this.c.a(i)));
        }
        return new ex1.a(gx1Var, gx1Var);
    }

    @Override // com.yandex.mobile.ads.impl.hx1
    public final long a(long j) {
        return this.b.a(f92.a(this.c, j));
    }

    final void d(long j) {
        this.d = j;
    }

    public final boolean c(long j) {
        gt0 gt0Var = this.b;
        return j - gt0Var.a(gt0Var.a() - 1) < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    public final void a(long j, long j2) {
        if (c(j)) {
            return;
        }
        this.b.a(j);
        this.c.a(j2);
    }
}
