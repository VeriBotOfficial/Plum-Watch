package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1393Bi implements InterfaceC2349fK {
    public final By A00;
    public final EnumC2354fP A01;

    public AbstractC1393Bi(By by, EnumC2354fP enumC2354fP) {
        this.A00 = by;
        this.A01 = enumC2354fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2349fK
    public void A45(Map<InterfaceC2332f2, EnumC2354fP> map, Map<SyncModifiableBundle, EnumC2341fC> map2) {
        map.put(this.A00, this.A01);
    }
}
