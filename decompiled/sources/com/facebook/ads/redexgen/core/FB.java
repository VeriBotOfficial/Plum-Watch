package com.facebook.ads.redexgen.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class FB {
    public static Constructor<?> A00;
    public static Constructor<?> A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;
    public static byte[] A05;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{BuiltinOptions.WhereOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixSetDiagOptions, 25, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.IfOptions, 25, BuiltinOptions.RankOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, 25, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SplitVOptions, 25, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RankOptions, 4, 25, BuiltinOptions.AddNOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 25, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, 25, BuiltinOptions.BucketizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.SquareOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.FillOptions, BuiltinOptions.FillOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 19, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, 19, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ATan2Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.PackOptions, BuiltinOptions.GeluOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.PackOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.PackOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.PackOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.PackOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.PackOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalOrOptions, 26, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LessOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.DequantizeOptions, 12, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectOptions, 58, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PackOptions};
    }

    public static InterfaceC11963f A00(float f) throws Exception {
        A04();
        Object newInstance = A00.newInstance(new Object[0]);
        A04.invoke(newInstance, Float.valueOf(f));
        Object builder = A02.invoke(newInstance, new Object[0]);
        C3M.A01(builder);
        return null;
    }

    public static InterfaceC12194c A01() throws Exception {
        A04();
        Object builder = A03.invoke(A01.newInstance(new Object[0]), new Object[0]);
        C3M.A01(builder);
        return null;
    }

    @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
    public static void A04() throws Exception {
        Constructor<?> constructor = A00;
        String A022 = A02(0, 5, 30);
        if (constructor == null || A04 == null || A02 == null) {
            Class<?> cls = Class.forName(A02(97, 86, 60));
            A00 = cls.getConstructor(new Class[0]);
            Class<?> scaleAndRotateTransformationBuilderClass = Float.TYPE;
            A04 = cls.getMethod(A02(183, 18, 97), scaleAndRotateTransformationBuilderClass);
            A02 = cls.getMethod(A022, new Class[0]);
        }
        if (A01 == null || A03 == null) {
            Class<?> cls2 = Class.forName(A02(5, 92, 30));
            A01 = cls2.getConstructor(new Class[0]);
            A03 = cls2.getMethod(A022, new Class[0]);
        }
    }
}
