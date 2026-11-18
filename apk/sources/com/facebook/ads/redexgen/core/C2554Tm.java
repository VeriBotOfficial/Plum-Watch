package com.facebook.ads.redexgen.core;

import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2554Tm {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -56, -53, -50, -57, -126, -118, -121, -58, -117, -126, -98, -126, -113, -109, -12, -9, -6, -13, -82, -53, -82, -77, -14, -82, -76, -76, -82, -9, -4, -14, -13, 6, -82, -53, -82, -77, -14, -47, -44, -41, -48, -117, -88, -88, -117, -104, -100, -117, OtaCommandGenerator.CMD_GET_INFO, OtaCommandGenerator.CMD_GET_INFO, -117, -44, -39, -49, -48, -29, -117, -88, -117, OtaCommandGenerator.CMD_NOTIFY_STATUS, -49};
    }

    public C2554Tm() {
        this(-1, -1);
    }

    public C2554Tm(int r8, int r9) {
        if (r8 < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 64), Integer.valueOf(r8)));
        }
        if (r8 >= 0 && r9 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 108), Integer.valueOf(r8), Integer.valueOf(r9)));
        }
        if (r8 == -1 && r9 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 73), Integer.valueOf(r9)));
        }
        this.A00 = r8;
        this.A01 = r9;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C2554Tm c2554Tm) {
        if (this.A00 != c2554Tm.A00) {
            return this.A00 - c2554Tm.A00;
        }
        return this.A01 - c2554Tm.A01;
    }

    public final C2554Tm A05(int r6) {
        if (this.A01 + r6 >= 0) {
            return new C2554Tm(this.A00, this.A01 + r6);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 64), Integer.valueOf(r6), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2554Tm)) {
            return false;
        }
        C2554Tm c2554Tm = (C2554Tm) obj;
        return c2554Tm.A00 == this.A00 && c2554Tm.A01 == this.A01;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
