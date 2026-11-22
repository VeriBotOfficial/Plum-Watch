package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class md2 {

    /* renamed from: a, reason: collision with root package name */
    private final uf2 f16228a;
    private final a b;
    private final Handler c;
    private boolean d;
    private boolean e;

    public interface a {
        void a();
    }

    public md2(uf2 renderValidator, a renderingStartListener) {
        Intrinsics.checkNotNullParameter(renderValidator, "renderValidator");
        Intrinsics.checkNotNullParameter(renderingStartListener, "renderingStartListener");
        this.f16228a = renderValidator;
        this.b = renderingStartListener;
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
            if (md2.this.d || !md2.this.f16228a.a()) {
                md2.this.c.postDelayed(this, 200L);
                return;
            }
            md2.this.b.a();
            md2.this.d = true;
            md2.this.b();
        }
    }

    public final void b() {
        this.c.removeCallbacksAndMessages(null);
        this.e = false;
    }
}
