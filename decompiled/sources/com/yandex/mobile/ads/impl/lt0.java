package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lt0 {

    /* renamed from: a, reason: collision with root package name */
    private final y42 f16167a;
    private final Context b;
    private final AtomicBoolean c;

    public lt0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16167a = new y42();
        this.b = context.getApplicationContext();
        this.c = new AtomicBoolean();
    }

    public final void a() {
        if (pa.a(this.b)) {
            this.f16167a.getClass();
            if (y42.a() || this.c.getAndSet(true)) {
                return;
            }
            hp0.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
        }
    }
}
