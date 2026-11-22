package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3223fd implements ModuleServiceLifecycleController {

    /* renamed from: a, reason: collision with root package name */
    public final P1 f18271a;

    public C3223fd(P1 p1) {
        this.f18271a = p1;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.f18271a.b(new O1() { // from class: io.appmetrica.analytics.impl.fd$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.O1
            public final void a(Intent intent) {
                C3223fd.a(ModuleServiceLifecycleObserver.this, intent);
            }
        });
        this.f18271a.a(new O1() { // from class: io.appmetrica.analytics.impl.fd$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.O1
            public final void a(Intent intent) {
                C3223fd.b(ModuleServiceLifecycleObserver.this, intent);
            }
        });
    }
}
