package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class JX {
    public static byte[] A02;
    public static String[] A03 = {"HuWf33fpJVnWiQs5jgU1coBxnkVs6NRv", "s99wI42TXu9zb6TF", "znB4eml4mMdVjhFim0h8Ic", "vwm3UU3z6IIrXLlJTF572ZAqfrELMHnc", "3Hoi8QCDYq5dLz7zrQI8B3P9CeceMza0", "88mhCIZfB8fBAcvooczZpqGcVMp3sArj", "twULWMK01HtAAxLhlSW3WXsxhxQi2bS3", "0mJGu"};
    public static final Pattern A04;
    public static final Pattern A05;
    public static final Pattern A06;
    public static final Pattern A07;
    public final int A00;
    public final PointF A01;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, 19, BuiltinOptions.HardSwishOptions, BuiltinOptions.AddNOptions, 64, 19, BuiltinOptions.ReverseV2Options, BuiltinOptions.IfOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, 19, BuiltinOptions.VarHandleOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.IfOptions, 64, 27, BuiltinOptions.LeakyReluOptions, 31, BuiltinOptions.ResizeNearestNeighborOptions, 26, 19, BuiltinOptions.AddNOptions, BuiltinOptions.WhileOptions, BuiltinOptions.ReverseSequenceOptions, 19, BuiltinOptions.VarHandleOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, 27, BuiltinOptions.LeakyReluOptions, 2, 31, BuiltinOptions.ResizeNearestNeighborOptions, 2, 31, BuiltinOptions.LeakyReluOptions, 1, 31, BuiltinOptions.ResizeNearestNeighborOptions, 1, 26, 8, 19, BuiltinOptions.BidirectionalSequenceRNNOptions, 64, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions, 19, BuiltinOptions.VarHandleOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.IfOptions, 64, 19, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RankOptions, 64, 29, 19, BuiltinOptions.IfOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RankOptions, 14, 20, BuiltinOptions.GreaterEqualOptions, 13, 31, BuiltinOptions.GreaterEqualOptions, 10, 7, 18, 27, BuiltinOptions.UniqueOptions, BuiltinOptions.TransposeConvOptions, 8, 27, 12, 12, 23, 26, 27, 13, 28, 28, BuiltinOptions.ExpOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.BroadcastToOptions, 28, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, 15, 15, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.CastOptions, BuiltinOptions.NotEqualOptions, 15, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, Byte.MAX_VALUE, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, BuiltinOptions.ATan2Options, Byte.MAX_VALUE, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, BuiltinOptions.ATan2Options, BuiltinOptions.SignOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Rfft2dOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, 32, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableFindOptions, 15, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.EqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.PowOptions, 23, BuiltinOptions.AbsOptions, BuiltinOptions.PowOptions, 0, BuiltinOptions.SplitVOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.PowOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.PowOptions, 0, BuiltinOptions.SplitVOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.PowOptions, 23, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.CallOnceOptions};
    }

    static {
        A05();
        A05 = Pattern.compile(A03(198, 11, 23));
        String A032 = A03(DeviceFeatures.MAP_MODE, 19, 105);
        A07 = Pattern.compile(AbstractC12174a.A0n(A03(157, 22, 16), A032));
        A06 = Pattern.compile(AbstractC12174a.A0n(A03(109, 48, 94), A032));
        A04 = Pattern.compile(A03(100, 9, 77));
    }

    public JX(int i, PointF pointF) {
        this.A00 = i;
        this.A01 = pointF;
    }

    public static int A00(String str) {
        int A01;
        Matcher matcher = A04.matcher(str);
        if (!matcher.find()) {
            return -1;
        }
        if (A03[1].length() == 17) {
            throw new RuntimeException();
        }
        A03[2] = "vLvehkH4B3ak8JU9onbvIk";
        A01 = C1590Ja.A01((String) C3M.A01(matcher.group(1)));
        return A01;
    }

    public static PointF A01(String str) {
        String group;
        String group2;
        Matcher matcher = A07.matcher(str);
        Matcher matcher2 = A06.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AnonymousClass44.A06(A03(82, 18, 115), A03(1, 81, 62) + str + A03(0, 1, 109));
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else if (find2) {
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        } else {
            return null;
        }
        return new PointF(Float.parseFloat(((String) C3M.A01(group)).trim()), Float.parseFloat(((String) C3M.A01(group2)).trim()));
    }

    public static JX A02(String str) {
        int parsedAlignment = -1;
        PointF pointF = null;
        Matcher matcher = A05.matcher(str);
        while (true) {
            boolean find = matcher.find();
            if (A03[1].length() == 17) {
                break;
            }
            A03[2] = "4wlmcdEyXnPZaqMgrsXq3d";
            if (find) {
                String group = matcher.group(1);
                if (A03[1].length() == 17) {
                    break;
                }
                A03[2] = "M6jPqZAMoTJlOEJJxCI750";
                String str2 = (String) C3M.A01(group);
                try {
                    PointF position = A01(str2);
                    if (position != null) {
                        pointF = position;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int A00 = A00(str2);
                    if (A00 != -1) {
                        parsedAlignment = A00;
                    }
                } catch (RuntimeException unused2) {
                }
            } else {
                return new JX(parsedAlignment, pointF);
            }
        }
        throw new RuntimeException();
    }

    public static String A04(String str) {
        return A05.matcher(str).replaceAll(A03(0, 0, 78));
    }
}
