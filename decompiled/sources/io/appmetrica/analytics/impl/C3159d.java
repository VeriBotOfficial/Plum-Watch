package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3159d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f18224a = new AtomicBoolean(true);
    public final /* synthetic */ C3184e b;

    public C3159d(C3184e c3184e) {
        this.b = c3184e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f18224a.get()) {
            this.b.e.set(false);
            C3184e c3184e = this.b;
            c3184e.c.postAtFrontOfQueue(c3184e.f);
            int i = this.b.b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C3184e.g);
                    if (this.b.e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.b.f18245a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3134c) it.next()).onAppNotResponding();
                }
            }
            while (!this.b.e.get()) {
                Thread.sleep(C3184e.g);
            }
        }
    }
}
