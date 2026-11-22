package com.huawei.hms.scankit.p;

/* compiled from: BitSource.java */
/* renamed from: com.huawei.hms.scankit.p.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3078z {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10703a;
    private int b;
    private int c;

    public C3078z(byte[] bArr) {
        this.f10703a = bArr;
    }

    public int a(int i) {
        if (i < 1 || i > 32 || i > a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.c;
        int i3 = 0;
        if (i2 > 0) {
            int i4 = 8 - i2;
            int i5 = i < i4 ? i : i4;
            int i6 = i4 - i5;
            int i7 = com.huawei.hms.scankit.util.b.a(this.f10703a, this.b) ? (((255 >> (8 - i5)) << i6) & this.f10703a[this.b]) >> i6 : 0;
            i -= i5;
            int i8 = this.c + i5;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.b++;
            }
            i3 = i7;
        }
        if (i > 0) {
            while (i >= 8) {
                if (com.huawei.hms.scankit.util.b.a(this.f10703a, this.b)) {
                    i3 = (i3 << 8) | (this.f10703a[this.b] & 255);
                }
                this.b++;
                i -= 8;
            }
            if (i > 0) {
                int i9 = 8 - i;
                int i10 = (255 >> i9) << i9;
                if (com.huawei.hms.scankit.util.b.a(this.f10703a, this.b)) {
                    i3 = (i3 << i) | ((i10 & this.f10703a[this.b]) >> i9);
                }
                this.c += i;
            }
        }
        return i3;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public int a() {
        return ((this.f10703a.length - this.b) * 8) - this.c;
    }
}
