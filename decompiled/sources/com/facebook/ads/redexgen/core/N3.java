package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class N3 implements Serializable {
    public static byte[] A05 = null;
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static N3 A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(A04(0, 6, 78));
        String optString2 = jSONObject.optString(A04(36, 8, 81));
        String optString3 = jSONObject.optString(A04(24, 12, 84));
        int optInt = jSONObject.optInt(A04(44, 14, 5), -1);
        boolean optBoolean = jSONObject.optBoolean(A04(6, 18, 35), false);
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString3) || optInt == -1) {
            return null;
        }
        return new N3(optString, optString2, optString3, optInt, optBoolean);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{BuiltinOptions.LessEqualOptions, 61, 61, BuiltinOptions.GreaterOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TransposeConvOptions, 8, 3, 14, 14, 4, 3, 5, 13, 1, 11, 16, 21, 22, 3, 9, 20, 3, 15, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.PowOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ExpandDimsOptions, 64, BuiltinOptions.PowOptions, BuiltinOptions.SquareOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SquareOptions, BuiltinOptions.SquareOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SquareOptions, -10, -23, -12, -13, -10, -8, -19, -14, -21, -29, -15, -13, -24, -23};
    }

    public N3(String str, String str2, String str3, int i, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(N3 n3, C2228dL c2228dL) {
        if (n3 != null && n3.A09()) {
            new UY(c2228dL).A04(true, n3.A01(), n3.A03(), n3.A02(), System.currentTimeMillis(), n3.A08());
        }
    }

    public static void A07(N3 n3, C2228dL c2228dL) {
        if (n3 != null && n3.A0A()) {
            new UY(c2228dL).A04(false, n3.A01(), n3.A03(), n3.A02(), System.currentTimeMillis(), n3.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}
