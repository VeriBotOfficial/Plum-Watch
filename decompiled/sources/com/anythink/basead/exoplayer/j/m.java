package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import com.anythink.basead.exoplayer.j.d;

/* loaded from: classes11.dex */
public final class m implements aa<Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2641a = 1000000;
    public static final int b = 2000;
    private static final int c = 2000;
    private static final int d = 524288;
    private final Handler e;
    private final d.a f;
    private final com.anythink.basead.exoplayer.k.y g;
    private final com.anythink.basead.exoplayer.k.c h;
    private int i;
    private long j;
    private long k;
    private long l;
    private long m;
    private long n;

    /* synthetic */ m(Handler handler, d.a aVar, long j, int i, com.anythink.basead.exoplayer.k.c cVar, byte b2) {
        this(handler, aVar, j, i, cVar);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f2643a;
        private d.a b;
        private long c = 1000000;
        private int d = 2000;
        private com.anythink.basead.exoplayer.k.c e = com.anythink.basead.exoplayer.k.c.f2673a;

        private a a(Handler handler, d.a aVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || aVar == null) ? false : true);
            this.f2643a = handler;
            this.b = aVar;
            return this;
        }

        private a a(int i) {
            this.d = i;
            return this;
        }

        private a a(long j) {
            this.c = j;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.c cVar) {
            this.e = cVar;
            return this;
        }

        private m a() {
            return new m(this.f2643a, this.b, this.c, this.d, this.e, (byte) 0);
        }
    }

    public m() {
        this(null, null, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f2673a);
    }

    @Deprecated
    private m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f2673a);
    }

    @Deprecated
    private m(Handler handler, d.a aVar, int i) {
        this(handler, aVar, 1000000L, i, com.anythink.basead.exoplayer.k.c.f2673a);
    }

    private m(Handler handler, d.a aVar, long j, int i, com.anythink.basead.exoplayer.k.c cVar) {
        this.e = handler;
        this.f = aVar;
        this.g = new com.anythink.basead.exoplayer.k.y(i);
        this.h = cVar;
        this.n = j;
    }

    @Override // com.anythink.basead.exoplayer.j.d
    public final synchronized long a() {
        return this.n;
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void b() {
        if (this.i == 0) {
            this.j = this.h.a();
        }
        this.i++;
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void a(int i) {
        this.k += i;
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void c() {
        m mVar;
        try {
            try {
                com.anythink.basead.exoplayer.k.a.b(this.i > 0);
                long a2 = this.h.a();
                int i = (int) (a2 - this.j);
                this.l += i;
                long j = this.m;
                long j2 = this.k;
                this.m = j + j2;
                if (i > 0) {
                    this.g.a((int) Math.sqrt(j2), (8000 * j2) / r6);
                    if (this.l >= 2000 || this.m >= 524288) {
                        this.n = (long) this.g.a();
                    }
                }
                long j3 = this.k;
                long j4 = this.n;
                Handler handler = this.e;
                if (handler == null || this.f == null) {
                    mVar = this;
                } else {
                    mVar = this;
                    handler.post(mVar.new AnonymousClass1(i, j3, j4));
                }
                int i2 = mVar.i - 1;
                mVar.i = i2;
                if (i2 > 0) {
                    mVar.j = a2;
                }
                mVar.k = 0L;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.j.m$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f2642a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        AnonymousClass1(int i, long j, long j2) {
            this.f2642a = i;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.f.c();
        }
    }

    private void a(int i, long j, long j2) {
        Handler handler = this.e;
        if (handler == null || this.f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i, j, j2));
    }
}
