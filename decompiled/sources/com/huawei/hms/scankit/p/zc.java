package com.huawei.hms.scankit.p;

/* compiled from: BarcodeRow.java */
/* loaded from: classes14.dex */
final class zc {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10706a;
    private int b = 0;

    zc(int i) {
        this.f10706a = new byte[i];
    }

    private void a(int i, boolean z) {
        if (!com.huawei.hms.scankit.util.b.a(this.f10706a, i)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f10706a[i] = z ? (byte) 1 : (byte) 0;
    }

    void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.b;
            this.b = i3 + 1;
            a(i3, z);
        }
    }

    byte[] a(int i) {
        int length = this.f10706a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f10706a[i2 / i];
        }
        return bArr;
    }
}
