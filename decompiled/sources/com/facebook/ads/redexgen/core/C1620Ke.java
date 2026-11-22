package com.facebook.ads.redexgen.core;

import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1620Ke {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 16);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{ProtocolBytes.SOF, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitcastOptions, -123, BuiltinOptions.BitcastOptions, -119, BuiltinOptions.UnsortedSegmentMinOptions, -117, BuiltinOptions.BitcastOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitcastOptions, -114, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, 63, 64, BuiltinOptions.ShapeOptions, -124, -116, -118, -117, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, -125, -125, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BitwiseXorOptions, -122, -119, BuiltinOptions.BitcastOptions, BuiltinOptions.ShapeOptions, -119, BuiltinOptions.BitcastOptions, -117, -119, Byte.MIN_VALUE, BuiltinOptions.BitcastOptions, -115, Byte.MIN_VALUE, -123, BuiltinOptions.RightShiftOptions, BuiltinOptions.ShapeOptions, Byte.MIN_VALUE, BuiltinOptions.SignOptions, -118, BuiltinOptions.BidirectionalSequenceLSTMOptions};
    }

    public C1620Ke(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C1620Ke(int i, int i2, int i3) {
        String A00 = A00(0, 0, 0);
        this.A04 = i != Integer.MIN_VALUE ? i + A00(0, 1, 112) : A00;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = Integer.MIN_VALUE;
        this.A01 = A00;
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
