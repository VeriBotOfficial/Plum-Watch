package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.Random;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.hY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2482hY {
    public static String A00;
    public static String A01;
    public static byte[] A02;
    public static final Random A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{BuiltinOptions.MaximumMinimumOptions, 0, 8, 13, 4, 5, BuiltinOptions.FloorDivOptions, 21, 14, BuiltinOptions.FloorDivOptions, 19, 4, 21, 19, 8, 4, 23, 4, BuiltinOptions.FloorDivOptions, BuiltinOptions.GreaterOptions, 4, 5, 8, 0, BuiltinOptions.MaximumMinimumOptions, 14, 19, 12, 0, 21, BuiltinOptions.RangeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, 9, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, 32, BuiltinOptions.GeluOptions, 10, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.NegOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.QuantizeOptions, 13, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SegmentSumOptions, 13, BuiltinOptions.HashtableOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableSizeOptions, 13, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, 13, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquareOptions, 13, 28, BuiltinOptions.PackOptions, 13, 28, BuiltinOptions.FloorModOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.LessEqualOptions, 58, BuiltinOptions.PadV2Options, BuiltinOptions.FloorModOptions, 30, 1, 12, 13, 7, BuiltinOptions.FloorModOptions, 12, 29, 26, 9, 28, 1, 7, 6, BuiltinOptions.FloorModOptions, 28, 7, BuiltinOptions.FloorModOptions, BuiltinOptions.MirrorPadOptions, 12, BuiltinOptions.ShapeOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogSoftmaxOptions, 32, BuiltinOptions.ArgMaxOptions, 34, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 18, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogSoftmaxOptions, 35, BuiltinOptions.NegOptions, 18, BuiltinOptions.ArgMinOptions, 34, 18, BuiltinOptions.PadV2Options, BuiltinOptions.LogSoftmaxOptions, 35, BuiltinOptions.LessOptions, 18, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, 32, BuiltinOptions.ArgMaxOptions, 35, BuiltinOptions.ArgMinOptions, 18, BuiltinOptions.LogSoftmaxOptions, 35, 18, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, 17, 2, 9, 3, 8, 21, BuiltinOptions.RangeOptions, 20, 2, 4, BuiltinOptions.ResizeNearestNeighborOptions, 6, 14, 1, 21, 4, BuiltinOptions.ResizeNearestNeighborOptions, 19, 21, 6, 9, 20, 1, 2, 21, BuiltinOptions.ResizeNearestNeighborOptions, 21, 2, 22, 18, 2, 20, 19, BuiltinOptions.RangeOptions, 17, 6, 11, 18, 2, 15, 28, 23, 29, 22, 11, BuiltinOptions.ReverseSequenceOptions, 10, 28, 26, BuiltinOptions.CosOptions, 24, 16, 31, 11, 26, BuiltinOptions.CosOptions, 15, 16, 29, 28, 22, BuiltinOptions.CosOptions, 29, 12, 11, 24, 13, 16, 22, 23, BuiltinOptions.ReverseSequenceOptions, 15, 24, 21, 12, 28, BuiltinOptions.AssignVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions};
    }

    static {
        A02();
        A00 = A01(41, 12, 83);
        A01 = A01(119, 37, 71);
        A03 = new Random();
    }

    public static int A00(int i, int i2) {
        if (i2 != 0) {
            return (int) ((Math.pow(2.0d, i - 1) * i2 * 1000.0d) + A03.nextInt(2000));
        }
        return (int) Math.min(((i - 1) * 1000) + 500, 5000L);
    }

    public static void A03(C2500hv c2500hv, MediaFormat mediaFormat) {
        String A012 = A01(0, 30, 107);
        String A013 = A01(30, 11, 11);
        if (!c2500hv.A01) {
            return;
        }
        try {
            if (C2480hW.A02()) {
                if (c2500hv.A0O && !C2480hW.A03(mediaFormat.getInteger(A01(DeviceFeatures.HEADSET_KEY_CALL, 5, 12)), mediaFormat.getInteger(A01(113, 6, 85)))) {
                    return;
                }
                long j = c2500hv.A00;
                if (j > 0) {
                    mediaFormat.setLong(A01(195, 37, 115), j);
                    AbstractC2411gL.A01(A013, A01(82, 31, 98), Long.valueOf(j));
                }
                mediaFormat.setInteger(A01(156, 39, 109), 1);
                AbstractC2411gL.A00(A013, A01(53, 29, 39));
            }
        } catch (ClassCastException e) {
            AbstractC2411gL.A02(A013, A012, e);
        } catch (NullPointerException e2) {
            AbstractC2411gL.A02(A013, A012, e2);
        }
    }

    public static boolean A04(C2500hv c2500hv, int i, int i2, int i3, int i4) {
        if (c2500hv.A01 && c2500hv.A0O && C2480hW.A03(i, i2) != C2480hW.A03(i3, i4)) {
            return true;
        }
        return false;
    }
}
