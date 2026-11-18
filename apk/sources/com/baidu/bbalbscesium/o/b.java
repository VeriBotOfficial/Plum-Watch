package com.baidu.bbalbscesium.o;

/* JADX INFO: loaded from: classes16.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f7441a;

    public b() {
        this(0L);
    }

    public b(long j) {
        this.f7441a = j;
    }

    public long a() {
        return this.f7441a;
    }

    public long a(long j) {
        return j & this.f7441a;
    }

    public boolean a(long j, long j2) {
        long j3 = this.f7441a;
        long j4 = (j & j2) | ((~j2) & j3);
        this.f7441a = j4;
        return (j4 ^ j3) != 0;
    }

    public void b(long j) {
        this.f7441a = j;
    }
}
