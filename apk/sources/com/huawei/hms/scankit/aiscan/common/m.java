package com.huawei.hms.scankit.aiscan.common;

/* JADX INFO: compiled from: LuminanceSource.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10521a;
    private final int b;

    protected m(int r1, int r2) {
        this.f10521a = r1;
        this.b = r2;
    }

    public final int a() {
        return this.b;
    }

    public abstract m a(int r1, int r2, int r3, int r4);

    public abstract byte[] a(int r1, byte[] bArr);

    public abstract m b(int r1, int r2, int r3, int r4);

    public abstract byte[] b();

    public final int c() {
        return this.f10521a;
    }

    public final String toString() {
        char c;
        int r0 = this.f10521a;
        byte[] bArrA = new byte[r0];
        StringBuilder sb = new StringBuilder(this.b * (r0 + 1));
        for (int r3 = 0; r3 < this.b; r3++) {
            bArrA = a(r3, bArrA);
            for (int r4 = 0; r4 < this.f10521a; r4++) {
                int r5 = bArrA[r4] & 255;
                if (r5 < 64) {
                    c = '#';
                } else if (r5 < 128) {
                    c = '+';
                } else {
                    c = r5 < 192 ? '.' : ' ';
                }
                sb.append(c);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
