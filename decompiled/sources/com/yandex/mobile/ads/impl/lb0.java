package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class lb0 {
    private boolean c;
    private int e;

    /* renamed from: a, reason: collision with root package name */
    private a f16095a = new a();
    private a b = new a();
    private long d = -9223372036854775807L;

    public final long a() {
        if (!this.f16095a.a()) {
            return -9223372036854775807L;
        }
        a aVar = this.f16095a;
        long j = aVar.e;
        if (j == 0) {
            return 0L;
        }
        return aVar.f / j;
    }

    public final float b() {
        if (!this.f16095a.a()) {
            return -1.0f;
        }
        return (float) (1.0E9d / (this.f16095a.e != 0 ? r0.f / r1 : 0L));
    }

    public final long d() {
        if (this.f16095a.a()) {
            return this.f16095a.f;
        }
        return -9223372036854775807L;
    }

    public final void f() {
        a aVar = this.f16095a;
        aVar.d = 0L;
        aVar.e = 0L;
        aVar.f = 0L;
        aVar.h = 0;
        Arrays.fill(aVar.g, false);
        a aVar2 = this.b;
        aVar2.d = 0L;
        aVar2.e = 0L;
        aVar2.f = 0L;
        aVar2.h = 0;
        Arrays.fill(aVar2.g, false);
        this.c = false;
        this.d = -9223372036854775807L;
        this.e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.g[(int) ((r5 - 1) % 15)] == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10) {
        /*
            r9 = this;
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.f16095a
            r0.a(r10)
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.f16095a
            boolean r0 = r0.a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            r9.c = r2
            goto L60
        L12:
            long r3 = r9.d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L60
            boolean r0 = r9.c
            r3 = 0
            if (r0 == 0) goto L3d
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.b
            long r5 = com.yandex.mobile.ads.impl.lb0.a.m13311$$Nest$fgetd(r0)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L2e
            goto L59
        L2e:
            boolean[] r0 = com.yandex.mobile.ads.impl.lb0.a.m13314$$Nest$fgetg(r0)
            r7 = 1
            long r5 = r5 - r7
            r7 = 15
            long r5 = r5 % r7
            int r5 = (int) r5
            boolean r0 = r0[r5]
            if (r0 == 0) goto L59
        L3d:
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.b
            com.yandex.mobile.ads.impl.lb0.a.m13315$$Nest$fputd(r0, r3)
            com.yandex.mobile.ads.impl.lb0.a.m13316$$Nest$fpute(r0, r3)
            com.yandex.mobile.ads.impl.lb0.a.m13317$$Nest$fputf(r0, r3)
            com.yandex.mobile.ads.impl.lb0.a.m13318$$Nest$fputh(r0, r2)
            boolean[] r0 = com.yandex.mobile.ads.impl.lb0.a.m13314$$Nest$fgetg(r0)
            java.util.Arrays.fill(r0, r2)
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.b
            long r3 = r9.d
            r0.a(r3)
        L59:
            r9.c = r1
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.b
            r0.a(r10)
        L60:
            boolean r0 = r9.c
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L76
            com.yandex.mobile.ads.impl.lb0$a r0 = r9.f16095a
            com.yandex.mobile.ads.impl.lb0$a r3 = r9.b
            r9.f16095a = r3
            r9.b = r0
            r9.c = r2
        L76:
            r9.d = r10
            com.yandex.mobile.ads.impl.lb0$a r10 = r9.f16095a
            boolean r10 = r10.a()
            if (r10 == 0) goto L81
            goto L85
        L81:
            int r10 = r9.e
            int r2 = r10 + 1
        L85:
            r9.e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lb0.a(long):void");
    }

    public final boolean e() {
        return this.f16095a.a();
    }

    public final int c() {
        return this.e;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f16096a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private final boolean[] g = new boolean[15];
        private int h;

        public final boolean a() {
            return this.d > 15 && this.h == 0;
        }

        public final void a(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f16096a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f16096a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int i = (int) (j2 % 15);
                if (Math.abs(j4 - this.b) <= 1000000) {
                    this.e++;
                    this.f += j4;
                    boolean[] zArr = this.g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.h--;
                    }
                } else {
                    boolean[] zArr2 = this.g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.h++;
                    }
                }
            }
            this.d++;
            this.c = j;
        }
    }
}
