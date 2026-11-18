package com.facebook.ads.redexgen.core;

import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2326Ke {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{ProtocolBytes.SOF, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitcastOptions, -123, BuiltinOptions.BitcastOptions, -119, BuiltinOptions.UnsortedSegmentMinOptions, -117, BuiltinOptions.BitcastOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitcastOptions, -114, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, 63, 64, BuiltinOptions.ShapeOptions, -124, -116, -118, -117, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, -125, -125, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, -122, -119, BuiltinOptions.BitcastOptions, BuiltinOptions.ShapeOptions, -119, BuiltinOptions.BitcastOptions, -117, -119, -128, BuiltinOptions.BitcastOptions, -115, -128, -123, BuiltinOptions.RightShiftOptions, BuiltinOptions.ShapeOptions, -128, BuiltinOptions.SignOptions, -118, BuiltinOptions.BidirectionalSequenceLSTMOptions};
    }

    public C2326Ke(int r2, int r3) {
        this(Integer.MIN_VALUE, r2, r3);
    }

    public C2326Ke(int r7, int r8, int r9) {
        String strA00 = A00(0, 0, 0);
        this.A04 = r7 != Integer.MIN_VALUE ? r7 + A00(0, 1, 112) : strA00;
        this.A02 = r8;
        this.A03 = r9;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = strA00;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
        } else {
            throw new IllegalStateException(A00(1, 53, 7));
        }
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
