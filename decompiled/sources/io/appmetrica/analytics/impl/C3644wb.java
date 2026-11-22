package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3644wb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3669xb f18566a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3644wb(C3669xb c3669xb, String str) {
        super(str);
        this.f18566a = c3669xb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        synchronized (this.f18566a.f18578a) {
            C3669xb.a(this.f18566a);
            this.f18566a.e = true;
            this.f18566a.f18578a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f18566a.b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                hashMap = new HashMap(this.f18566a.b);
                this.f18566a.b.clear();
            }
            if (hashMap.size() > 0) {
                C3669xb.a(this.f18566a, hashMap);
                hashMap.clear();
            }
        }
    }
}
