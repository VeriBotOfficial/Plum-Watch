package com.anythink.expressad.foundation.g.f;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes12.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f4861a = "d";
    private final Executor b;

    public d(final Handler handler) {
        this.b = new Executor() { // from class: com.anythink.expressad.foundation.g.f.d.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, l<?> lVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new a(jVar, lVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(j<?> jVar, com.anythink.expressad.foundation.g.f.a.a aVar) {
        if (this.b != null) {
            this.b.execute(new a(jVar, l.a(aVar)));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.o();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void b(final j<?> jVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.m();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void c(final j<?> jVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.4
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.n();
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void d(final j<?> jVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.5
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void e(final j<?> jVar) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.6
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.c
    public final void a(final j<?> jVar, final long j, final long j2) {
        Executor executor = this.b;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.d.7
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a(j, j2);
                }
            });
        }
    }

    private class a implements Runnable {
        private final j b;
        private final l c;

        public a(j jVar, l lVar) {
            this.b = jVar;
            this.c = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.b.f()) {
                this.b.c();
                this.b.m();
                return;
            }
            if (this.c.b == null) {
                this.b.a(this.c);
            } else {
                this.b.b(this.c.b);
            }
            this.b.c();
            this.b.o();
        }
    }
}
