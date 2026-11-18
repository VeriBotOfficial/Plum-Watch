package com.anythink.core.express.a;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        HashMap map = new HashMap();
        b = map;
        map.put('A', 'v');
        b.put('B', 'S');
        b.put('C', 'o');
        b.put('D', 'a');
        b.put('E', 'j');
        b.put('F', 'c');
        b.put('G', '7');
        b.put('H', 'd');
        Map<Character, Character> map2 = b;
        Character chValueOf = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        map2.put('I', chValueOf);
        b.put('J', 'z');
        b.put('K', 'p');
        Map<Character, Character> map3 = b;
        Character chValueOf2 = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT);
        map3.put(chValueOf2, 'W');
        b.put('M', 'i');
        b.put('N', 'f');
        b.put('O', 'G');
        b.put('P', 'y');
        b.put('Q', 'N');
        b.put(chValueOf, 'x');
        b.put('S', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        b.put('T', 'n');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'V');
        b.put('V', '5');
        b.put('W', 'k');
        b.put('X', '+');
        b.put('Y', 'D');
        b.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'H');
        b.put('a', chValueOf2);
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
        int r0 = 0;
        while (true) {
            char[] cArr2 = d;
            if (r0 >= cArr2.length) {
                break;
            }
            e[r0] = b.get(Character.valueOf(cArr2[r0])).charValue();
            r0++;
        }
        g = new byte[128];
        int r1 = 0;
        while (true) {
            byte[] bArr = g;
            if (r1 >= bArr.length) {
                break;
            }
            bArr[r1] = 127;
            r1++;
        }
        int r2 = 0;
        while (true) {
            char[] cArr3 = e;
            if (r2 >= cArr3.length) {
                return;
            }
            g[cArr3[r2]] = (byte) r2;
            r2++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int r11) {
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
                bArr[r11] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[r11 + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
                return 2;
            }
            if (c3 != 3) {
                bArr[r11] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
                return 1;
            }
            bArr[r11] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
            bArr[r11 + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
            bArr[r11 + 2] = (byte) (((b4 << 6) & 192) | (b5 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    private static byte[] a(char[] cArr, int r12, int r13) {
        int r9;
        try {
            char[] cArr2 = new char[4];
            int r2 = ((r13 >> 2) * 3) + 3;
            byte[] bArr = new byte[r2];
            int r6 = 0;
            int r7 = 0;
            for (int r5 = r12; r5 < r12 + r13; r5++) {
                char c2 = cArr[r5];
                if (c2 != '=') {
                    byte[] bArr2 = g;
                    if (c2 < bArr2.length && bArr2[c2] != 127) {
                        r9 = r7 + 1;
                        cArr2[r7] = c2;
                        if (r9 == 4) {
                            r6 += a(cArr2, bArr, r6);
                            r7 = 0;
                        } else {
                            r7 = r9;
                        }
                    }
                } else {
                    r9 = r7 + 1;
                    cArr2[r7] = c2;
                    if (r9 == 4) {
                        r6 += a(cArr2, bArr, r6);
                        r7 = 0;
                    } else {
                        r7 = r9;
                    }
                }
            }
            if (r6 == r2) {
                return bArr;
            }
            byte[] bArr3 = new byte[r6];
            System.arraycopy(bArr, 0, bArr3, 0, r6);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] bArrC = c(str);
        if (bArrC == null || bArrC.length <= 0) {
            return null;
        }
        return new String(bArrC);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    private static byte[] c(String str) {
        int r5;
        int r11;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int r2 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[r2];
            int r6 = 0;
            int r7 = 0;
            int r8 = 0;
            while (r6 < length) {
                int r9 = r6 + 256;
                if (r9 <= length) {
                    str.getChars(r6, r9, cArr, r8);
                    r5 = r8 + 256;
                } else {
                    str.getChars(r6, length, cArr, r8);
                    r5 = (length - r6) + r8;
                }
                int r10 = r8;
                while (r8 < r5) {
                    char c2 = cArr[r8];
                    if (c2 != '=') {
                        byte[] bArr2 = g;
                        if (c2 < bArr2.length && bArr2[c2] != 127) {
                            r11 = r10 + 1;
                            cArr[r10] = c2;
                            if (r11 == 4) {
                                r7 += a(cArr, bArr, r7);
                                r10 = 0;
                            } else {
                                r10 = r11;
                            }
                        }
                    } else {
                        r11 = r10 + 1;
                        cArr[r10] = c2;
                        if (r11 == 4) {
                            r7 += a(cArr, bArr, r7);
                            r10 = 0;
                        } else {
                            r10 = r11;
                        }
                    }
                    r8++;
                }
                r6 = r9;
                r8 = r10;
            }
            if (r7 == r2) {
                return bArr;
            }
            byte[] bArr3 = new byte[r7];
            System.arraycopy(bArr, 0, bArr3, 0, r7);
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

    private static String a(byte[] bArr, int r11) {
        if (r11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((r11 / 3) << 2) + 4];
            int r3 = 0;
            int r4 = 0;
            while (r11 >= 3) {
                int r5 = ((bArr[r3] & 255) << 16) + ((bArr[r3 + 1] & 255) << 8) + (bArr[r3 + 2] & 255);
                char[] cArr2 = e;
                cArr[r4] = cArr2[r5 >> 18];
                cArr[r4 + 1] = cArr2[(r5 >> 12) & 63];
                int r6 = r4 + 3;
                cArr[r4 + 2] = cArr2[(r5 >> 6) & 63];
                r4 += 4;
                cArr[r6] = cArr2[r5 & 63];
                r3 += 3;
                r11 -= 3;
            }
            if (r11 == 1) {
                int r10 = bArr[r3] & 255;
                char[] cArr3 = e;
                cArr[r4] = cArr3[r10 >> 2];
                cArr[r4 + 1] = cArr3[(r10 << 4) & 63];
                int r12 = r4 + 3;
                cArr[r4 + 2] = '=';
                r4 += 4;
                cArr[r12] = '=';
            } else if (r11 == 2) {
                int r13 = ((bArr[r3] & 255) << 8) + (bArr[r3 + 1] & 255);
                char[] cArr4 = e;
                cArr[r4] = cArr4[r13 >> 10];
                cArr[r4 + 1] = cArr4[(r13 >> 4) & 63];
                int r14 = r4 + 3;
                cArr[r4 + 2] = cArr4[(r13 << 2) & 63];
                r4 += 4;
                cArr[r14] = '=';
            }
            return new String(cArr, 0, r4);
        } catch (Exception unused) {
            return null;
        }
    }
}
