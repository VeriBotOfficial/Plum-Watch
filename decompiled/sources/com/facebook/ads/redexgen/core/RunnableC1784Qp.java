package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1784Qp implements Runnable {
    public final /* synthetic */ C1785Qq A00;

    public RunnableC1784Qp(C1785Qq c1785Qq) {
        this.A00 = c1785Qq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05 = 0L;
            this.A00.A06 = false;
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
