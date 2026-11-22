package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.cv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2203cv {
    public static boolean A00;
    public static byte[] A01;
    public static String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{BuiltinOptions.ReverseV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.EqualOptions, BuiltinOptions.SignOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PackOptions, 25, BuiltinOptions.LessEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.PowOptions, BuiltinOptions.HashtableOptions, 34, BuiltinOptions.PowOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.CastOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CastOptions, 18, 31, 26, 23, 18, 7, 26, 28, 29, BuiltinOptions.GatherNdOptions, 21, 18, 26, 31, 22, 23, BuiltinOptions.WhileOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions};
    }

    static {
        A03();
        A00 = true;
    }

    public static BitmapDrawable A00(C2228dL c2228dL, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = Base64.decode(str, 0);
            Bitmap overlayBm = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (overlayBm != null && (!A00 || A05(c2228dL, overlayBm))) {
                BitmapDrawable overlayRepeat = new BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                Resources resources = c2228dL.getResources();
                if (resources != null) {
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c2228dL, A02(0, 23, 41));
                    }
                } else {
                    A04(c2228dL, A02(23, 18, 119));
                }
                return overlayRepeat;
            }
            return null;
        } catch (Throwable th) {
            c2228dL.A08().AAy(A02(59, 3, 58), AbstractC1841Sv.A1u, new C1842Sw(th));
            return null;
        }
    }

    public static C2204cw A01(C2228dL c2228dL, String str) {
        BitmapDrawable A002;
        try {
            if (TextUtils.isEmpty(str) || (A002 = A00(c2228dL, str)) == null) {
                return null;
            }
            C2204cw c2204cw = new C2204cw(c2228dL);
            c2204cw.setBackground(A002);
            c2204cw.setClickable(false);
            c2204cw.setFocusable(false);
            return c2204cw;
        } catch (Throwable th) {
            c2228dL.A08().AAy(A02(59, 3, 58), AbstractC1841Sv.A1u, new C1842Sw(th));
            return null;
        }
    }

    public static void A04(C2228dL c2228dL, String str) {
        c2228dL.A08().AAy(A02(59, 3, 58), AbstractC1841Sv.A1u, new C1842Sw(str));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A05(com.facebook.ads.redexgen.core.C2228dL r4, android.graphics.Bitmap r5) {
        /*
            r3 = 0
        L1:
            int r0 = r5.getWidth()
            if (r3 >= r0) goto L36
            r2 = 0
        L8:
            int r0 = r5.getHeight()
            if (r2 >= r0) goto L33
            int r0 = r5.getPixel(r3, r2)
            int r0 = android.graphics.Color.alpha(r0)
            float r1 = (float) r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r0
            r0 = 1022739087(0x3cf5c28f, float:0.03)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            r2 = 41
            r1 = 18
            r0 = 79
            java.lang.String r0 = A02(r2, r1, r0)
            A04(r4, r0)
            r0 = 0
            return r0
        L30:
            int r2 = r2 + 1
            goto L8
        L33:
            int r3 = r3 + 1
            goto L1
        L36:
            r3 = 1
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2203cv.A02
            r0 = 2
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L4f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AbstractC2203cv.A02
            java.lang.String r1 = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7"
            r0 = 4
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC2203cv.A05(com.facebook.ads.redexgen.X.dL, android.graphics.Bitmap):boolean");
    }
}
