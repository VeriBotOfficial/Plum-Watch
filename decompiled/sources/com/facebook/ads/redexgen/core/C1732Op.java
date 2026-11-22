package com.facebook.ads.redexgen.core;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1732Op extends AbstractRunnableC1915Vt {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC1948Xc A01;

    public C1732Op(DialogInterfaceOnClickListenerC1948Xc dialogInterfaceOnClickListenerC1948Xc, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC1948Xc;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        InterfaceC2307ed interfaceC2307ed;
        InterfaceC2307ed interfaceC2307ed2;
        C2202cu c2202cu;
        Map<? extends String, ? extends String> A02;
        interfaceC2307ed = this.A01.A01.A02;
        if (interfaceC2307ed != null) {
            interfaceC2307ed2 = this.A01.A01.A02;
            c2202cu = this.A01.A01.A00;
            String A03 = VZ.A03(c2202cu);
            C2321er c2321er = new C2321er();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC2307ed2.AGD(A03, c2321er.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
