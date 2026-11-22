package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.eG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2284eG implements Runnable {
    public final /* synthetic */ C2287eJ A00;

    public RunnableC2284eG(C2287eJ c2287eJ) {
        this.A00 = c2287eJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0A();
            handler = this.A00.A01;
            handler.removeCallbacks(this);
            handler2 = this.A00.A01;
            handler2.postDelayed(this, 250L);
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
