package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import java.util.Arrays;
import java.util.Set;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.gq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2440gq implements TL {
    public static byte[] A03;
    public final Bundle A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.AbsOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.WhileOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.AbsOptions, BuiltinOptions.IfOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhereOptions, BuiltinOptions.CosOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.AbsOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.CosOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, 12, 1, 1, 2, 17, 3, 7, 22, 11, 10, 17, 15, 27, 10, 7, 11, 0, 13, 11, 17, 5, 11, 23, 32, BuiltinOptions.CastOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.PackOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.PackOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SliceOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PackOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.PadV2Options, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NegOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, 61, BuiltinOptions.PackOptions, BuiltinOptions.SelectOptions, BuiltinOptions.ExpOptions, 61, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.TileOptions, BuiltinOptions.GreaterEqualOptions, 34, 32, 61, BuiltinOptions.TransposeConvOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterEqualOptions, 61, 34, BuiltinOptions.DequantizeOptions, BuiltinOptions.PackOptions, 61, BuiltinOptions.LogicalOrOptions, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PadV2Options, 7, 2, 23, 2, 28, 19, 17, 12, 0, 6, 16, 16, 10, 13, 4, 28, 12, 19, 23, 10, 12, 13, 16, 28, 16, 23, 2, 23, 6, 28, 8, 6, 26, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.AddNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.RangeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhileOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.AddNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.WhereOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.AbsOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.CosOptions, BuiltinOptions.SquareOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.AbsOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquareOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SquareOptions, BuiltinOptions.DepthToSpaceOptions};
    }

    public C2440gq(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A71() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A7F() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final C1824Se A7e(SQ sq) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, 121));
        Integer valueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(125, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new C1824Se(stringArray, valueOf, country);
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A8O() {
        return this.A00.getString(A00(178, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final String A98() {
        String string = this.A00.getString(A00(158, 20, 6));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean AAR() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean AAX() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final Boolean AAb() {
        Set<String> keySet = this.A00.keySet();
        String A00 = A00(27, 13, 10);
        if (keySet.contains(A00)) {
            return Boolean.valueOf(this.A00.getBoolean(A00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || AdSettings.isTestMode(context);
    }
}
