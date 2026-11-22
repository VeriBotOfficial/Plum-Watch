package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Tn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1858Tn {
    A03,
    A05,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"seqAlwXEOvzJRT", "2kwhh1C9lzELPF4tFLY2", "Jj", "sVBc1MgsVLAc0bDFJylP1xNQuOv", "HeA0CnCob9O6sWYI", "hyCzZMBJpVm0WSm5X0p8b9", "uKys1875npMZUjGe7nShhq", "p4I3Upmes50ZeKIDqz8mdw8ttLtPhh"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[3] = "YOiRDsLdwk415VnA";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhileOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.DepthToSpaceOptions};
    }

    static {
        A01();
    }
}
