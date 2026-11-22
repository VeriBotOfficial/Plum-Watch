package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.ek, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2314ek {
    public static byte[] A07;
    public static String[] A08 = {"H9a6GPEeuBppqgml", "UMFfHf9K0rtxTnfS4GQ", "HJf7oQJhMr6BjfdBAkNXb1VX0FlaYu0s", "mblZ", "lDa8BWO3GNKgBVoNV1FydEibnHhzaqpi", "BpHqCYEOVY5", "fQPNbuq5zM2Vt99anBRO7vAhC8TCHPEC", "oGui3UnSaV6fb7qd5azTuEEp3mm97meQ"};
    public InterfaceC2305eb A05;
    public int A04 = 60000;
    public int A03 = 100;
    public int A00 = 10000;
    public int A02 = 8000;
    public int A01 = 3;
    public Map<String, String> A06 = new HashMap();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 100);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{4, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TransposeConvOptions, 32, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.PackOptions, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.PackOptions, 32, BuiltinOptions.GreaterOptions, 58, BuiltinOptions.Rfft2dOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalOrOptions, 58, 61, BuiltinOptions.Rfft2dOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, 61, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.AssignVariableOptions};
        if (A08[3].length() != 4) {
            throw new RuntimeException();
        }
        A08[4] = "ylxMzgRnic8ELdWNUfQitMVfYj0C1DI2";
    }

    static {
        A01();
    }

    public final C2314ek A02(int i) {
        this.A00 = i;
        return this;
    }

    public final C2314ek A03(int i) {
        if (i >= 1 && i <= 18) {
            this.A01 = i;
            return this;
        }
        throw new IllegalArgumentException(A00(0, 40, 45));
    }

    public final C2314ek A04(int i) {
        this.A02 = i;
        return this;
    }

    public final C2314ek A05(int i) {
        this.A03 = i;
        return this;
    }

    public final C2314ek A06(int i) {
        this.A04 = i;
        return this;
    }

    public final C2314ek A07(InterfaceC2305eb interfaceC2305eb) {
        this.A05 = interfaceC2305eb;
        return this;
    }

    public final C2314ek A08(Map<String, String> requestHeaders) {
        this.A06 = requestHeaders;
        return this;
    }

    public final C2315el A09() {
        return new C2315el(this.A04, this.A00, this.A02, this.A03, this.A01, this.A06, this.A05);
    }
}
