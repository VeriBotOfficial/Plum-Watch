package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.du1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class it0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15849a = new Handler(Looper.getMainLooper());

    public final void a() {
        this.f15849a.removeCallbacksAndMessages(null);
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15849a.post(runnable);
    }

    public final void a(du1.a runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f15849a.postDelayed(runnable, 50L);
    }
}
