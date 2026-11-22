package com.facebook.ads.redexgen.core;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1862Tr {
    public static byte[] A01;
    public static String[] A02 = {"bU9TaOq2H1BCoTTudHgTa6noiTEuLI16", "3dC6vQggwfY", "sSGIgptGmRpdYm1DWaL7pn14ju5", "", "MWUI4wrCJQVvfxcejCMbIiiXK3H", "jomkRAByJcuN5WcossiIAnU6", "EV4d58k22VMnbcsySNbmwKm2xbXDyfIQ", "0y1Y4yK8RTgYo"};
    public final File A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[7] = "66mt0TcJLXpax";
            strArr2[1] = "NTsH2gO48Ko";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
            i4++;
        }
    }

    public static void A02() {
        byte[] bArr = {7, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.SliceOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ExpOptions, BuiltinOptions.NegOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.CastOptions, BuiltinOptions.SegmentSumOptions, 32, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SliceOptions, BuiltinOptions.PadV2Options, BuiltinOptions.NotEqualOptions, 61, 7, 32, BuiltinOptions.ArgMaxOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.ScatterNdOptions, 34, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 32, BuiltinOptions.EqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CastOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.LogSoftmaxOptions, 34, BuiltinOptions.EqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.PowOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BitwiseXorOptions};
        String[] strArr = A02;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "";
        strArr2[5] = "lx0xFtkenAwJEtKSHitpjLSh";
        A01 = bArr;
    }

    static {
        A02();
    }

    public C1862Tr(File file) {
        this.A00 = file;
    }

    public static C1862Tr A00(String str, Context context) throws IOException {
        File filesDir = new File(context.getFilesDir(), A01(64, 9, 96));
        A03(filesDir);
        File fbsdklogDir = new File(filesDir, str);
        A03(fbsdklogDir);
        return new C1862Tr(fbsdklogDir);
    }

    public static void A03(File file) throws IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            } else {
                throw new C1863Ts(String.format(Locale.US, A01(0, 33, 62), file.getCanonicalPath()));
            }
        }
        throw new C1863Ts(String.format(Locale.US, A01(33, 31, 59), file.getCanonicalPath()));
    }

    public final C1862Tr A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new C1862Tr(file);
    }

    public final File A05() {
        return this.A00;
    }
}
