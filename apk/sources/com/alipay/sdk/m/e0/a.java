package com.alipay.sdk.m.e0;

import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f1376a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static byte[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1};

    public static byte[] a(String str) throws UnsupportedEncodingException {
        int r5;
        byte b2;
        int r7;
        byte b3;
        int r2;
        byte b4;
        int r6;
        byte b5;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes("US-ASCII");
        int length = bytes.length;
        int r3 = 0;
        loop0: while (r3 < length) {
            while (true) {
                r5 = r3 + 1;
                b2 = b[bytes[r3]];
                if (r5 >= length || b2 != -1) {
                    break;
                }
                r3 = r5;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                r7 = r5 + 1;
                b3 = b[bytes[r5]];
                if (r7 >= length || b3 != -1) {
                    break;
                }
                r5 = r7;
            }
            if (b3 == -1) {
                break;
            }
            stringBuffer.append((char) ((b2 << 2) | ((b3 & BuiltinOptions.SliceOptions) >>> 4)));
            while (true) {
                r2 = r7 + 1;
                byte b6 = bytes[r7];
                if (b6 == 61) {
                    break loop0;
                }
                b4 = b[b6];
                if (r2 >= length || b4 != -1) {
                    break;
                }
                r7 = r2;
            }
            if (b4 == -1) {
                break;
            }
            stringBuffer.append((char) (((b3 & 15) << 4) | ((b4 & BuiltinOptions.LogicalOrOptions) >>> 2)));
            while (true) {
                r6 = r2 + 1;
                byte b7 = bytes[r2];
                if (b7 == 61) {
                    break loop0;
                }
                b5 = b[b7];
                if (r6 >= length || b5 != -1) {
                    break;
                }
                r2 = r6;
            }
            if (b5 == -1) {
                break;
            }
            stringBuffer.append((char) (b5 | ((b4 & 3) << 6)));
            r3 = r6;
        }
        return stringBuffer.toString().getBytes("iso8859-1");
    }
}
