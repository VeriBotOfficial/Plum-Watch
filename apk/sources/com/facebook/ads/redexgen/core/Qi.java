package com.facebook.ads.redexgen.core;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Qi {
    public static String[] A05 = {"40gNEszX7YLOKw1QAED", "e7K0z1bDPzofCfI", "ASnLeHz2bV9", "nmSIAJ68DE4LOtHWgfxbIilOKN", "hLnVaEL0YJl", "iKeUOsk7q", "", TokenNames.C};
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    private final int A00(int r2, int r3) {
        if (r2 > r3) {
            return 1;
        }
        if (r2 == r3) {
            return 2;
        }
        return 4;
    }

    public final void A01() {
        this.A00 = 0;
    }

    public final void A02(int r2) {
        this.A00 |= r2;
    }

    public final void A03(int r1, int r2, int r3, int r4) {
        this.A04 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final boolean A04() {
        if ((this.A00 & 7) != 0 && (this.A00 & (A00(this.A02, this.A04) << 0)) == 0) {
            return false;
        }
        if ((this.A00 & 112) != 0 && (this.A00 & (A00(this.A02, this.A03) << 4)) == 0) {
            return false;
        }
        if ((this.A00 & 1792) != 0 && (this.A00 & (A00(this.A01, this.A04) << 8)) == 0) {
            return false;
        }
        if ((this.A00 & 28672) != 0 && (this.A00 & (A00(this.A01, this.A03) << 12)) == 0) {
            return false;
        }
        if (A05[0].length() == 6) {
            throw new RuntimeException();
        }
        A05[0] = "B0e1SHPnLLvWk0RI25GHgx";
        return true;
    }
}
