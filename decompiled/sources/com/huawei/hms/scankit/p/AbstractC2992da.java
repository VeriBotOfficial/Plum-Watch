package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: UPCEANReader.java */
/* renamed from: com.huawei.hms.scankit.p.da, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC2992da extends Y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f10631a = {1, 1, 1};
    public static final int[] b = {1, 1, 1, 1, 1};
    public static final int[] c = {1, 1, 1, 1, 1, 1};
    public static final int[][] d;
    public static final int[][] e;
    private final StringBuilder f = new StringBuilder(20);
    private final C2988ca g = new C2988ca();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        d = iArr;
        int[][] iArr2 = new int[20][];
        e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            e[i] = iArr4;
        }
    }

    protected AbstractC2992da() {
    }

    static int[] a(C3070x c3070x) throws C2967a {
        return b(c3070x, 0);
    }

    static ArrayList<int[]> b(C3070x c3070x) throws C2967a {
        int d2 = c3070x.d() / 2;
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i = 0;
        while (i < d2) {
            try {
                int[] b2 = b(c3070x, i);
                arrayList.add(b2);
                i = b2[0] + 1;
            } catch (C2967a unused) {
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        throw C2967a.a();
    }

    protected abstract int a(C3070x c3070x, int[] iArr, StringBuilder sb) throws C2967a;

    abstract BarcodeFormat a();

    abstract boolean a(int i, int i2, C3070x c3070x);

    abstract boolean a(int[] iArr, int[] iArr2) throws C2967a;

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        return a(i, c3070x, a(c3070x), map);
    }

    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, int[] iArr, Map<EnumC2970d, ?> map) throws C2967a {
        com.huawei.hms.scankit.aiscan.common.A a2 = map == null ? null : (com.huawei.hms.scankit.aiscan.common.A) map.get(EnumC2970d.NEED_RESULT_POINT_CALLBACK);
        if (a2 != null) {
            a2.a(new com.huawei.hms.scankit.aiscan.common.z((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f;
        sb.setLength(0);
        int a3 = a(c3070x, iArr, sb);
        if (a2 != null) {
            a2.a(new com.huawei.hms.scankit.aiscan.common.z(a3, i));
        }
        int[] a4 = a(c3070x, a3);
        if (a4[0] - a3 <= 1) {
            if (a2 != null) {
                a2.a(new com.huawei.hms.scankit.aiscan.common.z((a4[0] + a4[1]) / 2.0f, i));
            }
            if (a(iArr, a4)) {
                int i2 = a4[1];
                if ((i2 - a4[0]) + i2 < c3070x.d() && a(a4[0], i2, c3070x)) {
                    String sb2 = sb.toString();
                    if (sb2.length() >= 8) {
                        if (a(sb2)) {
                            float f = i;
                            com.huawei.hms.scankit.aiscan.common.x xVar = new com.huawei.hms.scankit.aiscan.common.x(sb2, null, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(iArr[0], f), new com.huawei.hms.scankit.aiscan.common.z(a4[1], f)}, a());
                            a(xVar, a4, i, c3070x, map);
                            return xVar;
                        }
                        throw C2967a.a();
                    }
                    throw C2967a.a();
                }
                throw C2967a.a();
            }
            throw C2967a.a();
        }
        throw C2967a.a();
    }

    static int[] b(C3070x c3070x, int i) throws C2967a {
        int[] iArr = new int[f10631a.length];
        int[] iArr2 = null;
        boolean z = false;
        while (!z) {
            int[] iArr3 = f10631a;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = a(c3070x, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            int i5 = i4 + 3;
            while (i4 <= i5 && (i4 < 0 || !(z = c3070x.a(i4, i2, false, true)))) {
                i4++;
            }
            i = i3;
        }
        return iArr2;
    }

    public static int b(CharSequence charSequence) throws C2967a {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C2967a.a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C2967a.a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    private void a(com.huawei.hms.scankit.aiscan.common.x xVar, int[] iArr, int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        int i2;
        try {
            com.huawei.hms.scankit.aiscan.common.x a2 = this.g.a(i, c3070x, iArr[1]);
            xVar.a(a2.h());
            i2 = a2.i().length();
        } catch (C2967a unused) {
            i2 = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(EnumC2970d.ALLOWED_EAN_EXTENSIONS);
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                if (i2 == i3) {
                    return;
                }
            }
            throw C2967a.a();
        }
    }

    boolean a(String str) throws C2967a {
        return a((CharSequence) str);
    }

    public static boolean a(CharSequence charSequence) throws C2967a {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return b(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    int[] a(C3070x c3070x, int i) throws C2967a {
        return a(c3070x, i, false, f10631a);
    }

    static int[] a(C3070x c3070x, int i, boolean z, int[] iArr) throws C2967a {
        return a(c3070x, i, z, iArr, new int[iArr.length]);
    }

    private static int[] a(C3070x c3070x, int i, boolean z, int[] iArr, int[] iArr2) throws C2967a {
        int d2 = c3070x.d();
        int c2 = z ? c3070x.c(i) : c3070x.b(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = c2;
        while (c2 < d2) {
            if (c3070x.a(c2) != z2) {
                if (i2 >= 0 && i2 < iArr2.length) {
                    iArr2[i2] = iArr2[i2] + 1;
                } else {
                    throw C2967a.a();
                }
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (Y.a(iArr2, iArr, 0.8f) < 0.46f) {
                        return new int[]{i3, c2};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            c2++;
        }
        throw C2967a.a();
    }

    static int a(C3070x c3070x, int[] iArr, int i, int[][] iArr2) throws C2967a {
        Y.a(c3070x, i, iArr);
        int length = iArr2.length;
        float f = 0.46f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float a2 = Y.a(iArr, iArr2[i3], 0.8f);
            if (a2 < f) {
                i2 = i3;
                f = a2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C2967a.a();
    }
}
