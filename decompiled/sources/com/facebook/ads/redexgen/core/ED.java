package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class ED extends AbstractRunnableC1915Vt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ E1 A02;
    public final /* synthetic */ EnumC2298eU A03;

    public ED(E1 e1, EnumC2298eU enumC2298eU, int i, int i2) {
        this.A02 = e1;
        this.A03 = enumC2298eU;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        C2228dL c2228dL;
        Handler handler;
        C1850Te c1850Te;
        C2228dL c2228dL2;
        C1850Te c1850Te2;
        DI di;
        Handler handler2;
        C2228dL c2228dL3;
        C1850Te c1850Te3;
        Handler handler3;
        C2228dL c2228dL4;
        C2228dL c2228dL5;
        C1850Te c1850Te4;
        DQ dq;
        Handler handler4;
        C2228dL c2228dL6;
        C2228dL c2228dL7;
        Handler handler5;
        C1850Te c1850Te5;
        C1850Te c1850Te6;
        DW dw;
        C2228dL c2228dL8;
        C1850Te c1850Te7;
        DO r0;
        if (this.A03 == EnumC2298eU.A07) {
            this.A02.A0M(UZ.A0y);
            c2228dL8 = this.A02.A0B;
            c2228dL8.A0F().A3b();
            c1850Te7 = this.A02.A0C;
            r0 = E1.A0J;
            c1850Te7.A02(r0);
            return;
        }
        if (this.A03 == EnumC2298eU.A03) {
            this.A02.A0M(UZ.A0t);
            this.A02.A04 = true;
            c1850Te6 = this.A02.A0C;
            dw = E1.A0H;
            c1850Te6.A02(dw);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC2298eU.A06) {
            this.A02.A0M(UZ.A0s);
            c2228dL7 = this.A02.A0B;
            c2228dL7.A0F().A3T();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            c1850Te5 = this.A02.A0C;
            c1850Te5.A02(new C11943d(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC2298eU.A0A) {
            c2228dL4 = this.A02.A0B;
            if (U7.A1u(c2228dL4)) {
                c2228dL6 = this.A02.A0B;
                c2228dL6.A0B().AFs();
            }
            this.A02.A0M(UZ.A0w);
            c2228dL5 = this.A02.A0B;
            c2228dL5.A0F().A3i();
            c1850Te4 = this.A02.A0C;
            dq = E1.A0I;
            c1850Te4.A02(dq);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC2298eU.A05) {
            this.A02.A0M(UZ.A0v);
            c2228dL3 = this.A02.A0B;
            c2228dL3.A0F().A3X();
            c1850Te3 = this.A02.A0C;
            final int i = this.A00;
            c1850Te3.A02(new DY(i) { // from class: com.facebook.ads.redexgen.X.3Y
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC2298eU.A04) {
            this.A02.A0M(UZ.A0u);
            c2228dL2 = this.A02.A0B;
            c2228dL2.A0F().A3U();
            c1850Te2 = this.A02.A0C;
            di = E1.A0L;
            c1850Te2.A02(di);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC2298eU.A09) {
            this.A02.A0M(UZ.A0s);
            c2228dL = this.A02.A0B;
            c2228dL.A0F().A3d();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            c1850Te = this.A02.A0C;
            c1850Te.A02(new C11943d(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
