package com.mbridge.msdk.foundation.tools;

import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: compiled from: SameMVEncoder.java */
/* JADX INFO: loaded from: classes2.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f11674a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    private static final byte[] b = new byte[128];
    private static Map<Character, Character> c;
    private static char[] d;

    static {
        HashMap map = new HashMap();
        c = map;
        map.put('A', 'v');
        c.put('B', 'S');
        c.put('C', 'o');
        c.put('D', 'a');
        c.put('E', 'j');
        c.put('F', 'c');
        c.put('G', '7');
        c.put('H', 'd');
        Map<Character, Character> map2 = c;
        Character chValueOf = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
        map2.put('I', chValueOf);
        c.put('J', 'z');
        c.put('K', 'p');
        Map<Character, Character> map3 = c;
        Character chValueOf2 = Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT);
        map3.put(chValueOf2, 'W');
        c.put('M', 'i');
        c.put('N', 'f');
        c.put('O', 'G');
        c.put('P', 'y');
        c.put('Q', 'N');
        c.put(chValueOf, 'x');
        c.put('S', Character.valueOf(Matrix.MATRIX_TYPE_ZERO));
        c.put('T', 'n');
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), 'V');
        c.put('V', '5');
        c.put('W', 'k');
        c.put('X', '+');
        c.put('Y', 'D');
        c.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), 'H');
        c.put('a', chValueOf2);
        c.put('b', 'Y');
        c.put('c', 'h');
        c.put('d', 'J');
        c.put('e', '4');
        c.put('f', '6');
        c.put('g', 'l');
        c.put('h', 't');
        c.put('i', '0');
        c.put('j', Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT));
        c.put('k', '3');
        c.put('l', 'Q');
        c.put('m', 'r');
        c.put('n', 'g');
        c.put('o', 'E');
        c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        c.put('q', 'q');
        c.put('r', '8');
        c.put('s', 's');
        c.put('t', 'w');
        c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        c.put('v', 'X');
        c.put('w', 'M');
        c.put('x', 'e');
        c.put('y', 'B');
        c.put('z', 'A');
        c.put('0', 'T');
        c.put('1', '2');
        c.put('2', 'F');
        c.put('3', 'b');
        c.put('4', '9');
        c.put('5', 'P');
        c.put('6', '1');
        c.put('7', 'O');
        c.put('8', 'I');
        c.put('9', 'K');
        c.put('+', 'm');
        c.put('/', 'C');
        d = new char[64];
        int r0 = 0;
        while (true) {
            char[] cArr = f11674a;
            if (r0 >= cArr.length) {
                break;
            }
            d[r0] = c.get(Character.valueOf(cArr[r0])).charValue();
            r0++;
        }
        int r1 = 0;
        while (true) {
            byte[] bArr = b;
            if (r1 >= bArr.length) {
                break;
            }
            bArr[r1] = 127;
            r1++;
        }
        int r2 = 0;
        while (true) {
            char[] cArr2 = d;
            if (r2 >= cArr2.length) {
                return;
            }
            b[cArr2[r2]] = (byte) r2;
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
            byte[] bArr2 = b;
            byte b2 = bArr2[cArr[0]];
            byte b3 = bArr2[cArr[1]];
            byte b4 = bArr2[c4];
            byte b5 = bArr2[c2];
            if (c3 == 1) {
                bArr[r11] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
                return 1;
            }
            if (c3 == 2) {
                bArr[r11] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[r11 + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
                return 2;
            }
            if (c3 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[r11] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
            bArr[r11 + 1] = (byte) (((b3 << 4) & 240) | ((b4 >> 2) & 15));
            bArr[r11 + 2] = (byte) (((b4 << 6) & 192) | (b5 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public static byte[] a(String str) {
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
                        byte[] bArr2 = b;
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

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int r10, int r11) {
        if (r11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((r11 / 3) << 2) + 4];
            int r3 = 0;
            while (r11 >= 3) {
                int r4 = ((bArr[r10] & 255) << 16) + ((bArr[r10 + 1] & 255) << 8) + (bArr[r10 + 2] & 255);
                char[] cArr2 = d;
                cArr[r3] = cArr2[r4 >> 18];
                cArr[r3 + 1] = cArr2[(r4 >> 12) & 63];
                int r5 = r3 + 3;
                cArr[r3 + 2] = cArr2[(r4 >> 6) & 63];
                r3 += 4;
                cArr[r5] = cArr2[r4 & 63];
                r10 += 3;
                r11 -= 3;
            }
            if (r11 == 1) {
                int r9 = bArr[r10] & 255;
                char[] cArr3 = d;
                cArr[r3] = cArr3[r9 >> 2];
                cArr[r3 + 1] = cArr3[(r9 << 4) & 63];
                int r12 = r3 + 3;
                cArr[r3 + 2] = com.alipay.sdk.m.p.a.h;
                r3 += 4;
                cArr[r12] = com.alipay.sdk.m.p.a.h;
            } else if (r11 == 2) {
                int r13 = ((bArr[r10] & 255) << 8) + (bArr[r10 + 1] & 255);
                char[] cArr4 = d;
                cArr[r3] = cArr4[r13 >> 10];
                cArr[r3 + 1] = cArr4[(r13 >> 4) & 63];
                int r14 = r3 + 3;
                cArr[r3 + 2] = cArr4[(r13 << 2) & 63];
                r3 += 4;
                cArr[r14] = com.alipay.sdk.m.p.a.h;
            }
            return new String(cArr, 0, r3);
        } catch (Exception unused) {
            return null;
        }
    }
}
