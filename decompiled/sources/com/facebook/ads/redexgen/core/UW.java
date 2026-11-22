package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UW implements InterfaceC2240dX {
    public final /* synthetic */ TD A00;

    public UW(TD td) {
        this.A00 = td;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2240dX
    public final void AFj() {
        AtomicBoolean atomicBoolean;
        InterfaceC1881Uk interfaceC1881Uk;
        InterfaceC1881Uk interfaceC1881Uk2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC1881Uk = this.A00.A02;
        if (interfaceC1881Uk != null) {
            interfaceC1881Uk2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            interfaceC1881Uk2.AEW(atomicBoolean2.get());
        }
    }
}
