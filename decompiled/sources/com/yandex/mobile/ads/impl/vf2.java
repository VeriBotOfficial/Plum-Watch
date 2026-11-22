package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.yandex.mobile.ads.impl.vf2;

/* loaded from: classes5.dex */
public interface vf2 {
    default void a(int i, long j) {
    }

    default void a(cg2 cg2Var) {
    }

    default void a(Object obj, long j) {
    }

    default void a(String str) {
    }

    default void a(String str, long j, long j2) {
    }

    default void b(int i, long j) {
    }

    default void b(jc0 jc0Var, ty tyVar) {
    }

    default void c(py pyVar) {
    }

    default void c(Exception exc) {
    }

    default void d(py pyVar) {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f17158a;
        private final vf2 b;

        public a(Handler handler, vf2 vf2Var) {
            this.f17158a = (Handler) hg.a(handler);
            this.b = vf2Var;
        }

        public final void b(final py pyVar) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.d(pyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(py pyVar) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.d(pyVar);
        }

        public final void a(final String str, final long j, final long j2) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(py pyVar) {
            synchronized (pyVar) {
            }
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.c(pyVar);
        }

        public final void c(final int i, final long j) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.a(j, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j, long j2) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.a(str, j, j2);
        }

        public final void a(final String str) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.a(str);
        }

        public final void a(final py pyVar) {
            synchronized (pyVar) {
            }
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.c(pyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i, long j) {
            vf2 vf2Var = this.b;
            int i2 = f92.f15466a;
            vf2Var.b(i, j);
        }

        public final void a(final int i, final long j) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.b(i, j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(jc0 jc0Var, ty tyVar) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.getClass();
            this.b.b(jc0Var, tyVar);
        }

        public final void a(final jc0 jc0Var, final ty tyVar) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.b(jc0Var, tyVar);
                    }
                });
            }
        }

        public final void b(final Exception exc) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.a(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, long j) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.a(obj, j);
        }

        public final void b(final cg2 cg2Var) {
            Handler handler = this.f17158a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.a(cg2Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j, int i) {
            vf2 vf2Var = this.b;
            int i2 = f92.f15466a;
            vf2Var.a(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Exception exc) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.c(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(cg2 cg2Var) {
            vf2 vf2Var = this.b;
            int i = f92.f15466a;
            vf2Var.a(cg2Var);
        }

        public final void a(final Surface surface) {
            if (this.f17158a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f17158a.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vf2$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        vf2.a.this.a(surface, elapsedRealtime);
                    }
                });
            }
        }
    }
}
