package com.xiaomi.push;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14414a = new a(new byte[0]);

    /* renamed from: a, reason: collision with other field name */
    private volatile int f167a = 0;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f168a;

    private a(byte[] bArr) {
        this.f168a = bArr;
    }

    public int a() {
        return this.f168a.length;
    }

    public static a a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new a(bArr2);
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m11860a() {
        byte[] bArr = this.f168a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f168a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f168a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f167a;
        if (i != 0) {
            return i;
        }
        byte[] bArr = this.f168a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            length = 1;
        }
        this.f167a = length;
        return length;
    }
}
