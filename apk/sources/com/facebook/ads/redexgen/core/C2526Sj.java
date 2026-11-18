package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2526Sj {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] ^ r4) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, BuiltinOptions.BatchMatMulOptions, 2, 0, 20, 6, 9, 21, BuiltinOptions.LogicalAndOptions, 4, 25, 2, 4, 17, 21, 8, 14, 15, 29, 26, 15, 13, 5, 26, 28, 15, 13, 11};
    }

    public C2526Sj(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public C2526Sj(String str, Map<String, String> map, boolean z) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(18, 10, 31), this.A01);
        map.put(A00(2, 16, 16), this.A00);
        Map<String, String> data = this.A02;
        map.putAll(data);
        return map;
    }
}
