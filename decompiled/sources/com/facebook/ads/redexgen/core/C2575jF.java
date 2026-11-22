package com.facebook.ads.redexgen.core;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2575jF implements L9 {
    public static String A07;
    public static byte[] A08;
    public static String[] A09 = {"76RHNajjOom", "Mjpn3pRzDJalybdRDXibpwNEIm", "yniKdbkjQS3x88FVx9CeVftqblxxQhpu", "Bjsdcl6Zd1aHs", "xxeVE5WeJXBB6h2Smwfm1cLqVC", "jWBIYbGBA8wTLtSAwtOQxldoJ8", "SNbZ6FPeFicMqudBak9DrYkQXr", "PSBHzZzFGATU6u0TdgIgliGoBbccT2bp"};
    public int A00;
    public InputStream A01;
    public HttpURLConnection A02;
    public final String A03;
    public volatile int A04;
    public volatile int A05;
    public volatile String A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{BuiltinOptions.PadV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SignOptions, Byte.MAX_VALUE, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ExpOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.LessOptions, 32, 32, BuiltinOptions.EqualOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.NonMaxSuppressionV5Options, 35, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.NonMaxSuppressionV5Options, 5, 20, 14, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FloorDivOptions, 64, 64, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorDivOptions, 64, 14, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.WhileOptions, 14, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.LeakyReluOptions, 64, BuiltinOptions.MatrixSetDiagOptions, 15, 20, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, 35, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PowOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PowOptions, BuiltinOptions.CastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ShapeOptions, 24, BuiltinOptions.SelectOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58, BuiltinOptions.BitwiseXorOptions, 21, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterEqualOptions, 8, BuiltinOptions.SelectOptions, BuiltinOptions.TransposeConvOptions, 30, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LessOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, 21, 34, 34, 63, 34, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NotEqualOptions, 63, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NotEqualOptions, 34, 63, 61, BuiltinOptions.ReadVariableOptions, 27, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.RightShiftOptions, 61, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PackOptions, 61, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.RightShiftOptions, 35, 20, 20, 9, 20, BuiltinOptions.BidirectionalSequenceRNNOptions, 20, 3, 7, 2, 15, 8, 1, BuiltinOptions.BidirectionalSequenceRNNOptions, 2, 7, 18, 7, BuiltinOptions.BidirectionalSequenceRNNOptions, 0, 20, 9, 11, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.IfOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SignOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.LessOptions, BuiltinOptions.TileOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhileOptions, 64, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 0, 63, BuiltinOptions.NegOptions, BuiltinOptions.ExpOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.GreaterOptions, 32, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.PackOptions, BuiltinOptions.DequantizeOptions, 32, BuiltinOptions.ExpOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableImportOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.HardSwishOptions, 31, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.LeakyReluOptions, 31, BuiltinOptions.RankOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, BuiltinOptions.UniqueOptions, 31, BuiltinOptions.QuantizeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.AddNOptions, 31, BuiltinOptions.Conv3DOptions, BuiltinOptions.WhileOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RankOptions, BuiltinOptions.NonMaxSuppressionV4Options, 24, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, 24, BuiltinOptions.ExpOptions, 26, 26, BuiltinOptions.WhereOptions, 24, 20, 27, 12, BuiltinOptions.WhereOptions, 7, 16, 17, 28, 7, 16, 22, 1, 6, BuiltinOptions.SplitVOptions, BuiltinOptions.WhereOptions, BuiltinOptions.IfOptions, 6, 28, BuiltinOptions.ReverseV2Options, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.QuantizeOptions, 6, 28, 30, 5, 8, 25, 15, BuiltinOptions.FloorDivOptions, BuiltinOptions.DensifyOptions};
    }

    static {
        A04();
        A07 = C2575jF.class.getSimpleName();
    }

    public C2575jF(String str) {
        this(str, L7.A01(str));
    }

    public C2575jF(String str, int i) {
        this(str);
        this.A00 = i;
    }

    public C2575jF(String str, String str2) {
        this.A05 = Integer.MIN_VALUE;
        this.A00 = -1;
        this.A03 = (String) L8.A00(str);
        this.A06 = str2;
    }

    private int A00(HttpURLConnection httpURLConnection, int i, int i2) throws IOException {
        int contentLength = httpURLConnection.getContentLength();
        return i2 == 200 ? contentLength : i2 == 206 ? contentLength + i : this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r6 != 303) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        if (r6 != 302) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection A02(int r9, int r10) throws java.io.IOException, com.facebook.ads.redexgen.core.C2579jJ {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2575jF.A02(int, int):java.net.HttpURLConnection");
    }

    private void A03() throws C2579jJ {
        String str = A01(255, 23, 59) + this.A03;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnection = A02(0, 10000);
                this.A05 = httpURLConnection.getContentLength();
                this.A06 = httpURLConnection.getContentType();
                inputStream = httpURLConnection.getInputStream();
                Log.i(A07, A01(74, 18, 83) + this.A03 + A01(313, 9, 56) + this.A06 + A01(32, 18, 68) + this.A05);
                L7.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            } catch (IOException e) {
                Log.e(A07, A01(129, 25, 84) + this.A03, e);
                L7.A05(inputStream);
                if (httpURLConnection == null) {
                    return;
                }
            }
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            L7.A05(inputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private final void A05(int i, int i2) throws C2579jJ {
        try {
            this.A02 = A02(i, i2);
            this.A06 = this.A02.getContentType();
            this.A01 = new BufferedInputStream(this.A02.getInputStream(), 8192);
            this.A05 = A00(this.A02, i, this.A02.getResponseCode());
        } catch (IOException e) {
            throw new C2579jJ(A01(154, 29, 90) + this.A03 + A01(19, 13, 66) + i, e);
        }
    }

    public final int A06() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final void AFz(int i) throws C2579jJ {
        A05(i, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final void close() throws C2579jJ {
        if (this.A02 != null) {
            try {
                this.A02.disconnect();
            } catch (NullPointerException e) {
                throw new C2579jJ(A01(92, 37, 89), e);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final synchronized int length() throws C2579jJ {
        if (this.A05 == Integer.MIN_VALUE) {
            A03();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.L9
    public final int read(byte[] bArr) throws C2579jJ {
        InputStream inputStream = this.A01;
        String A01 = A01(183, 24, 98);
        if (inputStream != null) {
            try {
                return this.A01.read(bArr, 0, bArr.length);
            } catch (InterruptedIOException e) {
                final String str = A01(278, 15, 60) + this.A03 + A01(0, 15, 15);
                throw new C2579jJ(str, e) { // from class: com.facebook.ads.redexgen.X.7e
                };
            } catch (IOException e2) {
                throw new C2579jJ(A01 + this.A03, e2);
            }
        }
        throw new C2579jJ(A01 + this.A03 + A01(51, 23, 42));
    }

    public final String toString() {
        return A01(207, 19, 16) + this.A03 + A01(328, 1, 26);
    }
}
