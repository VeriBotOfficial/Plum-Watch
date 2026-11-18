package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2342Kv {
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

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{58, BuiltinOptions.TileOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TileOptions};
    }

    public C2342Kv(C2342Kv c2342Kv) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = c2342Kv.A09;
        this.A08 = c2342Kv.A08;
        this.A06 = c2342Kv.A06;
        this.A07 = c2342Kv.A07;
        this.A02 = c2342Kv.A02;
        this.A03 = c2342Kv.A03;
        this.A0A = c2342Kv.A0A;
    }

    public C2342Kv(String str) {
        this.A04 = A00(0, 0, 3);
        this.A01 = -1;
        this.A00 = -1;
        this.A09 = str;
        String strA00 = A00(0, 7, 100);
        this.A08 = strA00;
        this.A06 = strA00;
        this.A07 = strA00;
        this.A02 = null;
        this.A03 = strA00;
        this.A0A = false;
    }

    public C2342Kv(String str, String str2, String str3, String str4, String str5, boolean z) {
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
