package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.fA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2339fA {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, BuiltinOptions.PackOptions, BuiltinOptions.VarHandleOptions, 32, BuiltinOptions.LessOptions, BuiltinOptions.VarHandleOptions, 61, BuiltinOptions.LessEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.NegOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogicalOrOptions};
    }

    public static char A00(byte b1, byte b2) {
        return (char) ((b1 << 8) | (b2 & 255));
    }

    public static char A01(long value) {
        char c = (char) value;
        AbstractC2570jA.A0H(((long) c) == value, A02(0, 16, 126), value);
        return c;
    }

    public static boolean A04(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
