package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.28, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass28 {
    public static byte[] A00;
    public static String[] A01 = {"sOrNj5Mdy4xi0kLPibyeSfiWQxOima4U", "xj48Y1LQ4ko", "eUY0SVXtYBJtN83XOuXTnKZfqvTHosXd", "paDpwp97WdTEiWCS91q7LcvTv3rNjzy2", "ATE3aiPBn3N", "z3W8kbtrqKRemiiFleAuTjlgcuTfL08m", "RcLeq9wITz99Drk9X88RRLyniy3v1DlZ", "ZhckCEJ2n6PA9tAuxk3fuT"};

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{BuiltinOptions.TransposeConvOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.LessOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SignOptions, 4, BuiltinOptions.LeakyReluOptions, BuiltinOptions.RangeOptions, 30, BuiltinOptions.BitcastOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BatchMatMulOptions, 23, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.UniqueOptions, 29, 19, 24, 17, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, 12, 13, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, 64, BuiltinOptions.RightShiftOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.RightShiftOptions, 58, 32, BuiltinOptions.EqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ArgMaxOptions, 0, BuiltinOptions.ZerosLikeOptions, 26, BuiltinOptions.ExpOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableOptions, 5, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixSetDiagOptions, 25, 31, BuiltinOptions.ScatterNdOptions, 34, 63, BuiltinOptions.BitcastOptions, 58, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, 32, 5, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquaredDifferenceOptions, 34, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.HashtableOptions, 58, BuiltinOptions.SignOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.MatrixDiagOptions, 25, 6, 3, 5, BuiltinOptions.CumsumOptions, BuiltinOptions.PowOptions, BuiltinOptions.PackOptions, BuiltinOptions.UniqueOptions, 13, 19, 24, BuiltinOptions.GreaterOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.AbsOptions, 22, 20, 20, BuiltinOptions.AddNOptions, 11, 29, 10, BuiltinOptions.ReverseV2Options, 8, 30, 9, 26, BuiltinOptions.SelectOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RandomOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectOptions, BuiltinOptions.RankOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.SquareOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 4, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, 31, 18, 3, 3, 31, 26, 16, 18, 7, 26, 28, 29, BuiltinOptions.IfOptions, 4, 22, 17, 30, BuiltinOptions.NotEqualOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.RankOptions, BuiltinOptions.SquareOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, 24, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, 4, BuiltinOptions.RangeOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 7, BuiltinOptions.RangeOptions, BuiltinOptions.LeakyReluOptions, 28, 2, 22, 7, 10, 12, BuiltinOptions.SquaredDifferenceOptions, 2, 14, 17, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 61, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, 32, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterEqualOptions, 32, 34, 28, 8, 25, 20, 18, BuiltinOptions.AddNOptions, 16, 20, 25, 20, BuiltinOptions.SliceOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.WhereOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.WhileOptions, BuiltinOptions.HardSwishOptions, 27, BuiltinOptions.QuantizeOptions, BuiltinOptions.FillOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.GatherNdOptions, 34, BuiltinOptions.NotEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GreaterEqualOptions, 32, BuiltinOptions.DequantizeOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMaxOptions, 63, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.SignOptions, BuiltinOptions.PackOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ExpOptions, BuiltinOptions.GeluOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.PowOptions, BuiltinOptions.CosOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixDiagOptions, 18, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 30, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, 61, BuiltinOptions.BitwiseXorOptions, 63, 34, BuiltinOptions.NonMaxSuppressionV5Options, 34, 32, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SegmentSumOptions, 34, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.DynamicUpdateSliceOptions, Byte.MAX_VALUE, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.TileOptions, BuiltinOptions.BucketizeOptions, Byte.MAX_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.DynamicUpdateSliceOptions, Byte.MAX_VALUE, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, 32, BuiltinOptions.ExpOptions, BuiltinOptions.PadV2Options, BuiltinOptions.HashtableOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LessOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, 32, BuiltinOptions.ExpOptions, BuiltinOptions.PadV2Options};
    }

    static {
        A04();
    }

    public static int A00(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        String filename = A03(4, 4, 104);
        if (!lastPathSegment.endsWith(filename)) {
            String filename2 = A03(29, 4, 31);
            if (!lastPathSegment.endsWith(filename2)) {
                String filename3 = A03(8, 4, 10);
                if (lastPathSegment.endsWith(filename3)) {
                    return 1;
                }
                String filename4 = A03(12, 5, 114);
                if (lastPathSegment.endsWith(filename4)) {
                    return 2;
                }
                String filename5 = A03(0, 4, 63);
                if (lastPathSegment.endsWith(filename5)) {
                    return 2;
                }
                String filename6 = A03(17, 4, 55);
                if (lastPathSegment.endsWith(filename6)) {
                    return 3;
                }
                String filename7 = A03(33, 5, 3);
                if (lastPathSegment.endsWith(filename7)) {
                    return 4;
                }
                String filename8 = A03(38, 4, 112);
                if (lastPathSegment.endsWith(filename8)) {
                    return 5;
                }
                String filename9 = A03(58, 4, 47);
                if (!lastPathSegment.endsWith(filename9)) {
                    String filename10 = A03(62, 5, 11);
                    if (!lastPathSegment.endsWith(filename10)) {
                        String filename11 = A03(98, 4, 94);
                        if (lastPathSegment.endsWith(filename11)) {
                            return 15;
                        }
                        int length = lastPathSegment.length();
                        String A03 = A03(67, 3, 84);
                        if (!lastPathSegment.startsWith(A03, length - (A03.length() + 1))) {
                            String filename12 = A03(118, 5, 33);
                            if (lastPathSegment.endsWith(filename12)) {
                                return 6;
                            }
                            String filename13 = A03(70, 4, 111);
                            if (lastPathSegment.endsWith(filename13)) {
                                return 7;
                            }
                            String A032 = A03(74, 4, 52);
                            if (!lastPathSegment.endsWith(A032)) {
                                int length2 = lastPathSegment.length();
                                String A033 = A03(55, 3, 14);
                                if (!lastPathSegment.startsWith(A033, length2 - (A033.length() + 1)) && !lastPathSegment.startsWith(A032, lastPathSegment.length() - (A032.length() + 1))) {
                                    int length3 = lastPathSegment.length();
                                    String A034 = A03(25, 4, 94);
                                    if (lastPathSegment.startsWith(A034, length3 - (A034.length() + 1))) {
                                        return 8;
                                    }
                                    int length4 = lastPathSegment.length();
                                    String A035 = A03(87, 3, 52);
                                    if (!lastPathSegment.startsWith(A035, length4 - (A035.length() + 1))) {
                                        String filename14 = A03(90, 5, 86);
                                        if (lastPathSegment.endsWith(filename14)) {
                                            return 9;
                                        }
                                        String filename15 = A03(95, 3, 104);
                                        if (!lastPathSegment.endsWith(filename15)) {
                                            String filename16 = A03(78, 5, 11);
                                            if (!lastPathSegment.endsWith(filename16)) {
                                                String filename17 = A03(83, 4, 44);
                                                if (!lastPathSegment.endsWith(filename17)) {
                                                    String filename18 = A03(51, 4, 120);
                                                    if (!lastPathSegment.endsWith(filename18)) {
                                                        String A036 = A03(102, 3, 34);
                                                        if (lastPathSegment.endsWith(A036) || lastPathSegment.startsWith(A036, lastPathSegment.length() - (A036.length() + 1))) {
                                                            return 11;
                                                        }
                                                        String filename19 = A03(109, 4, 92);
                                                        if (lastPathSegment.endsWith(filename19)) {
                                                            return 12;
                                                        }
                                                        String filename20 = A03(113, 5, 95);
                                                        if (lastPathSegment.endsWith(filename20)) {
                                                            return 12;
                                                        }
                                                        String filename21 = A03(105, 4, 64);
                                                        if (lastPathSegment.endsWith(filename21)) {
                                                            return 13;
                                                        }
                                                        String[] strArr = A01;
                                                        if (strArr[0].charAt(20) == strArr[5].charAt(20)) {
                                                            throw new RuntimeException();
                                                        }
                                                        String[] strArr2 = A01;
                                                        strArr2[2] = "SyPKArUiofAKtDYOeehIfh1mrOq04kE4";
                                                        strArr2[3] = "xM2ROt7CFYmp4WclnHzUErJdjCgsEFHY";
                                                        String filename22 = A03(123, 7, 55);
                                                        if (lastPathSegment.endsWith(filename22)) {
                                                            return 13;
                                                        }
                                                        String filename23 = A03(47, 4, 127);
                                                        if (lastPathSegment.endsWith(filename23)) {
                                                            return 14;
                                                        }
                                                        String filename24 = A03(42, 5, 112);
                                                        if (lastPathSegment.endsWith(filename24)) {
                                                            return 14;
                                                        }
                                                        String filename25 = A03(21, 4, 25);
                                                        if (!lastPathSegment.endsWith(filename25)) {
                                                            return -1;
                                                        }
                                                        return 16;
                                                    }
                                                }
                                            }
                                        }
                                        String[] strArr3 = A01;
                                        if (strArr3[0].charAt(20) != strArr3[5].charAt(20)) {
                                            String[] strArr4 = A01;
                                            strArr4[0] = "1wRaS2qHbg36RBVDXd8PcZR43XT5miNJ";
                                            strArr4[5] = "Vak8xJBIlxZA7GdMxsEEJaTmiAiwlk64";
                                            return 10;
                                        }
                                        String[] strArr5 = A01;
                                        strArr5[2] = "I1Nt4MatJPh6S3ZRGQ5jEYQUJm5selco";
                                        strArr5[3] = "WdisFFcNpT7R4JXqf39409YvWJDYYP5x";
                                        return 10;
                                    }
                                    return 9;
                                }
                                return 8;
                            }
                            return 8;
                        }
                        return 6;
                    }
                    return 15;
                }
                return 15;
            }
        }
        String[] strArr6 = A01;
        if (strArr6[2].charAt(16) == strArr6[3].charAt(16)) {
            throw new RuntimeException();
        }
        A01[7] = "O7R9Zztw2xxmA6l6DOopzc";
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d9, code lost:
    
        if (r3.equals(A03(142, 15, 11)) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        r0 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f3, code lost:
    
        if (r3.equals(A03(142, 15, 11)) != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x026c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x026d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0271 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0273 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0275 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0276 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0277 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0278 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x027a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x027b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass28.A01(java.lang.String):int");
    }

    public static int A02(Map<String, List<String>> responseHeaders) {
        List<String> list = responseHeaders.get(A03(130, 12, 34));
        return A01((list == null || list.isEmpty()) ? null : list.get(0));
    }
}
