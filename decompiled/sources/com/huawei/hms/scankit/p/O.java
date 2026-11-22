package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: CodaBarReader.java */
/* loaded from: classes14.dex */
public final class O extends Y {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10585a = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] c = {'A', 'B', 'C', 'D'};
    private final StringBuilder d = new StringBuilder(20);
    private int[] e = new int[80];
    private int f = 0;
    private int g;

    private int b() throws C2967a {
        for (int i = 1; i < this.f; i += 2) {
            int b2 = b(i);
            if (b2 != -1 && a(c, f10585a[b2])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.e[i3];
                }
                if (i == 1 || this.e[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw C2967a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        throw com.huawei.hms.scankit.aiscan.common.C2967a.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r18) throws com.huawei.hms.scankit.aiscan.common.C2967a {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.O.c(int):void");
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        Arrays.fill(this.e, 0);
        a(c3070x);
        int[] a2 = a();
        int i2 = a2[0];
        int i3 = a2[1];
        for (int i4 = 0; i4 < this.d.length(); i4++) {
            StringBuilder sb = this.d;
            sb.setCharAt(i4, f10585a[sb.charAt(i4)]);
        }
        char charAt = this.d.charAt(0);
        char[] cArr = c;
        if (!a(cArr, charAt)) {
            throw C2967a.a();
        }
        StringBuilder sb2 = this.d;
        if (!a(cArr, sb2.charAt(sb2.length() - 1))) {
            throw C2967a.a();
        }
        if (this.d.length() <= 3) {
            throw C2967a.a();
        }
        int i5 = this.g;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 += this.e[i6];
        }
        float f = i5;
        while (i2 < i3 - 1) {
            i5 += this.e[i2];
            i2++;
        }
        float f2 = i;
        return new com.huawei.hms.scankit.aiscan.common.x(this.d.toString(), null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(f, f2), new com.huawei.hms.scankit.aiscan.common.z(i5, f2)}, BarcodeFormat.CODABAR);
    }

    private int b(int i) {
        int i2 = i + 7;
        if (i2 >= this.f) {
            return -1;
        }
        int[] iArr = this.e;
        HashSet hashSet = new HashSet();
        for (int i3 = i; i3 < i2; i3++) {
            hashSet.add(Integer.valueOf(iArr[i3]));
        }
        Iterator it = hashSet.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            i5 += ((Integer) it.next()).intValue();
        }
        if (hashSet.size() > 0) {
            int size = i5 / hashSet.size();
            int i6 = 128;
            int i7 = 0;
            for (int i8 = 0; i8 < 7; i8++) {
                i6 >>= 1;
                if (iArr[i + i8] > size) {
                    i7 |= i6;
                }
            }
            while (true) {
                int[] iArr2 = b;
                if (i4 >= iArr2.length) {
                    break;
                }
                if (iArr2[i4] == i7) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    private int[] a() throws C2967a {
        int i;
        int b2 = b();
        int i2 = 0;
        this.d.setLength(0);
        int i3 = b2;
        while (true) {
            int b3 = b(i3);
            if (b3 != -1) {
                this.d.append((char) b3);
                i = i3 + 8;
                if ((this.d.length() <= 1 || !a(c, f10585a[b3])) && i < this.f) {
                    i3 = i;
                }
            } else {
                throw C2967a.a();
            }
        }
        int i4 = this.e[i3 + 7];
        for (int i5 = -8; i5 < -1; i5++) {
            i2 += this.e[i + i5];
        }
        if (i < this.f && i4 < i2 / 2) {
            throw C2967a.a();
        }
        c(b2);
        return new int[]{b2, i};
    }

    private void a(C3070x c3070x) throws C2967a {
        int i = 0;
        this.f = 0;
        int c2 = c3070x.c(0);
        this.g = c2;
        int d = c3070x.d();
        if (c2 < d) {
            boolean z = true;
            while (c2 < d) {
                if (c3070x.a(c2) != z) {
                    i++;
                } else {
                    a(i);
                    z = !z;
                    i = 1;
                }
                c2++;
            }
            a(i);
            return;
        }
        throw C2967a.a();
    }

    private void a(int i) throws C2967a {
        try {
            int[] iArr = this.e;
            int i2 = this.f;
            iArr[i2] = i;
            int i3 = i2 + 1;
            this.f = i3;
            if (i3 >= iArr.length) {
                int[] iArr2 = new int[i3 * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i3);
                this.e = iArr2;
            }
        } catch (NumberFormatException unused) {
            throw C2967a.a();
        }
    }

    public static boolean a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }
}
