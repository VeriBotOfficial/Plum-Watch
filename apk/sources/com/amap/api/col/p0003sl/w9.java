package com.amap.api.col.p0003sl;

import androidx.core.view.MotionEventCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: compiled from: Base64Util.java */
/* JADX INFO: loaded from: classes7.dex */
public class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1954a = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
    private static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, -9, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    static final /* synthetic */ boolean c = true;

    private w9() {
    }

    public static String a(byte[] bArr) {
        String strA;
        try {
            strA = a(bArr, bArr.length);
        } catch (IOException e) {
            if (!c) {
                throw new AssertionError(e.getMessage());
            }
            strA = null;
        }
        if (c || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static byte[] a(String str) throws Throwable {
        byte[] bytes;
        byte[] bArr;
        int r12;
        int r10;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream2;
        if (str != null) {
            try {
                bytes = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            int length = bytes.length;
            if (length <= bytes.length) {
                int r4 = 1;
                if (length == 0) {
                    bArr = new byte[0];
                } else if (length >= 4) {
                    byte[] bArr2 = b;
                    int r6 = (length * 3) / 4;
                    byte[] bArr3 = new byte[r6];
                    byte[] bArr4 = new byte[4];
                    int r9 = 0;
                    int r11 = 0;
                    int r13 = 0;
                    while (r9 < length) {
                        byte b2 = bytes[r9];
                        byte b3 = bArr2[(b2 & 255) == true ? 1 : 0];
                        if (b3 < -5) {
                            throw new IOException(String.format("Bad Base64Util input character decimal %d in array position %d", Integer.valueOf(bytes[r9] & 255), Integer.valueOf(r9)));
                        }
                        if (b3 >= -1) {
                            int r14 = r11 + 1;
                            bArr4[r11] = b2;
                            if (r14 <= 3) {
                                r11 = r14;
                            } else if (r13 >= 0 && (r12 = r13 + 2) < r6) {
                                byte[] bArr5 = b;
                                byte b4 = bArr4[2];
                                if (b4 == 61) {
                                    bArr3[r13] = (byte) ((((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[r4]] & 255) << 12)) >>> 16);
                                    r10 = r4;
                                } else {
                                    byte b5 = bArr4[3];
                                    if (b5 == 61) {
                                        int r2 = ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[bArr4[r4]] & 255) << 12) | ((bArr5[b4] & 255) << 6);
                                        bArr3[r13] = (byte) (r2 >>> 16);
                                        bArr3[r13 + 1] = (byte) (r2 >>> 8);
                                        r10 = 2;
                                    } else {
                                        int r3 = (bArr5[b5] & 255) | ((bArr5[bArr4[r4]] & 255) << 12) | ((bArr5[bArr4[0]] & 255) << 18) | ((bArr5[b4] & 255) << 6);
                                        bArr3[r13] = (byte) (r3 >> 16);
                                        bArr3[r13 + 1] = (byte) (r3 >> 8);
                                        bArr3[r12] = (byte) r3;
                                        r10 = 3;
                                    }
                                }
                                r13 += r10;
                                if (bytes[r9] == 61) {
                                    break;
                                }
                                r11 = 0;
                            } else {
                                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(r6), Integer.valueOf(r13)));
                            }
                        }
                        r9++;
                        r4 = 1;
                    }
                    bArr = new byte[r13];
                    System.arraycopy(bArr3, 0, bArr, 0, r13);
                } else {
                    throw new IllegalArgumentException("Base64Util-encoded string must have at least four characters, but length specified was ".concat(String.valueOf(length)));
                }
                byte[] bArr6 = bArr;
                if (bArr6.length >= 4 && 35615 == ((bArr6[0] & 255) | ((bArr6[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
                    byte[] bArr7 = new byte[2048];
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    GZIPInputStream gZIPInputStream3 = null;
                    ByteArrayOutputStream byteArrayOutputStream2 = null;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArr6);
                            try {
                                gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int r5 = gZIPInputStream2.read(bArr7);
                                        if (r5 < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream3.write(bArr7, 0, r5);
                                    } catch (IOException e) {
                                        e = e;
                                        byteArrayOutputStream2 = byteArrayOutputStream3;
                                        try {
                                            e.printStackTrace();
                                            try {
                                                byteArrayOutputStream2.close();
                                            } catch (Exception unused2) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            gZIPInputStream3 = gZIPInputStream2;
                                            gZIPInputStream = gZIPInputStream3;
                                            byteArrayOutputStream = byteArrayOutputStream3;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Exception unused5) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        gZIPInputStream3 = gZIPInputStream2;
                                        gZIPInputStream = gZIPInputStream3;
                                        byteArrayOutputStream = byteArrayOutputStream3;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream3.toByteArray();
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Exception unused6) {
                                }
                                bArr6 = byteArray;
                            } catch (IOException e2) {
                                e = e2;
                                gZIPInputStream2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = gZIPInputStream3;
                                byteArrayOutputStream = byteArrayOutputStream3;
                                byteArrayOutputStream.close();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                throw th;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            byteArrayInputStream = null;
                            gZIPInputStream2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            gZIPInputStream = null;
                            byteArrayInputStream = null;
                            byteArrayOutputStream = byteArrayOutputStream3;
                            byteArrayOutputStream.close();
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            throw th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        byteArrayInputStream = null;
                        gZIPInputStream2 = null;
                    } catch (Throwable th5) {
                        th = th5;
                        gZIPInputStream = null;
                        byteArrayInputStream = null;
                        byteArrayOutputStream.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        throw th;
                    }
                    try {
                        gZIPInputStream2.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused8) {
                    }
                }
                return bArr6;
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bytes.length), 0, Integer.valueOf(length)));
        }
        throw new NullPointerException("Input string was null.");
    }

    private static byte[] a(byte[] bArr, int r6, int r7, byte[] bArr2, int r9) {
        byte[] bArr3 = f1954a;
        int r5 = (r7 > 0 ? (bArr[r6] << 24) >>> 8 : 0) | (r7 > 1 ? (bArr[r6 + 1] << 24) >>> 16 : 0) | (r7 > 2 ? (bArr[r6 + 2] << 24) >>> 24 : 0);
        if (r7 == 1) {
            bArr2[r9] = bArr3[r5 >>> 18];
            bArr2[r9 + 1] = bArr3[(r5 >>> 12) & 63];
            bArr2[r9 + 2] = 61;
            bArr2[r9 + 3] = 61;
            return bArr2;
        }
        if (r7 == 2) {
            bArr2[r9] = bArr3[r5 >>> 18];
            bArr2[r9 + 1] = bArr3[(r5 >>> 12) & 63];
            bArr2[r9 + 2] = bArr3[(r5 >>> 6) & 63];
            bArr2[r9 + 3] = 61;
            return bArr2;
        }
        if (r7 != 3) {
            return bArr2;
        }
        bArr2[r9] = bArr3[r5 >>> 18];
        bArr2[r9 + 1] = bArr3[(r5 >>> 12) & 63];
        bArr2[r9 + 2] = bArr3[(r5 >>> 6) & 63];
        bArr2[r9 + 3] = bArr3[r5 & 63];
        return bArr2;
    }

    private static String a(byte[] bArr, int r8) throws IOException {
        if (r8 >= 0) {
            if (r8 <= bArr.length) {
                int r0 = ((r8 / 3) * 4) + (r8 % 3 <= 0 ? 0 : 4);
                byte[] bArr2 = new byte[r0];
                int r3 = r8 - 2;
                int r4 = 0;
                int r5 = 0;
                while (r4 < r3) {
                    a(bArr, r4, 3, bArr2, r5);
                    r4 += 3;
                    r5 += 4;
                }
                if (r4 < r8) {
                    a(bArr, r4, r8 - r4, bArr2, r5);
                    r5 += 4;
                }
                if (r5 <= r0 - 1) {
                    byte[] bArr3 = new byte[r5];
                    System.arraycopy(bArr2, 0, bArr3, 0, r5);
                    bArr2 = bArr3;
                }
                try {
                    return new String(bArr2, "US-ASCII");
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr2);
                }
            }
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(r8), Integer.valueOf(bArr.length)));
        }
        throw new IllegalArgumentException("Cannot have length offset: ".concat(String.valueOf(r8)));
    }
}
