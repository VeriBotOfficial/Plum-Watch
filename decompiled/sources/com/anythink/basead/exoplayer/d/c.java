package com.anythink.basead.exoplayer.d;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes11.dex */
public interface c {
    void a(Exception exc);

    void d();

    void e();

    void f();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0135a> f2419a = new CopyOnWriteArrayList<>();

        public final void a(Handler handler, c cVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || cVar == null) ? false : true);
            this.f2419a.add(new C0135a(handler, cVar));
        }

        public final void a(c cVar) {
            Iterator<C0135a> it = this.f2419a.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                if (next.b == cVar) {
                    this.f2419a.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0135a> it = this.f2419a.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                final c cVar = next.b;
                next.f2424a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.d();
                    }
                });
            }
        }

        public final void a(final Exception exc) {
            Iterator<C0135a> it = this.f2419a.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                final c cVar = next.b;
                next.f2424a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(exc);
                    }
                });
            }
        }

        public final void b() {
            Iterator<C0135a> it = this.f2419a.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                final c cVar = next.b;
                next.f2424a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0135a> it = this.f2419a.iterator();
            while (it.hasNext()) {
                C0135a next = it.next();
                final c cVar = next.b;
                next.f2424a.post(new Runnable() { // from class: com.anythink.basead.exoplayer.d.c.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.f();
                    }
                });
            }
        }

        /* renamed from: com.anythink.basead.exoplayer.d.c$a$a, reason: collision with other inner class name */
        private static final class C0135a {

            /* renamed from: a, reason: collision with root package name */
            public final Handler f2424a;
            public final c b;

            public C0135a(Handler handler, c cVar) {
                this.f2424a = handler;
                this.b = cVar;
            }
        }
    }
}
