package com.facebook.ads.redexgen.core;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class YV extends AbstractRunnableC1915Vt {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{BuiltinOptions.UniqueOptions, 3, BuiltinOptions.GatherNdOptions, BuiltinOptions.IfOptions, BuiltinOptions.RankOptions, 3, 7, 0, 16, 7, 8, BuiltinOptions.DensifyOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, 34, BuiltinOptions.SelectOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMinOptions, 34, BuiltinOptions.ShapeOptions, BuiltinOptions.NegOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.DensifyOptions, 32, BuiltinOptions.GreaterOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.SelectOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DequantizeOptions, 17, 22, 13, BuiltinOptions.SliceOptions, 2, 5, 6};
    }

    public YV(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1915Vt
    public final void A07() {
        VF.A05(A00(35, 7, 46), A00(8, 27, 14), A00(0, 8, 40));
        this.A00.onInitialized(this.A01);
    }
}
