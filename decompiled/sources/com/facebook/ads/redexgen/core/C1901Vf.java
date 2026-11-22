package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1901Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C1901Vf(VN vn) {
        this.A00 = vn;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C2952pu<UE, UJ> c2952pu, InterfaceC2943pk interfaceC2943pk) {
        switch (interfaceC2943pk.A9M(c2952pu)) {
            case A02:
            case A04:
                this.A00.A02(c2952pu, interfaceC2943pk);
                break;
        }
    }
}
