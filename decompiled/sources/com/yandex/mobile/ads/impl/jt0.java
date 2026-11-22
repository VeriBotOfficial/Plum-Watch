package com.yandex.mobile.ads.impl;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class jt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15944a;

    public jt0(Handler mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f15944a = mainThreadHandler;
    }

    public final void a() {
        this.f15944a.removeCallbacksAndMessages(null);
    }

    private final class a implements Runnable {
        private final long b;
        private final yn c;
        final /* synthetic */ jt0 d;

        public a(jt0 jt0Var, long j, h31 periodicJob) {
            Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
            this.d = jt0Var;
            this.b = j;
            this.c = periodicJob;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.c.b()) {
                this.c.run();
                this.d.f15944a.postDelayed(this, this.b);
            }
        }
    }

    public final void a(long j, h31 periodicJob) {
        Intrinsics.checkNotNullParameter(periodicJob, "periodicJob");
        if (periodicJob.b()) {
            this.f15944a.postDelayed(new a(this, j, periodicJob), j);
        }
    }
}
