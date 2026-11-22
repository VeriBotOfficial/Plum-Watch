package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
final class v02 {

    /* renamed from: a, reason: collision with root package name */
    private final ag1 f17104a = new ag1(8);
    private int b;

    private long a(wz wzVar) throws IOException {
        int i = 0;
        wzVar.b(this.f17104a.c(), 0, 1, false);
        int i2 = this.f17104a.c()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        wzVar.b(this.f17104a.c(), 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (this.f17104a.c()[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.yandex.mobile.ads.impl.wz r14) throws java.io.IOException {
        /*
            r13 = this;
            long r0 = r14.b()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L12
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L12
        L11:
            r3 = r0
        L12:
            int r3 = (int) r3
            com.yandex.mobile.ads.impl.ag1 r4 = r13.f17104a
            byte[] r4 = r4.c()
            r5 = 0
            r6 = 4
            r14.b(r4, r5, r6, r5)
            com.yandex.mobile.ads.impl.ag1 r4 = r13.f17104a
            long r7 = r4.v()
            r13.b = r6
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L54
            int r4 = r13.b
            int r4 = r4 + r6
            r13.b = r4
            if (r4 != r3) goto L36
            return r5
        L36:
            com.yandex.mobile.ads.impl.ag1 r4 = r13.f17104a
            byte[] r4 = r4.c()
            r14.b(r4, r5, r6, r5)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            com.yandex.mobile.ads.impl.ag1 r4 = r13.f17104a
            byte[] r4 = r4.c()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L26
        L54:
            long r3 = r13.a(r14)
            int r7 = r13.b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L9e
            if (r2 == 0) goto L6a
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto L9e
        L6a:
            int r0 = r13.b
            long r0 = (long) r0
            long r11 = r7 + r3
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L9b
            long r0 = r13.a(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L7c
            return r5
        L7c:
            long r0 = r13.a(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L8e
            goto L9a
        L8e:
            if (r2 == 0) goto L6a
            int r0 = (int) r0
            r14.a(r5, r0)
            int r1 = r13.b
            int r1 = r1 + r0
            r13.b = r1
            goto L6a
        L9a:
            return r5
        L9b:
            if (r0 != 0) goto L9e
            return r6
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.v02.b(com.yandex.mobile.ads.impl.wz):boolean");
    }
}
