package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.hg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2488hg implements S7 {
    public final /* synthetic */ AbstractC2503hy A00;
    public final /* synthetic */ NG A01;
    public final /* synthetic */ NH A02;
    public final /* synthetic */ C2228dL A03;
    public final /* synthetic */ boolean A04;

    public C2488hg(NH nh, C2228dL c2228dL, boolean z, AbstractC2503hy abstractC2503hy, NG ng) {
        this.A02 = nh;
        this.A03 = c2228dL;
        this.A04 = z;
        this.A00 = abstractC2503hy;
        this.A01 = ng;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            if (U7.A1l(this.A03) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(AbstractC2140bu.A01(this.A03, this.A00, 1, new C2489hh(this)));
                return;
            } else {
                this.A01.ACG();
                return;
            }
        }
        this.A01.ACF(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00(true);
    }
}
