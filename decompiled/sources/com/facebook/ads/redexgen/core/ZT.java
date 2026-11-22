package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class ZT {
    public static byte[] A02;
    public boolean A00 = true;
    public final LJ A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 85);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{13, 26, 26, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SquareOptions, 16, BuiltinOptions.PackOptions, BuiltinOptions.ArgMinOptions, 15, BuiltinOptions.PackOptions, 58, 64, BuiltinOptions.TransposeConvOptions, 58, 64, 24, BuiltinOptions.PackOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, 6, 20, BuiltinOptions.ExpOptions, BuiltinOptions.ExpOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.RangeOptions, 31, BuiltinOptions.SquareOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ShapeOptions, 24, BuiltinOptions.RangeOptions, BuiltinOptions.PowOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 24, BuiltinOptions.FloorDivOptions, BuiltinOptions.ShapeOptions, 13, -52, -39, -39, -20, 1, -35, TransmissionUnpacked.HD_VAL_MAGIC_HB, -2, -5, -6, -7, -2, TransmissionUnpacked.HD_VAL_MAGIC_HB, -48, -7, -17, -59, 34, 27, 21, 16, -44, -44, 18, BuiltinOptions.ExpOptions, 26, 15, 32, 21, 27, 26, -44, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, 32, 30, BuiltinOptions.CastOptions, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, 21, 18, -52, -44, -51, 35, 21, 26, 16, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, 13, 26, 15, 17, -52, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, -52, -51, 35, 21, 26, 16, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, 13, 26, 15, 17, -38, 32, 21, 25, 21, 26, 19, -52, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, -52, -51, 16, 27, 15, BuiltinOptions.ExpOptions, 25, 17, 26, 32, -52, -52, -52, -52, -52, -52, -52, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, -52, -51, 16, 27, 15, BuiltinOptions.ExpOptions, 25, 17, 26, 32, -38, 14, 27, 16, BuiltinOptions.CastOptions, -52, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, -52, -51, 16, 27, 15, BuiltinOptions.ExpOptions, 25, 17, 26, 32, -38, 14, 27, 16, BuiltinOptions.CastOptions, -38, 15, 20, 21, 24, 16, 30, 17, 26, -52, -52, -52, -52, -52, -52, -52, BuiltinOptions.ArgMaxOptions, BuiltinOptions.ArgMaxOptions, -52, 16, 27, 15, BuiltinOptions.ExpOptions, 25, 17, 26, 32, -38, 14, 27, 16, BuiltinOptions.CastOptions, -38, 15, 20, 21, 24, 16, 30, 17, 26, -38, 24, 17, 26, 19, 32, 20, -52, -24, -52, -35, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, -52, -52, 30, 17, 32, BuiltinOptions.ExpOptions, 30, 26, -25, -52, -52, BuiltinOptions.LessOptions, -52, -52, 34, 13, 30, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -52, -23, -52, 35, 21, 26, 16, 27, 35, -38, 28, 17, 30, 18, 27, 30, 25, 13, 26, 15, 17, -38, 32, 21, 25, 21, 26, 19, -25, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 30, 17, 31, 28, 27, 26, 31, 17, -15, 26, 16, -52, -22, -52, -36, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, -2, 17, 31, 28, 27, 26, 31, 17, -15, 26, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 30, 17, 31, 28, 27, 26, 31, 17, -15, 26, 16, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25, -52, -52, BuiltinOptions.LessOptions, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 16, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, 13, 16, 17, 16, -15, 34, 17, 26, 32, -1, 32, 13, 30, 32, -52, -22, -52, -36, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, TransmissionUnpacked.HD_VAL_MAGIC_HB, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, 13, 16, 17, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 16, 27, 25, -17, 27, 26, 32, 17, 26, 32, -8, 27, 13, 16, 17, 16, -15, 34, 17, 26, 32, -1, 32, 13, 30, 32, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25, -52, -52, BuiltinOptions.LessOptions, -52, -52, 21, 18, -52, -44, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 24, 27, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, -52, -22, -52, -36, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, -8, 27, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, -26, -45, -52, -41, -52, 26, 34, 32, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, 32, -38, 24, 27, 13, 16, -15, 34, 17, 26, 32, -15, 26, 16, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25, -52, -52, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, -52, 15, 13, 32, 15, 20, -44, 17, 30, 30, TransmissionUnpacked.HD_VAL_MAGIC_LB, -52, BuiltinOptions.MaximumMinimumOptions, -52, -52, 15, 27, 26, 31, 27, 24, 17, -38, 24, 27, 19, -44, -45, 13, 26, 11, 26, 13, 34, 21, 19, 13, 32, 21, 27, 26, 11, 32, 21, 25, 21, 26, 19, 11, 17, 30, 30, 27, 30, -26, -45, -52, -41, -52, 17, 30, 30, -38, 25, 17, 31, 31, 13, 19, 17, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25, BuiltinOptions.LessOptions, BuiltinOptions.LessOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, -44, TransmissionUnpacked.HD_VAL_MAGIC_LB, TransmissionUnpacked.HD_VAL_MAGIC_LB, -25};
    }

    public ZT(LJ lj) {
        this.A01 = lj;
    }

    public static long A00(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1L;
        }
        try {
            long parseLong = Long.parseLong(substring);
            if (parseLong < 0) {
                return -1L;
            }
            return parseLong;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String A01 = A01(40, 17, 54);
        if (str.startsWith(A01)) {
            this.A01.A0M(A00(str, A01));
            return;
        }
        String A012 = A01(0, 22, 119);
        if (str.startsWith(A012)) {
            this.A01.A0K(A00(str, A012));
            return;
        }
        String A013 = A01(22, 18, 126);
        if (!str.startsWith(A013)) {
            return;
        }
        this.A01.A0L(A00(str, A013));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
