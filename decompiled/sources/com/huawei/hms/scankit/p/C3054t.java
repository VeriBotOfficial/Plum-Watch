package com.huawei.hms.scankit.p;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.exifinterface.media.ExifInterface;
import com.autonavi.aps.amapapi.config.Const;
import com.google.android.gms.ads.RequestConfiguration;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.C2971e;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Decoder.java */
/* renamed from: com.huawei.hms.scankit.p.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3054t {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f10688a = {"CTRL_PS", " ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", TokenNames.C, "D", "E", TokenNames.F, RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", TokenNames.I, "J", "K", TokenNames.L, "M", "N", "O", "P", "Q", TokenNames.R, "S", "T", TokenNames.U, "V", ExifInterface.LONGITUDE_WEST, TokenNames.X, "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] b = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", com.anythink.core.d.n.f4527a, "o", "p", "q", "r", "s", ak.aH, ak.aG, "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] c = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", Separators.HT, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", Separators.AT, "\\", "^", "_", "`", "|", Constants.WAVE_SEPARATOR, "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] d = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", Separators.PERCENT, "&", Separators.QUOTE, Separators.LPAREN, Separators.RPAREN, "*", "+", ",", Constants.ACCEPT_TIME_SEPARATOR_SERVER, ".", "/", ":", ";", Separators.LESS_THAN, "=", Separators.GREATER_THAN, Separators.QUESTION, "[", "]", Const.STR_MART_JSON_BEGIN, "}", "CTRL_UL"};
    private static final String[] e = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    private C3043q f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Decoder.java */
    /* renamed from: com.huawei.hms.scankit.p.t$a */
    enum a {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    private boolean[] b(boolean[] zArr) throws C2967a {
        int i;
        com.huawei.hms.scankit.aiscan.common.h hVar;
        C3043q c3043q = this.f;
        if (c3043q == null) {
            throw C2967a.a();
        }
        if (c3043q.f() <= 2) {
            hVar = com.huawei.hms.scankit.aiscan.common.h.c;
            i = 6;
        } else {
            i = 8;
            if (this.f.f() <= 8) {
                hVar = com.huawei.hms.scankit.aiscan.common.h.g;
            } else if (this.f.f() <= 22) {
                hVar = com.huawei.hms.scankit.aiscan.common.h.b;
                i = 10;
            } else {
                hVar = com.huawei.hms.scankit.aiscan.common.h.f10517a;
                i = 12;
            }
        }
        int e2 = this.f.e();
        int length = zArr.length / i;
        if (length < e2) {
            throw C2967a.a();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = a(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new com.huawei.hms.scankit.aiscan.common.u(hVar).a(iArr, length - e2);
            return a(e2, i, iArr);
        } catch (C2967a e3) {
            throw C2967a.a(e3.getMessage());
        }
    }

    public C2971e a(C3043q c3043q, Map<EnumC2970d, ?> map) throws C2967a {
        this.f = c3043q;
        boolean[] b2 = b(a(c3043q.a()));
        C2971e c2971e = new C2971e(a(b2), a(b2, map), null, null);
        c2971e.a(b2.length);
        return c2971e;
    }

    private static String a(boolean[] zArr, Map<EnumC2970d, ?> map) throws C2967a {
        a aVar = a.UPPER;
        StringBuilder a2 = a(zArr, aVar, aVar);
        int length = a2.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) a2.charAt(i);
        }
        try {
            return new String(bArr, com.huawei.hms.scankit.aiscan.common.B.a(bArr, map));
        } catch (UnsupportedEncodingException unused) {
            throw C2967a.a();
        }
    }

    private static StringBuilder a(boolean[] zArr, a aVar, a aVar2) {
        int length = zArr.length;
        StringBuilder sb = new StringBuilder(20);
        a aVar3 = aVar;
        a aVar4 = aVar2;
        int i = 0;
        while (i < length) {
            if (aVar4 != a.BINARY) {
                int i2 = aVar4 == a.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int a2 = a(zArr, i, i2);
                i += i2;
                String a3 = a(aVar4, a2);
                if (a3.startsWith("CTRL_")) {
                    aVar3 = a(a3.charAt(5));
                    if (a3.charAt(6) != 'L') {
                        aVar3 = aVar4;
                        aVar4 = aVar3;
                    }
                } else {
                    sb.append(a3);
                }
                aVar4 = aVar3;
            } else {
                if (length - i < 5) {
                    break;
                }
                int a4 = a(zArr, i, 5);
                int i3 = i + 5;
                if (a4 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    a4 = a(zArr, i3, 11) + 31;
                    i3 = i + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= a4) {
                        i = i3;
                        break;
                    }
                    if (length - i3 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) a(zArr, i3, 8));
                    i3 += 8;
                    i4++;
                }
                aVar4 = aVar3;
            }
        }
        return sb;
    }

    private static a a(char c2) {
        if (c2 == 'B') {
            return a.BINARY;
        }
        if (c2 == 'D') {
            return a.DIGIT;
        }
        if (c2 == 'P') {
            return a.PUNCT;
        }
        if (c2 == 'L') {
            return a.LOWER;
        }
        if (c2 != 'M') {
            return a.UPPER;
        }
        return a.MIXED;
    }

    private static String a(a aVar, int i) {
        int i2 = C3050s.f10685a[aVar.ordinal()];
        if (i2 == 1) {
            return f10688a[i];
        }
        if (i2 == 2) {
            return b[i];
        }
        if (i2 == 3) {
            return c[i];
        }
        if (i2 == 4) {
            return d[i];
        }
        if (i2 != 5) {
            throw new IllegalStateException("Bad table");
        }
        return e[i];
    }

    private boolean[] a(int i, int i2, int[] iArr) throws C2967a {
        int i3 = 1 << i2;
        int i4 = i3 - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = iArr[i6];
            if (i7 == 0 || i7 == i4) {
                throw C2967a.a();
            }
            if (i7 == 1 || i7 == i3 - 2) {
                i5++;
            }
        }
        boolean[] zArr = new boolean[(i * i2) - i5];
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = iArr[i9];
            if (i10 == 1 || i10 == i3 - 2) {
                Arrays.fill(zArr, i8, (i8 + i2) - 1, i10 > 1);
                i8 += i2 - 1;
            } else {
                int i11 = i2 - 1;
                while (i11 >= 0) {
                    int i12 = i8 + 1;
                    zArr[i8] = ((1 << i11) & i10) != 0;
                    i11--;
                    i8 = i12;
                }
            }
        }
        return zArr;
    }

    private boolean[] a(C3074y c3074y) {
        C3043q c3043q = this.f;
        boolean z = c3043q != null && c3043q.g();
        C3043q c3043q2 = this.f;
        int f = c3043q2 != null ? c3043q2.f() : 0;
        int i = (z ? 11 : 14) + (f * 4);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[a(f, z)];
        int i2 = 2;
        if (z) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < f) {
            int i10 = ((f - i8) * 4) + (z ? 9 : 12);
            int i11 = i8 * 2;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 * 2;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = c3074y.b(iArr[i16], iArr[i17]);
                    int i18 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = c3074y.b(iArr[i17], iArr[i18]);
                    int i19 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = c3074y.b(iArr[i18], iArr[i19]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = c3074y.b(iArr[i19], iArr[i16]);
                    i15++;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 * 8;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    private static int a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static byte a(boolean[] zArr, int i) {
        int a2;
        int length = zArr.length - i;
        if (length >= 8) {
            a2 = a(zArr, i, 8);
        } else {
            a2 = a(zArr, i, length) << (8 - length);
        }
        return (byte) a2;
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = a(zArr, i * 8);
        }
        return bArr;
    }
}
