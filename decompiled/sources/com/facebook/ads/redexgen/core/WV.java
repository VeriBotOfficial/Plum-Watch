package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class WV {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<V4, V6> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{BuiltinOptions.BroadcastToOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, 12, BuiltinOptions.NonMaxSuppressionV4Options, 11, BuiltinOptions.FloorModOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AbsOptions, 11, BuiltinOptions.Conv3DOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AbsOptions, 11, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquaredDifferenceOptions, 11, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, 11, BuiltinOptions.IfOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.ZerosLikeOptions, 11, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, 11, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.NonMaxSuppressionV4Options, 5, BuiltinOptions.SparseToDenseOptions, 9, 12, 9, 8, 16, 9, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.DequantizeOptions, 3, BuiltinOptions.ExpandDimsOptions, 14, 29, 2, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 19, 30, 23, 2, BuiltinOptions.RangeOptions};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(V4.A09, V6.A0D);
        A02.put(V4.A07, V6.A0F);
        A02.put(V4.A06, V6.A0E);
    }

    public static AdSize A00(V4 v4) {
        return AdSize.fromWidthAndHeight(v4.A04(), v4.A03());
    }

    public static AdSize A01(V6 v6) {
        for (Map.Entry<V4, V6> entry : A02.entrySet()) {
            if (entry.getValue() == v6) {
                V4 key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static V4 A02(int i) {
        switch (i) {
            case 4:
                return V4.A05;
            case 5:
                return V4.A06;
            case 6:
                return V4.A07;
            case 7:
                return V4.A09;
            case 100:
                return V4.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, 117));
        }
    }

    public static V4 A03(int i, int i2) {
        if (V4.A08.A03() == i2 && V4.A08.A04() == i) {
            return V4.A08;
        }
        if (V4.A05.A03() == i2) {
            int A04 = V4.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i) {
                return V4.A05;
            }
        }
        if (V4.A06.A03() == i2 && V4.A06.A04() == i) {
            return V4.A06;
        }
        if (V4.A07.A03() == i2 && V4.A07.A04() == i) {
            return V4.A07;
        }
        if (V4.A09.A03() == i2) {
            V4 v4 = V4.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (v4.A04() == i) {
                return V4.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static V4 A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static V6 A05(V4 v4) {
        V6 adTemplate = A02.get(v4);
        if (adTemplate == null) {
            return V6.A0G;
        }
        return adTemplate;
    }
}
