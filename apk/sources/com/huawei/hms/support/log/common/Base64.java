package com.huawei.hms.support.log.common;

import com.alipay.sdk.m.p.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes11.dex */
public final class Base64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f10745a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', a.h};
    private static final byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private Base64() {
    }

    private static int a(String str) {
        int length = str.length();
        for (int r1 = 0; r1 < str.length(); r1++) {
            char cCharAt = str.charAt(r1);
            if (cCharAt > 255 || b[cCharAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        int r0 = a(str);
        int r1 = (r0 / 4) * 3;
        int r2 = r0 % 4;
        if (r2 == 3) {
            r1 += 2;
        }
        if (r2 == 2) {
            r1++;
        }
        byte[] bArr = new byte[r1];
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        for (int r3 = 0; r3 < str.length(); r3++) {
            char cCharAt = str.charAt(r3);
            byte b2 = cCharAt > 255 ? (byte) -1 : b[cCharAt];
            if (b2 >= 0) {
                int r9 = r6 + 6;
                r5 = (r5 << 6) | b2;
                if (r9 >= 8) {
                    r6 -= 2;
                    bArr[r4] = (byte) (255 & (r5 >> r6));
                    r4++;
                } else {
                    r6 = r9;
                }
            }
        }
        return r4 != r1 ? new byte[0] : bArr;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int r11) {
        boolean z;
        char[] cArr = new char[((r11 + 2) / 3) * 4];
        int r2 = 0;
        int r3 = 0;
        while (r2 < r11) {
            int r4 = (bArr[r2] & 255) << 8;
            int r5 = r2 + 1;
            boolean z2 = true;
            if (r5 < r11) {
                r4 |= bArr[r5] & 255;
                z = true;
            } else {
                z = false;
            }
            int r6 = r4 << 8;
            int r7 = r2 + 2;
            if (r7 < r11) {
                r6 |= bArr[r7] & 255;
            } else {
                z2 = false;
            }
            int r8 = r3 + 3;
            char[] cArr2 = f10745a;
            int r9 = 64;
            cArr[r8] = cArr2[z2 ? r6 & 63 : 64];
            int r10 = r6 >> 6;
            int r12 = r3 + 2;
            if (z) {
                r9 = r10 & 63;
            }
            cArr[r12] = cArr2[r9];
            cArr[r3 + 1] = cArr2[(r6 >> 12) & 63];
            cArr[r3] = cArr2[(r6 >> 18) & 63];
            r2 += 3;
            r3 += 4;
        }
        return new String(cArr);
    }
}
