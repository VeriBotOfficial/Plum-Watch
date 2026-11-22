package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class SP {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", "h", "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C2202cu> A01 = new AtomicReference<>();

    public static C2202cu A00() {
        AtomicReference<C2202cu> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = ak.aH;
        return atomicReference.get();
    }

    public static void A01(C2202cu c2202cu) {
        if (c2202cu == null) {
            return;
        }
        AB.A00(A01, null, c2202cu);
    }
}
