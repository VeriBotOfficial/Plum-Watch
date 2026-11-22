package com.facebook.ads.redexgen.core;

import androidx.media3.datasource.cache.CacheDataSink;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2560iz implements InterfaceC12364t {
    public InterfaceC1655Ln A02;
    public long A01 = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    public int A00 = 20480;

    public final C2560iz A00(InterfaceC1655Ln interfaceC1655Ln) {
        this.A02 = interfaceC1655Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC12364t
    public final C2559iy A59() {
        return new C2559iy((InterfaceC1655Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
