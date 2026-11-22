package com.facebook.ads.redexgen.core;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.wakeup.common.DeviceFeatures;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class SI {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, PSSSigner.TRAILER_IMPLICIT, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, BuiltinOptions.CastOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.CastOptions, 23, 26, -42, 28, 23, 31, 34, BuiltinOptions.PadV2Options, BuiltinOptions.ArgMaxOptions, 27, -28, -80, -50, -48, TransmissionUnpacked.HD_VAL_MAGIC_LB, -46, -115, TransmissionUnpacked.HD_VAL_MAGIC_LB, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, BuiltinOptions.LogSoftmaxOptions, 23, 19, BuiltinOptions.DequantizeOptions, 27, BuiltinOptions.ArgMaxOptions, 23, 17, BuiltinOptions.CastOptions, 27, BuiltinOptions.GreaterOptions, 23, 17, 20, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, 23, BuiltinOptions.CastOptions, -33, -30, -35, -31, TransmissionUnpacked.HD_VAL_MAGIC_HB, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, BuiltinOptions.PadV2Options, BuiltinOptions.LessEqualOptions, BuiltinOptions.LessOptions, 29, BuiltinOptions.SliceOptions, 27, BuiltinOptions.SliceOptions, BuiltinOptions.EqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ExpOptions, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RankOptions, 30, 28, 30, 35, 32, 63, 61, 63, BuiltinOptions.FillOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.PackOptions, 63, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.CosOptions, BuiltinOptions.UniqueOptions, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, BuiltinOptions.LogSoftmaxOptions, 25, 29, 21, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ZerosLikeOptions, 61};
    }

    static {
        A01();
        A09 = SI.class.getSimpleName();
        A05 = AbstractC1841Sv.A0o;
        A06 = AbstractC1841Sv.A0s;
        A02 = AbstractC1841Sv.A0l;
        A01 = AbstractC1841Sv.A0k;
        A03 = AbstractC1841Sv.A0m;
        A00 = AbstractC1841Sv.A0i;
        A04 = AbstractC1841Sv.A0n;
        A07 = AbstractC1841Sv.A0t;
    }

    public static void A02(SQ sq, S8 s8, int i, String str, long j) {
        if (!A06(sq)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), s8.A01);
            jSONObject.put(A00(134, 13, 46), s8.A02);
            if (j > 0) {
                jSONObject.put(A00(DeviceFeatures.DIAL_THUMB, 9, 73), XG.A07(System.currentTimeMillis() - j));
            }
            C1842Sw c1842Sw = new C1842Sw(str);
            c1842Sw.A07(jSONObject);
            c1842Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i, c1842Sw);
        } catch (Throwable deLogException) {
            sq.A08().A4A(deLogException);
        }
    }

    public static void A03(SQ sq, SD sd, String str, int i, String str2, Long l, Long l2) {
        if (A06(sq)) {
            A05(sq, sd.A06, sd.A07, sd.A08, A00(DeviceFeatures.CONFIG_SLEEP, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(SQ sq, SH sh, boolean z) {
        if (!A06(sq)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), sh.A01);
            jSONObject.put(A00(134, 13, 46), sh.A03);
            jSONObject.put(A00(104, 16, 23), sh.A02);
            jSONObject.put(A00(159, 13, 117), sh.A00);
            if (U7.A2M(sq)) {
                jSONObject.put(A00(200, 3, 106), sh.A04);
            }
            String A002 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C1842Sw c1842Sw = new C1842Sw(A002);
            c1842Sw.A07(jSONObject);
            c1842Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i, c1842Sw);
        } catch (Throwable th) {
            sq.A08().A4A(th);
        }
    }

    public static void A05(SQ sq, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(DeviceFeatures.DIAL_THUMB, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (U7.A2M(sq)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i == A03) {
                A002 = A00(38, 23, 79);
            } else if (i == A01) {
                A002 = A00(0, 19, 39);
            }
            C1842Sw c1842Sw = new C1842Sw(A002);
            c1842Sw.A07(jSONObject);
            c1842Sw.A05(1);
            sq.A08().AAz(A00(154, 5, 84), i, c1842Sw);
        } catch (Throwable th) {
            sq.A08().A4A(th);
        }
    }

    public static boolean A06(SQ sq) {
        int A062;
        if (sq.A05().AAF()) {
            A062 = 1;
        } else {
            A062 = U9.A06(sq);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || sq.A09().A00() <= 1.0d / ((double) A062);
    }
}
