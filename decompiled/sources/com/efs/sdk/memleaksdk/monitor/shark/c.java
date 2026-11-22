package com.efs.sdk.memleaksdk.monitor.shark;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes14.dex */
public abstract class c<C> extends b<C> implements Callable<a> {
    private volatile boolean b = true;
    private final Runnable c = new Runnable() { // from class: com.efs.sdk.memleaksdk.monitor.internal.c.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.call() == a.Terminate || c.this.b) {
                    return;
                }
                Handler a2 = d.a();
                a2.removeCallbacks(this);
                a2.postDelayed(this, c.this.b());
            } catch (Throwable unused) {
            }
        }
    };

    public enum a {
        Continue,
        Terminate
    }

    protected long b() {
        return 1000L;
    }

    public void a(long j) {
        Handler a2 = d.a();
        a2.removeCallbacks(this.c);
        a2.postDelayed(this.c, j);
        this.b = false;
    }

    public void c() {
        this.b = true;
        d.a().removeCallbacks(this.c);
    }
}
