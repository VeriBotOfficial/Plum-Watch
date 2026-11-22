package com.anythink.core.express.a;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4547a = 256;
    private static Map<Character, Character> b = null;
    private static Map<Character, Character> c = null;
    private static final char[] d;
    private static char[] e = null;
    private static final char f = '=';
    private static final byte[] g;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        d = cArr;
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put('A', 'v');
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', 'd');
        Map<Character, Character> map = b;
        Character valueOf = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        map.put('I', valueOf);
        b.put('J', 'z');
        b.put('K', 'p');
        Map<Character, Character> map2 = b;
        Character valueOf2 = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT);
        map2.put(valueOf2, 'W');
        b.put('M', 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put(valueOf, 'x');
        b.put('S', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        b.put('T', 'n');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put('Y', 'D');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'H');
        b.put('a', valueOf2);
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
        e = new char[cArr.length];
        int i = 0;
        while (true) {
            char[] cArr2 = d;
            if (i >= cArr2.length) {
                break;
            }
            e[i] = b.get(Character.valueOf(cArr2[i])).charValue();
            i++;
        }
        g = new byte[128];
        int i2 = 0;
        while (true) {
            byte[] bArr = g;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = Byte.MAX_VALUE;
            i2++;
        }
        int i3 = 0;
        while (true) {
            char[] cArr3 = e;
            if (i3 >= cArr3.length) {
                return;
            }
            g[cArr3[i3]] = (byte) i3;
            i3++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i) {
        try {
            char c2 = cArr[3];
            char c3 = c2 == '=' ? (char) 2 : (char) 3;
            char c4 = cArr[2];
            if (c4 == '=') {
                c3 = 1;
            }
            byte[] bArr2 = g;
            byte b2 = bArr2[cArr[0]];
            byte b3 = bArr2[cArr[1]];
            byte b4 = bArr2[c4];
            byte b5 = bArr2[c2];
            if (c3 == 2) {
                bArr[i] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[i + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
                return 2;
            }
            if (c3 != 3) {
                bArr[i] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
                return 1;
            }
            bArr[i] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
            bArr[i + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
            bArr[i + 2] = (byte) (((b4 << 6) & 192) | (b5 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static byte[] a(char[] cArr, int i, int i2) {
        try {
            char[] cArr2 = new char[4];
            int i3 = ((i2 >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = i; i6 < i + i2; i6++) {
                char c2 = cArr[i6];
                if (c2 != '=') {
                    byte[] bArr2 = g;
                    if (c2 < bArr2.length) {
                        if (bArr2[c2] == Byte.MAX_VALUE) {
                        }
                    }
                }
                int i7 = i5 + 1;
                cArr2[i5] = c2;
                if (i7 == 4) {
                    i4 += a(cArr2, bArr, i4);
                    i5 = 0;
                } else {
                    i5 = i7;
                }
            }
            if (i4 == i3) {
                return bArr;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c2 = c(str);
        if (c2 == null || c2.length <= 0) {
            return null;
        }
        return new String(c2);
    }

    private static byte[] c(String str) {
        int i;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i2 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int i6 = i3 + 256;
                if (i6 <= length) {
                    str.getChars(i3, i6, cArr, i5);
                    i = i5 + 256;
                } else {
                    str.getChars(i3, length, cArr, i5);
                    i = (length - i3) + i5;
                }
                int i7 = i5;
                while (i5 < i) {
                    char c2 = cArr[i5];
                    if (c2 != '=') {
                        byte[] bArr2 = g;
                        if (c2 < bArr2.length) {
                            if (bArr2[c2] == Byte.MAX_VALUE) {
                            }
                        }
                        i5++;
                    }
                    int i8 = i7 + 1;
                    cArr[i7] = c2;
                    if (i8 == 4) {
                        i4 += a(cArr, bArr, i4);
                        i7 = 0;
                    } else {
                        i7 = i8;
                    }
                    i5++;
                }
                i3 = i6;
                i5 = i7;
            }
            if (i4 == i2) {
                return bArr;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 0, bArr3, 0, i4);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, bytes.length);
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i) {
        if (i <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i / 3) << 2) + 4];
            int i2 = 0;
            int i3 = 0;
            while (i >= 3) {
                int i4 = ((bArr[i2] & 255) << 16) + ((bArr[i2 + 1] & 255) << 8) + (bArr[i2 + 2] & 255);
                char[] cArr2 = e;
                cArr[i3] = cArr2[i4 >> 18];
                cArr[i3 + 1] = cArr2[(i4 >> 12) & 63];
                int i5 = i3 + 3;
                cArr[i3 + 2] = cArr2[(i4 >> 6) & 63];
                i3 += 4;
                cArr[i5] = cArr2[i4 & 63];
                i2 += 3;
                i -= 3;
            }
            if (i == 1) {
                int i6 = bArr[i2] & 255;
                char[] cArr3 = e;
                cArr[i3] = cArr3[i6 >> 2];
                cArr[i3 + 1] = cArr3[(i6 << 4) & 63];
                int i7 = i3 + 3;
                cArr[i3 + 2] = '=';
                i3 += 4;
                cArr[i7] = '=';
            } else if (i == 2) {
                int i8 = ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
                char[] cArr4 = e;
                cArr[i3] = cArr4[i8 >> 10];
                cArr[i3 + 1] = cArr4[(i8 >> 4) & 63];
                int i9 = i3 + 3;
                cArr[i3 + 2] = cArr4[(i8 << 2) & 63];
                i3 += 4;
                cArr[i9] = '=';
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}
