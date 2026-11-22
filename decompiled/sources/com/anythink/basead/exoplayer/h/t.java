package com.anythink.basead.exoplayer.h;

import android.os.Handler;
import android.os.Looper;
import com.anythink.basead.exoplayer.h.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes11.dex */
public interface t {
    void a(int i, s.a aVar);

    void a(int i, s.a aVar, b bVar, c cVar);

    void a(int i, s.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i, s.a aVar, c cVar);

    void b(int i, s.a aVar);

    void b(int i, s.a aVar, b bVar, c cVar);

    void b(int i, s.a aVar, c cVar);

    void c(int i, s.a aVar);

    void c(int i, s.a aVar, b bVar, c cVar);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.basead.exoplayer.j.k f2588a;
        public final long b;
        public final long c;
        public final long d;

        public b(com.anythink.basead.exoplayer.j.k kVar, long j, long j2, long j3) {
            this.f2588a = kVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2589a;
        public final int b;
        public final com.anythink.basead.exoplayer.m c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, com.anythink.basead.exoplayer.m mVar, int i3, Object obj, long j, long j2) {
            this.f2589a = i;
            this.b = i2;
            this.c = mVar;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2577a;
        public final s.a b;
        private final CopyOnWriteArrayList<C0145a> c;
        private final long d;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0145a> copyOnWriteArrayList, int i, s.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.f2577a = i;
            this.b = aVar;
            this.d = j;
        }

        public final a a(int i, s.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public final void a(Handler handler, t tVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || tVar == null) ? false : true);
            this.c.add(new C0145a(handler, tVar));
        }

        public final void a(t tVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                if (next.b == tVar) {
                    this.c.remove(next);
                }
            }
        }

        public final void a() {
            com.anythink.basead.exoplayer.k.a.b(this.b != null);
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.a(a.this.f2577a, a.this.b);
                    }
                });
            }
        }

        public final void b() {
            com.anythink.basead.exoplayer.k.a.b(this.b != null);
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.b(a.this.f2577a, a.this.b);
                    }
                });
            }
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j) {
            a(kVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i2, com.anythink.basead.exoplayer.m mVar, int i3, Object obj, long j, long j2, long j3) {
            a(new b(kVar, j3, 0L, 0L), new c(i, i2, mVar, i3, obj, a(j), a(j2)));
        }

        public final void a(final b bVar, final c cVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.a(a.this.f2577a, a.this.b, bVar, cVar);
                    }
                });
            }
        }

        private void a(com.anythink.basead.exoplayer.j.k kVar, int i, long j, long j2, long j3) {
            a(kVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i2, com.anythink.basead.exoplayer.m mVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b(new b(kVar, j3, j4, j5), new c(i, i2, mVar, i3, obj, a(j), a(j2)));
        }

        public final void b(final b bVar, final c cVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.b(a.this.f2577a, a.this.b, bVar, cVar);
                    }
                });
            }
        }

        private void b(com.anythink.basead.exoplayer.j.k kVar, int i, long j, long j2, long j3) {
            b(kVar, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void b(com.anythink.basead.exoplayer.j.k kVar, int i, int i2, com.anythink.basead.exoplayer.m mVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            c(new b(kVar, j3, j4, j5), new c(i, i2, mVar, i3, obj, a(j), a(j2)));
        }

        public final void c(final b bVar, final c cVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.c(a.this.f2577a, a.this.b, bVar, cVar);
                    }
                });
            }
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, IOException iOException) {
            a(kVar, 6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, -1L, 0L, 0L, iOException, true);
        }

        public final void a(com.anythink.basead.exoplayer.j.k kVar, int i, int i2, com.anythink.basead.exoplayer.m mVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            a(new b(kVar, j3, j4, j5), new c(i, i2, mVar, i3, obj, a(j), a(j2)), iOException, z);
        }

        public final void a(final b bVar, final c cVar, final IOException iOException, final boolean z) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.a(a.this.f2577a, a.this.b, bVar, cVar, iOException, z);
                    }
                });
            }
        }

        public final void c() {
            com.anythink.basead.exoplayer.k.a.b(this.b != null);
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.c(a.this.f2577a, a.this.b);
                    }
                });
            }
        }

        public final void a(int i, long j, long j2) {
            a(new c(1, i, null, 3, null, a(j), a(j2)));
        }

        public final void a(final c cVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.a(a.this.f2577a, a.this.b, cVar);
                    }
                });
            }
        }

        public final void a(int i, com.anythink.basead.exoplayer.m mVar, int i2, Object obj, long j) {
            b(new c(1, i, mVar, i2, obj, a(j), -9223372036854775807L));
        }

        public final void b(final c cVar) {
            Iterator<C0145a> it = this.c.iterator();
            while (it.hasNext()) {
                C0145a next = it.next();
                final t tVar = next.b;
                a(next.f2587a, new Runnable() { // from class: com.anythink.basead.exoplayer.h.t.a.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        tVar.b(a.this.f2577a, a.this.b, cVar);
                    }
                });
            }
        }

        private long a(long j) {
            long a2 = com.anythink.basead.exoplayer.b.a(j);
            if (a2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + a2;
        }

        private static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: com.anythink.basead.exoplayer.h.t$a$a, reason: collision with other inner class name */
        private static final class C0145a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f2587a;
            public final t b;

            public C0145a(Handler handler, t tVar) {
                this.f2587a = handler;
                this.b = tVar;
            }
        }
    }
}
