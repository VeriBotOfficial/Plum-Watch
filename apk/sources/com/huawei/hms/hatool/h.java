package com.huawei.hms.hatool;

/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f10403a;
    private int b = 0;

    public h(int r2) {
        this.f10403a = null;
        this.f10403a = new byte[r2];
    }

    public void a(byte[] bArr, int r6) {
        if (r6 <= 0) {
            return;
        }
        byte[] bArr2 = this.f10403a;
        int length = bArr2.length;
        int r2 = this.b;
        if (length - r2 >= r6) {
            System.arraycopy(bArr, 0, bArr2, r2, r6);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + r6) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, r2);
            System.arraycopy(bArr, 0, bArr3, this.b, r6);
            this.f10403a = bArr3;
        }
        this.b += r6;
    }

    public byte[] a() {
        int r0 = this.b;
        if (r0 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[r0];
        System.arraycopy(this.f10403a, 0, bArr, 0, r0);
        return bArr;
    }

    public int b() {
        return this.b;
    }
}
