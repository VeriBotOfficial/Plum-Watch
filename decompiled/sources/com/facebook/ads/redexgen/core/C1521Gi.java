package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Gi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1521Gi {
    public static byte[] A02;
    public static final Pattern A03;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{64, BuiltinOptions.LogicalAndOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MAX_VALUE, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.TileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MAX_VALUE, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.TileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MAX_VALUE, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.TileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.BatchMatMulOptions, 34, 31, BuiltinOptions.LogicalAndOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.RankOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitwiseXorOptions};
    }

    static {
        A01();
        A03 = Pattern.compile(A00(0, 50, 25));
    }

    private boolean A02(String str) {
        Matcher matcher = A03.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) AbstractC12174a.A0f(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) AbstractC12174a.A0f(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.A00 = parseInt;
                    this.A01 = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i) {
        int encoderPadding = i >> 12;
        int encoderDelay = i & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(com.facebook.ads.androidx.media3.common.Metadata r9) {
        /*
            r8 = this;
            r3 = 0
        L1:
            int r0 = r9.A02()
            if (r3 >= r0) goto L59
            com.facebook.ads.androidx.media3.common.Metadata$Entry r5 = r9.A03(r3)
            boolean r7 = r5 instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame
            r2 = 66
            r1 = 8
            r0 = 56
            java.lang.String r6 = A00(r2, r1, r0)
            r4 = 1
            if (r7 == 0) goto L2d
            com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame r5 = (com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame) r5
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L56
            return r4
        L2d:
            boolean r0 = r5 instanceof com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame
            if (r0 == 0) goto L56
            com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame r5 = (com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame) r5
            r2 = 50
            r1 = 16
            r0 = 76
            java.lang.String r1 = A00(r2, r1, r0)
            java.lang.String r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r5.A02
            boolean r0 = r8.A02(r0)
            if (r0 == 0) goto L56
            return r4
        L56:
            int r3 = r3 + 1
            goto L1
        L59:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1521Gi.A05(com.facebook.ads.androidx.media3.common.Metadata):boolean");
    }
}
