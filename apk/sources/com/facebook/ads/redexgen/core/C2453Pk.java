package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2453Pk {
    public static byte[] A02;
    public static String[] A03 = {"eKMrgqlCE6gemHc3i8XP3AKPCikI", "F056EMXFpemItrIKSNHDMT", "UP7tmvacf", "VwJuHcYZb6pOUF9c5fygzqO1xhwXl8", "rbSS0TX92cN6cYo9TUPXDkEXEuy61J", "qalk034xToBy0kTaZmHtwYGALLiE8EwC", "z1", "iDDMQnl7H0FoGDQAr6PhZLTqZy2Xncag"};
    public long A00 = 0;
    public C2453Pk A01;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 37);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{BuiltinOptions.SelectOptions, BuiltinOptions.SelectOptions};
    }

    static {
        A02();
    }

    private void A01() {
        if (this.A01 == null) {
            this.A01 = new C2453Pk();
        }
    }

    public final int A03(int r10) {
        if (this.A01 == null) {
            if (r10 >= 64) {
                return Long.bitCount(this.A00);
            }
            long j = this.A00;
            long j2 = (1 << r10) - 1;
            if (A03[6].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "eBNk3oMk3zKdgPZGJWBoIC6ya78Y9W";
            strArr[4] = "SZljZRIwDL4qj86IVN03h7W6Ja49N5";
            return Long.bitCount(j & j2);
        }
        if (r10 < 64) {
            return Long.bitCount(this.A00 & ((1 << r10) - 1));
        }
        return this.A01.A03(r10 - 64) + Long.bitCount(this.A00);
    }

    public final void A04() {
        this.A00 = 0L;
        if (this.A01 != null) {
            C2453Pk c2453Pk = this.A01;
            String[] strArr = A03;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "MSI1mtfoMLAkHcYJR6PW0K";
            strArr2[7] = "fUjJFSbhC3MyLq7bD4XnyNju1VoRa1IS";
            c2453Pk.A04();
        }
    }

    public final void A05(int r7) {
        if (r7 >= 64) {
            if (this.A01 != null) {
                C2453Pk c2453Pk = this.A01;
                int r3 = r7 - 64;
                if (A03[6].length() != 2) {
                    throw new RuntimeException();
                }
                A03[6] = "gh";
                c2453Pk.A05(r3);
                return;
            }
            return;
        }
        this.A00 &= ~(1 << r7);
    }

    public final void A06(int r5) {
        if (r5 >= 64) {
            A01();
            this.A01.A06(r5 - 64);
        } else {
            this.A00 |= 1 << r5;
        }
    }

    public final void A07(int r12, boolean z) {
        if (r12 >= 64) {
            A01();
            this.A01.A07(r12 - 64, z);
            return;
        }
        boolean z2 = (this.A00 & Long.MIN_VALUE) != 0;
        long j = (1 << r12) - 1;
        long j2 = this.A00 & j;
        long j3 = this.A00;
        long mask = ~j;
        this.A00 = j2 | ((j3 & mask) << 1);
        if (z) {
            A06(r12);
        } else {
            A05(r12);
        }
        if (!z2 && this.A01 == null) {
            return;
        }
        A01();
        this.A01.A07(0, z2);
    }

    public final boolean A08(int r6) {
        if (r6 < 64) {
            return (this.A00 & (1 << r6)) != 0;
        }
        A01();
        return this.A01.A08(r6 - 64);
    }

    public final boolean A09(int r14) {
        if (r14 >= 64) {
            A01();
            return this.A01.A09(r14 - 64);
        }
        long j = 1 << r14;
        boolean z = (this.A00 & j) != 0;
        long mask = this.A00;
        this.A00 = mask & (~j);
        long j2 = j - 1;
        long j3 = this.A00 & j2;
        long mask2 = this.A00;
        long before = ~j2;
        this.A00 = j3 | Long.rotateRight(mask2 & before, 1);
        if (this.A01 != null) {
            if (this.A01.A08(0)) {
                A06(63);
            }
            this.A01.A09(0);
        }
        return z;
    }

    public final String toString() {
        return this.A01 == null ? Long.toBinaryString(this.A00) : this.A01.toString() + A00(0, 2, 114) + Long.toBinaryString(this.A00);
    }
}
