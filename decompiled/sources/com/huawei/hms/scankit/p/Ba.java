package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.Ya;

/* compiled from: DataBlock.java */
/* loaded from: classes14.dex */
final class Ba {

    /* renamed from: a, reason: collision with root package name */
    private final int f10551a;
    private final byte[] b;

    private Ba(int i, byte[] bArr) {
        this.f10551a = i;
        this.b = bArr;
    }

    static Ba[] a(byte[] bArr, Ya ya, Pa pa) {
        if (bArr.length != ya.d()) {
            throw new IllegalArgumentException();
        }
        Ya.b a2 = ya.a(pa);
        Ya.a[] a3 = a2.a();
        int i = 0;
        for (Ya.a aVar : a3) {
            i += aVar.a();
        }
        Ba[] baArr = new Ba[i];
        int i2 = 0;
        for (Ya.a aVar2 : a3) {
            int i3 = 0;
            while (i3 < aVar2.a()) {
                int b = aVar2.b();
                baArr[i2] = new Ba(b, new byte[a2.b() + b]);
                i3++;
                i2++;
            }
        }
        int length = baArr[0].b.length;
        int i4 = i - 1;
        while (i4 >= 0 && baArr[i4].b.length != length) {
            i4--;
        }
        return a(baArr, bArr, length, a2, i2, i4 + 1);
    }

    int b() {
        return this.f10551a;
    }

    private static Ba[] a(Ba[] baArr, byte[] bArr, int i, Ya.b bVar, int i2, int i3) {
        int b = i - bVar.b();
        int i4 = 0;
        for (int i5 = 0; i5 < b; i5++) {
            int i6 = 0;
            while (i6 < i2) {
                baArr[i6].b[i5] = bArr[i4];
                i6++;
                i4++;
            }
        }
        int i7 = i3;
        while (i7 < i2) {
            baArr[i7].b[b] = bArr[i4];
            i7++;
            i4++;
        }
        int length = baArr[0].b.length;
        while (b < length) {
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i8 < i3 ? b : b + 1;
                if (i8 >= 0 && i8 < baArr.length && com.huawei.hms.scankit.util.b.a(baArr[i8].b, i9) && com.huawei.hms.scankit.util.b.a(bArr, i4)) {
                    baArr[i8].b[i9] = bArr[i4];
                    i8++;
                    i4++;
                } else {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
            b++;
        }
        return baArr;
    }

    byte[] a() {
        return this.b;
    }
}
