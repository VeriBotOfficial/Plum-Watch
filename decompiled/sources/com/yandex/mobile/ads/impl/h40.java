package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.h40;
import com.yandex.mobile.ads.impl.vw0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface h40 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15654a;
        public final vw0.b b;
        private final CopyOnWriteArrayList<C0970a> c;

        public final void a(Handler handler, h40 h40Var) {
            h40Var.getClass();
            this.c.add(new C0970a(handler, h40Var));
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void e(h40 h40Var) {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                if (next.b == h40Var) {
                    this.c.remove(next);
                }
            }
        }

        public final void a() {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.a(h40Var);
                    }
                });
            }
        }

        public final void c() {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.c(h40Var);
                    }
                });
            }
        }

        public final void b() {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.b(h40Var);
                    }
                });
            }
        }

        public final void d() {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.d(h40Var);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList<C0970a> copyOnWriteArrayList, int i, vw0.b bVar) {
            this.c = copyOnWriteArrayList;
            this.f15654a = i;
            this.b = bVar;
        }

        /* renamed from: com.yandex.mobile.ads.impl.h40$a$a, reason: collision with other inner class name */
        private static final class C0970a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f15655a;
            public h40 b;

            public C0970a(Handler handler, h40 h40Var) {
                this.f15655a = handler;
                this.b = h40Var;
            }
        }

        public final void a(final int i) {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.a(h40Var, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(h40 h40Var) {
            h40Var.a(this.f15654a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(h40 h40Var) {
            h40Var.d(this.f15654a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(h40 h40Var) {
            h40Var.b(this.f15654a, this.b);
        }

        public final void a(final Exception exc) {
            Iterator<C0970a> it = this.c.iterator();
            while (it.hasNext()) {
                C0970a next = it.next();
                final h40 h40Var = next.b;
                f92.a(next.f15655a, new Runnable() { // from class: com.yandex.mobile.ads.impl.h40$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h40.a.this.a(h40Var, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(h40 h40Var) {
            h40Var.c(this.f15654a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(h40 h40Var, int i) {
            h40Var.getClass();
            h40Var.a(this.f15654a, this.b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(h40 h40Var, Exception exc) {
            h40Var.a(this.f15654a, this.b, exc);
        }

        public final a a(int i, vw0.b bVar) {
            return new a(this.c, i, bVar);
        }
    }

    default void a(int i, vw0.b bVar) {
    }

    default void a(int i, vw0.b bVar, int i2) {
    }

    default void a(int i, vw0.b bVar, Exception exc) {
    }

    default void b(int i, vw0.b bVar) {
    }

    default void c(int i, vw0.b bVar) {
    }

    default void d(int i, vw0.b bVar) {
    }
}
