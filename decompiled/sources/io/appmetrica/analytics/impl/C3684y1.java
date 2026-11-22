package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3684y1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f18585a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ F1 d;

    public C3684y1(F1 f1, Intent intent, int i, int i2) {
        this.d = f1;
        this.f18585a = intent;
        this.b = i;
        this.c = i2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.d.b.a(this.f18585a, this.b, this.c);
    }
}
