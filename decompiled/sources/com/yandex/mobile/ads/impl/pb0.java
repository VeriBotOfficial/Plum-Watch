package com.yandex.mobile.ads.impl;

/* loaded from: classes5.dex */
final class pb0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f16542a;
        public final int[] b;
        public final int c;
        public final long[] d;
        public final int[] e;
        public final long f;

        private a(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f16542a = jArr;
            this.b = iArr;
            this.c = i;
            this.d = jArr2;
            this.e = iArr2;
            this.f = j;
        }
    }

    public static a a(int i, long[] jArr, int[] iArr, long j) {
        int i2;
        int i3 = 8192 / i;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i6 = iArr[i4];
            int i7 = f92.f15466a;
            i5 += ((i6 + i3) - 1) / i3;
            i4++;
        }
        long[] jArr2 = new long[i5];
        int[] iArr2 = new int[i5];
        long[] jArr3 = new long[i5];
        int[] iArr3 = new int[i5];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            long j2 = jArr[i11];
            while (i12 > 0) {
                int min = Math.min(i3, i12);
                jArr2[i9] = j2;
                int i13 = i * min;
                iArr2[i9] = i13;
                i10 = Math.max(i10, i13);
                int i14 = i2;
                jArr3[i9] = i8 * j;
                iArr3[i9] = i14;
                j2 += iArr2[i9];
                i8 += min;
                i12 -= min;
                i9++;
                i2 = i14;
                jArr2 = jArr2;
            }
        }
        return new a(jArr2, iArr2, i10, jArr3, iArr3, j * i8);
    }
}
