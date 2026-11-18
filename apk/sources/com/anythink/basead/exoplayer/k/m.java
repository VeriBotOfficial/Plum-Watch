package com.anythink.basead.exoplayer.k;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f2683a = 32;
    private int b;
    private long[] c;

    public m() {
        this((byte) 0);
    }

    private m(byte b) {
        this.c = new long[32];
    }

    private void a(long j) {
        int r0 = this.b;
        long[] jArr = this.c;
        if (r0 == jArr.length) {
            this.c = Arrays.copyOf(jArr, r0 * 2);
        }
        long[] jArr2 = this.c;
        int r1 = this.b;
        this.b = r1 + 1;
        jArr2[r1] = j;
    }

    private long a(int r4) {
        if (r4 < 0 || r4 >= this.b) {
            throw new IndexOutOfBoundsException("Invalid index " + r4 + ", size is " + this.b);
        }
        return this.c[r4];
    }

    private int a() {
        return this.b;
    }

    private long[] b() {
        return Arrays.copyOf(this.c, this.b);
    }
}
