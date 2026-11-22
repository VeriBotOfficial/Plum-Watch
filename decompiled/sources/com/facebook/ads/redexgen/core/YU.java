package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YU implements InterfaceC1905Vj {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1905Vj
    public final void AHp(Throwable th, Object obj) {
        if (obj instanceof SM) {
            C2228dL adContext = ((SM) obj).A6e();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C2228dL)) {
            return;
        }
        ((C2228dL) context).A0Q(th);
    }
}
