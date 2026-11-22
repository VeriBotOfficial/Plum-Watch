package com.yandex.mobile.ads.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class we0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f17243a = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder binder) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(binder, "binder");
        try {
            this.f17243a.put(binder);
        } catch (InterruptedException unused) {
            sp0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        try {
            this.f17243a.clear();
        } catch (UnsupportedOperationException unused) {
            sp0.c(new Object[0]);
        }
    }

    public final IBinder a() throws InterruptedException {
        return (IBinder) this.f17243a.poll(5L, TimeUnit.SECONDS);
    }
}
