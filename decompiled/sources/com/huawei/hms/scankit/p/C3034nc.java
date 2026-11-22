package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: Code128Writer.java */
/* renamed from: com.huawei.hms.scankit.p.nc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3034nc extends AbstractC3057tc {

    /* compiled from: Code128Writer.java */
    /* renamed from: com.huawei.hms.scankit.p.nc$a */
    private enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc, com.huawei.hms.scankit.p.Pb
    public C3074y a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<Jc, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got " + barcodeFormat);
    }

    @Override // com.huawei.hms.scankit.p.AbstractC3057tc
    public boolean[] a(String str) {
        int length = str.length();
        if (length >= 1 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt < ' ' || charAt > '~') {
                    switch (charAt) {
                        case 241:
                        case 242:
                        case TelnetCommand.BREAK /* 243 */:
                        case 244:
                            break;
                        default:
                            throw new IllegalArgumentException("Bad character in input: " + charAt);
                    }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 1;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                int a2 = a(str, i4, i6);
                if (a2 == i6) {
                    switch (str.charAt(i4)) {
                        case 241:
                            a2 = 102;
                            break;
                        case 242:
                            a2 = 97;
                            break;
                        case TelnetCommand.BREAK /* 243 */:
                            a2 = 96;
                            break;
                        case 244:
                            a2 = 100;
                            break;
                        default:
                            if (i6 == 100) {
                                a2 = str.charAt(i4) - ' ';
                                break;
                            } else {
                                try {
                                    a2 = Integer.parseInt(str.substring(i4, i4 + 2));
                                    i4++;
                                    break;
                                } catch (NumberFormatException unused) {
                                    throw new IllegalArgumentException("contents substring can not format integer");
                                }
                            }
                    }
                    i4++;
                } else if (i6 == 0) {
                    a2 = a2 == 100 ? 104 : 105;
                    i6 = a2;
                } else {
                    i6 = a2;
                }
                arrayList.add(P.f10588a[a2]);
                i5 += a2 * i3;
                if (i4 != 0) {
                    i3++;
                }
            }
            arrayList.add(P.f10588a[i5 % 103]);
            arrayList.add(P.f10588a[106]);
            int i7 = 0;
            for (int[] iArr : arrayList) {
                for (int i8 : iArr) {
                    i7 += i8;
                }
            }
            boolean[] zArr = new boolean[i7];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i += AbstractC3057tc.a(zArr, i, (int[]) it.next(), true);
            }
            return zArr;
        }
        throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
    }

    private static a a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i2);
        if (charAt2 >= '0' && charAt2 <= '9') {
            return a.TWO_DIGITS;
        }
        return a.ONE_DIGIT;
    }

    private static int a(CharSequence charSequence, int i, int i2) {
        a a2;
        a a3;
        a a4 = a(charSequence, i);
        if (a4 != a.UNCODABLE && a4 != a.ONE_DIGIT) {
            if (i2 == 99) {
                return 99;
            }
            if (i2 == 100) {
                if (a4 == a.FNC_1 || (a2 = a(charSequence, i + 2)) == a.UNCODABLE || a2 == a.ONE_DIGIT) {
                    return 100;
                }
                if (a2 == a.FNC_1) {
                    return a(charSequence, i + 3) == a.TWO_DIGITS ? 99 : 100;
                }
                int i3 = i + 4;
                while (true) {
                    a3 = a(charSequence, i3);
                    if (a3 != a.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                return a3 == a.ONE_DIGIT ? 100 : 99;
            }
            if (a4 == a.FNC_1) {
                a4 = a(charSequence, i + 1);
            }
            if (a4 == a.TWO_DIGITS) {
                return 99;
            }
        }
        return 100;
    }
}
