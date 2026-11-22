package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bd2 {

    /* renamed from: a, reason: collision with root package name */
    private final qd2 f15097a;
    private final a b;
    private final Handler c;
    private boolean d;
    private boolean e;

    public interface a {
        void b();
    }

    public bd2(qd2 statusController, a preparedListener) {
        Intrinsics.checkNotNullParameter(statusController, "statusController");
        Intrinsics.checkNotNullParameter(preparedListener, "preparedListener");
        this.f15097a = statusController;
        this.b = preparedListener;
        this.c = new Handler(Looper.getMainLooper());
    }

    public final void a() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        this.c.post(new b());
    }

    private final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (bd2.this.d || !bd2.this.f15097a.a(pd2.d)) {
                bd2.this.c.postDelayed(this, 200L);
                return;
            }
            bd2.this.b.b();
            bd2.this.d = true;
            bd2.this.b();
        }
    }

    public final void b() {
        this.c.removeCallbacksAndMessages(null);
        this.e = false;
    }
}
