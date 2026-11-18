package com.huawei.hms.scankit.p;

import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.scankit.p.cc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultPlacement.java */
/* JADX INFO: loaded from: classes11.dex */
public class C3737cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f10630a;
    private final int b;
    private final int c;
    private final byte[] d;

    public C3737cc(CharSequence charSequence, int r2, int r3) {
        this.f10630a = charSequence;
        this.c = r2;
        this.b = r3;
        byte[] bArr = new byte[r2 * r3];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private boolean b(int r3, int r4) {
        return this.d[(r4 * this.c) + r3] >= 0;
    }

    private void c(int r7) {
        a(this.b - 3, 0, r7, 1);
        a(this.b - 2, 0, r7, 2);
        a(this.b - 1, 0, r7, 3);
        a(0, this.c - 2, r7, 4);
        a(0, this.c - 1, r7, 5);
        a(1, this.c - 1, r7, 6);
        a(2, this.c - 1, r7, 7);
        a(3, this.c - 1, r7, 8);
    }

    private void d(int r7) {
        a(this.b - 1, 0, r7, 1);
        a(this.b - 1, this.c - 1, r7, 2);
        a(0, this.c - 3, r7, 3);
        a(0, this.c - 2, r7, 4);
        a(0, this.c - 1, r7, 5);
        a(1, this.c - 3, r7, 6);
        a(1, this.c - 2, r7, 7);
        a(1, this.c - 1, r7, 8);
    }

    public final boolean a(int r3, int r4) {
        return this.d[(r4 * this.c) + r3] == 1;
    }

    private void a(int r3, int r4, boolean z) {
        this.d[(r4 * this.c) + r3] = z ? (byte) 1 : (byte) 0;
    }

    private void b(int r7) {
        a(this.b - 3, 0, r7, 1);
        a(this.b - 2, 0, r7, 2);
        a(this.b - 1, 0, r7, 3);
        a(0, this.c - 4, r7, 4);
        a(0, this.c - 3, r7, 5);
        a(0, this.c - 2, r7, 6);
        a(0, this.c - 1, r7, 7);
        a(1, this.c - 1, r7, 8);
    }

    public final void a() {
        int r7;
        int r4;
        int r0 = 0;
        int r2 = 0;
        int r3 = 4;
        while (true) {
            if (r3 == this.b && r0 == 0) {
                a(r2);
                r2++;
            }
            if (r3 == this.b - 2 && r0 == 0 && this.c % 4 != 0) {
                b(r2);
                r2++;
            }
            if (r3 == this.b - 2 && r0 == 0 && this.c % 8 == 4) {
                c(r2);
                r2++;
            }
            if (r3 == this.b + 4 && r0 == 2 && this.c % 8 == 0) {
                d(r2);
                r2++;
            }
            while (true) {
                if (r3 < this.b && r0 >= 0 && !b(r0, r3)) {
                    a(r3, r0, r2);
                    r2++;
                }
                int r5 = r3 - 2;
                int r6 = r0 + 2;
                if (r5 < 0 || r6 >= this.c) {
                    break;
                }
                r3 = r5;
                r0 = r6;
            }
            int r8 = r3 - 1;
            int r1 = r0 + 5;
            while (true) {
                if (r8 >= 0 && r1 < this.c && !b(r1, r8)) {
                    a(r8, r1, r2);
                    r2++;
                }
                int r9 = r8 + 2;
                int r10 = r1 - 2;
                r7 = this.b;
                if (r9 >= r7 || r10 < 0) {
                    break;
                }
                r8 = r9;
                r1 = r10;
            }
            r3 = r8 + 5;
            r0 = r1 - 1;
            if (r3 >= r7 && r0 >= (r4 = this.c)) {
                break;
            }
        }
        if (b(r4 - 1, r7 - 1)) {
            return;
        }
        a(this.c - 1, this.b - 1, true);
        a(this.c - 2, this.b - 2, true);
    }

    private void a(int r2, int r3, int r4, int r5) {
        if (r2 < 0) {
            int r0 = this.b;
            r2 += r0;
            r3 += 4 - ((r0 + 4) % 8);
        }
        if (r3 < 0) {
            int r1 = this.c;
            r3 += r1;
            r2 += 4 - ((r1 + 4) % 8);
        }
        a(r3, r2, (this.f10630a.charAt(r4) & (1 << (8 - r5))) != 0);
    }

    private void a(int r5, int r6, int r7) {
        int r0 = r5 - 2;
        int r1 = r6 - 2;
        a(r0, r1, r7, 1);
        int r2 = r6 - 1;
        a(r0, r2, r7, 2);
        int r3 = r5 - 1;
        a(r3, r1, r7, 3);
        a(r3, r2, r7, 4);
        a(r3, r6, r7, 5);
        a(r5, r1, r7, 6);
        a(r5, r2, r7, 7);
        a(r5, r6, r7, 8);
    }

    private void a(int r7) {
        a(this.b - 1, 0, r7, 1);
        a(this.b - 1, 1, r7, 2);
        a(this.b - 1, 2, r7, 3);
        a(0, this.c - 2, r7, 4);
        a(0, this.c - 1, r7, 5);
        a(1, this.c - 1, r7, 6);
        a(2, this.c - 1, r7, 7);
        a(3, this.c - 1, r7, 8);
    }
}
