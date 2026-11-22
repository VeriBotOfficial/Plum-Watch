package com.anythink.basead.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes11.dex */
public interface aa {
    int a();

    int a(int i);

    aa a(int i, int i2);

    int b();

    int b(int i);

    int c();

    aa c(int i);

    aa d();

    public static class a implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final Random f2528a;
        private final int[] b;
        private final int[] c;

        public a() {
            this(0, new Random());
        }

        private a(int i, long j) {
            this(i, new Random(j));
        }

        private a(int i, Random random) {
            this(a(i, random), random);
        }

        private a(int[] iArr, Random random) {
            this.b = iArr;
            this.f2528a = random;
            this.c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.c[iArr[i]] = i;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.b.length;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i2 = this.c[i] + 1;
            int[] iArr = this.b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i2 = this.c[i] - 1;
            if (i2 >= 0) {
                return this.b[i2];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            int[] iArr = this.b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f2528a.nextInt(this.b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f2528a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new a(iArr3, new Random(this.f2528a.nextLong()));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            int[] iArr = new int[this.b.length - 1];
            int i2 = 0;
            boolean z = false;
            while (true) {
                int[] iArr2 = this.b;
                if (i2 < iArr2.length) {
                    int i3 = iArr2[i2];
                    if (i3 == i) {
                        z = true;
                    } else {
                        int i4 = z ? i2 - 1 : i2;
                        if (i3 > i) {
                            i3--;
                        }
                        iArr[i4] = i3;
                    }
                    i2++;
                } else {
                    return new a(iArr, new Random(this.f2528a.nextLong()));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f2528a.nextLong()));
        }

        private static int[] a(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }
    }

    public static final class b implements aa {

        /* renamed from: a, reason: collision with root package name */
        private final int f2529a;

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        public b(int i) {
            this.f2529a = i;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f2529a;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int i) {
            int i2 = i + 1;
            if (i2 < this.f2529a) {
                return i2;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int i = this.f2529a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            return this.f2529a > 0 ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int i, int i2) {
            return new b(this.f2529a + i2);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int i) {
            return new b(this.f2529a - 1);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }
    }
}
