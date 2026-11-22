package com.xiaomi.push;

/* loaded from: classes4.dex */
public class ij extends il {

    /* renamed from: a, reason: collision with root package name */
    private int f14680a;

    /* renamed from: a, reason: collision with other field name */
    private ht f922a;

    public ij(int i) {
        this.f922a = new ht(i);
    }

    @Override // com.xiaomi.push.il
    public int a(byte[] bArr, int i, int i2) {
        byte[] m12331a = this.f922a.m12331a();
        if (i2 > this.f922a.a() - this.f14680a) {
            i2 = this.f922a.a() - this.f14680a;
        }
        if (i2 > 0) {
            System.arraycopy(m12331a, this.f14680a, bArr, i, i2);
            this.f14680a += i2;
        }
        return i2;
    }

    @Override // com.xiaomi.push.il
    /* renamed from: a */
    public void mo12353a(byte[] bArr, int i, int i2) {
        this.f922a.write(bArr, i, i2);
    }

    public int a() {
        return this.f922a.size();
    }
}
