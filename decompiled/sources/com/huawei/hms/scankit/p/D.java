package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.K;

/* compiled from: DataBlock.java */
/* loaded from: classes14.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    private final int f10555a;
    private final byte[] b;

    private D(int i, byte[] bArr) {
        this.f10555a = i;
        this.b = bArr;
    }

    static D[] a(byte[] bArr, K k) {
        K.b c = k.c();
        K.a[] a2 = c.a();
        int i = 0;
        for (K.a aVar : a2) {
            i += aVar.a();
        }
        D[] dArr = new D[i];
        int i2 = 0;
        for (K.a aVar2 : a2) {
            int i3 = 0;
            while (i3 < aVar2.a()) {
                int b = aVar2.b();
                dArr[i2] = new D(b, new byte[c.b() + b]);
                i3++;
                i2++;
            }
        }
        int length = dArr[0].b.length - c.b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                dArr[i7].b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = k.g() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            dArr[i9].b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = dArr[0].b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                dArr[i11].b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return dArr;
        }
        throw new IllegalArgumentException();
    }

    int b() {
        return this.f10555a;
    }

    byte[] a() {
        return this.b;
    }
}
