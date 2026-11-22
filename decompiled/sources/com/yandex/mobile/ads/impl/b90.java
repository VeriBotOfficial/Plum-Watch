package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b90 {

    /* renamed from: a, reason: collision with root package name */
    private final ht0 f15083a;
    private final Handler b;
    private final LinkedHashMap c;
    private boolean d;

    public /* synthetic */ b90() {
        this(new ht0(), new Handler(Looper.getMainLooper()));
    }

    public b90(ht0 mainThreadExecutor, Handler handler) {
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f15083a = mainThreadExecutor;
        this.b = handler;
        this.c = new LinkedHashMap();
    }

    public final void a(View feedAdView, int i) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.c.put(feedAdView, Integer.valueOf(i));
    }

    public static final class a implements Runnable {
        final /* synthetic */ a90 c;

        a(a90 a90Var) {
            this.c = a90Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap linkedHashMap = b90.this.c;
            a90 a90Var = this.c;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                View view = (View) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (wh2.a(view) >= 1) {
                    a90Var.a(intValue);
                }
            }
            b90.this.b.postDelayed(this, 200L);
        }
    }

    public final void a(View feedAdView) {
        Intrinsics.checkNotNullParameter(feedAdView, "feedAdView");
        this.c.remove(feedAdView);
    }

    public final void a(a90 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.d) {
            return;
        }
        this.d = true;
        this.f15083a.a(new a(listener));
    }

    public final void a() {
        this.c.clear();
        this.b.removeCallbacksAndMessages(null);
        this.d = false;
    }
}
