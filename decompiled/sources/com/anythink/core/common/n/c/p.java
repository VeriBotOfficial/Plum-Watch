package com.anythink.core.common.n.c;

/* loaded from: classes12.dex */
final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f4235a;
    private final c b;
    private s c;
    private int d;
    private boolean e;
    private long f;

    p(e eVar) {
        this.f4235a = eVar;
        c c = eVar.c();
        this.b = c;
        s sVar = c.b;
        this.c = sVar;
        this.d = sVar != null ? sVar.d : -1;
    }

    @Override // com.anythink.core.common.n.c.w
    public final long a_(c cVar, long j) {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        s sVar = this.c;
        if (sVar != null && (sVar != this.b.b || this.d != this.b.b.d)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        this.f4235a.b(this.f + j);
        if (this.c == null && this.b.b != null) {
            this.c = this.b.b;
            this.d = this.b.b.d;
        }
        long min = Math.min(j, this.b.c - this.f);
        if (min <= 0) {
            return -1L;
        }
        this.b.a(cVar, this.f, min);
        this.f += min;
        return min;
    }

    @Override // com.anythink.core.common.n.c.w
    public final x a() {
        return this.f4235a.a();
    }

    @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
