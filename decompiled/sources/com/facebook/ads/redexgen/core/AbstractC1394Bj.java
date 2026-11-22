package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1394Bj implements InterfaceC2349fK {
    public final EnumC2341fC A00;
    public final AbstractC11661z A01;

    public AbstractC1394Bj(AbstractC11661z abstractC11661z, EnumC2341fC enumC2341fC) {
        this.A01 = abstractC11661z;
        this.A00 = enumC2341fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2349fK
    public void A45(Map<InterfaceC2332f2, EnumC2354fP> map, Map<SyncModifiableBundle, EnumC2341fC> map2) {
        map2.put(null, this.A00);
    }
}
