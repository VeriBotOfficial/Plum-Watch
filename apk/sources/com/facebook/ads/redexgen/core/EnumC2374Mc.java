package com.facebook.ads.redexgen.core;

import com.autonavi.aps.amapapi.config.Const;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2374Mc {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final String A00;

    public static String A00(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) + Const.I_DEF_CGI_SIG);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, PSSSigner.TRAILER_IMPLICIT, -55, -48, PSSSigner.TRAILER_IMPLICIT, -57, 61, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -8, -20, -7, 0, -20, -9, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions};
    }

    static {
        A01();
    }

    EnumC2374Mc(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
