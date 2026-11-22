package com.huawei.hms.scankit.p;

import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.scankit.aiscan.common.EnumC2969c;
import com.huawei.hms.scankit.p.Ya;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.net.telnet.TelnetCommand;

/* compiled from: Encoder.java */
/* loaded from: classes14.dex */
public final class Lc {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f10577a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    private static int a(Ic ic) {
        return Mc.a(ic) + Mc.b(ic) + Mc.c(ic) + Mc.d(ic);
    }

    static void b(CharSequence charSequence, C3070x c3070x) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                c3070x.a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    c3070x.a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    c3070x.a(charAt, 4);
                }
            }
        }
    }

    public static Oc a(String str, Pa pa, Map<Jc, ?> map) throws WriterException {
        String str2;
        Ya a2;
        EnumC2969c a3;
        boolean z = map != null && map.containsKey(Jc.CHARACTER_SET);
        if (!z) {
            str2 = "ISO-8859-1";
        } else {
            str2 = map.get(Jc.CHARACTER_SET).toString();
        }
        Va a4 = a(str, str2);
        C3070x c3070x = new C3070x();
        if (a4 == Va.BYTE && z && (a3 = EnumC2969c.a(str2)) != null) {
            a(a3, c3070x);
        }
        if (map != null && map.containsKey(Jc.GS1_FORMAT) && Boolean.valueOf(map.get(Jc.GS1_FORMAT).toString()).booleanValue()) {
            a(Va.FNC1_FIRST_POSITION, c3070x);
        }
        a(a4, c3070x);
        C3070x c3070x2 = new C3070x();
        a(str, a4, c3070x2, str2);
        if (map != null && map.containsKey(Jc.QR_VERSION)) {
            a2 = Ya.c(Integer.parseInt(map.get(Jc.QR_VERSION).toString()));
            if (!a(a(a4, c3070x, c3070x2, a2), a2, pa)) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            a2 = a(pa, a4, c3070x, c3070x2);
        }
        C3070x c3070x3 = new C3070x();
        c3070x3.a(c3070x);
        a(a4 == Va.BYTE ? c3070x2.e() : str.length(), a2, a4, c3070x3);
        c3070x3.a(c3070x2);
        Ya.b a5 = a2.a(pa);
        int d = a2.d() - a5.d();
        a(d, c3070x3);
        C3070x a6 = a(c3070x3, a2.d(), d, a5.c());
        Oc oc = new Oc();
        oc.a(pa);
        oc.a(a4);
        oc.a(a2);
        int c = a2.c();
        Ic ic = new Ic(c, c);
        int a7 = a(a6, pa, a2, ic);
        oc.b(a7);
        Nc.a(a6, pa, a2, a7, ic);
        oc.a(ic);
        return oc;
    }

    private static Ya a(Pa pa, Va va, C3070x c3070x, C3070x c3070x2) throws WriterException {
        return a(a(va, c3070x, c3070x2, a(a(va, c3070x, c3070x2, Ya.c(1)), pa)), pa);
    }

    private static int a(Va va, C3070x c3070x, C3070x c3070x2, Ya ya) {
        return c3070x.d() + va.a(ya) + c3070x2.d();
    }

    static int a(int i) {
        int[] iArr = f10577a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    private static Va a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && a(str)) {
            return Va.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else {
                if (a(charAt) == -1) {
                    return Va.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return Va.ALPHANUMERIC;
        }
        if (z2) {
            return Va.NUMERIC;
        }
        return Va.BYTE;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(C3070x c3070x, Pa pa, Ya ya, Ic ic) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            Nc.a(c3070x, pa, ya, i3, ic);
            int a2 = a(ic);
            if (a2 < i) {
                i2 = i3;
                i = a2;
            }
        }
        return i2;
    }

    private static Ya a(int i, Pa pa) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            Ya c = Ya.c(i2);
            if (a(i, c, pa)) {
                return c;
            }
        }
        throw new WriterException("Data too big");
    }

    private static boolean a(int i, Ya ya, Pa pa) {
        return ya.d() - ya.a(pa).d() >= (i + 7) / 8;
    }

    static void a(int i, C3070x c3070x) throws WriterException {
        int i2 = i * 8;
        if (c3070x.d() <= i2) {
            for (int i3 = 0; i3 < 4 && c3070x.d() < i2; i3++) {
                c3070x.a(false);
            }
            int d = c3070x.d() & 7;
            if (d > 0) {
                while (d < 8) {
                    c3070x.a(false);
                    d++;
                }
            }
            int e = i - c3070x.e();
            for (int i4 = 0; i4 < e; i4++) {
                c3070x.a((i4 & 1) == 0 ? TelnetCommand.EOF : 17, 8);
            }
            if (c3070x.d() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + c3070x.d() + " > " + i2);
    }

    static void a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
                return;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
                return;
            }
        }
        throw new WriterException("Block ID too large");
    }

    static C3070x a(C3070x c3070x, int i, int i2, int i3) throws WriterException {
        if (c3070x.e() == i2) {
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i4 < i3) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i8 = i;
                int i9 = i2;
                int i10 = i3;
                a(i8, i9, i10, i4, iArr, iArr2);
                int i11 = iArr[0];
                byte[] bArr = new byte[i11];
                c3070x.a(i5 * 8, bArr, 0, i11);
                byte[] a2 = a(bArr, iArr2[0]);
                arrayList.add(new Hc(bArr, a2));
                i7 = Math.max(i7, i11);
                i6 = Math.max(i6, a2.length);
                i5 += iArr[0];
                i4++;
                i = i8;
                i2 = i9;
                i3 = i10;
            }
            int i12 = i;
            if (i2 == i5) {
                C3070x c3070x2 = new C3070x();
                for (int i13 = 0; i13 < i7; i13++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] a3 = ((Hc) it.next()).a();
                        if (i13 < a3.length) {
                            c3070x2.a(a3[i13], 8);
                        }
                    }
                }
                for (int i14 = 0; i14 < i6; i14++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] b = ((Hc) it2.next()).b();
                        if (i14 < b.length) {
                            c3070x2.a(b[i14], 8);
                        }
                    }
                }
                if (i12 == c3070x2.e()) {
                    return c3070x2;
                }
                throw new WriterException("Interleaving error: " + i12 + " and " + c3070x2.e() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new com.huawei.hms.scankit.aiscan.common.v(com.huawei.hms.scankit.aiscan.common.h.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static void a(Va va, C3070x c3070x) {
        c3070x.a(va.a(), 4);
    }

    static void a(int i, Ya ya, Va va, C3070x c3070x) throws WriterException {
        int a2 = va.a(ya);
        int i2 = 1 << a2;
        if (i < i2) {
            c3070x.a(i, a2);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    static void a(String str, Va va, C3070x c3070x, String str2) throws WriterException {
        int i = Kc.f10573a[va.ordinal()];
        if (i == 1) {
            b(str, c3070x);
            return;
        }
        if (i == 2) {
            a((CharSequence) str, c3070x);
        } else if (i == 3) {
            a(str, c3070x, str2);
        } else {
            if (i != 4) {
                throw new WriterException("Invalid mode: " + va);
            }
            a(str, c3070x);
        }
    }

    static void a(CharSequence charSequence, C3070x c3070x) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a2 = a(charSequence.charAt(i));
            if (a2 == -1) {
                throw new WriterException();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int a3 = a(charSequence.charAt(i2));
                if (a3 != -1) {
                    c3070x.a((a2 * 45) + a3, 11);
                    i += 2;
                } else {
                    throw new WriterException();
                }
            } else {
                c3070x.a(a2, 6);
                i = i2;
            }
        }
    }

    static void a(String str, C3070x c3070x, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                c3070x.a(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[LOOP:0: B:5:0x0008->B:12:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(java.lang.String r6, com.huawei.hms.scankit.p.C3070x r7) throws com.huawei.hms.hmsscankit.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = r4
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.a(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            com.huawei.hms.hmsscankit.WriterException r6 = new com.huawei.hms.hmsscankit.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            com.huawei.hms.hmsscankit.WriterException r7 = new com.huawei.hms.hmsscankit.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Lc.a(java.lang.String, com.huawei.hms.scankit.p.x):void");
    }

    private static void a(EnumC2969c enumC2969c, C3070x c3070x) {
        c3070x.a(Va.ECI.a(), 4);
        c3070x.a(enumC2969c.a(), 8);
    }
}
