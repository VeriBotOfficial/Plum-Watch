package com.huawei.hms.scankit.p;

import com.google.common.base.Ascii;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.wakeup.commponent.module.sport.SportTypeConstant;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.smtp.SMTPReply;
import org.opencv.videoio.Videoio;

/* compiled from: Code93Reader.java */
/* loaded from: classes14.dex */
public final class S extends Y {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10597a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
    public static final int[] b;
    private static final int c;
    private final StringBuilder d = new StringBuilder(20);
    private final int[] e = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, Videoio.CAP_PROP_XI_AG_MAX_LIMIT, 404, 402, 394, 360, 356, SMTPReply.START_MAIL_INPUT, 308, SportTypeConstant.Course_21, 344, FTPReply.NEED_ACCOUNT, 326, 300, 278, 436, Videoio.CAP_PROP_XI_DECIMATION_PATTERN, Videoio.CAP_PROP_XI_BINNING_VERTICAL, 422, 406, 410, 364, 358, 310, 314, 302, Videoio.CAP_PROP_XI_CHIP_TEMP, Videoio.CAP_PROP_XI_COOLING, 458, 366, 374, 430, SportTypeConstant.Course_33, Videoio.CAP_PROP_XI_IMAGE_IS_COLOR, Videoio.CAP_PROP_XI_CMS, 306, FTPReply.FILE_ACTION_PENDING};
        b = iArr;
        c = iArr[47];
    }

    private static int b(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        int b2 = c3070x.b(a(c3070x)[1]);
        int d = c3070x.d();
        int[] iArr = this.e;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.d;
        sb.setLength(0);
        while (true) {
            Y.a(c3070x, b2, iArr);
            int b3 = b(iArr);
            if (b3 < 0) {
                throw C2967a.a();
            }
            char a2 = a(b3);
            sb.append(a2);
            int i2 = b2;
            for (int i3 : iArr) {
                i2 += i3;
            }
            int b4 = c3070x.b(i2);
            if (a2 == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i4 = 0;
                for (int i5 : iArr) {
                    i4 += i5;
                }
                if (b4 == d || !c3070x.a(b4)) {
                    throw C2967a.a();
                }
                if (sb.length() < 2) {
                    throw C2967a.a();
                }
                a(sb);
                sb.setLength(sb.length() - 2);
                float f = i;
                return new com.huawei.hms.scankit.aiscan.common.x(b(sb), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(r14[0], f), new com.huawei.hms.scankit.aiscan.common.z(b2 + ((i4 * 10) / 9), f)}, BarcodeFormat.CODE_93);
            }
            b2 = b4;
        }
    }

    private static String b(CharSequence charSequence) throws C2967a {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 'a' || charAt > 'd') {
                sb.append(charAt);
            } else if (i < length - 1) {
                i++;
                sb.append(a(charAt, charSequence.charAt(i)));
            } else {
                throw C2967a.a();
            }
            i++;
        }
        return sb.toString();
    }

    private int[] a(C3070x c3070x) throws C2967a {
        int d = c3070x.d();
        int b2 = c3070x.b(0);
        Arrays.fill(this.e, 0);
        int[] iArr = this.e;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = b2;
        while (b2 < d) {
            if (c3070x.a(b2) != z) {
                if (i >= 0 && i < iArr.length) {
                    iArr[i] = iArr[i] + 1;
                } else {
                    throw C2967a.a();
                }
            } else {
                if (i != length - 1) {
                    i++;
                } else {
                    if (b(iArr) == c) {
                        return new int[]{i2, b2};
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
            b2++;
        }
        throw C2967a.a();
    }

    private static char a(int i) throws C2967a {
        int i2 = 0;
        while (true) {
            int[] iArr = b;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f10597a[i2];
                }
                i2++;
            } else {
                throw C2967a.a();
            }
        }
    }

    private static char a(char c2, char c3) throws C2967a {
        int i;
        switch (c2) {
            case 'a':
                if (c3 >= 'A' && c3 <= 'Z') {
                    i = c3 - '@';
                    break;
                } else {
                    throw C2967a.a();
                }
            case 'b':
                if (c3 >= 'A' && c3 <= 'E') {
                    i = c3 - '&';
                    break;
                } else if (c3 >= 'F' && c3 <= 'J') {
                    i = c3 - 11;
                    break;
                } else if (c3 >= 'K' && c3 <= 'O') {
                    i = c3 + 16;
                    break;
                } else if (c3 >= 'P' && c3 <= 'S') {
                    i = c3 + '+';
                    break;
                } else {
                    if (c3 < 'T' || c3 > 'Z') {
                        throw C2967a.a();
                    }
                    return Ascii.MAX;
                }
                break;
            case 'c':
                if (c3 >= 'A' && c3 <= 'O') {
                    i = c3 - ' ';
                    break;
                } else {
                    if (c3 == 'Z') {
                        return AbstractJsonLexerKt.COLON;
                    }
                    throw C2967a.a();
                }
            case 'd':
                if (c3 >= 'A' && c3 <= 'Z') {
                    i = c3 + ' ';
                    break;
                } else {
                    throw C2967a.a();
                }
            default:
                return (char) 0;
        }
        return (char) i;
    }

    private static void a(CharSequence charSequence) throws C2967a {
        int length = charSequence.length();
        a(charSequence, length - 2, 20);
        a(charSequence, length - 1, 15);
    }

    private static void a(CharSequence charSequence, int i, int i2) throws C2967a {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f10597a[i3 % 47]) {
            throw C2967a.a();
        }
    }
}
