package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2338f9 implements Runnable {
    public final /* synthetic */ C1406Bw A00;

    public RunnableC2338f9(C1406Bw c1406Bw) {
        this.A00 = c1406Bw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            C1406Bw.A03(this.A00);
            throw null;
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
