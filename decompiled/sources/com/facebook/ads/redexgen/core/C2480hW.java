package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.hW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2480hW {

    @Nullable
    public static Boolean A00;
    public static byte[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{BuiltinOptions.Conv3DOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 64, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, 12, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, 12, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, 12, BuiltinOptions.FloorDivOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, 12, BuiltinOptions.VarHandleOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SplitVOptions, 7, BuiltinOptions.NegOptions, 61, 32, 10, BuiltinOptions.ShapeOptions, 32, 26, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, 35, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.GeluOptions, 58, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, 58, BuiltinOptions.DensifyOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, 58, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.RandomOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixDiagOptions, 24, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions};
    }

    static {
        A01();
        A00 = null;
    }

    public static boolean A02() {
        if (A00 != null) {
            return A00.booleanValue();
        }
        A00 = false;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(A00(75, 9, 74));
                Iterator<String> it = createDecoderByType.getSupportedVendorParameters().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String param = it.next();
                    if (param.equals(A00(36, 39, 106))) {
                        A00 = true;
                        break;
                    }
                }
                createDecoderByType.release();
            }
        } catch (IOException e) {
            String param2 = A00(25, 11, 50);
            AbstractC2411gL.A02(param2, A00(0, 25, 81), e);
        }
        return A00.booleanValue();
    }

    public static boolean A03(int i, int i2) {
        if (i >= 480 && i2 >= 480 && i <= 3840 && i2 <= 2160) {
            return true;
        }
        return false;
    }
}
