package com.anythink.core.express.a;

import android.text.TextUtils;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4546a = "a";
    private static Map<Character, Character> b;
    private static Map<Character, Character> c;
    private static char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static byte[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1};

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put('v', 'A');
        c.put('S', 'B');
        c.put('o', 'C');
        c.put('a', 'D');
        c.put('j', 'E');
        c.put('c', 'F');
        c.put('7', 'G');
        c.put('d', 'H');
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), 'I');
        c.put('z', 'J');
        c.put('p', 'K');
        c.put('W', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT));
        c.put('i', 'M');
        c.put('f', 'N');
        c.put('G', 'O');
        c.put('y', 'P');
        c.put('N', 'Q');
        c.put('x', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'S');
        c.put('n', 'T');
        c.put('V', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT));
        c.put('5', 'V');
        c.put('k', 'W');
        c.put('+', 'X');
        c.put('D', 'Y');
        c.put('H', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), 'a');
        c.put('Y', 'b');
        c.put('h', 'c');
        c.put('J', 'd');
        c.put('4', 'e');
        c.put('6', 'f');
        c.put('l', 'g');
        c.put('t', 'h');
        c.put('0', 'i');
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'j');
        c.put('3', 'k');
        c.put('Q', 'l');
        c.put('r', 'm');
        c.put('g', 'n');
        c.put('E', 'o');
        c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        c.put('q', 'q');
        c.put('8', 'r');
        c.put('s', 's');
        c.put('w', 't');
        c.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        c.put('X', 'v');
        c.put('M', 'w');
        c.put('e', 'x');
        c.put('B', 'y');
        c.put('A', 'z');
        c.put('T', '0');
        c.put('2', '1');
        c.put('F', '2');
        c.put('b', '3');
        c.put('9', '4');
        c.put('P', '5');
        c.put('1', '6');
        c.put('O', '7');
        c.put('I', '8');
        c.put('K', '9');
        c.put('m', '+');
        c.put('C', '/');
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap2.put('A', 'v');
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', 'd');
        b.put('I', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        b.put('J', 'z');
        b.put('K', 'p');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), 'W');
        b.put('M', 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), 'x');
        b.put('S', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        b.put('T', 'n');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put('Y', 'D');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'H');
        b.put('a', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT));
        b.put('b', 'Y');
        b.put('c', 'h');
        b.put('d', 'J');
        b.put('e', '4');
        b.put('f', '6');
        b.put('g', 'l');
        b.put('h', 't');
        b.put('i', '0');
        b.put('j', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT));
        b.put('k', '3');
        b.put('l', 'Q');
        b.put('m', 'r');
        b.put('n', 'g');
        b.put('o', 'E');
        b.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        b.put('q', 'q');
        b.put('r', '8');
        b.put('s', 's');
        b.put('t', 'w');
        b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        b.put('v', 'X');
        b.put('w', 'M');
        b.put('x', 'e');
        b.put('y', 'B');
        b.put('z', 'A');
        b.put('0', 'T');
        b.put('1', '2');
        b.put('2', 'F');
        b.put('3', 'b');
        b.put('4', '9');
        b.put('5', 'P');
        b.put('6', '1');
        b.put('7', 'O');
        b.put('8', 'I');
        b.put('9', 'K');
        b.put('+', 'm');
        b.put('/', 'C');
    }

    private a() {
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                stringBuffer.append(d[i3 >>> 2]);
                stringBuffer.append(d[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b3 = bArr[i2];
            if (i4 == length) {
                stringBuffer.append(d[i3 >>> 2]);
                stringBuffer.append(d[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
                stringBuffer.append(d[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b4 = bArr[i4];
            stringBuffer.append(d[i3 >>> 2]);
            stringBuffer.append(d[((b2 & 3) << 4) | ((b3 & TransmissionUnpacked.HD_VAL_MAGIC_HB) >>> 4)]);
            stringBuffer.append(d[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(d[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static byte[] c(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3;
        byte b4;
        int i4;
        byte b5;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i5 = 0;
        while (i5 < length) {
            while (true) {
                i = i5 + 1;
                b2 = e[bytes[i5]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i5 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = e[bytes[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & BuiltinOptions.SliceOptions) >>> 4));
            while (true) {
                i3 = i2 + 1;
                byte b6 = bytes[i2];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = e[b6];
                if (i3 >= length || b4 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & BuiltinOptions.LogicalOrOptions) >>> 2));
            while (true) {
                i4 = i3 + 1;
                byte b7 = bytes[i3];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = e[b7];
                if (i4 >= length || b5 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i5 = i4;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return b.b(str);
    }

    public static String b(String str) {
        return b.a(str);
    }
}
