package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.iG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2517iG implements MK {
    public static byte[] A08;
    public final MJ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final Collection<String> A06;
    public final Map<String, String> A07;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2517iG A00(C6M c6m, JSONObject jSONObject) {
        String optString = jSONObject.optString(A01(33, 6, 120));
        String optString2 = jSONObject.optString(A01(0, 18, 118));
        String optString3 = jSONObject.optString(A01(47, 10, 52));
        String A02 = AbstractC1937Wr.A02(jSONObject, A01(18, 2, 83));
        MJ A00 = ML.A00(jSONObject);
        Collection<String> A03 = ML.A03(c6m, jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject(A01(39, 8, 66));
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next));
            }
        }
        return new C2517iG(optString, optString2, A00, A03, hashMap, optString3, A02, AbstractC1937Wr.A02(jSONObject, A01(20, 13, 89)));
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{BuiltinOptions.AbsOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.AbsOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.RankOptions, BuiltinOptions.IfOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.IfOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.AbsOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RangeOptions, 64, BuiltinOptions.FillOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TileOptions, 64, 61, BuiltinOptions.IfOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.DequantizeOptions, 30, BuiltinOptions.GreaterEqualOptions, 26, 29, 26, BuiltinOptions.GreaterEqualOptions, 26, 29, 16, 28, 32, 16, 30, 31, 10, 20, 15};
    }

    public C2517iG(String str, String str2, MJ mj, Collection<String> detectionStrings, Map<String, String> metadata, String str3, String str4, String str5) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = mj;
        this.A06 = detectionStrings;
        this.A07 = metadata;
        this.A05 = str3;
        this.A02 = str4;
        this.A03 = str5;
    }

    public final String A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A04;
    }

    public final String A05() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return this.A00;
    }
}
