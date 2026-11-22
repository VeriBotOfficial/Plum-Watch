package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1912Vq extends FrameLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<InterfaceC1905Vj> A01 = new AtomicReference<>();

    public static void A00(boolean z, InterfaceC1905Vj interfaceC1905Vj) {
        A00.set(z);
        A01.set(interfaceC1905Vj);
    }
}
