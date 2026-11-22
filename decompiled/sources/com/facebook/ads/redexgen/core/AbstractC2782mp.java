package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2782mp implements C5J {
    public static byte[] A00;
    public static final boolean A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{32, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.EqualOptions, 35, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.SelectOptions, 58, 22, 26, 1, 20, 21};
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (A00(0, 4, 65).equals(com.facebook.ads.redexgen.core.AbstractC12174a.A06) != false) goto L8;
     */
    static {
        /*
            A01()
            java.lang.String r3 = com.facebook.ads.redexgen.core.AbstractC12174a.A05
            r2 = 8
            r1 = 6
            r0 = 91
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L38
            java.lang.String r3 = com.facebook.ads.redexgen.core.AbstractC12174a.A06
            r2 = 4
            r1 = 4
            r0 = 66
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L34
            java.lang.String r3 = com.facebook.ads.redexgen.core.AbstractC12174a.A06
            r2 = 0
            r1 = 4
            r0 = 65
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L38
        L34:
            r0 = 1
        L35:
            com.facebook.ads.redexgen.core.AbstractC2782mp.A01 = r0
            return
        L38:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2782mp.<clinit>():void");
    }
}
