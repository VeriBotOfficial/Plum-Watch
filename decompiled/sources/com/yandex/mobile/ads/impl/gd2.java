package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gd2 {

    /* renamed from: a, reason: collision with root package name */
    private final wc2<?> f15578a;
    private final dd2 b;
    private final Handler c;
    private boolean d;

    public /* synthetic */ gd2(wc2 wc2Var, dd2 dd2Var) {
        this(wc2Var, dd2Var, new Handler(Looper.getMainLooper()));
    }

    public gd2(wc2<?> videoAdPlayer, dd2 videoAdProgressEventsObservable, Handler handler) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15578a = videoAdPlayer;
        this.b = videoAdProgressEventsObservable;
        this.c = handler;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.b.a();
        this.c.post(new a());
    }

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = gd2.this.f15578a.getAdPosition();
            gd2.this.b.a(gd2.this.f15578a.b(), adPosition);
            if (gd2.this.d) {
                gd2.this.c.postDelayed(this, 200L);
            }
        }
    }

    public final void b() {
        if (this.d) {
            this.b.b();
            this.c.removeCallbacksAndMessages(null);
            this.d = false;
        }
    }
}
