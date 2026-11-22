package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3659x1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f18572a;
    public final /* synthetic */ int b;
    public final /* synthetic */ F1 c;

    public C3659x1(F1 f1, Intent intent, int i) {
        this.c = f1;
        this.f18572a = intent;
        this.b = i;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.c.b.a(this.f18572a, this.b);
    }
}
