package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.Arrays;
import java.util.Map;

/* compiled from: OneDReader.java */
/* loaded from: classes14.dex */
public abstract class Y implements com.huawei.hms.scankit.aiscan.common.t {
    private com.huawei.hms.scankit.aiscan.common.x b(C3066w c3066w, Map<EnumC2970d, ?> map) throws C2967a {
        int e = c3066w.e();
        int c = c3066w.c();
        C3070x c3070x = new C3070x(e);
        int max = Math.max(1, c >> 5);
        int i = c / 2;
        if (map != null && map.containsKey(EnumC2970d.PHOTO_MODE_NUM)) {
            i += (((Integer) map.get(EnumC2970d.PHOTO_MODE_NUM)).intValue() * max) / 3;
        }
        int i2 = i;
        int i3 = 0;
        while (i3 < 15) {
            int i4 = i3 + 1;
            int i5 = i4 / 2;
            if ((i3 & 1) != 0) {
                i5 = -i5;
            }
            int i6 = i2 + (i5 * max);
            if (i6 < 0 || i6 >= c) {
                break;
            }
            C3066w c3066w2 = c3066w;
            Map<EnumC2970d, ?> map2 = map;
            com.huawei.hms.scankit.aiscan.common.x a2 = a(c3066w2, c3070x, map2, i6, e);
            if (a2 != null && a2.i() != null) {
                return a2;
            }
            c3066w = c3066w2;
            map = map2;
            i3 = i4;
        }
        throw C2967a.a();
    }

    public abstract com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a;

    @Override // com.huawei.hms.scankit.aiscan.common.t
    public com.huawei.hms.scankit.aiscan.common.x a(C3066w c3066w, Map<EnumC2970d, ?> map) throws C2967a {
        return b(c3066w, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C3066w r10, com.huawei.hms.scankit.p.C3070x r11, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC2970d, ?> r12, int r13, int r14) throws com.huawei.hms.scankit.aiscan.common.C2967a {
        /*
            r9 = this;
            r0 = 0
        L1:
            r1 = 3
            if (r0 >= r1) goto L57
            r2 = 1
            if (r0 != 0) goto Ld
            com.huawei.hms.scankit.p.x r11 = r10.a(r13, r11)     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L21
        Lb:
            r4 = r11
            goto L2a
        Ld:
            if (r0 != r2) goto L1a
            com.huawei.hms.scankit.p.y r1 = r10.b()
            com.huawei.hms.scankit.p.x r11 = r1.a(r13, r11)
            r4 = r11
            r1 = r2
            goto L2a
        L1a:
            r3 = 2
            if (r0 != r3) goto Lb
            boolean r3 = com.huawei.hms.scankit.p._a.o
            if (r3 != 0) goto L25
        L21:
            r6 = r12
            r7 = r13
            r8 = r14
            goto L51
        L25:
            com.huawei.hms.scankit.p.x r11 = r10.a(r13, r2)
            goto Lb
        L2a:
            int[] r11 = r4.c()
            boolean r11 = a(r11)
            if (r11 != 0) goto L38
            r6 = r12
            r7 = r13
            r8 = r14
            goto L50
        L38:
            boolean r11 = com.huawei.hms.scankit.p._a.c
            if (r11 != 0) goto L3e
            r5 = r2
            goto L3f
        L3e:
            r5 = r1
        L3f:
            r3 = r9
            r6 = r12
            r7 = r13
            r8 = r14
            com.huawei.hms.scankit.aiscan.common.x r11 = r3.a(r4, r5, r6, r7, r8)
            if (r11 == 0) goto L50
            java.lang.String r12 = r11.i()
            if (r12 == 0) goto L50
            return r11
        L50:
            r11 = r4
        L51:
            int r0 = r0 + 1
            r12 = r6
            r13 = r7
            r14 = r8
            goto L1
        L57:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Y.a(com.huawei.hms.scankit.p.w, com.huawei.hms.scankit.p.x, java.util.Map, int, int):com.huawei.hms.scankit.aiscan.common.x");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:14|(6:18|19|20|(1:41)(4:24|25|26|27)|28|(2:33|34)(2:30|31)))|44|19|20|(1:22)|41|28|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.scankit.aiscan.common.x a(com.huawei.hms.scankit.p.C3070x r20, int r21, java.util.Map<com.huawei.hms.scankit.aiscan.common.EnumC2970d, ?> r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r24
            r1 = 0
            r3 = r21
            r2 = r22
            r4 = r1
        L8:
            if (r4 >= r3) goto Laf
            if (r4 != 0) goto Lf
            r20.b()
        Lf:
            r5 = 1
            if (r4 != r5) goto L15
            r20.h()
        L15:
            r6 = 2
            if (r4 != r6) goto L1e
            r20.f()
            r20.i()
        L1e:
            r7 = r1
        L1f:
            if (r7 >= r6) goto La3
            if (r7 != r5) goto L47
            r20.g()
            if (r2 == 0) goto L47
            com.huawei.hms.scankit.aiscan.common.d r8 = com.huawei.hms.scankit.aiscan.common.EnumC2970d.NEED_RESULT_POINT_CALLBACK
            boolean r8 = r2.containsKey(r8)
            if (r8 == 0) goto L47
            java.util.EnumMap r8 = new java.util.EnumMap
            java.lang.Class<com.huawei.hms.scankit.aiscan.common.d> r9 = com.huawei.hms.scankit.aiscan.common.EnumC2970d.class
            r8.<init>(r9)
            r8.putAll(r2)
            com.huawei.hms.scankit.aiscan.common.d r2 = com.huawei.hms.scankit.aiscan.common.EnumC2970d.NEED_RESULT_POINT_CALLBACK
            r8.remove(r2)
            r2 = r8
            r9 = r20
            r10 = r23
            r8 = r19
            goto L4d
        L47:
            r8 = r19
            r9 = r20
            r10 = r23
        L4d:
            com.huawei.hms.scankit.aiscan.common.x r11 = r8.a(r10, r9, r2)     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            if (r7 != r5) goto L8c
            com.huawei.hms.scankit.aiscan.common.z[] r12 = r11.h()     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            if (r12 == 0) goto L8c
            com.huawei.hms.scankit.aiscan.common.z r13 = new com.huawei.hms.scankit.aiscan.common.z     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            float r14 = (float) r0     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            r15 = r12[r1]     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            float r15 = r15.b()     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            float r15 = r14 - r15
            r16 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 - r16
            r17 = r12[r1]     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L96
            r18 = r1
            float r1 = r17.c()     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            r13.<init>(r15, r1)     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            r12[r18] = r13     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            com.huawei.hms.scankit.aiscan.common.z r1 = new com.huawei.hms.scankit.aiscan.common.z     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            float r13 = r13.b()     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            float r14 = r14 - r13
            float r14 = r14 - r16
            r13 = r12[r5]     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            float r13 = r13.c()     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            r1.<init>(r14, r13)     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            r12[r5] = r1     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            goto L8e
        L8c:
            r18 = r1
        L8e:
            boolean r1 = a(r11, r0)     // Catch: com.huawei.hms.scankit.aiscan.common.C2967a -> L98
            if (r1 != 0) goto L95
            goto L9d
        L95:
            return r11
        L96:
            r18 = r1
        L98:
            if (r7 != r5) goto L9d
            r9.g()
        L9d:
            int r7 = r7 + 1
            r1 = r18
            goto L1f
        La3:
            r8 = r19
            r9 = r20
            r10 = r23
            r18 = r1
            int r4 = r4 + 1
            goto L8
        Laf:
            r8 = r19
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.Y.a(com.huawei.hms.scankit.p.x, int, java.util.Map, int, int):com.huawei.hms.scankit.aiscan.common.x");
    }

    private static boolean a(int[] iArr) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length && i < 20; i3++) {
            int i4 = iArr[i3];
            i += Integer.bitCount((i2 | (i4 << 1)) ^ i4);
            i2 = (iArr[i3] >> 31) & 1;
        }
        return i >= 20;
    }

    private static boolean a(com.huawei.hms.scankit.aiscan.common.x xVar, int i) {
        com.huawei.hms.scankit.aiscan.common.z[] h = xVar.h();
        return Math.abs(((double) h[1].b()) - ((double) h[0].b())) / ((double) i) > 0.4d;
    }

    protected static void a(C3070x c3070x, int i, int[] iArr) throws C2967a {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int d = c3070x.d();
        if (i < d) {
            boolean z = !c3070x.a(i);
            int i2 = 0;
            while (i < d) {
                if (c3070x.a(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    if (i2 >= 0 && i2 < iArr.length) {
                        iArr[i2] = 1;
                        z = !z;
                    } else {
                        throw C2967a.a();
                    }
                } else if (i2 >= 0 && i2 < iArr.length) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    throw C2967a.a();
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != d) {
                    throw C2967a.a();
                }
                return;
            }
            return;
        }
        throw C2967a.a();
    }

    protected static float a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
