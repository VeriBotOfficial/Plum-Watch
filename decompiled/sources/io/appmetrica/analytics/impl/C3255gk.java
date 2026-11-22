package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3255gk implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18296a;
    public final C3230fk b;
    public final HashMap c = new HashMap();

    public C3255gk(Context context, C3230fk c3230fk) {
        this.f18296a = context;
        this.b = c3230fk;
    }

    public final String a(String str) {
        return "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK." + str;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        if (this.c.get(str) == null) {
            HashMap hashMap = this.c;
            C3230fk c3230fk = this.b;
            Context context = this.f18296a;
            String a2 = a(str);
            c3230fk.f18277a.getClass();
            Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
            intent.setAction(a2);
            ServiceConnectionC3205ek serviceConnectionC3205ek = new ServiceConnectionC3205ek();
            try {
                context.bindService(intent, serviceConnectionC3205ek, 1);
            } catch (Throwable unused) {
                serviceConnectionC3205ek = null;
            }
            hashMap.put(str, serviceConnectionC3205ek);
        }
        return this.c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.c.get(str);
        if (serviceConnection != null) {
            C3230fk c3230fk = this.b;
            a(str);
            Context context = this.f18296a;
            c3230fk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
