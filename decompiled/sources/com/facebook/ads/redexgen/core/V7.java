package com.facebook.ads.redexgen.core;

import android.util.Log;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public class V7 implements InterfaceC2308ee {
    public static byte[] A01;
    public static String[] A02 = {"Pvxnryfp5C2YJ", "58Tt8xWVSP1vJRxeZG7By0J4DHdpZFgc", "d8fJjrUVSDGdkyzleHZclvn63G4sHX0L", "2vkexQ2kDfwHm", "C5INcofoFkRix0Rm4DG2QIlt8jox4BBj", "", "Y25u3HoHlGlpJYy8Y", "MTcvQGxX9nLrxfee4M1dH5SKsx5IsifC"};
    public final /* synthetic */ SQ A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[1] = "YNZl3vrESdm0ZjqRAgqNuDMkNkDkDjcM";
            strArr[2] = "T4MR0Bp8ShJAOBNGhRUi97nIryoGWHBS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{26, BuiltinOptions.PowOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.UnsortedSegmentSumOptions, 61, BuiltinOptions.SliceOptions, BuiltinOptions.NegOptions, BuiltinOptions.LessOptions, BuiltinOptions.PowOptions, BuiltinOptions.GreaterEqualOptions, 58, BuiltinOptions.TransposeConvOptions, BuiltinOptions.UnsortedSegmentSumOptions, 58, BuiltinOptions.NotEqualOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NegOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LessOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SignOptions, BuiltinOptions.ATan2Options, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.LessOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ATan2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.ATan2Options, BuiltinOptions.HashtableFindOptions, BuiltinOptions.TileOptions, BuiltinOptions.LessOptions};
    }

    static {
        A01();
    }

    public V7(SQ sq) {
        this.A00 = sq;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308ee
    public final void ACo(InterfaceC2306ec interfaceC2306ec) {
        if (this.A00.A05().AAF() && interfaceC2306ec != null) {
            String str = A00(24, 31, 44) + interfaceC2306ec.A6v();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308ee
    public final void ADC(Exception exc) {
        String str;
        if (this.A00.A05().AAF()) {
            str = C1874Ud.A01;
            Log.e(str, A00(0, 24, 124), exc);
        }
    }
}
