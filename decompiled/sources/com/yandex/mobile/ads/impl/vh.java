package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.vh;

/* loaded from: classes5.dex */
public interface vh {
    default void a(int i, long j, long j2) {
    }

    default void a(long j) {
    }

    default void a(jc0 jc0Var, ty tyVar) {
    }

    default void a(py pyVar) {
    }

    default void a(Exception exc) {
    }

    default void b(py pyVar) {
    }

    default void b(Exception exc) {
    }

    default void b(String str) {
    }

    default void b(String str, long j, long j2) {
    }

    default void onSkipSilenceEnabledChanged(boolean z) {
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f17162a;
        private final vh b;

        public a(Handler handler, vh vhVar) {
            this.f17162a = (Handler) hg.a(handler);
            this.b = vhVar;
        }

        public final void b(final Exception exc) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.d(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Exception exc) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.a(exc);
        }

        public final void a(final Exception exc) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.c(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Exception exc) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.b(exc);
        }

        public final void b(final py pyVar) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.d(pyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(py pyVar) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.b(pyVar);
        }

        public final void a(final String str, final long j, final long j2) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(py pyVar) {
            synchronized (pyVar) {
            }
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.a(pyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, long j, long j2) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.b(str, j, j2);
        }

        public final void a(final String str) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.b(str);
        }

        public final void a(final py pyVar) {
            synchronized (pyVar) {
            }
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.c(pyVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(jc0 jc0Var, ty tyVar) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.getClass();
            this.b.a(jc0Var, tyVar);
        }

        public final void a(final jc0 jc0Var, final ty tyVar) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.b(jc0Var, tyVar);
                    }
                });
            }
        }

        public final void b(final long j) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.a(j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.a(j);
        }

        public final void b(final boolean z) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.a(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            vh vhVar = this.b;
            int i = f92.f15466a;
            vhVar.onSkipSilenceEnabledChanged(z);
        }

        public final void b(final int i, final long j, final long j2) {
            Handler handler = this.f17162a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.vh$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        vh.a.this.a(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, long j, long j2) {
            vh vhVar = this.b;
            int i2 = f92.f15466a;
            vhVar.a(i, j, j2);
        }
    }
}
