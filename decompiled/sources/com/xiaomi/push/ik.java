package com.xiaomi.push;

/* loaded from: classes4.dex */
public final class ik extends il {

    /* renamed from: a, reason: collision with root package name */
    private int f14681a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f923a;
    private int b;

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public void b(byte[] bArr, int i, int i2) {
        this.f923a = bArr;
        this.f14681a = i;
        this.b = i + i2;
    }

    @Override // com.xiaomi.push.il
    public int a(byte[] bArr, int i, int i2) {
        int b = b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f923a, this.f14681a, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.il
    /* renamed from: a */
    public void mo12353a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.il
    public byte[] a() {
        return this.f923a;
    }

    @Override // com.xiaomi.push.il
    public int a_() {
        return this.f14681a;
    }

    @Override // com.xiaomi.push.il
    public int b() {
        return this.b - this.f14681a;
    }

    @Override // com.xiaomi.push.il
    public void a(int i) {
        this.f14681a += i;
    }
}
