package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class U8 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, 63, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, 4, 58, BuiltinOptions.EqualOptions, 63, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, 63, 4, 58, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterOptions, 4, BuiltinOptions.SparseToDenseOptions, 58, BuiltinOptions.ArgMinOptions, 4, BuiltinOptions.PowOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.SelectOptions, 4, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, 58, BuiltinOptions.PadV2Options, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, 4, BuiltinOptions.PowOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalAndOptions, 58, BuiltinOptions.SelectOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, 32, BuiltinOptions.CastOptions, BuiltinOptions.SelectOptions, BuiltinOptions.NotEqualOptions, 30, 32, BuiltinOptions.SelectOptions, BuiltinOptions.CastOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, 30, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, 32, 35, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, 30, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, 30, 32, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TransposeConvOptions, 30, 35, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, 30, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, 30, 34, BuiltinOptions.LessOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, 11, 14, 4, 29, BuiltinOptions.EqualOptions, 11, 4, 14, 24, 5, 3, 14, BuiltinOptions.EqualOptions, 15, 4, 11, 8, 6, 15, BuiltinOptions.EqualOptions, 3, 4, BuiltinOptions.EqualOptions, 11, 26, 26, BuiltinOptions.EqualOptions, 8, 24, 5, 29, 25, 15, 24, BuiltinOptions.EqualOptions, 4, 11, 28, 3, 13, 11, 30, 3, 5, 4, BuiltinOptions.Conv3DOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CosOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.CosOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CosOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CosOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, Byte.MAX_VALUE, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.WhereOptions, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions};
    }

    public static boolean A02(Context context) {
        return U7.A0V(context).A30(A00(0, 47, 121), true);
    }

    public static boolean A03(Context context) {
        return U7.A0V(context).A30(A00(47, 47, 99), false);
    }

    public static boolean A04(Context context) {
        return U7.A0V(context).A30(A00(139, 46, 41), false);
    }

    public static boolean A05(Context context) {
        return U7.A0V(context).A30(A00(Opcodes.INVOKEINTERFACE, 15, 30), false);
    }

    public static boolean A06(Context context) {
        return U7.A0V(context).A30(A00(94, 45, 72), false);
    }
}
