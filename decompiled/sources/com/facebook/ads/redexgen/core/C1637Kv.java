package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Kv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1637Kv {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public Integer A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions};
    }

    public C1637Kv(C1637Kv c1637Kv) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = c1637Kv.A09;
        this.A08 = c1637Kv.A08;
        this.A06 = c1637Kv.A06;
        this.A07 = c1637Kv.A07;
        this.A02 = c1637Kv.A02;
        this.A03 = c1637Kv.A03;
        this.A0A = c1637Kv.A0A;
    }

    public C1637Kv(String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String A00 = A00(0, 7, 100);
        this.A08 = A00;
        this.A06 = A00;
        this.A07 = A00;
        this.A02 = null;
        this.A03 = A00;
        this.A0A = false;
    }

    public C1637Kv(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = null;
        this.A03 = str5;
        this.A0A = z;
    }
}
