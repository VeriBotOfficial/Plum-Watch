package com.tencent.open.utils;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private long f13681a;

    public n(long j) {
        this.f13681a = j;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof n) && this.f13681a == ((n) obj).b();
    }

    public byte[] a() {
        long j = this.f13681a;
        return new byte[]{(byte) (255 & j), (byte) ((65280 & j) >> 8), (byte) ((16711680 & j) >> 16), (byte) ((j & 4278190080L) >> 24)};
    }

    public long b() {
        return this.f13681a;
    }

    public int hashCode() {
        return (int) this.f13681a;
    }
}
