package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3709z1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f18603a;
    public final /* synthetic */ F1 b;

    public C3709z1(F1 f1, Intent intent) {
        this.b = f1;
        this.f18603a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.b.b.a(this.f18603a);
    }
}
