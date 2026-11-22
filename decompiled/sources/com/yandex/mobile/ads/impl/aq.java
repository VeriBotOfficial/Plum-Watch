package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
public final class aq implements m52 {

    /* renamed from: a, reason: collision with root package name */
    private long f15032a;
    private long b;

    public final long a() {
        return this.f15032a;
    }

    public final void b() {
        this.f15032a += this.b;
        this.b = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.m52
    public final void a(long j, long j2) {
        this.b = j2;
    }
}
