package com.umeng.analytics.pro;

/* compiled from: TMemoryInputTransport.java */
/* loaded from: classes2.dex */
public final class cf extends cg {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f13828a;
    private int b;
    private int c;

    @Override // com.umeng.analytics.pro.cg
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.cg
    public void b() throws ch {
    }

    @Override // com.umeng.analytics.pro.cg
    public void c() {
    }

    public cf() {
    }

    public cf(byte[] bArr) {
        a(bArr);
    }

    public cf(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public void a(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public void c(byte[] bArr, int i, int i2) {
        this.f13828a = bArr;
        this.b = i;
        this.c = i + i2;
    }

    public void e() {
        this.f13828a = null;
    }

    @Override // com.umeng.analytics.pro.cg
    public int a(byte[] bArr, int i, int i2) throws ch {
        int h = h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f13828a, this.b, bArr, i, i2);
            a(i2);
        }
        return i2;
    }

    @Override // com.umeng.analytics.pro.cg
    public void b(byte[] bArr, int i, int i2) throws ch {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.analytics.pro.cg
    public byte[] f() {
        return this.f13828a;
    }

    @Override // com.umeng.analytics.pro.cg
    public int g() {
        return this.b;
    }

    @Override // com.umeng.analytics.pro.cg
    public int h() {
        return this.c - this.b;
    }

    @Override // com.umeng.analytics.pro.cg
    public void a(int i) {
        this.b += i;
    }
}
