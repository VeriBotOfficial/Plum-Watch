package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum ME {
    A09,
    A04,
    A05,
    A0A,
    A03,
    A08,
    A07,
    A06;

    public static byte[] A00;
    public static String[] A01 = {"lOzuqd9TjXHlivepUaRJZyovV0XRZz3Q", "3CmPFRqqfEz1KNHoTaFI9Gq9W7MdJSat", "haORrB9MD96pjJjEM3VH9Mkp1W5ocbVO", "NmjzB0Xtr3isEon9bZHWRNmwidAWwXHD", "sUTNp2nMxY0O1vbAqz8mD0UyRSKVk6HB", "U2dhTMN4g5dnFjvsoCGatnesuvXNv1a4", "4yC8jy8D2py2trVgka4ywqiYEdNiB8JC", "oszw9hdc4eixLtuswncqLzcYbbEIixDe"};

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.CastOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SignOptions, BuiltinOptions.SignOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RightShiftOptions, 32, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpOptions, 32, 28, 1, 13, 28, 11, 23, 24, 21, 6, 27, 11, 22, 14, 10, 28, 11, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AssignVariableOptions};
    }

    static {
        A01();
    }

    public static boolean A02(ME me) {
        return A04.equals(me) || A05.equals(me);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ME[] valuesCustom() {
        ME[] meArr = (ME[]) values().clone();
        String[] strArr = A01;
        if (strArr[6].charAt(17) != strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "RzvFYuFX7ttNqzVxDa22HEjRW3DLLGXn";
        strArr2[0] = "i0gT3y5gW8KzD6GAKa0KnQ1HdBIZCzpI";
        return meArr;
    }
}
