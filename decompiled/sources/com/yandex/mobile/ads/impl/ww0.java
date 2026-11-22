package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.vw0;
import com.yandex.mobile.ads.impl.ww0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface ww0 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17287a;
        public final vw0.b b;
        private final CopyOnWriteArrayList<C0988a> c;
        private final long d;

        public final void a(Handler handler, ww0 ww0Var) {
            ww0Var.getClass();
            this.c.add(new C0988a(handler, ww0Var));
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, vw0.b bVar) {
            this.c = copyOnWriteArrayList;
            this.f17287a = i;
            this.b = bVar;
            this.d = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(ww0 ww0Var, es0 es0Var, lw0 lw0Var) {
            ww0Var.c(this.f17287a, this.b, es0Var, lw0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(ww0 ww0Var, es0 es0Var, lw0 lw0Var) {
            ww0Var.b(this.f17287a, this.b, es0Var, lw0Var);
        }

        private long a(long j) {
            long b = f92.b(j);
            if (b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b;
        }

        public final void a(int i, jc0 jc0Var, long j) {
            a(new lw0(1, i, jc0Var, 0, null, a(j), -9223372036854775807L));
        }

        /* renamed from: com.yandex.mobile.ads.impl.ww0$a$a, reason: collision with other inner class name */
        private static final class C0988a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f17288a;
            public ww0 b;

            public C0988a(Handler handler, ww0 ww0Var) {
                this.f17288a = handler;
                this.b = ww0Var;
            }
        }

        public final void c(final es0 es0Var, final lw0 lw0Var) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                final ww0 ww0Var = next.b;
                f92.a(next.f17288a, new Runnable() { // from class: com.yandex.mobile.ads.impl.ww0$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ww0.a.this.c(ww0Var, es0Var, lw0Var);
                    }
                });
            }
        }

        public final void b(final es0 es0Var, final lw0 lw0Var) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                final ww0 ww0Var = next.b;
                f92.a(next.f17288a, new Runnable() { // from class: com.yandex.mobile.ads.impl.ww0$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ww0.a.this.b(ww0Var, es0Var, lw0Var);
                    }
                });
            }
        }

        public final void b(es0 es0Var, jc0 jc0Var, long j, long j2) {
            c(es0Var, new lw0(1, -1, jc0Var, 0, null, a(j), a(j2)));
        }

        public final void a(final lw0 lw0Var) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                final ww0 ww0Var = next.b;
                f92.a(next.f17288a, new Runnable() { // from class: com.yandex.mobile.ads.impl.ww0$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ww0.a.this.a(ww0Var, lw0Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ww0 ww0Var, lw0 lw0Var) {
            ww0Var.a(this.f17287a, this.b, lw0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ww0 ww0Var, es0 es0Var, lw0 lw0Var) {
            ww0Var.a(this.f17287a, this.b, es0Var, lw0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(ww0 ww0Var, es0 es0Var, lw0 lw0Var, IOException iOException, boolean z) {
            ww0Var.a(this.f17287a, this.b, es0Var, lw0Var, iOException, z);
        }

        public final void a(es0 es0Var, long j, long j2) {
            a(es0Var, new lw0(1, -1, null, 0, null, a(j), a(j2)));
        }

        public final void a(final es0 es0Var, final lw0 lw0Var) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                final ww0 ww0Var = next.b;
                f92.a(next.f17288a, new Runnable() { // from class: com.yandex.mobile.ads.impl.ww0$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ww0.a.this.a(ww0Var, es0Var, lw0Var);
                    }
                });
            }
        }

        public final void a(es0 es0Var, jc0 jc0Var, long j, long j2) {
            b(es0Var, new lw0(1, -1, jc0Var, 0, null, a(j), a(j2)));
        }

        public final void a(es0 es0Var, int i, jc0 jc0Var, long j, long j2, IOException iOException, boolean z) {
            a(es0Var, new lw0(i, -1, jc0Var, 0, null, a(j), a(j2)), iOException, z);
        }

        public final void a(final es0 es0Var, final lw0 lw0Var, final IOException iOException, final boolean z) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                final ww0 ww0Var = next.b;
                f92.a(next.f17288a, new Runnable() { // from class: com.yandex.mobile.ads.impl.ww0$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ww0.a.this.a(ww0Var, es0Var, lw0Var, iOException, z);
                    }
                });
            }
        }

        public final void a(ww0 ww0Var) {
            Iterator<C0988a> it = this.c.iterator();
            while (it.hasNext()) {
                C0988a next = it.next();
                if (next.b == ww0Var) {
                    this.c.remove(next);
                }
            }
        }

        public final a a(int i, vw0.b bVar) {
            return new a(this.c, i, bVar);
        }
    }

    default void a(int i, vw0.b bVar, es0 es0Var, lw0 lw0Var) {
    }

    default void a(int i, vw0.b bVar, es0 es0Var, lw0 lw0Var, IOException iOException, boolean z) {
    }

    default void a(int i, vw0.b bVar, lw0 lw0Var) {
    }

    default void b(int i, vw0.b bVar, es0 es0Var, lw0 lw0Var) {
    }

    default void c(int i, vw0.b bVar, es0 es0Var, lw0 lw0Var) {
    }
}
