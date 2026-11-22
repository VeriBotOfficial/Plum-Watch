package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.7p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C13107p {
    public static byte[] A02;
    public static String[] A03 = {"n0jQ8SeFa80EBLo4BXhwXwPS4Wjubjck", "v64BeMF4Y1fRwWGkqW0btQJWsOcnPY4V", "TgQc", "Ri1mjPnDGJYW0mGh81XgbTSSpeaxgcJq", "RtYQoh190WxakJNXNOvGF0rP0AmdpNRb", "fbDVM5YfIDSRqB6n56hfMufsgfpcQx7k", "HNWTUdzo11zzvmCb4ifQA88FoSPuiiKn", "CiEa"};
    public static final C13107p A04;
    public static final C13107p A05;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Prevent throwing when building the map")
    public static final AbstractC2776mj<Integer, Integer> A06;
    public final int A00;
    public final int[] A01;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        byte[] bArr = {5, 9, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.IfOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.WhileOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MirrorPadOptions, 64, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixSetDiagOptions, 20, BuiltinOptions.ReverseV2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, Byte.MAX_VALUE, BuiltinOptions.RightShiftOptions, 6, BuiltinOptions.SparseToDenseOptions, 35, BuiltinOptions.LessEqualOptions, BuiltinOptions.ArgMaxOptions, 4, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, 34, BuiltinOptions.ExpandDimsOptions, 28, BuiltinOptions.NegOptions, BuiltinOptions.DequantizeOptions, 63, 4, BuiltinOptions.SelectOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, 34, BuiltinOptions.PadV2Options, 4, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LessOptions, BuiltinOptions.TileOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.FillOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PackOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.MaximumMinimumOptions, 58, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SignOptions, BuiltinOptions.PowOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SignOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.SignOptions, 29, 17, 24, 28, 10, 20, 0, 17, 28, 26, 10, 5, 25, 0, 18, 30, 17, 27, 13, 16, 22, 27, BuiltinOptions.ReverseV2Options, 18, 26, 27, 22, 30, BuiltinOptions.ReverseV2Options, 26, 7, 11, 13, 30, BuiltinOptions.ReverseV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SliceOptions, 32, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, BuiltinOptions.NegOptions, BuiltinOptions.PowOptions, 32, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, BuiltinOptions.LogicalAndOptions, BuiltinOptions.PadV2Options, 58, BuiltinOptions.RandomOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 61, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.ATan2Options, BuiltinOptions.RandomOptions, 61, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RandomOptions, 61, BuiltinOptions.RankOptions, BuiltinOptions.WhileOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions, 64, 17, 30, 20, 2, 31, 25, 20, BuiltinOptions.DepthToSpaceOptions, 29, 21, 20, 25, 17, BuiltinOptions.DepthToSpaceOptions, 21, 8, 4, 2, 17, BuiltinOptions.DepthToSpaceOptions, 61, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, 63, BuiltinOptions.CastOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SignOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SignOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, Byte.MAX_VALUE, BuiltinOptions.RandomOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.SignOptions, BuiltinOptions.ReadVariableOptions, Byte.MAX_VALUE, BuiltinOptions.BitcastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SignOptions, BuiltinOptions.ATan2Options, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.CumsumOptions};
        String[] strArr = A03;
        if (strArr[7].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "fFCHGQkYTOkakvUkxnOWQDFO0G2COwX4";
        strArr2[3] = "aKWONvT57JCa0OWG4uWHvxhg88ypYICi";
        A02 = bArr;
    }

    static {
        A06();
        A04 = new C13107p(new int[]{2}, 8);
        A05 = new C13107p(new int[]{2, 5, 6}, 8);
        A06 = new C2774mh().A05(5, 6).A05(17, 6).A05(7, 6).A05(18, 6).A05(6, 8).A05(8, 8).A05(14, 8).A07();
    }

    public C13107p(int[] iArr, int i) {
        if (iArr != null) {
            this.A01 = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.A01);
        } else {
            this.A01 = new int[0];
        }
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r4 == 5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(int r4) {
        /*
            int r1 = com.facebook.ads.redexgen.core.AbstractC12174a.A02
            r0 = 28
            if (r1 > r0) goto Lb
            r0 = 7
            if (r4 != r0) goto L2b
            r4 = 8
        Lb:
            int r1 = com.facebook.ads.redexgen.core.AbstractC12174a.A02
            r0 = 26
            if (r1 > r0) goto L26
            r2 = 237(0xed, float:3.32E-43)
            r1 = 4
            r0 = 55
            java.lang.String r1 = A05(r2, r1, r0)
            java.lang.String r0 = com.facebook.ads.redexgen.core.AbstractC12174a.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L26
            r0 = 1
            if (r4 != r0) goto L26
            r4 = 2
        L26:
            int r0 = com.facebook.ads.redexgen.core.AbstractC12174a.A01(r4)
            return r0
        L2b:
            r0 = 3
            if (r4 == r0) goto L65
            r3 = 4
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C13107p.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L6d
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            java.lang.String r1 = "n1qXVCZQxk2N8nhnGA5Su8h2HHCkXbDi"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "3IkXI2X5X2wTbaqU0wEl3DE4dRdq07f0"
            r0 = 3
            r2[r0] = r1
            if (r4 == r3) goto L65
            r3 = 5
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C13107p.A03
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            java.lang.String r1 = "tECYq4G9CXONPArggxwQRVOEprBCIxCW"
            r0 = 1
            r2[r0] = r1
            if (r4 != r3) goto Lb
        L65:
            r4 = 6
            goto Lb
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C13107p.A00(int):int");
    }

    public static int A01(int i, int i2) {
        if (AbstractC12174a.A02 >= 29) {
            return C13097o.A00(i, i2);
        }
        Integer orDefault = A06.getOrDefault(Integer.valueOf(i), 0);
        if (A03[1].charAt(21) == '1') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[5] = "4LwyKZxV9xzADs3TG4HwkSSUmTpMdFHu";
        strArr[4] = "TU5gCkHzG3bOz42CgVjxZ9enmRnhlx9h";
        return ((Integer) C3M.A01(orDefault)).intValue();
    }

    public static C13107p A02(Context context) {
        Intent intent = context.registerReceiver(null, new IntentFilter(A05(68, 36, 113)));
        return A03(context, intent);
    }

    public static C13107p A03(Context context, Intent intent) {
        if (A07() && Settings.Global.getInt(context.getContentResolver(), A05(206, 31, 58), 0) == 1) {
            return A05;
        }
        if (AbstractC12174a.A02 >= 29 && (AbstractC12174a.A18(context) || AbstractC12174a.A17(context))) {
            return new C13107p(C13097o.A01(), 8);
        }
        if (intent == null || intent.getIntExtra(A05(104, 36, 91), 0) == 0) {
            return A04;
        }
        return new C13107p(intent.getIntArrayExtra(A05(140, 29, 55)), intent.getIntExtra(A05(169, 37, 84), 8));
    }

    public static boolean A07() {
        if (AbstractC12174a.A02 >= 17) {
            if (A05(21, 6, 52).equals(AbstractC12174a.A05) || A05(61, 6, 7).equals(AbstractC12174a.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int A08() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r5 != (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = r9.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        r0 = androidx.media3.extractor.OpusUtil.SAMPLE_RATE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r5 != (-1)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> A09(com.facebook.ads.redexgen.core.C2905or r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.A0W
            java.lang.Object r1 = com.facebook.ads.redexgen.core.C3M.A01(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r9.A0R
            int r4 = com.facebook.ads.redexgen.core.AbstractC11722h.A03(r1, r0)
            com.facebook.ads.redexgen.X.mj<java.lang.Integer, java.lang.Integer> r1 = com.facebook.ads.redexgen.core.C13107p.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = r1.containsKey(r0)
            r7 = 0
            if (r0 != 0) goto L1c
            return r7
        L1c:
            r6 = 18
            if (r4 != r6) goto L2e
            boolean r0 = r8.A0A(r6)
            if (r0 != 0) goto L2e
            r4 = 6
        L27:
            boolean r0 = r8.A0A(r4)
            if (r0 != 0) goto L3a
            return r7
        L2e:
            r0 = 8
            if (r4 != r0) goto L27
            boolean r0 = r8.A0A(r0)
            if (r0 != 0) goto L27
            r4 = 7
            goto L27
        L3a:
            int r5 = r9.A06
            r3 = -1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            r0 = 7
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            java.lang.String r1 = "4KpokJkqLEvhjIg40C82zBlUQNBiJ4Nh"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "qYsciqDft0GPV223mm2sV4x00h8r6ql4"
            r0 = 3
            r2[r0] = r1
            if (r5 == r3) goto L65
            if (r4 != r6) goto L9f
        L65:
            int r5 = r9.A0G
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C13107p.A03
            r0 = 1
            r1 = r1[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            r0 = 49
            if (r1 == r0) goto L8c
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            java.lang.String r1 = "PeibxLIDNQepcsKrVJzxdcnxdYsUjYYR"
            r0 = 0
            r2[r0] = r1
            if (r5 == r3) goto L9b
        L7f:
            int r0 = r9.A0G
        L81:
            int r1 = A01(r4, r0)
        L85:
            int r0 = A00(r1)
            if (r0 != 0) goto La6
            return r7
        L8c:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C13107p.A03
            java.lang.String r1 = "BgZH8BuYmZ4E43z5yTU6VaJsu5Ivkzql"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "qg4irZvxQMOGKPEC5vFhWWygbOBgLyYA"
            r0 = 3
            r2[r0] = r1
            if (r5 == r3) goto L9b
            goto L7f
        L9b:
            r0 = 48000(0xbb80, float:6.7262E-41)
            goto L81
        L9f:
            int r1 = r9.A06
            int r0 = r8.A00
            if (r1 <= r0) goto L85
            return r7
        La6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C13107p.A09(com.facebook.ads.redexgen.X.or):android.util.Pair");
    }

    public final boolean A0A(int i) {
        return Arrays.binarySearch(this.A01, i) >= 0;
    }

    public final boolean A0B(C2905or c2905or) {
        return A09(c2905or) != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13107p)) {
            return false;
        }
        C13107p c13107p = (C13107p) obj;
        return Arrays.equals(this.A01, c13107p.A01) && this.A00 == c13107p.A00;
    }

    public final int hashCode() {
        return this.A00 + (Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return A05(27, 34, 99) + this.A00 + A05(0, 21, 13) + Arrays.toString(this.A01) + A05(67, 1, 61);
    }
}
