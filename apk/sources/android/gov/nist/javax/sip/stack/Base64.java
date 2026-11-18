package android.gov.nist.javax.sip.stack;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPOutputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    public static final int URL_SAFE = 16;
    private static final byte[] _STANDARD_ALPHABET = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte[] _STANDARD_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, -9, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _URL_SAFE_ALPHABET = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};
    private static final byte[] _URL_SAFE_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _ORDERED_ALPHABET = {BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options};
    private static final byte[] _ORDERED_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, -9, -9, -9, -9, BuiltinOptions.CastOptions, -9, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.LogicalAndOptions, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private static final byte[] getAlphabet(int r2) {
        if ((r2 & 16) == 16) {
            return _URL_SAFE_ALPHABET;
        }
        if ((r2 & 32) == 32) {
            return _ORDERED_ALPHABET;
        }
        return _STANDARD_ALPHABET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDecodabet(int r2) {
        if ((r2 & 16) == 16) {
            return _URL_SAFE_DECODABET;
        }
        if ((r2 & 32) == 32) {
            return _ORDERED_DECODABET;
        }
        return _STANDARD_DECODABET;
    }

    private Base64() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int r8, int r9) {
        encode3to4(bArr2, 0, r8, bArr, 0, r9);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int r5, int r6, byte[] bArr2, int r8, int r9) {
        byte[] alphabet = getAlphabet(r9);
        int r4 = (r6 > 0 ? (bArr[r5] << 24) >>> 8 : 0) | (r6 > 1 ? (bArr[r5 + 1] << 24) >>> 16 : 0) | (r6 > 2 ? (bArr[r5 + 2] << 24) >>> 24 : 0);
        if (r6 == 1) {
            bArr2[r8] = alphabet[r4 >>> 18];
            bArr2[r8 + 1] = alphabet[(r4 >>> 12) & 63];
            bArr2[r8 + 2] = 61;
            bArr2[r8 + 3] = 61;
            return bArr2;
        }
        if (r6 == 2) {
            bArr2[r8] = alphabet[r4 >>> 18];
            bArr2[r8 + 1] = alphabet[(r4 >>> 12) & 63];
            bArr2[r8 + 2] = alphabet[(r4 >>> 6) & 63];
            bArr2[r8 + 3] = 61;
            return bArr2;
        }
        if (r6 != 3) {
            return bArr2;
        }
        bArr2[r8] = alphabet[r4 >>> 18];
        bArr2[r8 + 1] = alphabet[(r4 >>> 12) & 63];
        bArr2[r8 + 2] = alphabet[(r4 >>> 6) & 63];
        bArr2[r8 + 3] = alphabet[r4 & 63];
        return bArr2;
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int r3 = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, r3);
            encode3to4(bArr2, bArr, r3, 0);
            byteBuffer2.put(bArr2);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int r4 = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, r4);
            encode3to4(bArr2, bArr, r4, 0);
            for (int r5 = 0; r5 < 4; r5++) {
                charBuffer.put((char) (bArr2[r5] & 255));
            }
        }
    }

    public static String encodeObject(Serializable serializable) throws IOException {
        return encodeObject(serializable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static String encodeObject(Serializable serializable, int r6) throws Throwable {
        ?? gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        objectOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                outputStream = new OutputStream(byteArrayOutputStream, r6 | 1);
                try {
                    if ((r6 & 2) != 0) {
                        gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                            gZIPOutputStream = gZIPOutputStream;
                        } catch (IOException e) {
                            e = e;
                            objectOutputStream = objectOutputStream2;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            gZIPOutputStream = gZIPOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                objectOutputStream2 = objectOutputStream3;
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    outputStream.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused4) {
                                    throw th;
                                }
                            }
                        }
                    } else {
                        objectOutputStream2 = new ObjectOutputStream(outputStream);
                        gZIPOutputStream = 0;
                    }
                    objectOutputStream2.writeObject(serializable);
                    try {
                        objectOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused8) {
                    }
                    try {
                        return new String(byteArrayOutputStream.toByteArray(), "US-ASCII");
                    } catch (UnsupportedEncodingException unused9) {
                        return new String(byteArrayOutputStream.toByteArray());
                    }
                } catch (IOException e2) {
                    e = e2;
                    ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = objectOutputStream4;
                    gZIPOutputStream = objectOutputStream4;
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = objectOutputStream2;
                }
            } catch (IOException e3) {
                e = e3;
                gZIPOutputStream = 0;
                outputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                objectOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                gZIPOutputStream = 0;
                outputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            gZIPOutputStream = 0;
            objectOutputStream = null;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            gZIPOutputStream = 0;
            byteArrayOutputStream = null;
            outputStream = null;
        }
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int r3) throws IOException {
        return encodeBytes(bArr, 0, bArr.length, r3);
    }

    public static String encodeBytes(byte[] bArr, int r2, int r3) {
        try {
            return encodeBytes(bArr, r2, r3, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int r1, int r2, int r3) throws Throwable {
        byte[] bArrEncodeBytesToBytes = encodeBytesToBytes(bArr, r1, r2, r3);
        try {
            return new String(bArrEncodeBytesToBytes, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrEncodeBytesToBytes);
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr, int r19, int r20, int r21) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        if (bArr == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (r19 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + r19);
        }
        if (r20 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + r20);
        }
        if (r19 + r20 > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(r19), Integer.valueOf(r20), Integer.valueOf(bArr.length)));
        }
        if ((r21 & 2) != 0) {
            GZIPOutputStream gZIPOutputStream2 = null;
            gZIPOutputStream2 = null;
            gZIPOutputStream2 = null;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    outputStream = new OutputStream(byteArrayOutputStream, r21 | 1);
                    try {
                        gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            gZIPOutputStream.write(bArr, r19, r20);
                            gZIPOutputStream.close();
                            try {
                                gZIPOutputStream.close();
                            } catch (Exception unused) {
                            }
                            try {
                                outputStream.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception unused3) {
                            }
                            return byteArrayOutputStream.toByteArray();
                        } catch (IOException e) {
                            e = e;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                gZIPOutputStream2 = gZIPOutputStream;
                                try {
                                    gZIPOutputStream2.close();
                                } catch (Exception unused4) {
                                }
                                try {
                                    outputStream.close();
                                } catch (Exception unused5) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused6) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            gZIPOutputStream2 = gZIPOutputStream;
                            gZIPOutputStream2.close();
                            outputStream.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        gZIPOutputStream = null;
                    }
                } catch (IOException e3) {
                    e = e3;
                    outputStream = null;
                    gZIPOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = null;
                gZIPOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
                outputStream = null;
            }
        } else {
            boolean z = (r21 & 8) != 0;
            int r1 = ((r20 / 3) * 4) + (r20 % 3 > 0 ? 4 : 0);
            if (z) {
                r1 += r1 / 76;
            }
            int r13 = r1;
            byte[] bArr2 = new byte[r13];
            int r15 = r20 - 2;
            int r6 = 0;
            int r16 = 0;
            int r17 = 0;
            while (r6 < r15) {
                int r10 = r6;
                encode3to4(bArr, r6 + r19, 3, bArr2, r16, r21);
                int r2 = r17 + 4;
                if (!z || r2 < 76) {
                    r17 = r2;
                } else {
                    bArr2[r16 + 4] = 10;
                    r16++;
                    r17 = 0;
                }
                r6 = r10 + 3;
                r16 += 4;
            }
            int r11 = r6;
            if (r11 < r20) {
                encode3to4(bArr, r11 + r19, r20 - r11, bArr2, r16, r21);
                r16 += 4;
            }
            int r0 = r16;
            if (r0 > r13 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[r0];
            System.arraycopy(bArr2, 0, bArr3, 0, r0);
            return bArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int r6, byte[] bArr2, int r8, int r9) {
        int r0;
        int r1;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (r6 < 0 || (r0 = r6 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(r6)));
        }
        if (r8 < 0 || (r1 = r8 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(r8)));
        }
        byte[] decodabet = getDecodabet(r9);
        byte b = bArr[r6 + 2];
        if (b == 61) {
            bArr2[r8] = (byte) ((((decodabet[bArr[r6 + 1]] & 255) << 12) | ((decodabet[bArr[r6]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b2 = bArr[r0];
        if (b2 == 61) {
            int r5 = ((decodabet[bArr[r6 + 1]] & 255) << 12) | ((decodabet[bArr[r6]] & 255) << 18) | ((decodabet[b] & 255) << 6);
            bArr2[r8] = (byte) (r5 >>> 16);
            bArr2[r8 + 1] = (byte) (r5 >>> 8);
            return 2;
        }
        int r7 = ((decodabet[bArr[r6 + 1]] & 255) << 12) | ((decodabet[bArr[r6]] & 255) << 18) | ((decodabet[b] & 255) << 6) | (decodabet[b2] & 255);
        bArr2[r8] = (byte) (r7 >> 16);
        bArr2[r8 + 1] = (byte) (r7 >> 8);
        bArr2[r1] = (byte) r7;
        return 3;
    }

    public static byte[] decode(byte[] bArr) throws IOException {
        return decode(bArr, 0, bArr.length, 0);
    }

    public static byte[] decode(byte[] bArr, int r11, int r12, int r13) throws IOException {
        int r0;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (r11 < 0 || (r0 = r11 + r12) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(r11), Integer.valueOf(r12)));
        }
        if (r12 == 0) {
            return new byte[0];
        }
        if (r12 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + r12);
        }
        byte[] decodabet = getDecodabet(r13);
        byte[] bArr2 = new byte[(r12 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int r5 = 0;
        int r6 = 0;
        while (r11 < r0) {
            byte b = bArr[r11];
            byte b2 = decodabet[b & 255];
            if (b2 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[r11] & 255), Integer.valueOf(r11)));
            }
            if (b2 >= -1) {
                int r8 = r5 + 1;
                bArr3[r5] = b;
                if (r8 > 3) {
                    r6 += decode4to3(bArr3, 0, bArr2, r6, r13);
                    if (bArr[r11] == 61) {
                        break;
                    }
                    r5 = 0;
                } else {
                    r5 = r8;
                }
            }
            r11++;
        }
        byte[] bArr4 = new byte[r6];
        System.arraycopy(bArr2, 0, bArr4, 0, r6);
        return bArr4;
    }

    public static byte[] decode(String str) throws IOException {
        return decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static byte[] decode(java.lang.String r5, int r6) throws java.lang.Throwable {
        /*
            if (r5 == 0) goto L8e
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L9
            goto Ld
        L9:
            byte[] r5 = r5.getBytes()
        Ld:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = decode(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L1a
            r6 = r2
            goto L1b
        L1a:
            r6 = r1
        L1b:
            if (r5 == 0) goto L8d
            int r3 = r5.length
            if (r3 < r0) goto L8d
            if (r6 != 0) goto L8d
            r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L8d
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            r2.<init>()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L78
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6f
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L64 java.io.IOException -> L67
        L48:
            int r0 = r4.read(r6)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            if (r0 < 0) goto L52
            r2.write(r6, r1, r0)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            goto L48
        L52:
            byte[] r5 = r2.toByteArray()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r2.close()     // Catch: java.lang.Exception -> L59
        L59:
            r4.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            r3.close()     // Catch: java.lang.Exception -> L8d
            goto L8d
        L60:
            r5 = move-exception
            goto L6d
        L62:
            r6 = move-exception
            goto L72
        L64:
            r5 = move-exception
            r4 = r0
            goto L6d
        L67:
            r6 = move-exception
            r4 = r0
            goto L72
        L6a:
            r5 = move-exception
            r3 = r0
            r4 = r3
        L6d:
            r0 = r2
            goto L83
        L6f:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L72:
            r0 = r2
            goto L7b
        L74:
            r5 = move-exception
            r3 = r0
            r4 = r3
            goto L83
        L78:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L7b:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L82
            r0.close()     // Catch: java.lang.Exception -> L59
            goto L59
        L82:
            r5 = move-exception
        L83:
            r0.close()     // Catch: java.lang.Exception -> L86
        L86:
            r4.close()     // Catch: java.lang.Exception -> L89
        L89:
            r3.close()     // Catch: java.lang.Exception -> L8c
        L8c:
            throw r5
        L8d:
            return r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.gov.nist.javax.sip.stack.Base64.decode(java.lang.String, int):byte[]");
    }

    public static Object decodeToObject(String str) throws IOException, ClassNotFoundException {
        return decodeToObject(str, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static Object decodeToObject(String str, int r2, final ClassLoader classLoader) throws Throwable {
        ObjectInputStream objectInputStream;
        byte[] bArrDecode = decode(str, r2);
        ByteArrayInputStream byteArrayInputStream = null;
        objectInputStream = null;
        objectInputStream = null;
        ObjectInputStream objectInputStream2 = null;
        byteArrayInputStream = null;
        try {
            try {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrDecode);
                try {
                    if (classLoader == 0) {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream2);
                    } else {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream2) { // from class: android.gov.nist.javax.sip.stack.Base64.1
                            @Override // java.io.ObjectInputStream
                            public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
                                Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                                return cls == null ? super.resolveClass(objectStreamClass) : cls;
                            }
                        };
                    }
                    objectInputStream2 = objectInputStream;
                    Object object = objectInputStream2.readObject();
                    try {
                        byteArrayInputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        objectInputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return object;
                } catch (IOException e) {
                    throw e;
                } catch (ClassNotFoundException e2) {
                    throw e2;
                } catch (Throwable th) {
                    th = th;
                    classLoader = objectInputStream2;
                    byteArrayInputStream = byteArrayInputStream2;
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        classLoader.close();
                        throw th;
                    } catch (Exception unused4) {
                        throw th;
                    }
                }
            } catch (IOException e3) {
                throw e3;
            } catch (ClassNotFoundException e4) {
                throw e4;
            } catch (Throwable th2) {
                th = th2;
                classLoader = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void encodeToFile(byte[] bArr, String str) throws Throwable {
        if (bArr == null) {
            throw new NullPointerException("Data to encode was null.");
        }
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = new OutputStream(new FileOutputStream(str), 1);
                try {
                    outputStream2.write(bArr);
                    try {
                        outputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void decodeToFile(String str, String str2) throws Throwable {
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = new OutputStream(new FileOutputStream(str2), 0);
                try {
                    outputStream2.write(str.getBytes("US-ASCII"));
                    try {
                        outputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static byte[] decodeFromFile(String str) throws Throwable {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() > 2147483647L) {
                    throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
                }
                byte[] bArr = new byte[(int) file.length()];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
                int r1 = 0;
                while (true) {
                    try {
                        int r3 = inputStream2.read(bArr, r1, 4096);
                        if (r3 < 0) {
                            break;
                        }
                        r1 += r3;
                    } catch (IOException e) {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[r1];
                System.arraycopy(bArr, 0, bArr2, 0, r1);
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String encodeFromFile(String str) throws Throwable {
        InputStream inputStream = null;
        try {
            File file = new File(str);
            byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
            InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
            int r1 = 0;
            while (true) {
                try {
                    int r3 = inputStream2.read(bArr, r1, 4096);
                    if (r3 < 0) {
                        break;
                    }
                    r1 += r3;
                } catch (IOException e) {
                    inputStream = inputStream2;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStream2;
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
            String str2 = new String(bArr, 0, r1, "US-ASCII");
            try {
                inputStream2.close();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (IOException e2) {
            throw e2;
        }
    }

    public static void encodeFileToFile(String str, String str2) throws Throwable {
        String strEncodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(strEncodeFromFile.getBytes("US-ASCII"));
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void decodeFileToFile(String str, String str2) throws Throwable {
        byte[] bArrDecodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str2));
                try {
                    bufferedOutputStream2.write(bArrDecodeFromFile);
                    try {
                        bufferedOutputStream2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static class InputStream extends FilterInputStream {
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        public InputStream(java.io.InputStream inputStream, int r4) {
            super(inputStream);
            this.options = r4;
            this.breakLines = (r4 & 8) > 0;
            boolean z = (r4 & 1) > 0;
            this.encode = z;
            int r3 = z ? 4 : 3;
            this.bufferLength = r3;
            this.buffer = new byte[r3];
            this.position = -1;
            this.lineLength = 0;
            this.decodabet = Base64.getDecodabet(r4);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int r5;
            if (this.position < 0) {
                if (this.encode) {
                    byte[] bArr = new byte[3];
                    int r6 = 0;
                    for (int r7 = 0; r7 < 3; r7++) {
                        int r8 = this.in.read();
                        if (r8 < 0) {
                            break;
                        }
                        bArr[r7] = (byte) r8;
                        r6++;
                    }
                    if (r6 <= 0) {
                        return -1;
                    }
                    Base64.encode3to4(bArr, 0, r6, this.buffer, 0, this.options);
                    this.position = 0;
                    this.numSigBytes = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int r4 = 0;
                    while (r4 < 4) {
                        do {
                            r5 = this.in.read();
                            if (r5 < 0) {
                                break;
                            }
                        } while (this.decodabet[r5 & 127] <= -5);
                        if (r5 < 0) {
                            break;
                        }
                        bArr2[r4] = (byte) r5;
                        r4++;
                    }
                    if (r4 != 4) {
                        if (r4 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.numSigBytes = Base64.decode4to3(bArr2, 0, this.buffer, 0, this.options);
                    this.position = 0;
                }
            }
            int r0 = this.position;
            if (r0 >= 0) {
                if (r0 >= this.numSigBytes) {
                    return -1;
                }
                if (this.encode && this.breakLines && this.lineLength >= 76) {
                    this.lineLength = 0;
                    return 10;
                }
                this.lineLength++;
                byte[] bArr3 = this.buffer;
                int r3 = r0 + 1;
                this.position = r3;
                byte b = bArr3[r0];
                if (r3 >= this.bufferLength) {
                    this.position = -1;
                }
                return b & 255;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int r5, int r6) throws IOException {
            int r0 = 0;
            while (r0 < r6) {
                int r1 = read();
                if (r1 >= 0) {
                    bArr[r5 + r0] = (byte) r1;
                    r0++;
                } else if (r0 == 0) {
                    return -1;
                }
            }
            return r0;
        }
    }

    public static class OutputStream extends FilterOutputStream {
        private byte[] b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        public OutputStream(java.io.OutputStream outputStream, int r4) {
            super(outputStream);
            this.breakLines = (r4 & 8) != 0;
            boolean z = (r4 & 1) != 0;
            this.encode = z;
            int r0 = z ? 3 : 4;
            this.bufferLength = r0;
            this.buffer = new byte[r0];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.b4 = new byte[4];
            this.options = r4;
            this.decodabet = Base64.getDecodabet(r4);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int r6) throws IOException {
            if (this.suspendEncoding) {
                this.out.write(r6);
                return;
            }
            if (this.encode) {
                byte[] bArr = this.buffer;
                int r2 = this.position;
                int r3 = r2 + 1;
                this.position = r3;
                bArr[r2] = (byte) r6;
                if (r3 >= this.bufferLength) {
                    this.out.write(Base64.encode3to4(this.b4, this.buffer, this.bufferLength, this.options));
                    int r7 = this.lineLength + 4;
                    this.lineLength = r7;
                    if (this.breakLines && r7 >= 76) {
                        this.out.write(10);
                        this.lineLength = 0;
                    }
                    this.position = 0;
                    return;
                }
                return;
            }
            byte b = this.decodabet[r6 & 127];
            if (b <= -5) {
                if (b != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
                return;
            }
            byte[] bArr2 = this.buffer;
            int r4 = this.position;
            int r5 = r4 + 1;
            this.position = r5;
            bArr2[r4] = (byte) r6;
            if (r5 >= this.bufferLength) {
                this.out.write(this.b4, 0, Base64.decode4to3(bArr2, 0, this.b4, 0, this.options));
                this.position = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int r4, int r5) throws IOException {
            if (this.suspendEncoding) {
                this.out.write(bArr, r4, r5);
                return;
            }
            for (int r0 = 0; r0 < r5; r0++) {
                write(bArr[r4 + r0]);
            }
        }

        public void flushBase64() throws IOException {
            if (this.position > 0) {
                if (this.encode) {
                    this.out.write(Base64.encode3to4(this.b4, this.buffer, this.position, this.options));
                    this.position = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            flushBase64();
            super.close();
            this.buffer = null;
            this.out = null;
        }

        public void suspendEncoding() throws IOException {
            flushBase64();
            this.suspendEncoding = true;
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }
    }
}
