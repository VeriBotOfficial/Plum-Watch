package com.baidu.mapauto.auth.util;

import androidx.core.view.MotionEventCompat;
import java.io.UnsupportedEncodingException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes15.dex */
public final class Base64Util {
    private static final byte[] MAP = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};

    private Base64Util() {
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int r17) {
        byte b;
        int r15;
        int r0 = (r17 / 4) * 3;
        if (r0 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[r0];
        int r3 = r17;
        int r4 = 0;
        while (true) {
            byte b2 = bArr[r3 - 1];
            b = 10;
            if (b2 != 10 && b2 != 13 && b2 != 32 && b2 != 9) {
                if (b2 != 61) {
                    break;
                }
                r4++;
            }
            r3--;
        }
        int r5 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        while (r5 < r3) {
            byte b3 = bArr[r5];
            if (b3 != b && b3 != 13 && b3 != 32 && b3 != 9) {
                if (b3 >= 65 && b3 <= 90) {
                    r15 = b3 - 65;
                } else if (b3 >= 97 && b3 <= 122) {
                    r15 = b3 - 71;
                } else if (b3 >= 48 && b3 <= 57) {
                    r15 = b3 + 4;
                } else if (b3 == 43) {
                    r15 = 62;
                } else {
                    if (b3 != 47) {
                        return null;
                    }
                    r15 = 63;
                }
                r11 = ((byte) r15) | (r11 << 6);
                if (r12 % 4 == 3) {
                    bArr2[r10] = (byte) ((16711680 & r11) >> 16);
                    int r14 = r10 + 2;
                    bArr2[r10 + 1] = (byte) ((65280 & r11) >> 8);
                    r10 += 3;
                    bArr2[r14] = (byte) (r11 & 255);
                }
                r12++;
            }
            r5++;
            b = 10;
        }
        if (r4 > 0) {
            int r1 = r11 << (r4 * 6);
            int r6 = r10 + 1;
            bArr2[r10] = (byte) ((r1 & 16711680) >> 16);
            if (r4 == 1) {
                r10 += 2;
                bArr2[r6] = (byte) ((r1 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
            } else {
                r10 = r6;
            }
        }
        byte[] bArr3 = new byte[r10];
        System.arraycopy(bArr2, 0, bArr3, 0, r10);
        return bArr3;
    }

    public static String encode(byte[] bArr, String str) throws UnsupportedEncodingException {
        int length = (bArr.length * 4) / 3;
        byte[] bArr2 = new byte[(length / 76) + 3 + length];
        int length2 = bArr.length - (bArr.length % 3);
        int r4 = 0;
        int r5 = 0;
        for (int r3 = 0; r3 < length2; r3 += 3) {
            byte[] bArr3 = MAP;
            bArr2[r4] = bArr3[(bArr[r3] & 255) >> 2];
            int r11 = r3 + 1;
            bArr2[r4 + 1] = bArr3[((bArr[r3] & 3) << 4) | ((bArr[r11] & 255) >> 4)];
            int r10 = r3 + 2;
            bArr2[r4 + 2] = bArr3[((bArr[r11] & 15) << 2) | ((bArr[r10] & 255) >> 6)];
            int r6 = r4 + 4;
            bArr2[r4 + 3] = bArr3[bArr[r10] & 63];
            if ((r6 - r5) % 76 != 0 || r6 == 0) {
                r4 = r6;
            } else {
                r4 += 5;
                bArr2[r6] = 10;
                r5++;
            }
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            byte[] bArr4 = MAP;
            bArr2[r4] = bArr4[(bArr[length2] & 255) >> 2];
            bArr2[r4 + 1] = bArr4[(bArr[length2] & 3) << 4];
            int r13 = r4 + 3;
            bArr2[r4 + 2] = 61;
            r4 += 4;
            bArr2[r13] = 61;
        } else if (length3 == 2) {
            byte[] bArr5 = MAP;
            bArr2[r4] = bArr5[(bArr[length2] & 255) >> 2];
            int r12 = (bArr[length2] & 3) << 4;
            int r1 = length2 + 1;
            bArr2[r4 + 1] = bArr5[((bArr[r1] & 255) >> 4) | r12];
            int r7 = r4 + 3;
            bArr2[r4 + 2] = bArr5[(bArr[r1] & 15) << 2];
            r4 += 4;
            bArr2[r7] = 61;
        }
        return new String(bArr2, 0, r4, str);
    }

    public static String encodeWithoutLineFeed(byte[] bArr, String str) throws UnsupportedEncodingException {
        int length = (bArr.length * 4) / 3;
        byte[] bArr2 = new byte[(length / 76) + 3 + length];
        int length2 = bArr.length - (bArr.length % 3);
        int r4 = 0;
        for (int r3 = 0; r3 < length2; r3 += 3) {
            byte[] bArr3 = MAP;
            bArr2[r4] = bArr3[(bArr[r3] & 255) >> 2];
            int r10 = r3 + 1;
            bArr2[r4 + 1] = bArr3[((bArr[r3] & 3) << 4) | ((bArr[r10] & 255) >> 4)];
            int r6 = r4 + 3;
            int r9 = r3 + 2;
            bArr2[r4 + 2] = bArr3[((bArr[r10] & 15) << 2) | ((bArr[r9] & 255) >> 6)];
            r4 += 4;
            bArr2[r6] = bArr3[bArr[r9] & 63];
        }
        int length3 = bArr.length % 3;
        if (length3 == 1) {
            byte[] bArr4 = MAP;
            bArr2[r4] = bArr4[(bArr[length2] & 255) >> 2];
            bArr2[r4 + 1] = bArr4[(bArr[length2] & 3) << 4];
            int r12 = r4 + 3;
            bArr2[r4 + 2] = 61;
            r4 += 4;
            bArr2[r12] = 61;
        } else if (length3 == 2) {
            byte[] bArr5 = MAP;
            bArr2[r4] = bArr5[(bArr[length2] & 255) >> 2];
            int r11 = (bArr[length2] & 3) << 4;
            int r1 = length2 + 1;
            bArr2[r4 + 1] = bArr5[((bArr[r1] & 255) >> 4) | r11];
            int r5 = r4 + 3;
            bArr2[r4 + 2] = bArr5[(bArr[r1] & 15) << 2];
            r4 += 4;
            bArr2[r5] = 61;
        }
        return new String(bArr2, 0, r4, str);
    }
}
