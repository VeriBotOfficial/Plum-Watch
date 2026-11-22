package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Zf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC2003Zf implements Runnable {
    public final /* synthetic */ C2004Zg A00;
    public final /* synthetic */ InterfaceC2005Zh A01;

    public RunnableC2003Zf(C2004Zg c2004Zg, InterfaceC2005Zh interfaceC2005Zh) {
        this.A00 = c2004Zg;
        this.A01 = interfaceC2005Zh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            this.A01.ACO();
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
