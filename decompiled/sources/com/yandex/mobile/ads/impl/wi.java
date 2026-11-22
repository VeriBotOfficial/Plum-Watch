package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.wi;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public interface wi {

    public interface a {

        /* renamed from: com.yandex.mobile.ads.impl.wi$a$a, reason: collision with other inner class name */
        public static final class C0986a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0987a> f17253a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: com.yandex.mobile.ads.impl.wi$a$a$a, reason: collision with other inner class name */
            static final class C0987a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f17254a;
                private final a b;
                private boolean c;

                public C0987a(Handler handler, ed edVar) {
                    this.f17254a = handler;
                    this.b = edVar;
                }
            }

            public final void a(Handler handler, ed edVar) {
                edVar.getClass();
                a(edVar);
                this.f17253a.add(new C0987a(handler, edVar));
            }

            public final void a(final int i, final long j, final long j2) {
                Iterator<C0987a> it = this.f17253a.iterator();
                while (it.hasNext()) {
                    final C0987a next = it.next();
                    if (!next.c) {
                        next.f17254a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.wi$a$a$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                wi.a.C0986a.a(wi.a.C0986a.C0987a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0987a c0987a, int i, long j, long j2) {
                c0987a.b.b(i, j, j2);
            }

            public final void a(ed edVar) {
                Iterator<C0987a> it = this.f17253a.iterator();
                while (it.hasNext()) {
                    C0987a next = it.next();
                    if (next.b == edVar) {
                        next.c = true;
                        this.f17253a.remove(next);
                    }
                }
            }
        }

        void b(int i, long j, long j2);
    }

    jz a();

    void a(Handler handler, ed edVar);

    void a(ed edVar);
}
