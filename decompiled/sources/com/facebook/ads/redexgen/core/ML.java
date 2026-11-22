package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public abstract class ML {
    public static byte[] A00;
    public static String[] A01 = {"jSoy8XspXCFqO9NWG0uega5zyBcMMpnv", "8I941vkvBihlhZSR3", "E0n4xhy7f55RdYtJKKgnHTy6BEjDvFXE", "Oow628hlFtykEPzM3xMW0Wh", "gjSfO6YGNNbsKn6TLZq3stDSfq2Vbbu6", "XJoMwGgC8l1BSQaiX90ZQnicuTGj509z", "JK4GcCSwzapE3gOVlVNykyUw2lU6lT6d", "8BqJ2MeWpSgEuyxwl"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {BuiltinOptions.RankOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SignOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ArgMinOptions, 27, 10, 19, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.GeluOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.RightShiftOptions, Byte.MAX_VALUE, BuiltinOptions.AbsOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentMinOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.MaximumMinimumOptions, 32, BuiltinOptions.PowOptions, BuiltinOptions.SelectOptions, 34, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, BuiltinOptions.SelectOptions, 58, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, 32, 17, BuiltinOptions.GreaterOptions, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PowOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.SelectOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, 58};
        if (A01[6].length() == 14) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[7] = "4DtSv1ItoT1AnjNkW";
        strArr[1] = "xsdhzuZMhKe1kPAxh";
        A00 = bArr;
    }

    static {
        A05();
    }

    public static MJ A00(JSONObject jSONObject) {
        return MJ.A00(jSONObject.optString(A02(52, 21, 9)));
    }

    public static C2549io A01(C2228dL c2228dL, JSONObject jSONObject, String str) {
        return new C2549io(jSONObject, c2228dL, str);
    }

    public static Collection<String> A03(C2228dL c2228dL, JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            String detectionStringJSON = jSONObject.optString(A02(35, 17, 86));
            if (!TextUtils.isEmpty(detectionStringJSON)) {
                JSONArray detectionStringsArray = new JSONArray(detectionStringJSON);
                jSONArray = detectionStringsArray;
            }
        } catch (JSONException e) {
            c2228dL.A08().AAy(A02(73, 7, 26), AbstractC1841Sv.A2C, new C1842Sw(e));
        }
        return A04(jSONArray);
    }

    public static Collection<String> A04(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean A06(C2228dL c2228dL, MK mk, US us) {
        MJ A8C = mk.A8C();
        if (A8C != null) {
            MJ invalidationBehavior = MJ.A03;
            if (A8C != invalidationBehavior) {
                boolean packageInstalled = false;
                Collection<String> A7h = mk.A7h();
                if (A7h == null || A7h.isEmpty()) {
                    return false;
                }
                Iterator<String> it = A7h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AbstractC1942Ww.A04(c2228dL, it.next())) {
                        packageInstalled = true;
                        break;
                    }
                }
                MJ invalidationBehavior2 = MJ.A02;
                if (packageInstalled != (A8C == invalidationBehavior2)) {
                    return false;
                }
                String clientToken = mk.A7G();
                if (!TextUtils.isEmpty(clientToken)) {
                    us.AB6(clientToken, null);
                    return true;
                }
                c2228dL.A08().AAy(A02(32, 3, 61), AbstractC1841Sv.A0Z, new C1842Sw(A02(0, 32, 80)));
                return true;
            }
        }
        return false;
    }
}
