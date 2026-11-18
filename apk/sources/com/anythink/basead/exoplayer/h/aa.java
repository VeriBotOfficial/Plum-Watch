package com.anythink.basead.exoplayer.h;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public interface aa {
    int a();

    int a(int r1);

    aa a(int r1, int r2);

    int b();

    int b(int r1);

    int c();

    aa c(int r1);

    aa d();

    public static class a implements aa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f2529a;
        private final int[] b;
        private final int[] c;

        public a() {
            this(0, new Random());
        }

        private a(int r2, long j) {
            this(r2, new Random(j));
        }

        private a(int r1, Random random) {
            this(a(r1, random), random);
        }

        private a(int[] r3, Random random) {
            this.b = r3;
            this.f2529a = random;
            this.c = new int[r3.length];
            for (int r4 = 0; r4 < r3.length; r4++) {
                this.c[r3[r4]] = r4;
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.b.length;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int r3) {
            int r4 = this.c[r3] + 1;
            int[] r0 = this.b;
            if (r4 < r0.length) {
                return r0[r4];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int r2) {
            int r3 = this.c[r2] - 1;
            if (r3 >= 0) {
                return this.b[r3];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int[] r0 = this.b;
            if (r0.length > 0) {
                return r0[r0.length - 1];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            int[] r0 = this.b;
            if (r0.length > 0) {
                return r0[0];
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int r9, int r10) {
            int[] r0 = new int[r10];
            int[] r1 = new int[r10];
            int r2 = 0;
            int r3 = 0;
            while (r3 < r10) {
                r0[r3] = this.f2529a.nextInt(this.b.length + 1);
                int r5 = r3 + 1;
                int r4 = this.f2529a.nextInt(r5);
                r1[r3] = r1[r4];
                r1[r4] = r3 + r9;
                r3 = r5;
            }
            Arrays.sort(r0);
            int[] r6 = new int[this.b.length + r10];
            int r7 = 0;
            int r8 = 0;
            while (true) {
                int[] r11 = this.b;
                if (r2 < r11.length + r10) {
                    if (r7 < r10 && r8 == r0[r7]) {
                        r6[r2] = r1[r7];
                        r7++;
                    } else {
                        int r12 = r8 + 1;
                        int r13 = r11[r8];
                        r6[r2] = r13;
                        if (r13 >= r9) {
                            r6[r2] = r13 + r10;
                        }
                        r8 = r12;
                    }
                    r2++;
                } else {
                    return new a(r6, new Random(this.f2529a.nextLong()));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int r7) {
            int[] r0 = new int[this.b.length - 1];
            int r2 = 0;
            boolean z = false;
            while (true) {
                int[] r4 = this.b;
                if (r2 < r4.length) {
                    int r5 = r4[r2];
                    if (r5 == r7) {
                        z = true;
                    } else {
                        int r6 = z ? r2 - 1 : r2;
                        if (r5 > r7) {
                            r5--;
                        }
                        r0[r6] = r5;
                    }
                    r2++;
                } else {
                    return new a(r0, new Random(this.f2529a.nextLong()));
                }
            }
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new a(0, new Random(this.f2529a.nextLong()));
        }

        private static int[] a(int r5, Random random) {
            int[] r0 = new int[r5];
            int r1 = 0;
            while (r1 < r5) {
                int r2 = r1 + 1;
                int r3 = random.nextInt(r2);
                r0[r1] = r0[r3];
                r0[r3] = r1;
                r1 = r2;
            }
            return r0;
        }
    }

    public static final class b implements aa {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2530a;

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b(int r2) {
            int r3 = r2 - 1;
            if (r3 >= 0) {
                return r3;
            }
            return -1;
        }

        public b(int r1) {
            this.f2530a = r1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a() {
            return this.f2530a;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int a(int r2) {
            int r3 = r2 + 1;
            if (r3 < this.f2530a) {
                return r3;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int b() {
            int r0 = this.f2530a;
            if (r0 > 0) {
                return r0 - 1;
            }
            return -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final int c() {
            return this.f2530a > 0 ? 0 : -1;
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa a(int r2, int r3) {
            return new b(this.f2530a + r3);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa c(int r2) {
            return new b(this.f2530a - 1);
        }

        @Override // com.anythink.basead.exoplayer.h.aa
        public final aa d() {
            return new b(0);
        }
    }
}
