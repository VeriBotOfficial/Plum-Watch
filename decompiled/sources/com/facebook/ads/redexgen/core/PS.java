package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.imageutils.JfifUtil;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.util.Arrays;
import org.apache.commons.net.telnet.TelnetCommand;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class PS {
    public static byte[] A02;
    public static String[] A03 = {"MIyaG5GGMOxZGMlafXmCt20n5rwr84Cp", "2d7Ue4OLDSzNDZ0wIaqfb27lMuRlGrEq", "mYVPmAfRmW7XSvdIWjd", "xGy6wksCbV1DRuK7mqOXpPoeqCYQ0xXA", "bG0ONBuurvv92UazdjN2MWGsVI3Uiutq", "DcUOjHhMMeDdpHUeoCsuhqU8ztRHLrD6", "9Z29anAmU4sgj9dhE7", "NGIsWgcUmAFv5dLZHkD"};
    public static final PO A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableImportOptions, 22, BuiltinOptions.UniqueOptions, BuiltinOptions.LeakyReluOptions, 9, 4, 30, 5, 15, 24, 34, 5, BuiltinOptions.PackOptions, 10, 25, 14, 5, 31, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.HardSwishOptions, 25, 20, 14, 21, 31, 8, BuiltinOptions.SparseToDenseOptions, 21, BuiltinOptions.ArgMaxOptions, 24, 9, 30, 30, 21, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, 61, BuiltinOptions.DequantizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.LogicalOrOptions, BuiltinOptions.DequantizeOptions, 7, 28, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.RandomOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, 6, 28, 64, BuiltinOptions.HardSwishOptions, 24, 23, 18, 24, 16, 26, 25, 23, 30, BuiltinOptions.FloorDivOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.ArgMinOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, 30, 63, BuiltinOptions.LessOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.NegOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.LogSoftmaxOptions, 63, BuiltinOptions.ATan2Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.CastOptions, 63, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SignOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, 58, BuiltinOptions.ArgMinOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SignOptions, 4, 31, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, 5, 31, 29, 6, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FillOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, 28, 6, BuiltinOptions.QuantizeOptions, BuiltinOptions.SquareOptions, 18, 3, 1, 9, 3, 5, 7, BuiltinOptions.GreaterOptions, 3, 15, 7, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SquareOptions, 8, 19, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, 64, 64, BuiltinOptions.FillOptions, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReverseSequenceOptions, 9, 19, 25, 2, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ZerosLikeOptions, 64, BuiltinOptions.AbsOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 24, 2, 8, 19, 64, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, 9, 19, BuiltinOptions.ReverseV2Options, BuiltinOptions.ResizeNearestNeighborOptions, 30, 15, 18, 30, BuiltinOptions.UniqueOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseSequenceOptions, 1, 30, 18, 0, BuiltinOptions.LogicalAndOptions, 19, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, 63, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.PowOptions, 34, BuiltinOptions.LessOptions, 34, BuiltinOptions.MaximumMinimumOptions, 34, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PowOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AddNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FillOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.AddNOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquareOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.DepthToSpaceOptions, 6, 4, 19, 14, 8, 9, 24, 4, 11, 2, 6, 21, 24, 1, 8, 4, 18, 20, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, Byte.MAX_VALUE, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.Rfft2dOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.IfOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RankOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, 64, BuiltinOptions.IfOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.IfOptions, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, 64, BuiltinOptions.ReverseV2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, 31, 29, 10, 23, 17, 16, 1, 29, 11, 10, 16, 18, 5, 24, 30, 31, 14, 23, 30, 18, 4, 2, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMinOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, 61, 63, BuiltinOptions.DequantizeOptions, BuiltinOptions.EqualOptions, 61, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ShapeOptions, 34, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, 34, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableImportOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CastOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, 35, BuiltinOptions.NotEqualOptions, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, 61, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseSequenceOptions, 64, BuiltinOptions.GatherNdOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixSetDiagOptions, 64, BuiltinOptions.RangeOptions, 64, BuiltinOptions.FloorModOptions, 64, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.GeluOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SplitVOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ZerosLikeOptions, 64, 64, BuiltinOptions.GatherNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, 22, 20, 3, 30, 24, 25, 8, 4, 18, 27, 18, 20, 3, BuiltinOptions.BitcastOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.GeluOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableSizeOptions, Byte.MAX_VALUE, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FloorDivOptions};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new AnonymousClass07() { // from class: com.facebook.ads.redexgen.X.04
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A04 = new AnonymousClass07();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C0A();
        } else {
            A04 = new C0D();
        }
    }

    public PS(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static PS A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new PS(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i) {
        switch (i) {
            case 1:
                return A08(367, 12, 15);
            case 2:
                return A08(SportTypeConstant.Course_33, 18, 25);
            case 4:
                return A08(577, 13, 9);
            case 8:
                return A08(312, 22, 114);
            case 16:
                return A08(334, 12, 65);
            case 32:
                String A08 = A08(379, 17, 100);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[7].length()) {
                    A03[0] = "SoHELriMkQBcnBScVZvUK7T5g3K9Fm6N";
                    return A08;
                }
                break;
            case 64:
                if (A03[0].charAt(4) != 'k') {
                    String[] strArr2 = A03;
                    strArr2[2] = "WqW7FwrDIFS0bz5Pv3V";
                    strArr2[7] = "9aPQSHdK8ccW2UHKig7";
                    return A08(TelnetCommand.EOF, 26, 53);
                }
                A03[0] = "EQhP22rcQn8uHJztvMH4f7UvmkKbnpEF";
                return A08(TelnetCommand.EOF, 26, 53);
            case 128:
                return A08(262, 32, 83);
            case 256:
                return A08(396, 35, 46);
            case 512:
                return A08(Videoio.CAP_PROP_XI_TARGET_TEMP, 39, 58);
            case 1024:
                return A08(431, 24, 107);
            case 2048:
                return A08(506, 28, 91);
            case 4096:
                return A08(556, 21, 82);
            case 8192:
                String A082 = A08(534, 22, 125);
                String[] strArr3 = A03;
                if (strArr3[4].charAt(1) == strArr3[3].charAt(1)) {
                    String[] strArr4 = A03;
                    strArr4[2] = "qK4Dr1iI0ffiXenjEdF";
                    strArr4[7] = "zXyhBsmJjFlVcoSAhS3";
                    return A082;
                }
                break;
            case 16384:
                return A08(346, 11, 80);
            case 32768:
                return A08(455, 12, 114);
            case 65536:
                return A08(357, 10, 0);
            case 131072:
                return A08(Videoio.CAP_PROP_XI_HOUS_BACK_SIDE_TEMP, 20, 99);
            default:
                return A08(TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 14, 126);
        }
        throw new RuntimeException();
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i) {
        this.A01.addAction(i);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((PP) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((PQ) obj).A00);
    }

    public final void A0R(boolean z) {
        this.A01.setScrollable(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PS ps = (PS) obj;
        if (this.A01 == null) {
            if (ps.A01 != null) {
                return false;
            }
        } else if (!this.A01.equals(ps.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01 == null) {
            return 0;
        }
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 53));
        sb.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 37));
        sb.append(builder2.append(rect).toString());
        sb.append(A08(165, 15, 60)).append(A04());
        sb.append(A08(65, 13, 98)).append(A02());
        sb.append(A08(JfifUtil.MARKER_SOS, 8, 52)).append(A05());
        sb.append(A08(91, 22, 4)).append(A03());
        sb.append(A08(226, 10, 41)).append(A06());
        sb.append(A08(41, 13, 24)).append(A0C());
        sb.append(A08(54, 11, 88)).append(A0D());
        sb.append(A08(124, 13, 5)).append(A0G());
        sb.append(A08(137, 11, 97)).append(A0H());
        sb.append(A08(206, 12, 109)).append(A0L());
        sb.append(A08(78, 13, 37)).append(A0E());
        sb.append(A08(148, 17, 120)).append(A0I());
        sb.append(A08(113, 11, 65)).append(A0F());
        sb.append(A08(180, 12, 109)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(192, 14, 124)).append(A0K());
        sb.append(builder3.toString());
        sb.append(A08(2, 3, 19));
        int A00 = A00();
        while (A00 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(A00);
            A00 &= ~numberOfTrailingZeros;
            sb.append(A07(numberOfTrailingZeros));
            String[] strArr = A03;
            if (strArr[1].charAt(26) != strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            A03[0] = "u7URBkmoClRMdzvgw4WX3UmEFyKryATB";
            if (A00 != 0) {
                sb.append(A08(0, 2, 8));
            }
        }
        sb.append(A08(624, 1, 66));
        return sb.toString();
    }
}
