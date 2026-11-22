package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1704Nl {

    @Nullable
    public static HandlerC1703Nk A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static HandlerC1703Nk A00(C2202cu c2202cu) {
        if (A00 == null) {
            A00 = new HandlerC1703Nk(c2202cu);
        }
        return A00;
    }

    public static void A01(C2202cu c2202cu) {
        if (UA.A0F(c2202cu)) {
            A03(c2202cu);
        }
    }

    public static void A02(C2202cu c2202cu) {
        if (UA.A0E(c2202cu)) {
            A03(c2202cu);
        }
    }

    public static void A03(C2202cu c2202cu) {
        if (A01.compareAndSet(false, true)) {
            XJ.A01.execute(new C2438go(c2202cu));
        }
    }
}
