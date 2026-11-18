package com.facebook.ads.redexgen.core;

import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3172hX {
    A09(A00(DeviceFeatures.E_BOOK, 7, 111)),
    A07(A00(145, 11, 71)),
    A0A(A00(180, 16, 94)),
    A06(A00(129, 16, 114)),
    A08(A00(156, 17, 64)),
    A05(A00(120, 9, 118)),
    A04(A00(98, 22, 15));

    public static byte[] A01;
    public static String[] A02 = {"3irfHjb1xBggEOYppIC20CVGO", "PvTwVw4l1egAAUgNiEJHpQxcY", "Z83jj4f2UJi7iIzCa97fW954cYyfIvRS", "Pn3ECjM654pG8xNfJs7iPR6nvOfTtg4S", "rnvCizUmlaJkbQ0LWt7EGYvIVwvlRHSU", "Y4v1TwA3VTqRjFpvhM1P5mrv4yN1Kb1i", "iJ3TP1yTdydKb8xTTpNjz5p9ilImmlzt", "3Fyn3bOdC3lEL0zKVakbNgp9AIkAOPYu"};
    public final String A00;

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r4, r4 + r5);
        for (int r7 = 0; r7 < bArrCopyOfRange.length; r7++) {
            int r8 = bArrCopyOfRange[r7] ^ r6;
            String[] strArr = A02;
            if (strArr[4].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "9Fh1XlTwmrAkPSBsBt7sR6HEZ4z1EPMB";
            strArr2[3] = "w0XpqxyBnVeSACOsJ07N96wKg89kpHEO";
            bArrCopyOfRange[r7] = (byte) (r8 ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ZerosLikeOptions, 64, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 64, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.RankOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, 25, 16, 13, 28, 26, 0, 26, 17, 27, BuiltinOptions.ExpOptions, 32, BuiltinOptions.SliceOptions, 32, 58, BuiltinOptions.PackOptions, 63, 58, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, 61, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 2, 25, 28, 25, 24, 0, 25, 127, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.HashtableOptions, 64, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.PadV2Options, 34, 63, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, 18, BuiltinOptions.ArgMaxOptions, 35, BuiltinOptions.LessOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, 22, BuiltinOptions.DequantizeOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalOrOptions, 61, 22, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SelectOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, 18, 9, 16, 16, 35, 26, 19, 14, 17, 29, 8, 8, 14, 9, 29, 26, 24, 30, BuiltinOptions.LogSoftmaxOptions, 21, 20, 15, BuiltinOptions.LogSoftmaxOptions, 9, 30, 26, 31, 2, BuiltinOptions.ExpOptions, 58, 63, 58, BuiltinOptions.PackOptions, 35, 58, 18, 4, 12, 17, 12, 11, 2, 58, 3, 10, 23, 58, 14, 0, 28, 22};
    }

    static {
        A01();
    }

    EnumC3172hX(String str) {
        this.A00 = str;
    }
}
