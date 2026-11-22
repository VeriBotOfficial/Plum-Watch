package com.huawei.hms.scankit.p;

import com.google.zxing.common.StringUtils;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.C2971e;
import com.huawei.hms.scankit.aiscan.common.EnumC2969c;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: DecodedBitStreamParser.java */
/* loaded from: classes14.dex */
final class Ma {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f10579a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    static C2971e a(byte[] bArr, Ya ya, Pa pa, Map<EnumC2970d, ?> map) throws C2967a {
        int i;
        int i2;
        C3078z c3078z = new C3078z(bArr);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            try {
                int[] iArr = {i5, i3, i4};
                Va a2 = c3078z.a() < 4 ? Va.TERMINATOR : Va.a(c3078z.a(4));
                a(a2, c3078z, sb, ya, iArr, null, arrayList, map);
                int i6 = iArr[0] == 1 ? 1 : 0;
                i = iArr[1];
                i2 = iArr[2];
                if (a2 == Va.TERMINATOR) {
                    break;
                }
                i5 = i6;
                i3 = i;
                i4 = i2;
            } catch (IllegalArgumentException unused) {
                throw C2967a.a();
            }
        }
        return new C2971e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, pa != null ? pa.toString() : null, i, i2);
    }

    private static void b(C3078z c3078z, StringBuilder sb, int i) throws C2967a {
        if (i * 13 > c3078z.a()) {
            throw C2967a.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int a2 = c3078z.a(13);
            int i3 = (a2 % 192) | ((a2 / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            if (com.huawei.hms.scankit.util.b.a(bArr, i2)) {
                int i5 = i2 + 1;
                if (com.huawei.hms.scankit.util.b.a(bArr, i5)) {
                    bArr[i2] = (byte) (i4 >> 8);
                    bArr[i5] = (byte) i4;
                    i2 += 2;
                    i--;
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        try {
            sb.append(new String(bArr, StringUtils.SHIFT_JIS));
        } catch (UnsupportedEncodingException unused) {
            throw C2967a.a();
        }
    }

    private static void c(C3078z c3078z, StringBuilder sb, int i) throws C2967a {
        while (i >= 3) {
            if (c3078z.a() < 10) {
                throw C2967a.a();
            }
            int a2 = c3078z.a(10);
            if (a2 >= 1000) {
                throw C2967a.a();
            }
            sb.append(a(a2 / 100));
            sb.append(a((a2 / 10) % 10));
            sb.append(a(a2 % 10));
            i -= 3;
        }
        if (i == 2) {
            if (c3078z.a() < 7) {
                throw C2967a.a();
            }
            int a3 = c3078z.a(7);
            if (a3 >= 100) {
                throw C2967a.a();
            }
            sb.append(a(a3 / 10));
            sb.append(a(a3 % 10));
            return;
        }
        if (i == 1) {
            if (c3078z.a() < 4) {
                throw C2967a.a();
            }
            int a4 = c3078z.a(4);
            if (a4 >= 10) {
                throw C2967a.a();
            }
            sb.append(a(a4));
        }
    }

    private static void a(Va va, C3078z c3078z, StringBuilder sb, Ya ya, int[] iArr, EnumC2969c enumC2969c, List<byte[]> list, Map<EnumC2970d, ?> map) throws C2967a {
        switch (La.f10576a[va.ordinal()]) {
            case 5:
                return;
            case 6:
            case 7:
                iArr[0] = 1;
                return;
            case 8:
                if (c3078z.a() >= 16) {
                    iArr[1] = c3078z.a(8);
                    iArr[2] = c3078z.a(8);
                    return;
                }
                throw C2967a.a();
            case 9:
                if (EnumC2969c.a(a(c3078z)) == null) {
                    throw C2967a.a();
                }
                return;
            case 10:
                int a2 = c3078z.a(4);
                int a3 = c3078z.a(va.a(ya));
                if (a2 == 1) {
                    a(c3078z, sb, a3);
                    return;
                }
                return;
            default:
                int a4 = c3078z.a(va.a(ya));
                int i = La.f10576a[va.ordinal()];
                if (i == 1) {
                    c(c3078z, sb, a4);
                    return;
                }
                if (i == 2) {
                    a(c3078z, sb, a4, iArr[0] == 1);
                    return;
                } else if (i == 3) {
                    a(c3078z, sb, a4, enumC2969c, list, map);
                    return;
                } else {
                    if (i != 4) {
                        throw C2967a.a();
                    }
                    b(c3078z, sb, a4);
                    return;
                }
        }
    }

    private static void a(C3078z c3078z, StringBuilder sb, int i) throws C2967a {
        if (i * 13 <= c3078z.a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int a2 = c3078z.a(13);
                int i3 = (a2 % 96) | ((a2 / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                if (com.huawei.hms.scankit.util.b.a(bArr, i2)) {
                    int i5 = i2 + 1;
                    if (com.huawei.hms.scankit.util.b.a(bArr, i5)) {
                        bArr[i2] = (byte) ((i4 >> 8) & 255);
                        bArr[i5] = (byte) (i4 & 255);
                        i2 += 2;
                        i--;
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            try {
                sb.append(new String(bArr, StringUtils.GB2312));
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C2967a.a();
            }
        }
        throw C2967a.a();
    }

    private static void a(C3078z c3078z, StringBuilder sb, int i, EnumC2969c enumC2969c, Collection<byte[]> collection, Map<EnumC2970d, ?> map) throws C2967a {
        String name;
        if (i * 8 <= c3078z.a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) c3078z.a(8);
            }
            if (enumC2969c == null) {
                name = com.huawei.hms.scankit.aiscan.common.B.a(bArr, map);
            } else {
                name = enumC2969c.name();
            }
            try {
                sb.append(new String(bArr, name));
                collection.add(bArr);
                return;
            } catch (UnsupportedEncodingException unused) {
                throw C2967a.a();
            }
        }
        throw C2967a.a();
    }

    private static char a(int i) throws C2967a {
        char[] cArr = f10579a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C2967a.a();
    }

    private static void a(C3078z c3078z, StringBuilder sb, int i, boolean z) throws C2967a {
        while (i > 1) {
            if (c3078z.a() >= 11) {
                int a2 = c3078z.a(11);
                sb.append(a(a2 / 45));
                sb.append(a(a2 % 45));
                i -= 2;
            } else {
                throw C2967a.a();
            }
        }
        if (i == 1) {
            if (c3078z.a() >= 6) {
                sb.append(a(c3078z.a(6)));
            } else {
                throw C2967a.a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static int a(C3078z c3078z) throws C2967a {
        int a2 = c3078z.a(8);
        if ((a2 & 128) == 0) {
            return a2 & 127;
        }
        if ((a2 & 192) == 128) {
            return c3078z.a(8) | ((a2 & 63) << 8);
        }
        if ((a2 & 224) == 192) {
            return c3078z.a(16) | ((a2 & 31) << 16);
        }
        throw C2967a.a();
    }
}
