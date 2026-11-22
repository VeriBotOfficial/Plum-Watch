package com.huawei.hms.scankit.aiscan.common;

/* compiled from: LuminanceSource.java */
/* loaded from: classes14.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private final int f10521a;
    private final int b;

    protected m(int i, int i2) {
        this.f10521a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public abstract m a(int i, int i2, int i3, int i4);

    public abstract byte[] a(int i, byte[] bArr);

    public abstract m b(int i, int i2, int i3, int i4);

    public abstract byte[] b();

    public final int c() {
        return this.f10521a;
    }

    public final String toString() {
        int i = this.f10521a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder(this.b * (i + 1));
        for (int i2 = 0; i2 < this.b; i2++) {
            bArr = a(i2, bArr);
            for (int i3 = 0; i3 < this.f10521a; i3++) {
                int i4 = bArr[i3] & 255;
                sb.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
