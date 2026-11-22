package com.huawei.hms.scankit.p;

import com.google.common.base.Ascii;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Code39Reader.java */
/* loaded from: classes14.dex */
public final class Q extends Y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10592a = {52, SportTypeConstant.Course_28, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, DeviceFeatures.DEVICE_SOUND_NEW, 168, 162, 138, 42};
    private final boolean b;
    private final boolean c;
    private final StringBuilder d;
    private final int[] e;

    public Q() {
        this(false);
    }

    private static boolean b(int[] iArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < i) {
                i = i3;
            }
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2 / i > 6;
    }

    private static int c(int[] iArr) {
        int length = iArr.length;
        if (b(iArr)) {
            return -1;
        }
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i6 |= 1 << ((length - 1) - i7);
                    i4++;
                    i5 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if (i10 * 2 >= i5) {
                            return -1;
                        }
                    }
                }
                return i6;
            }
            if (i4 <= 3) {
                return -1;
            }
            i = i2;
        }
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        int[] iArr = this.e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.d;
        sb.setLength(0);
        int[] a2 = a(c3070x, iArr);
        int b = c3070x.b(a2[1]);
        int d = c3070x.d();
        while (true) {
            Y.a(c3070x, b, iArr);
            int c = c(iArr);
            if (c < 0) {
                throw C2967a.a();
            }
            char a3 = a(c);
            sb.append(a3);
            int i2 = b;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int b2 = c3070x.b(i2);
            if (a3 == '*') {
                sb.setLength(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                int i6 = (b2 - b) - i4;
                if (b2 == d || i6 * 5 >= i4) {
                    return a(sb, a2, b, i4, i);
                }
                throw C2967a.a();
            }
            b = b2;
        }
    }

    public Q(boolean z) {
        this(z, false);
    }

    public Q(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = new StringBuilder(20);
        this.e = new int[9];
    }

    private com.huawei.hms.scankit.aiscan.common.x a(StringBuilder sb, int[] iArr, int i, int i2, int i3) throws C2967a {
        String sb2;
        if (this.b) {
            int length = sb.length() - 1;
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                i4 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.d.charAt(i5));
            }
            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i4 % 43)) {
                sb.setLength(length);
            } else {
                throw C2967a.a();
            }
        }
        if (sb.length() != 0) {
            if (this.c) {
                sb2 = a(sb);
            } else {
                sb2 = sb.toString();
            }
            float f = i3;
            return new com.huawei.hms.scankit.aiscan.common.x(sb2, null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(iArr[0], f), new com.huawei.hms.scankit.aiscan.common.z(i + i2, f)}, BarcodeFormat.CODE_39);
        }
        throw C2967a.a();
    }

    private static int[] a(C3070x c3070x, int[] iArr) throws C2967a {
        int d = c3070x.d();
        int b = c3070x.b(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = b;
        while (b < d) {
            if (c3070x.a(b) != z) {
                if (i >= 0 && i < iArr.length) {
                    iArr[i] = iArr[i] + 1;
                } else {
                    throw C2967a.a();
                }
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (c(iArr) == 148 && c3070x.a(Math.max(0, i2 - ((b - i2) / 5)), i2, false, true)) {
                        return new int[]{i2, b};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                }
                iArr[i] = 1;
                z = !z;
            }
            b++;
        }
        throw C2967a.a();
    }

    private static char a(int i) throws C2967a {
        int i2 = 0;
        while (true) {
            int[] iArr = f10592a;
            if (i2 >= iArr.length) {
                if (i == 148) {
                    return '*';
                }
                throw C2967a.a();
            }
            if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
            }
            i2++;
        }
    }

    private static String a(CharSequence charSequence) throws C2967a {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb.append(charAt);
            } else {
                i++;
                sb.append(a(charAt, charSequence.charAt(i)));
            }
            i++;
        }
        return sb.toString();
    }

    private static char a(char c, char c2) throws C2967a {
        int i;
        if (c != '$') {
            if (c != '%') {
                if (c != '+') {
                    if (c != '/') {
                        return (char) 0;
                    }
                    if (c2 < 'A' || c2 > 'O') {
                        if (c2 == 'Z') {
                            return AbstractJsonLexerKt.COLON;
                        }
                        throw C2967a.a();
                    }
                    i = c2 - ' ';
                } else {
                    if (c2 < 'A' || c2 > 'Z') {
                        throw C2967a.a();
                    }
                    i = c2 + ' ';
                }
            } else if (c2 >= 'A' && c2 <= 'E') {
                i = c2 - '&';
            } else if (c2 >= 'F' && c2 <= 'J') {
                i = c2 - 11;
            } else if (c2 >= 'K' && c2 <= 'O') {
                i = c2 + 16;
            } else {
                if (c2 < 'P' || c2 > 'T') {
                    if (c2 == 'U') {
                        return (char) 0;
                    }
                    if (c2 == 'V') {
                        return '@';
                    }
                    if (c2 == 'W') {
                        return '`';
                    }
                    if (c2 == 'X' || c2 == 'Y' || c2 == 'Z') {
                        return Ascii.MAX;
                    }
                    throw C2967a.a();
                }
                i = c2 + '+';
            }
        } else {
            if (c2 < 'A' || c2 > 'Z') {
                throw C2967a.a();
            }
            i = c2 - '@';
        }
        return (char) i;
    }
}
