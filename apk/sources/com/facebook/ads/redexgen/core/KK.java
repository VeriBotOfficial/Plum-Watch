package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KK {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public KK(int r2) {
        this.A02 = new byte[r2];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int r4, int r5) {
        if (!this.A03) {
            return;
        }
        int r6 = r5 - r4;
        int length = this.A02.length;
        int readLength = this.A00;
        if (length < readLength + r6) {
            byte[] bArr2 = this.A02;
            int readLength2 = this.A00;
            this.A02 = Arrays.copyOf(bArr2, (readLength2 + r6) * 2);
        }
        byte[] bArr3 = this.A02;
        int readLength3 = this.A00;
        System.arraycopy(bArr, r4, bArr3, readLength3, r6);
        int readLength4 = this.A00;
        this.A00 = readLength4 + r6;
    }

    public final boolean A02(int r4, int r5) {
        if (this.A03) {
            this.A00 -= r5;
            if (this.A01 == 0 && r4 == 181) {
                this.A01 = this.A00;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (r4 == 179) {
            this.A03 = true;
        }
        A01(A04, 0, A04.length);
        return false;
    }
}
