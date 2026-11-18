package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC3031fB {
    A05(A00(27, 7, 66)),
    A04(A00(17, 10, 41));

    public static byte[] A01;
    public static String[] A02 = {"8ssLPxUWgolxbJp1XageKk", "Dg1K6DVjcfMH4tCqXC1sgOKGeA5uth3Q", "k5UerSqSpL774hBrbVIh5hzcGYTqhwwy", "0mtXhllSXqdp9S5VgsRy7NU2TbMA8xeG", "", "SSXMStq65k9Kuk7D57GOtIpCJ0iDP0Qg", "", "QQzDcdSrE5R6m8lZGsEzAH1KwZryrNxV"};
    public String A00;

    public static String A00(int r4, int r5, int r6) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r4, r4 + r5);
        for (int r7 = 0; r7 < bArrCopyOfRange.length; r7++) {
            int r8 = bArrCopyOfRange[r7] ^ r6;
            String[] strArr = A02;
            if (strArr[1].charAt(24) == strArr[5].charAt(24)) {
                throw new RuntimeException();
            }
            A02[0] = "rcLq9mDrDhDKDEyyKV3bsF";
            bArrCopyOfRange[r7] = (byte) (r8 ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.RightShiftOptions, 127, BuiltinOptions.VarHandleOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DensifyOptions, 22, 20, 9, 16, 15, 2, 3, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NotEqualOptions, 63, 61, BuiltinOptions.PadV2Options, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions};
    }

    static {
        A01();
    }

    EnumC3031fB(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}
