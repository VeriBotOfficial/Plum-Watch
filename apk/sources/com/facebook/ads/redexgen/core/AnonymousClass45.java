package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.45, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass45 {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-125, BuiltinOptions.UnsortedSegmentMaxOptions, -54, -64, -47, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.UnsortedSegmentMaxOptions, -64, -54, BuiltinOptions.UnsortedSegmentMaxOptions, -97, -60, -52, -73, -62, -65, -70, BuiltinOptions.UnsortedSegmentProdOptions, -65, -60, -70, -69, -50, BuiltinOptions.UnsortedSegmentProdOptions};
    }

    public AnonymousClass45() {
        this(32);
    }

    public AnonymousClass45(int r2) {
        this.A01 = new long[r2];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int r5) {
        if (r5 >= 0 && r5 < this.A00) {
            return this.A01[r5];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 43) + r5 + A00(0, 10, 44) + this.A00);
    }

    public final void A04(long j) {
        if (this.A00 == this.A01.length) {
            this.A01 = Arrays.copyOf(this.A01, this.A00 * 2);
        }
        long[] jArr = this.A01;
        int r1 = this.A00;
        this.A00 = r1 + 1;
        jArr[r1] = j;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
