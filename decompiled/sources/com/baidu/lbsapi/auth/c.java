package com.baidu.lbsapi.auth;

import androidx.core.view.MotionEventCompat;
import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f7489a = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};

    public static String a(byte[] bArr, String str) throws UnsupportedEncodingException {
        int length = (bArr.length * 4) / 3;
        byte[] bArr2 = new byte[length + (length / 76) + 3];
        int length2 = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length2; i2 += 3) {
            byte[] bArr3 = f7489a;
            bArr2[i] = bArr3[(bArr[i2] & 255) >> 2];
            int i3 = i2 + 1;
            bArr2[i + 1] = bArr3[((bArr[i2] & 3) << 4) | ((bArr[i3] & 255) >> 4)];
            int i4 = i + 3;
            int i5 = i2 + 2;
            bArr2[i + 2] = bArr3[((bArr[i3] & 15) << 2) | ((bArr[i5] & 255) >> 6)];
            i += 4;
            bArr2[i4] = bArr3[bArr[i5] & 63];
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            byte[] bArr4 = f7489a;
            bArr2[i] = bArr4[(bArr[length2] & 255) >> 2];
            bArr2[i + 1] = bArr4[(bArr[length2] & 3) << 4];
            int i6 = i + 3;
            bArr2[i + 2] = 61;
            i += 4;
            bArr2[i6] = 61;
        } else if (length3 == 2) {
            byte[] bArr5 = f7489a;
            bArr2[i] = bArr5[(bArr[length2] & 255) >> 2];
            int i7 = (bArr[length2] & 3) << 4;
            int i8 = length2 + 1;
            bArr2[i + 1] = bArr5[((bArr[i8] & 255) >> 4) | i7];
            int i9 = i + 3;
            bArr2[i + 2] = bArr5[(bArr[i8] & 15) << 2];
            i += 4;
            bArr2[i9] = 61;
        }
        return new String(bArr2, 0, i, str);
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    public static byte[] a(byte[] bArr, int i) {
        byte b;
        int i2;
        int i3 = (i / 4) * 3;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        int i4 = i;
        int i5 = 0;
        while (true) {
            byte b2 = bArr[i4 - 1];
            b = 10;
            if (b2 != 10 && b2 != 13 && b2 != 32 && b2 != 9) {
                if (b2 != 61) {
                    break;
                }
                i5++;
            }
            i4--;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i6 < i4) {
            byte b3 = bArr[i6];
            if (b3 != b && b3 != 13 && b3 != 32 && b3 != 9) {
                if (b3 >= 65 && b3 <= 90) {
                    i2 = b3 - 65;
                } else if (b3 >= 97 && b3 <= 122) {
                    i2 = b3 - 71;
                } else if (b3 >= 48 && b3 <= 57) {
                    i2 = b3 + 4;
                } else if (b3 == 43) {
                    i2 = 62;
                } else {
                    if (b3 != 47) {
                        return null;
                    }
                    i2 = 63;
                }
                i7 = ((byte) i2) | (i7 << 6);
                if (i9 % 4 == 3) {
                    bArr2[i8] = (byte) ((16711680 & i7) >> 16);
                    int i10 = i8 + 2;
                    bArr2[i8 + 1] = (byte) ((65280 & i7) >> 8);
                    i8 += 3;
                    bArr2[i10] = (byte) (i7 & 255);
                }
                i9++;
            }
            i6++;
            b = 10;
        }
        if (i5 > 0) {
            int i11 = i7 << (i5 * 6);
            int i12 = i8 + 1;
            bArr2[i8] = (byte) ((i11 & 16711680) >> 16);
            if (i5 == 1) {
                i8 += 2;
                bArr2[i12] = (byte) ((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
            } else {
                i8 = i12;
            }
        }
        byte[] bArr3 = new byte[i8];
        System.arraycopy(bArr2, 0, bArr3, 0, i8);
        return bArr3;
    }
}
