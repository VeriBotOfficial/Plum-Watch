package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.lT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2699lT implements InterfaceC1535Gw {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{BuiltinOptions.FloorDivOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, 64, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.CastOptions, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMaxOptions, 32, 16, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectOptions, 4, 25, 2, 7, BuiltinOptions.CastOptions, 2, 8, 9, 20, BuiltinOptions.FillOptions, 0, 9, 2, 11, 24, 4, BuiltinOptions.ReverseV2Options};
    }

    public C2699lT(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        if (this.A00 > 0) {
            this.A05 = jArr2[this.A00 - 1] + jArr3[this.A00 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    private final int A00(long j) {
        return AbstractC12174a.A0L(this.A04, j, true, true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final long A7l() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final C1534Gv A8t(long j) {
        int A00 = A00(j);
        C1536Gx c1536Gx = new C1536Gx(this.A04[A00], this.A03[A00]);
        if (c1536Gx.A01 < j) {
            int chunkIndex = this.A00;
            if (A00 != chunkIndex - 1) {
                int chunkIndex2 = A00 + 1;
                long j2 = this.A04[chunkIndex2];
                int chunkIndex3 = A00 + 1;
                C1536Gx seekPoint = new C1536Gx(j2, this.A03[chunkIndex3]);
                return new C1534Gv(c1536Gx, seekPoint);
            }
        }
        return new C1534Gv(c1536Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1535Gw
    public final boolean AAa() {
        return true;
    }

    public final String toString() {
        return A01(42, 18, 116) + this.A00 + A01(25, 8, 1) + Arrays.toString(this.A01) + A01(15, 10, 91) + Arrays.toString(this.A03) + A01(33, 9, 93) + Arrays.toString(this.A04) + A01(1, 14, 13) + Arrays.toString(this.A02) + A01(0, 1, 112);
    }
}
