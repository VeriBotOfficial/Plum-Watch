package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.ib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerThreadC3296ib extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f18325a;

    public HandlerThreadC3296ib(String str) {
        super(str);
        this.f18325a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f18325a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f18325a = false;
        interrupt();
    }
}
