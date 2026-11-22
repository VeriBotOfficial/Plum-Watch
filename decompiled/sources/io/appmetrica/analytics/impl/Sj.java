package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class Sj implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f18069a;

    public Sj(Handler handler) {
        this.f18069a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18069a.post(runnable);
    }
}
