package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass17 extends AbstractC13459l {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RankOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SignOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LogSoftmaxOptions, 35, BuiltinOptions.PowOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SliceOptions, 34, BuiltinOptions.AssignVariableOptions, 32, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpandDimsOptions, 35, BuiltinOptions.ArgMaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, 63, BuiltinOptions.EqualOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, 63, BuiltinOptions.CastOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, 35, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.AssignVariableOptions, 63, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, BuiltinOptions.AssignVariableOptions, 34, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.CastOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, Byte.MAX_VALUE, BuiltinOptions.AssignVariableOptions, 21, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, 61, 61, BuiltinOptions.AssignVariableOptions, 4, 35, BuiltinOptions.PowOptions, Byte.MAX_VALUE, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, 35, 34, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, BuiltinOptions.AssignVariableOptions, 34, BuiltinOptions.CastOptions, 35, BuiltinOptions.PowOptions, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogicalAndOptions, 63, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PowOptions, 63, BuiltinOptions.PowOptions, 63, BuiltinOptions.NotEqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.LogicalAndOptions, 35, BuiltinOptions.AssignVariableOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AssignVariableOptions, 4, 34, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.AssignVariableOptions, 4, 35, BuiltinOptions.PowOptions, Byte.MAX_VALUE, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, 23, BuiltinOptions.PowOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentSumOptions, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AssignVariableOptions, 23, BuiltinOptions.PowOptions, 61, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SliceOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PowOptions, BuiltinOptions.EqualOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PowOptions, 34, Byte.MAX_VALUE, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GeluOptions, 34, BuiltinOptions.BitwiseXorOptions, 32, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpandDimsOptions, 35, BuiltinOptions.ArgMaxOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GeluOptions, 34, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.ShapeOptions, 35, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, 63, BuiltinOptions.CastOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.GeluOptions, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFy(AnonymousClass56 anonymousClass56) throws C2834nf {
        C4S.A02(A01(0, 15, 71));
        Uri uri = anonymousClass56.A06;
        this.A01 = uri;
        A0G(anonymousClass56);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(anonymousClass56.A04);
                this.A00 = anonymousClass56.A03 == -1 ? this.A02.length() - anonymousClass56.A04 : anonymousClass56.A03;
                C4S.A00();
                if (this.A00 < 0) {
                    throw new C2834nf(null, null, 2008);
                }
                this.A03 = true;
                A0H(anonymousClass56);
                long j = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j;
            } catch (IOException e) {
                throw new C2834nf(e, 2000);
            }
        } catch (Throwable th) {
            C4S.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public AnonymousClass17() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.RandomAccessFile A00(android.net.Uri r6) throws com.facebook.ads.redexgen.core.C2834nf {
        /*
            r3 = 2006(0x7d6, float:2.811E-42)
            java.lang.String r0 = r6.getPath()     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.lang.Object r4 = com.facebook.ads.redexgen.core.C3M.A01(r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            r2 = 29
            r1 = 1
            r0 = 31
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            r1.<init>(r4, r0)     // Catch: java.lang.RuntimeException -> L1b java.lang.SecurityException -> L24 java.io.FileNotFoundException -> L2b
            return r1
        L1b:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf
            r0.<init>(r2, r1)
            throw r0
        L24:
            r1 = move-exception
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf
            r0.<init>(r1, r3)
            throw r0
        L2b:
            r4 = move-exception
            java.lang.String r0 = r6.getQuery()
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L4e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "uF4"
            r0 = 1
            r2[r0] = r1
            if (r5 == 0) goto L7a
            java.lang.String r0 = r6.getFragment()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L7a
            int r1 = com.facebook.ads.redexgen.core.AbstractC12174a.A02
            r0 = 21
            if (r1 < r0) goto L77
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = com.facebook.ads.redexgen.core.AnonymousClass58.A01(r0)
            if (r0 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf
            r0.<init>(r4, r3)
            throw r0
        L77:
            r3 = 2005(0x7d5, float:2.81E-42)
            goto L71
        L7a:
            java.lang.String r5 = r6.getPath()
            java.lang.String r2 = r6.getQuery()
            java.lang.String r1 = r6.getFragment()
            r0 = 3
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            r3[r0] = r5
            r0 = 1
            r3[r0] = r2
            r0 = 2
            r3[r0] = r1
            r2 = 30
            r1 = 192(0xc0, float:2.69E-43)
            r0 = 19
            java.lang.String r0 = A01(r2, r1, r0)
            java.lang.String r2 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf
            r0.<init>(r2, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass17.A00(android.net.Uri):java.io.RandomAccessFile");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    public final Uri A9H() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r6.A03 = false;
        A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r4 != false) goto L22;
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2840nl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.facebook.ads.redexgen.core.C2834nf {
        /*
            r6 = this;
            r4 = 0
            r6.A01 = r4
            r3 = 0
            java.io.RandomAccessFile r0 = r6.A02     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
            if (r0 == 0) goto Ld
            java.io.RandomAccessFile r0 = r6.A02     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
            r0.close()     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L46
        Ld:
            r6.A02 = r4
            boolean r4 = r6.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L37
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt"
            r0 = 7
            r2[r0] = r1
            if (r4 == 0) goto L36
            r6.A03 = r3
            r6.A0E()
        L36:
            return
        L37:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            com.facebook.ads.redexgen.X.nf r0 = new com.facebook.ads.redexgen.X.nf     // Catch: java.lang.Throwable -> L46
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r5 = move-exception
            r6.A02 = r4
            boolean r4 = r6.A03
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L73
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "Vm3YcALUN"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "c4edS4Kr4EVyTdnKAl"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L72
        L6d:
            r6.A03 = r3
            r6.A0E()
        L72:
            throw r5
        L73:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass17.A05
            java.lang.String r1 = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P"
            r0 = 4
            r2[r0] = r1
            if (r4 == 0) goto L72
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass17.close():void");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i2) throws C2834nf {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                C4S.A02(A01(15, 14, 75));
                int read = ((RandomAccessFile) AbstractC12174a.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i2));
                if (read > 0) {
                    this.A00 -= read;
                    A0F(read);
                }
                return read;
            } catch (IOException e) {
                throw new C2834nf(e, 2000);
            }
        } finally {
            C4S.A00();
        }
    }
}
