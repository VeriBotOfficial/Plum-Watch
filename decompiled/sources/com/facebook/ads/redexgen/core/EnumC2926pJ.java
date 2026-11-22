package com.facebook.ads.redexgen.core;

import com.wakeup.commonui.utils.PermissionsTipHelper;
import java.util.Arrays;
import kotlin.Metadata;
import org.tensorflow.lite.schema.BuiltinOptions;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", PermissionsTipHelper.PERMISSIONS_FLAG_FILE, "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC2926pJ {
    A05,
    A04,
    A0H,
    A0C,
    A08,
    A0B,
    A0I,
    A06,
    A0A,
    A0D,
    A0E,
    A0F,
    A07,
    A09,
    A0G;

    public static byte[] A00;
    public static String[] A01 = {"Rv8gvV16xF14rXJa8ys12UvRM3fqPLyI", "UcSDNoyAd7hAuBmsZZHLguWnytii130l", "ED7ecOC6EdeJIgNMIPoHmXrwamnQGstx", "BUEKOmcJKNgB4JeoBrUcYjJkope3pnc", "09HtIC6J3ndQ006hR2DfsxfysqzwGQ1s", "uKMTkvRb9VJmiylnlY8d6WVdU9", "Y6AdbyooKlLQqvqU7YO0Osoc2idrR8tf", "d6Zg2ebC4FLOENwv3uxY"};
    public static final /* synthetic */ InterfaceC13569w A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A01[6].charAt(0) == 's') {
            throw new RuntimeException();
        }
        A01[6] = "fY3Nz46mZ4ok68tyHpIJjbxIlrtCCt3n";
        A00 = new byte[]{BuiltinOptions.RightShiftOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BitcastOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, 20, 9, 1, 3, 20, 2, 2, 24, 30, 31, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.MatrixSetDiagOptions, 12, 31, 4, 9, 30, 3, 5, 4, 30, 29, 17, 19, 30, 13, 4, 19, 0, 27, 19, 16, 30, 23, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.FillOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AddNOptions, 64, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.RankOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, 64, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, 64};
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC2926pJ[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A01;
        if (strArr[7].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "fNr6S9qwrpJNcVOY2uQv";
        strArr2[5] = "MQ40BB82iiEDH6m8yNyJR95Ya0";
        return (EnumC2926pJ[]) clone;
    }

    static {
        A01();
        A02 = AbstractC2921pB.A01(A03);
    }
}
