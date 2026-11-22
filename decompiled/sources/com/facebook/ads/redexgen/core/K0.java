package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC2012Zo {
    public final WeakReference<C12505h> A00;

    public K0(C12505h c12505h) {
        this.A00 = new WeakReference<>(c12505h);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2012Zo
    public final void ADT(C2011Zn c2011Zn) {
        C12505h c12505h = this.A00.get();
        if (c12505h != null) {
            c12505h.A04 = c2011Zn.A00() != null;
            c12505h.A02();
        }
    }
}
