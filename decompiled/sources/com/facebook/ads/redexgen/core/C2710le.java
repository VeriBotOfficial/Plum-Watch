package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2710le implements InterfaceC1464Ed {
    public final int A00;

    public C2710le() {
        this(-1);
    }

    public C2710le(int i) {
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Ed
    public final int A8R(int i) {
        if (this.A00 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1464Ed
    public final long A8m(C1463Ec c1463Ec) {
        IOException iOException = c1463Ec.A03;
        if ((iOException instanceof C11732i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C13419h) || (iOException instanceof C1474En) || C12424z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c1463Ec.A00 - 1) * 1000, 5000);
    }
}
