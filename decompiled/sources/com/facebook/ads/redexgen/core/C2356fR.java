package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.fR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2356fR {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final InterfaceC1804Rj A00;
    public final SF A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{BuiltinOptions.ReverseV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RandomOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.LogicalOrOptions, 30, 9, 0, 3, 13, 8, 5, 2, 11, BuiltinOptions.SquaredDifferenceOptions, 5, 1, 13, 11, 9, BuiltinOptions.RankOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, 31, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, 6, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RankOptions, 28, 6, 3, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.SignOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SignOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.TileOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SignOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SignOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TileOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.EqualOptions, 34, BuiltinOptions.ExpOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.AssignVariableOptions};
    }

    static {
        A02();
        A04 = C2356fR.class.getSimpleName();
    }

    public C2356fR(InterfaceC1804Rj interfaceC1804Rj, C2202cu c2202cu) {
        this.A00 = interfaceC1804Rj;
        this.A00.A3s(new C2358fT(this));
        this.A01 = new SF(c2202cu);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            InterfaceC1804Rj interfaceC1804Rj = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(interfaceC1804Rj.A6p().size()));
        }
        for (InterfaceC1807Rm interfaceC1807Rm : this.A00.A6p()) {
            switch (C1803Ri.A00[interfaceC1807Rm.A9G().ordinal()]) {
                case 1:
                    A04(interfaceC1807Rm.getUrl());
                    break;
                case 2:
                    A06(interfaceC1807Rm.getUrl());
                    break;
                case 3:
                    A05(interfaceC1807Rm.getUrl());
                    break;
            }
        }
        this.A01.A0X(new C2357fS(this), new S8(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        SD sd = new SD(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        sd.A02 = A00(117, 8, 106);
        this.A01.A0c(sd);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        SB sb = new SB(str, A00(81, 36, 123), A00(125, 7, 50));
        sb.A04 = true;
        sb.A02 = A00(117, 8, 106);
        this.A01.A0Y(sb);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        SB sb = new SB(str, A00(81, 36, 123), A00(125, 7, 50));
        sb.A04 = false;
        sb.A02 = A00(117, 8, 106);
        this.A01.A0b(sb);
    }
}
