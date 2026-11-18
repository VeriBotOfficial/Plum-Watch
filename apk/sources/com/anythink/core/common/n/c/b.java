package com.anythink.core.common.n.c;

import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes16.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f4217a = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
    private static final byte[] b = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};

    private b() {
    }

    public static byte[] a(String str) {
        int r13;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int r5 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[r5];
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        for (int r8 = 0; r8 < length; r8++) {
            char cCharAt2 = str.charAt(r8);
            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                r13 = cCharAt2 - 'A';
            } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                r13 = cCharAt2 - 'G';
            } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                r13 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                r13 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    r13 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            r10 = (r10 << 6) | ((byte) r13);
            r9++;
            if (r9 % 4 == 0) {
                bArr[r11] = (byte) (r10 >> 16);
                int r14 = r11 + 2;
                bArr[r11 + 1] = (byte) (r10 >> 8);
                r11 += 3;
                bArr[r14] = (byte) r10;
            }
        }
        int r12 = r9 % 4;
        if (r12 == 1) {
            return null;
        }
        if (r12 == 2) {
            bArr[r11] = (byte) ((r10 << 12) >> 16);
            r11++;
        } else if (r12 == 3) {
            int r15 = r10 << 6;
            int r0 = r11 + 1;
            bArr[r11] = (byte) (r15 >> 16);
            r11 += 2;
            bArr[r0] = (byte) (r15 >> 8);
        }
        if (r11 == r5) {
            return bArr;
        }
        byte[] bArr2 = new byte[r11];
        System.arraycopy(bArr, 0, bArr2, 0, r11);
        return bArr2;
    }

    public static String a(byte[] bArr) {
        return a(bArr, f4217a);
    }

    public static String b(byte[] bArr) {
        return a(bArr, b);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int r4 = 0;
        for (int r3 = 0; r3 < length; r3 += 3) {
            bArr3[r4] = bArr2[(bArr[r3] & 255) >> 2];
            int r8 = r3 + 1;
            bArr3[r4 + 1] = bArr2[((bArr[r3] & 3) << 4) | ((bArr[r8] & 255) >> 4)];
            int r5 = r4 + 3;
            int r7 = (bArr[r8] & 15) << 2;
            int r9 = r3 + 2;
            bArr3[r4 + 2] = bArr2[r7 | ((bArr[r9] & 255) >> 6)];
            r4 += 4;
            bArr3[r5] = bArr2[bArr[r9] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[r4] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[r4 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[r4 + 2] = 61;
            bArr3[r4 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[r4] = bArr2[(bArr[length] & 255) >> 2];
            int r10 = (bArr[length] & 3) << 4;
            int r2 = length + 1;
            bArr3[r4 + 1] = bArr2[((bArr[r2] & 255) >> 4) | r10];
            bArr3[r4 + 2] = bArr2[(bArr[r2] & 15) << 2];
            bArr3[r4 + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
