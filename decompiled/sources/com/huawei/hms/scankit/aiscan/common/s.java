package com.huawei.hms.scankit.aiscan.common;

/* compiled from: RGBLuminanceSource.java */
/* loaded from: classes14.dex */
public final class s extends m {
    private final byte[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public s(int i, int i2, int[] iArr) {
        super(i, i2);
        this.d = i;
        this.e = i2;
        this.f = 0;
        this.g = 0;
        int i3 = i * i2;
        this.c = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            if (((-16777216) & i5) == 0) {
                i5 = -1;
            }
            this.c[i4] = (byte) (((((((i5 >> 16) & 255) * 306) + (((i5 >> 8) & 255) * 601)) + ((i5 & 255) * 117)) + 512) >> 10);
        }
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public byte[] a(int i, byte[] bArr) {
        if (i < 0 || i >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i);
        }
        int c = c();
        if (bArr == null || bArr.length < c) {
            bArr = new byte[c];
        }
        System.arraycopy(this.c, ((i + this.g) * this.d) + this.f, bArr, 0, c);
        return bArr;
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public byte[] b() {
        int c = c();
        int a2 = a();
        int i = this.d;
        if (c == i && a2 == this.e) {
            return this.c;
        }
        int i2 = c * a2;
        byte[] bArr = new byte[i2];
        int i3 = (this.g * i) + this.f;
        if (c == i) {
            System.arraycopy(this.c, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < a2; i4++) {
            System.arraycopy(this.c, i3, bArr, i4 * c, c);
            i3 += this.d;
        }
        return bArr;
    }

    private s(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i5 + i3 <= i && i6 + i4 <= i2) {
            this.c = bArr;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m a(int i, int i2, int i3, int i4) {
        return new s(this.c, this.d, this.e, this.f + i, this.g + i2, i3, i4);
    }

    @Override // com.huawei.hms.scankit.aiscan.common.m
    public m b(int i, int i2, int i3, int i4) {
        int i5 = this.e;
        int i6 = this.d;
        if (i5 > i6) {
            byte[] bArr = new byte[i * i2];
            for (int i7 = 0; i7 < this.e; i7++) {
                byte[] bArr2 = this.c;
                int i8 = this.d;
                System.arraycopy(bArr2, i7 * i8, bArr, (i7 * i) + i3, i8);
            }
            return new r(bArr, i, i2, this.f, this.g, i, i2, false);
        }
        byte[] bArr3 = new byte[i * i2];
        System.arraycopy(this.c, 0, bArr3, i * i4, i5 * i6);
        int i9 = this.d;
        return new r(bArr3, i9, i2, this.f, this.g, i9, i2, false);
    }
}
