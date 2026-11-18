package com.facebook.ads.redexgen.core;

import com.hispark.crashdump.protocol.ProtocolBytes;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC2506Rn {
    A04(A01(16, 5, 107)),
    A06(A01(27, 5, 1)),
    A05(A01(21, 6, 74));

    public static byte[] A01;
    public static String[] A02 = {"SZ4ZqaU4fFFh0E4YNccvZxVNy5", "RnD6qsfq2PJ4GIm1AYVwkdKueb87xF36", "J6AvcZe6YXfwvJXVFlguqZimD2oQ2oTO", "puNNDl5gPUEFWhcEtNEHLKZ21l2c7qHR", "lO566f8c3ZpTrsgNovf1GdP6EuJ1Ihz8", "rzZJHS6KiH5aslcybkMmKbRCqwolmQAz", "lMymBa1GAS6gSrjK2mQJROkXbE", "lIq0nKP0GwKiYNEJRhA9Zsqqg4xJtS7q"};
    public final String A00;

    public static String A01(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-70, -66, -78, -72, -74, BuiltinOptions.QuantizeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.IfOptions, ProtocolBytes.SOF, -94, -99, -98, -88, -34, -30, -42, -36, -38, -63, -75, -58, -65, -55, -60, -127, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ATan2Options};
    }

    static {
        A02();
    }

    EnumC2506Rn(String str) {
        this.A00 = str;
    }

    public static EnumC2506Rn A00(String str) {
        for (EnumC2506Rn type : values()) {
            String[] strArr = A02;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "Aja9B1UEj6BzKn1INFFqcKK4Fe";
            strArr2[0] = "GwpKbwXfukeF7x0PFg8wIbfMxN";
            if (type.A00.equals(str)) {
                return type;
            }
        }
        return null;
    }
}
