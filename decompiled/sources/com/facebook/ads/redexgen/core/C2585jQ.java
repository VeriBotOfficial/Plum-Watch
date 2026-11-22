package com.facebook.ads.redexgen.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2585jQ implements InterfaceC1634Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1634Ks
    public final C1633Kr<File> A3p(File file, LA la) {
        if (file.exists()) {
            return new C1633Kr<>(true, file);
        }
        return new C1633Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1634Ks
    public final void A55(File file, LA la) {
    }
}
