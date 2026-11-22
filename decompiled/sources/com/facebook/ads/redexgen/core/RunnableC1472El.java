package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.El, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC1472El implements Runnable {
    public final InterfaceC1471Ek A00;

    public RunnableC1472El(InterfaceC1471Ek interfaceC1471Ek) {
        this.A00 = interfaceC1471Ek;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            this.A00.AE4();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
