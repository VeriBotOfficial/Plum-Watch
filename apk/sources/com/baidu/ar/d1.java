package com.baidu.ar;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes16.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f6869a = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectOptions};
    public static final byte[] b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, -9, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] c = {BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NonMaxSuppressionV4Options};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, BuiltinOptions.LogicalAndOptions, -9, -9, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final byte[] e = {BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AddNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options};
    public static final byte[] f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, -9, -9, -9, -9, BuiltinOptions.CastOptions, -9, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.LogicalAndOptions, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    public static final /* synthetic */ boolean g = true;

    public static class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6870a;
        public int b;
        public byte[] c;
        public int d;
        public int e;
        public boolean f;
        public byte[] g;
        public boolean h;
        public int i;
        public byte[] j;

        public a(OutputStream outputStream, int r4) {
            super(outputStream);
            this.f = (r4 & 8) != 0;
            boolean z = (r4 & 1) != 0;
            this.f6870a = z;
            int r0 = z ? 3 : 4;
            this.d = r0;
            this.c = new byte[r0];
            this.b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = r4;
            this.j = d1.c(r4);
        }

        public void a() throws IOException {
            int r0 = this.b;
            if (r0 > 0) {
                if (!this.f6870a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(d1.b(this.g, this.c, r0, this.i));
                this.b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a();
            super.close();
            this.c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int r6) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(r6);
                return;
            }
            if (this.f6870a) {
                byte[] bArr = this.c;
                int r2 = this.b;
                int r3 = r2 + 1;
                this.b = r3;
                bArr[r2] = (byte) r6;
                int r7 = this.d;
                if (r3 < r7) {
                    return;
                }
                ((FilterOutputStream) this).out.write(d1.b(this.g, bArr, r7, this.i));
                int r8 = this.e + 4;
                this.e = r8;
                if (this.f && r8 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.e = 0;
                }
            } else {
                byte b = this.j[r6 & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.c;
                int r4 = this.b;
                int r5 = r4 + 1;
                this.b = r5;
                bArr2[r4] = (byte) r6;
                if (r5 < this.d) {
                    return;
                }
                ((FilterOutputStream) this).out.write(this.g, 0, d1.b(bArr2, 0, this.g, 0, this.i));
            }
            this.b = 0;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int r4, int r5) throws IOException {
            if (this.h) {
                ((FilterOutputStream) this).out.write(bArr, r4, r5);
                return;
            }
            for (int r0 = 0; r0 < r5; r0++) {
                write(bArr[r4 + r0]);
            }
        }
    }

    public static String a(byte[] bArr) throws Throwable {
        String strA;
        try {
            strA = a(bArr, 0, bArr.length, 0);
        } catch (IOException e2) {
            if (!g) {
                throw new AssertionError(e2.getMessage());
            }
            strA = null;
        }
        if (g || strA != null) {
            return strA;
        }
        throw new AssertionError();
    }

    public static String a(byte[] bArr, int r1, int r2, int r3) throws Throwable {
        byte[] bArrB = b(bArr, r1, r2, r3);
        try {
            return new String(bArrB, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrB);
        }
    }

    public static byte[] a(byte[] bArr, int r5, int r6, byte[] bArr2, int r8, int r9) {
        byte[] bArrB = b(r9);
        int r4 = (r6 > 0 ? (bArr[r5] << 24) >>> 8 : 0) | (r6 > 1 ? (bArr[r5 + 1] << 24) >>> 16 : 0) | (r6 > 2 ? (bArr[r5 + 2] << 24) >>> 24 : 0);
        if (r6 == 1) {
            bArr2[r8] = bArrB[r4 >>> 18];
            bArr2[r8 + 1] = bArrB[(r4 >>> 12) & 63];
            bArr2[r8 + 2] = 61;
            bArr2[r8 + 3] = 61;
            return bArr2;
        }
        if (r6 == 2) {
            bArr2[r8] = bArrB[r4 >>> 18];
            bArr2[r8 + 1] = bArrB[(r4 >>> 12) & 63];
            bArr2[r8 + 2] = bArrB[(r4 >>> 6) & 63];
            bArr2[r8 + 3] = 61;
            return bArr2;
        }
        if (r6 != 3) {
            return bArr2;
        }
        bArr2[r8] = bArrB[r4 >>> 18];
        bArr2[r8 + 1] = bArrB[(r4 >>> 12) & 63];
        bArr2[r8 + 2] = bArrB[(r4 >>> 6) & 63];
        bArr2[r8 + 3] = bArrB[r4 & 63];
        return bArr2;
    }

    public static int b(byte[] bArr, int r6, byte[] bArr2, int r8, int r9) {
        int r0;
        int r1;
        if (bArr == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Destination array was null.");
        }
        if (r6 < 0 || (r0 = r6 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(r6)));
        }
        if (r8 < 0 || (r1 = r8 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(r8)));
        }
        byte[] bArrC = c(r9);
        byte b2 = bArr[r6 + 2];
        if (b2 == 61) {
            bArr2[r8] = (byte) ((((bArrC[bArr[r6 + 1]] & 255) << 12) | ((bArrC[bArr[r6]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b3 = bArr[r0];
        if (b3 == 61) {
            int r5 = ((bArrC[bArr[r6 + 1]] & 255) << 12) | ((bArrC[bArr[r6]] & 255) << 18) | ((bArrC[b2] & 255) << 6);
            bArr2[r8] = (byte) (r5 >>> 16);
            bArr2[r8 + 1] = (byte) (r5 >>> 8);
            return 2;
        }
        int r7 = ((bArrC[bArr[r6 + 1]] & 255) << 12) | ((bArrC[bArr[r6]] & 255) << 18) | ((bArrC[b2] & 255) << 6) | (bArrC[b3] & 255);
        bArr2[r8] = (byte) (r7 >> 16);
        bArr2[r8 + 1] = (byte) (r7 >> 8);
        bArr2[r1] = (byte) r7;
        return 3;
    }

    public static final byte[] b(int r2) {
        if ((r2 & 16) == 16) {
            return c;
        }
        return (r2 & 32) == 32 ? e : f6869a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public static byte[] b(byte[] bArr, int r19, int r20, int r21) throws Throwable {
        a aVar;
        if (bArr == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (r19 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + r19);
        }
        if (r20 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + r20);
        }
        int r1 = r19 + r20;
        ByteArrayOutputStream length = bArr.length;
        if (r1 > length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(r19), Integer.valueOf(r20), Integer.valueOf(bArr.length)));
        }
        if ((r21 & 2) == 0) {
            boolean z = (r21 & 8) != 0;
            int r2 = ((r20 / 3) * 4) + (r20 % 3 > 0 ? 4 : 0);
            if (z) {
                r2 += r2 / 76;
            }
            int r13 = r2;
            byte[] bArr2 = new byte[r13];
            int r15 = r20 - 2;
            int r6 = 0;
            int r16 = 0;
            int r17 = 0;
            while (r6 < r15) {
                int r10 = r6;
                a(bArr, r6 + r19, 3, bArr2, r16, r21);
                int r3 = r17 + 4;
                if (!z || r3 < 76) {
                    r17 = r3;
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
                a(bArr, r11 + r19, r20 - r11, bArr2, r16, r21);
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
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                length = new ByteArrayOutputStream();
                try {
                    aVar = new a(length, r21 | 1);
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(aVar);
                        try {
                            gZIPOutputStream2.write(bArr, r19, r20);
                            gZIPOutputStream2.close();
                            try {
                                gZIPOutputStream2.close();
                            } catch (Exception unused) {
                            }
                            try {
                                aVar.close();
                            } catch (Exception unused2) {
                            }
                            try {
                                length.close();
                            } catch (Exception unused3) {
                            }
                            return length.toByteArray();
                        } catch (IOException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (aVar != null) {
                                try {
                                    aVar.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (length == 0) {
                                throw th;
                            }
                            try {
                                length.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    } catch (IOException e3) {
                        throw e3;
                    }
                } catch (IOException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = null;
                }
            } catch (IOException e5) {
                length = 0;
                aVar = null;
                throw e5;
            } catch (Throwable th3) {
                th = th3;
                length = 0;
                aVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, int r8, int r9) {
        a(bArr2, 0, r8, bArr, 0, r9);
        return bArr;
    }

    public static final byte[] c(int r2) {
        if ((r2 & 16) == 16) {
            return d;
        }
        return (r2 & 32) == 32 ? f : b;
    }
}
