package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1575Il implements InterfaceC2012Zo {
    public final WeakReference<C5Q> A00;

    public C1575Il(C5Q c5q) {
        this.A00 = new WeakReference<>(c5q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2012Zo
    public final void ADT(C2011Zn c2011Zn) {
        C5Q c5q = this.A00.get();
        if (c5q != null) {
            c5q.A06 = c2011Zn.A00() != null;
            c5q.A02();
        }
    }
}
