package com.facebook.ads.redexgen.core;

import com.autonavi.aps.amapapi.config.Const;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1670Mc {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + Const.I_DEF_CGI_SIG);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, PSSSigner.TRAILER_IMPLICIT, -55, -48, PSSSigner.TRAILER_IMPLICIT, -57, 61, BuiltinOptions.LogicalAndOptions, 61, BuiltinOptions.ExpandDimsOptions, 58, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -8, -20, -7, 0, -20, -9, BuiltinOptions.WhileOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.WhileOptions, BuiltinOptions.CosOptions};
    }

    static {
        A01();
    }

    EnumC1670Mc(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
