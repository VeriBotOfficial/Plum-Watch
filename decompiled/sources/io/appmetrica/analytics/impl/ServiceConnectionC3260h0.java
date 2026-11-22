package io.appmetrica.analytics.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.appmetrica.analytics.internal.IAppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC3260h0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3285i0 f18298a;

    public ServiceConnectionC3260h0(C3285i0 c3285i0) {
        this.f18298a = c3285i0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f18298a) {
            this.f18298a.d = IAppMetricaService.Stub.asInterface(iBinder);
            this.f18298a.e.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f18298a) {
            this.f18298a.d = null;
        }
    }
}
