package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WS {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static final Map<String, String> A03;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-10, -14, -66, -11, -62, -11, -66, -76, -80, BuiltinOptions.BitcastOptions, -64, -61, PSSSigner.TRAILER_IMPLICIT, PSSSigner.TRAILER_IMPLICIT, -73, PSSSigner.TRAILER_IMPLICIT, -75, -83, -77, -128, -77, -84, -86, -83, -99};
    }

    static {
        A03();
        A01 = false;
        A00 = false;
        A03 = Collections.synchronizedMap(new HashMap());
    }

    public static synchronized String A01(String str) {
        if (!A04()) {
            return null;
        }
        return System.getProperty(A00(0, 7, 115) + str);
    }

    public static Map<String, String> A02() {
        if (!A04()) {
            return Collections.emptyMap();
        }
        return A03;
    }

    public static synchronized boolean A04() {
        if (!A00) {
            A01 = A00(21, 4, 27).equals(System.getProperty(A00(7, 14, 49)));
            A00 = true;
        }
        return A01;
    }

    public static synchronized boolean A05(String str) {
        return !TextUtils.isEmpty(A01(str));
    }
}
