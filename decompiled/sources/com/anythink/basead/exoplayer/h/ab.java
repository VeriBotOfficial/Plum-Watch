package com.anythink.basead.exoplayer.h;

import com.anythink.basead.exoplayer.ae;

/* loaded from: classes11.dex */
public final class ab extends com.anythink.basead.exoplayer.ae {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final Object k;

    @Override // com.anythink.basead.exoplayer.ae
    public final int b() {
        return 1;
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int c() {
        return 1;
    }

    private ab(long j, boolean z, boolean z2) {
        this(j, z, z2, null);
    }

    public ab(long j, boolean z, boolean z2, Object obj) {
        this(j, j, z, z2, obj, (byte) 0);
    }

    private ab(long j, long j2, boolean z, boolean z2, Object obj, byte b2) {
        this(j, j2, z, z2, obj);
    }

    private ab(long j, long j2, boolean z, boolean z2, Object obj) {
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = j;
        this.f = j2;
        this.g = 0L;
        this.h = 0L;
        this.i = z;
        this.j = z2;
        this.k = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r1 > r4) goto L12;
     */
    @Override // com.anythink.basead.exoplayer.ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.anythink.basead.exoplayer.ae.b a(int r17, com.anythink.basead.exoplayer.ae.b r18, boolean r19, long r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = r17
            com.anythink.basead.exoplayer.k.a.a(r2, r1)
            if (r19 == 0) goto Ld
            java.lang.Object r1 = r0.k
            goto Le
        Ld:
            r1 = 0
        Le:
            r3 = r1
            long r1 = r0.h
            boolean r9 = r0.j
            if (r9 == 0) goto L2f
            r4 = 0
            int r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r4 == 0) goto L2f
            long r4 = r0.f
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L28
        L26:
            r10 = r6
            goto L30
        L28:
            long r1 = r1 + r20
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L2f
            goto L26
        L2f:
            r10 = r1
        L30:
            long r4 = r0.c
            long r6 = r0.d
            boolean r8 = r0.i
            long r12 = r0.f
            long r14 = r0.g
            r2 = r18
            com.anythink.basead.exoplayer.ae$b r1 = r2.a(r3, r4, r6, r8, r9, r10, r12, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.h.ab.a(int, com.anythink.basead.exoplayer.ae$b, boolean, long):com.anythink.basead.exoplayer.ae$b");
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final ae.a a(int i, ae.a aVar, boolean z) {
        com.anythink.basead.exoplayer.k.a.a(i, 1);
        return aVar.a(null, z ? b : null, this.e, -this.g);
    }

    @Override // com.anythink.basead.exoplayer.ae
    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }
}
