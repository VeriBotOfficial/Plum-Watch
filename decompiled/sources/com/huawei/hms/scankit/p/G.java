package com.huawei.hms.scankit.p;

import com.google.common.base.Ascii;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.C2971e;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.wakeup.common.DeviceFeatures;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.nntp.NNTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes14.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10562a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};
    private static final char[] b;
    private static final char[] c;
    private static final char[] d;
    private static final char[] e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodedBitStreamParser.java */
    enum a {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        UPPER_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', AbstractJsonLexerKt.COMMA, '-', '.', '/', AbstractJsonLexerKt.COLON, ';', Typography.less, com.alipay.sdk.m.p.a.h, Typography.greater, '?', '@', AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.END_LIST, '^', '_'};
        b = cArr;
        c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        d = cArr;
        e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~', Ascii.MAX};
    }

    static C2971e a(byte[] bArr, Map<EnumC2970d, ?> map) throws C2967a {
        C3078z c3078z = new C3078z(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        a aVar = a.ASCII_ENCODE;
        do {
            if (aVar == a.ASCII_ENCODE) {
                aVar = a(c3078z, sb, sb2);
            } else {
                int i = F.f10559a[aVar.ordinal()];
                if (i == 1) {
                    b(c3078z, sb);
                } else if (i == 2) {
                    d(c3078z, sb);
                } else if (i == 3) {
                    a(c3078z, sb);
                } else if (i == 4) {
                    c(c3078z, sb);
                } else {
                    if (i != 5) {
                        throw C2967a.a("AIScanException");
                    }
                    a(c3078z, sb, arrayList);
                }
                aVar = a.ASCII_ENCODE;
            }
            if (aVar == a.PAD_ENCODE) {
                break;
            }
        } while (c3078z.a() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        int length = sb.length();
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) sb.charAt(i2);
        }
        try {
            String str = new String(bArr2, com.huawei.hms.scankit.aiscan.common.B.a(bArr2, map));
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            return new C2971e(bArr, str, arrayList, null);
        } catch (UnsupportedEncodingException unused) {
            throw C2967a.a();
        }
    }

    private static void b(C3078z c3078z, StringBuilder sb) throws C2967a {
        int a2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c3078z.a() != 8 && (a2 = c3078z.a(8)) != 254) {
            a(a2, c3078z.a(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int[] b2 = b(sb, i, iArr[i2], z);
                i = b2[0];
                z = b2[1] == 1;
            }
            if (c3078z.a() <= 0) {
                return;
            }
        }
    }

    private static void c(C3078z c3078z, StringBuilder sb) {
        while (c3078z.a() > 16) {
            for (int i = 0; i < 4; i++) {
                int a2 = c3078z.a(6);
                if (a2 == 31) {
                    int b2 = 8 - c3078z.b();
                    if (b2 != 8) {
                        c3078z.a(b2);
                        return;
                    }
                    return;
                }
                if ((a2 & 32) == 0) {
                    a2 |= 64;
                }
                sb.append((char) a2);
            }
            if (c3078z.a() <= 0) {
                return;
            }
        }
    }

    private static void d(C3078z c3078z, StringBuilder sb) throws C2967a {
        int a2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (c3078z.a() != 8 && (a2 = c3078z.a(8)) != 254) {
            a(a2, c3078z.a(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int[] a3 = a(sb, i, iArr[i2], z);
                i = a3[0];
                z = a3[1] == 1;
            }
            if (c3078z.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int[] b(StringBuilder sb, int i, int i2, boolean z) throws C2967a {
        int i3;
        boolean z2;
        if (i != 0) {
            if (i == 1) {
                if (z) {
                    i2 += 128;
                }
                sb.append((char) i2);
            } else if (i == 2) {
                char[] cArr = b;
                if (i2 < cArr.length) {
                    char c2 = cArr[i2];
                    if (z) {
                        c2 = (char) (c2 + 128);
                    }
                    sb.append(c2);
                    z2 = false;
                } else if (i2 == 27) {
                    sb.append((char) 29);
                    z2 = z;
                } else {
                    if (i2 != 30) {
                        throw C2967a.a("AIScanException");
                    }
                    z2 = true;
                }
                i = 0;
                i3 = z2;
            } else {
                if (i != 3) {
                    throw C2967a.a("AIScanException");
                }
                sb.append((char) (z ? i2 + 224 : i2 + 96));
            }
            i = 0;
            i3 = 0;
        } else if (i2 < 3) {
            i = i2 + 1;
            i3 = z;
        } else {
            char[] cArr2 = f10562a;
            if (i2 < cArr2.length) {
                char c3 = cArr2[i2];
                if (z) {
                    c3 = (char) (c3 + 128);
                }
                sb.append(c3);
                i3 = 0;
            } else {
                throw C2967a.a("AIScanException");
            }
        }
        return new int[]{i, i3};
    }

    private static a a(C3078z c3078z, StringBuilder sb, StringBuilder sb2) throws C2967a {
        boolean z = false;
        do {
            int a2 = c3078z.a(8);
            if (a2 == 0) {
                throw C2967a.a("AIScanException");
            }
            if (a2 <= 128) {
                if (z) {
                    a2 += 128;
                }
                sb.append((char) (a2 - 1));
                return a.ASCII_ENCODE;
            }
            if (a2 == 129) {
                return a.PAD_ENCODE;
            }
            if (a2 <= 229) {
                int i = a2 - 130;
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
            } else {
                a a3 = a(a2, sb, sb2, c3078z);
                if (a3 != null) {
                    if (a3 != a.UPPER_ENCODE) {
                        return a3;
                    }
                    z = true;
                }
            }
        } while (c3078z.a() > 0);
        return a.ASCII_ENCODE;
    }

    private static a a(int i, StringBuilder sb, StringBuilder sb2, C3078z c3078z) throws C2967a {
        switch (i) {
            case 230:
                return a.C40_ENCODE;
            case NNTPReply.NEW_NEWSGROUP_LIST_FOLLOWS /* 231 */:
                return a.BASE256_ENCODE;
            case DeviceFeatures.HEADSET_KEY_CALL /* 232 */:
                sb.append((char) 29);
                return null;
            case 233:
            case 234:
            case 241:
                return null;
            case 235:
                return a.UPPER_ENCODE;
            case TelnetCommand.EOF /* 236 */:
                sb.append("[)>\u001e05\u001d");
                sb2.insert(0, "\u001e\u0004");
                return null;
            case 237:
                sb.append("[)>\u001e06\u001d");
                sb2.insert(0, "\u001e\u0004");
                return null;
            case TelnetCommand.ABORT /* 238 */:
                return a.ANSIX12_ENCODE;
            case TelnetCommand.EOR /* 239 */:
                return a.TEXT_ENCODE;
            case 240:
                return a.EDIFACT_ENCODE;
            default:
                if (i == 254 && c3078z.a() == 0) {
                    return null;
                }
                throw C2967a.a("AIScanException");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int[] a(StringBuilder sb, int i, int i2, boolean z) throws C2967a {
        int i3;
        boolean z2;
        if (i != 0) {
            if (i == 1) {
                if (z) {
                    i2 = (char) (i2 + 128);
                }
                sb.append(i2);
            } else if (i == 2) {
                char[] cArr = d;
                if (i2 < cArr.length) {
                    char c2 = cArr[i2];
                    if (z) {
                        c2 = (char) (c2 + 128);
                    }
                    sb.append(c2);
                    z2 = false;
                } else if (i2 == 27) {
                    sb.append((char) 29);
                    z2 = z;
                } else {
                    if (i2 != 30) {
                        throw C2967a.a("AIScanException");
                    }
                    z2 = true;
                }
                i = 0;
                i3 = z2;
            } else {
                if (i != 3) {
                    throw C2967a.a("AIScanException");
                }
                char[] cArr2 = e;
                if (i2 < cArr2.length) {
                    char c3 = cArr2[i2];
                    if (z) {
                        c3 = (char) (c3 + 128);
                    }
                    sb.append(c3);
                } else {
                    throw C2967a.a("AIScanException");
                }
            }
            i = 0;
            i3 = 0;
        } else if (i2 < 3) {
            i = i2 + 1;
            i3 = z;
        } else {
            char[] cArr3 = c;
            if (i2 < cArr3.length) {
                char c4 = cArr3[i2];
                if (z) {
                    c4 = (char) (c4 + 128);
                }
                sb.append(c4);
                i3 = 0;
            } else {
                throw C2967a.a("AIScanException");
            }
        }
        return new int[]{i, i3};
    }

    private static void a(C3078z c3078z, StringBuilder sb) throws C2967a {
        int a2;
        int[] iArr = new int[3];
        while (c3078z.a() != 8 && (a2 = c3078z.a(8)) != 254) {
            a(a2, c3078z.a(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append('\r');
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append(Typography.greater);
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw C2967a.a("AIScanException");
                }
            }
            if (c3078z.a() <= 0) {
                return;
            }
        }
    }

    private static void a(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static void a(C3078z c3078z, StringBuilder sb, Collection<byte[]> collection) throws C2967a {
        int c2 = c3078z.c();
        int i = c2 + 2;
        int a2 = a(c3078z.a(8), c2 + 1);
        if (a2 == 0) {
            a2 = c3078z.a() / 8;
        } else if (a2 >= 250) {
            a2 = ((a2 - 249) * 250) + a(c3078z.a(8), i);
            i = c2 + 3;
        }
        if (a2 >= 0) {
            byte[] bArr = new byte[a2];
            int i2 = 0;
            while (i2 < a2) {
                if (c3078z.a() >= 8) {
                    bArr[i2] = (byte) a(c3078z.a(8), i);
                    i2++;
                    i++;
                } else {
                    throw C2967a.a("AIScanException");
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalStateException("Platform does not support required encoding: " + e2);
            }
        }
        throw C2967a.a("AIScanException");
    }

    private static int a(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
