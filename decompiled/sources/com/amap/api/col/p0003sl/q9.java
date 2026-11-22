package com.amap.api.col.p0003sl;

/* compiled from: AMapRecallLogUpdateStrategy.java */
/* loaded from: classes11.dex */
public final class q9 extends mc {
    protected long b;
    private boolean c;
    private boolean d;
    private int e;
    private long f;

    public q9(boolean z, mc mcVar, long j, int i) {
        super(mcVar);
        this.d = false;
        this.c = z;
        this.f = j;
        this.e = i;
    }

    @Override // com.amap.api.col.p0003sl.mc
    public final int a() {
        return 320000;
    }

    public final void b(boolean z) {
        this.d = z;
    }

    @Override // com.amap.api.col.p0003sl.mc
    protected final boolean c() {
        if (this.d && this.f <= this.e) {
            return true;
        }
        if (!this.c || this.f >= this.e) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.b < 600000) {
            return false;
        }
        this.b = currentTimeMillis;
        return true;
    }

    public final long d() {
        return this.f;
    }

    public final void b(int i) {
        if (i <= 0) {
            return;
        }
        this.f += i;
    }
}
