package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hm1;
import java.util.ArrayList;

/* loaded from: classes5.dex */
final class im1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.hm1.a> a(com.yandex.mobile.ads.impl.ag1 r30) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.im1.a(com.yandex.mobile.ads.impl.ag1):java.util.ArrayList");
    }

    public static hm1 a(int i, byte[] bArr) {
        ArrayList<hm1.a> arrayList;
        int h;
        ag1 ag1Var = new ag1(bArr);
        try {
            ag1Var.f(4);
            h = ag1Var.h();
            ag1Var.e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (h == 1886547818) {
            ag1Var.f(8);
            int d = ag1Var.d();
            int e = ag1Var.e();
            while (d < e) {
                int h2 = ag1Var.h() + d;
                if (h2 <= d || h2 > e) {
                    break;
                }
                int h3 = ag1Var.h();
                if (h3 != 2037673328 && h3 != 1836279920) {
                    ag1Var.e(h2);
                    d = h2;
                }
                ag1Var.d(h2);
                arrayList = a(ag1Var);
                break;
            }
            arrayList = null;
        } else {
            arrayList = a(ag1Var);
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            hm1.a aVar = arrayList.get(0);
            return new hm1(aVar, aVar, i);
        }
        if (size != 2) {
            return null;
        }
        return new hm1(arrayList.get(0), arrayList.get(1), i);
    }
}
