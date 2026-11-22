package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Xd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1949Xd {
    public static C1949Xd A02;
    public final C1729Om A00;
    public final C1951Xf A01;

    public C1949Xd(C2228dL c2228dL, Executor executor, TE te) {
        this.A01 = new C1951Xf(c2228dL);
        this.A00 = new C1729Om(executor, te, c2228dL);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C2228dL c2228dL, Executor executor, TE te) {
        if (!U7.A1X(c2228dL)) {
            return;
        }
        if (A02 == null) {
            A02 = new C1949Xd(c2228dL, executor, te);
            A02.A00();
        } else {
            A02.A02(te);
        }
    }

    private void A02(TE te) {
        this.A00.A07(te);
    }
}
