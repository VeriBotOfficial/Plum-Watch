package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.io.Serializable;
import java.util.Arrays;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2394My implements Serializable {
    public static byte[] A0A = null;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final long serialVersionUID = 8946536326456653736L;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public static String A02(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0A = new byte[]{BuiltinOptions.HashtableSizeOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BitwiseXorOptions, -126, BuiltinOptions.BitwiseXorOptions, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.UnsortedSegmentSumOptions, -118, -72, -118, PSSSigner.TRAILER_IMPLICIT, -117, -116, -77, -55, -64, -55, -60, -55, -13, -113, -46, -94, -46, -93, -46, -91, -128, -61, -61, OtaCommandGenerator.CMD_GET_INFO, -115, -107, -115, -61, -61, -64, -62, -62, -60, -51, -45, -66, -62, -50, -53, -50, -47, 24, 29, 21, 25, BuiltinOptions.CastOptions, 34, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, 22, 35, 24, BuiltinOptions.GreaterEqualOptions, 19, 23, 35, 32, 35, BuiltinOptions.DequantizeOptions, 27, BuiltinOptions.GreaterOptions, 25, 23, 27, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, 14, 31, 12, 10, 14, 26, 23, 26, 29, 10, 26, BuiltinOptions.ExpOptions, 16, 29, 10, 24, 16, 15, 20, 12, 17, 34, 15, 13, 18, BuiltinOptions.MaximumMinimumOptions, 28, 15, 27, 23, 17, 13, 17, 29, 26, 29, 32, TransmissionUnpacked.HD_VAL_MAGIC_HB, 1, -18, -20, 1, -14, 5, 1, -20, TransmissionUnpacked.HD_VAL_MAGIC_HB, -4, -7, -4, -1, 32, BuiltinOptions.TransposeConvOptions, 30, 28, BuiltinOptions.TransposeConvOptions, 34, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, 28, 32, BuiltinOptions.GreaterOptions, BuiltinOptions.LessOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SelectOptions, 28, BuiltinOptions.GreaterOptions, BuiltinOptions.TileOptions, 34, BuiltinOptions.SelectOptions, 28, BuiltinOptions.NegOptions, 34, BuiltinOptions.ExpOptions, BuiltinOptions.DequantizeOptions, 30, 28, 30, 11, 29, 18, 29, 21, 14, 8, 12, 24, 21, 24, 27, BuiltinOptions.LessOptions, 30, BuiltinOptions.LessOptions, BuiltinOptions.ExpOptions, 26, 20, 24, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.MaximumMinimumOptions};
    }

    static {
        A03();
        A0B = Color.parseColor(A02(14, 7, 76));
        A0C = Color.parseColor(A02(7, 7, 18));
        A0D = Color.parseColor(A02(21, 7, 40));
        String strA02 = A02(28, 9, 25);
        A0E = Color.parseColor(strA02);
        A0F = Color.parseColor(A02(0, 7, 7));
        A0G = Color.parseColor(strA02);
    }

    public C2394My(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A09 = r9;
        this.A06 = r10;
    }

    public static int A00(JSONObject jSONObject, String str, int r3) {
        if (jSONObject != null && jSONObject.has(str)) {
            return Color.parseColor(jSONObject.optString(str));
        }
        return r3;
    }

    public static C2394My A01(JSONObject jSONObject) {
        return new C2394My(A00(jSONObject, A02(37, 12, 27), A0B), A00(jSONObject, A02(57, 10, 112), A0C), A00(jSONObject, A02(152, 14, 101), -16777216), A00(jSONObject, A02(49, 8, 114), A0D), A00(jSONObject, A02(67, 9, 116), A0E), A00(jSONObject, A02(76, 20, 103), -1), A00(jSONObject, A02(113, 14, 73), -1), A00(jSONObject, A02(127, 25, 121), A0G), A00(jSONObject, A02(Opcodes.IF_ACMPNE, 11, 113), -16777216), A00(jSONObject, A02(96, 17, 106), A0E));
    }

    public final int A04() {
        return this.A06;
    }

    public final int A05(boolean z) {
        if (z) {
            return -1;
        }
        return this.A00;
    }

    public final int A06(boolean z) {
        if (z) {
            return -1;
        }
        return this.A01;
    }

    public final int A07(boolean z) {
        if (z) {
            return -1;
        }
        return this.A02;
    }

    public final int A08(boolean z) {
        return z ? A0F : this.A03;
    }

    public final int A09(boolean z) {
        return z ? this.A05 : this.A04;
    }

    public final int A0A(boolean z) {
        return z ? this.A08 : this.A07;
    }

    public final int A0B(boolean z) {
        if (z) {
            return -1;
        }
        return this.A09;
    }
}
