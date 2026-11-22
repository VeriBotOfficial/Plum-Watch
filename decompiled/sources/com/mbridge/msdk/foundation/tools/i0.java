package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: SameBase64Tool.java */
/* loaded from: classes17.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f11667a;
    private static Map<Character, Character> b;
    private static byte[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, BuiltinOptions.LogicalAndOptions, -1, -1, -1, 63, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, 58, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, BuiltinOptions.ExpOptions, 34, 35, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, -1, -1, -1, -1, -1};
    private static char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap hashMap = new HashMap();
        f11667a = hashMap;
        hashMap.put('v', 'A');
        f11667a.put('S', 'B');
        f11667a.put('o', 'C');
        f11667a.put('a', 'D');
        f11667a.put('j', 'E');
        f11667a.put('c', 'F');
        f11667a.put('7', 'G');
        f11667a.put('d', 'H');
        f11667a.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), 'I');
        f11667a.put('z', 'J');
        f11667a.put('p', 'K');
        f11667a.put('W', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT));
        f11667a.put('i', 'M');
        f11667a.put('f', 'N');
        f11667a.put('G', 'O');
        f11667a.put('y', 'P');
        f11667a.put('N', 'Q');
        f11667a.put('x', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR));
        f11667a.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'S');
        f11667a.put('n', 'T');
        f11667a.put('V', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT));
        f11667a.put('5', 'V');
        f11667a.put('k', 'W');
        f11667a.put('+', 'X');
        f11667a.put('D', 'Y');
        f11667a.put('H', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        f11667a.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), 'a');
        f11667a.put('Y', 'b');
        f11667a.put('h', 'c');
        f11667a.put('J', 'd');
        f11667a.put('4', 'e');
        f11667a.put('6', 'f');
        f11667a.put('l', 'g');
        f11667a.put('t', 'h');
        f11667a.put('0', 'i');
        f11667a.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'j');
        f11667a.put('3', 'k');
        f11667a.put('Q', 'l');
        f11667a.put('r', 'm');
        f11667a.put('g', 'n');
        f11667a.put('E', 'o');
        f11667a.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f11667a.put('q', 'q');
        f11667a.put('8', 'r');
        f11667a.put('s', 's');
        f11667a.put('w', 't');
        f11667a.put('/', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f11667a.put('X', 'v');
        f11667a.put('M', 'w');
        f11667a.put('e', 'x');
        f11667a.put('B', 'y');
        f11667a.put('A', 'z');
        f11667a.put('T', '0');
        f11667a.put('2', '1');
        f11667a.put('F', '2');
        f11667a.put('b', '3');
        f11667a.put('9', '4');
        f11667a.put('P', '5');
        f11667a.put('1', '6');
        f11667a.put('O', '7');
        f11667a.put('I', '8');
        f11667a.put('K', '9');
        f11667a.put('m', '+');
        f11667a.put('C', '/');
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

    public static String a(String str) {
        return p0.b(str);
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : p0.c(str);
    }
}
