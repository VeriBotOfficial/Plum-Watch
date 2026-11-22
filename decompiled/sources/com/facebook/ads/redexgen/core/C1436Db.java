package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1436Db implements InterfaceC2242dZ {
    public final View A00;
    public final C2228dL A01;

    public C1436Db(C2228dL c2228dL, View view) {
        this.A01 = c2228dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2242dZ
    public final double A9N() {
        C2302eY result = C2301eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
