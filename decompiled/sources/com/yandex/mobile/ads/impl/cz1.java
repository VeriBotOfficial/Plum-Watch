package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.i52;
import com.yandex.mobile.ads.impl.jw0;

/* loaded from: classes5.dex */
public final class cz1 extends i52 {
    private static final Object p = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final Object m;
    private final jw0 n;
    private final jw0.e o;

    static {
        new jw0.a().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int b() {
        return 1;
    }

    public cz1(long j, long j2, boolean z, jw0 jw0Var, jw0.e eVar) {
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j;
        this.g = j2;
        this.h = 0L;
        this.i = 0L;
        this.j = z;
        this.k = false;
        this.l = false;
        this.m = null;
        this.n = (jw0) hg.a(jw0Var);
        this.o = eVar;
    }

    public cz1(long j, long j2, boolean z, boolean z2, jw0 jw0Var) {
        this(j, j2, z, jw0Var, z2 ? jw0Var.d : null);
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final i52.b a(int i, i52.b bVar, boolean z) {
        hg.a(i, 1);
        Object obj = z ? p : null;
        long j = this.f;
        long j2 = -this.h;
        bVar.getClass();
        return bVar.a(null, obj, 0, j, j2, n5.h, false);
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final Object a(int i) {
        hg.a(i, 1);
        return p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // com.yandex.mobile.ads.impl.i52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.i52.d a(int r25, com.yandex.mobile.ads.impl.i52.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.yandex.mobile.ads.impl.hg.a(r2, r1)
            long r1 = r0.i
            boolean r14 = r0.k
            if (r14 == 0) goto L2d
            boolean r3 = r0.l
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
        L2a:
            r16 = r5
            goto L2f
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.yandex.mobile.ads.impl.i52.d.s
            com.yandex.mobile.ads.impl.jw0 r5 = r0.n
            java.lang.Object r6 = r0.m
            long r7 = r0.c
            long r9 = r0.d
            long r11 = r0.e
            boolean r13 = r0.j
            com.yandex.mobile.ads.impl.jw0$e r15 = r0.o
            long r1 = r0.g
            r18 = r1
            long r1 = r0.h
            r20 = 0
            r21 = 0
            r3 = r26
            r22 = r1
            com.yandex.mobile.ads.impl.i52$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cz1.a(int, com.yandex.mobile.ads.impl.i52$d, long):com.yandex.mobile.ads.impl.i52$d");
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int a(Object obj) {
        return p.equals(obj) ? 0 : -1;
    }
}
