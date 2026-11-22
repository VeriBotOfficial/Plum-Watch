package com.anythink.basead.exoplayer.j.a;

import android.net.Uri;
import com.anythink.basead.exoplayer.j.a.a;
import com.anythink.basead.exoplayer.k.v;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2625a = 131072;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public volatile long f2626a;
        public volatile long b;
        public volatile long c = -1;

        private long a() {
            return this.f2626a + this.b;
        }
    }

    private static String a(Uri uri) {
        return uri.toString();
    }

    public static String a(com.anythink.basead.exoplayer.j.k kVar) {
        return kVar.h != null ? kVar.h : kVar.c.toString();
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, a aVar2) {
        com.anythink.basead.exoplayer.j.a.a aVar3;
        long b;
        String a2 = a(kVar);
        long j = kVar.e;
        if (kVar.g != -1) {
            b = kVar.g;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            b = aVar3.b(a2);
        }
        aVar2.c = b;
        aVar2.f2626a = 0L;
        aVar2.b = 0L;
        long j2 = b;
        while (j2 != 0) {
            long b2 = aVar3.b(a2, j, j2 != -1 ? j2 : Long.MAX_VALUE);
            if (b2 > 0) {
                aVar2.f2626a += b2;
            } else {
                b2 = -b2;
                if (b2 == Long.MAX_VALUE) {
                    return;
                }
            }
            j += b2;
            if (j2 == -1) {
                b2 = 0;
            }
            j2 -= b2;
            aVar3 = aVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, com.anythink.basead.exoplayer.j.h hVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j;
        c cVar;
        a aVar3;
        long j2;
        byte[] bArr;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        a aVar5 = aVar2;
        c cVar2 = new c(aVar4, hVar);
        byte[] bArr2 = new byte[131072];
        com.anythink.basead.exoplayer.k.a.a(cVar2);
        com.anythink.basead.exoplayer.k.a.a(bArr2);
        if (aVar5 == null) {
            j = Long.MAX_VALUE;
            aVar5 = new a();
        } else {
            String a2 = a(kVar2);
            long j3 = kVar2.e;
            long b = kVar2.g != -1 ? kVar2.g : aVar4.b(a2);
            aVar5.c = b;
            aVar5.f2626a = 0L;
            aVar5.b = 0L;
            long j4 = b;
            while (true) {
                if (j4 == 0) {
                    j = Long.MAX_VALUE;
                    break;
                }
                long b2 = aVar4.b(a2, j3, j4 != -1 ? j4 : Long.MAX_VALUE);
                if (b2 <= 0) {
                    j = Long.MAX_VALUE;
                    b2 = -b2;
                    if (b2 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar5.f2626a += b2;
                }
                j3 += b2;
                if (j4 == -1) {
                    b2 = 0;
                }
                j4 -= b2;
            }
        }
        String a3 = a(kVar2);
        long j5 = kVar2.e;
        long b3 = kVar2.g != -1 ? kVar2.g : aVar4.b(a3);
        while (b3 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b4 = aVar4.b(a3, j5, b3 != -1 ? b3 : j);
            String str = a3;
            long j6 = j5;
            if (b4 <= 0) {
                long j7 = -b4;
                c cVar3 = cVar2;
                a aVar6 = aVar5;
                byte[] bArr3 = bArr2;
                long a4 = a(kVar2, j6, j7, cVar3, bArr3, (v) null, aVar6);
                aVar3 = aVar6;
                j2 = j6;
                cVar = cVar3;
                bArr = bArr3;
                if (a4 < j7) {
                    return;
                } else {
                    b4 = j7;
                }
            } else {
                cVar = cVar2;
                aVar3 = aVar5;
                j2 = j6;
                bArr = bArr2;
            }
            j5 = j2 + b4;
            if (b3 == -1) {
                b4 = 0;
            }
            b3 -= b4;
            cVar2 = cVar;
            bArr2 = bArr;
            aVar5 = aVar3;
            a3 = str;
            kVar2 = kVar;
            aVar4 = aVar;
        }
    }

    private static void a(com.anythink.basead.exoplayer.j.k kVar, com.anythink.basead.exoplayer.j.a.a aVar, c cVar, byte[] bArr, v vVar, a aVar2, AtomicBoolean atomicBoolean) {
        long j;
        a aVar3;
        com.anythink.basead.exoplayer.j.k kVar2 = kVar;
        com.anythink.basead.exoplayer.j.a.a aVar4 = aVar;
        com.anythink.basead.exoplayer.k.a.a(cVar);
        com.anythink.basead.exoplayer.k.a.a(bArr);
        if (aVar2 == null) {
            j = Long.MAX_VALUE;
            aVar3 = new a();
        } else {
            String a2 = a(kVar2);
            long j2 = kVar2.e;
            long b = kVar2.g != -1 ? kVar2.g : aVar4.b(a2);
            aVar2.c = b;
            aVar2.f2626a = 0L;
            aVar2.b = 0L;
            long j3 = b;
            while (true) {
                if (j3 == 0) {
                    j = Long.MAX_VALUE;
                    break;
                }
                long b2 = aVar4.b(a2, j2, j3 != -1 ? j3 : Long.MAX_VALUE);
                if (b2 <= 0) {
                    j = Long.MAX_VALUE;
                    b2 = -b2;
                    if (b2 == Long.MAX_VALUE) {
                        break;
                    }
                } else {
                    aVar2.f2626a += b2;
                }
                j2 += b2;
                if (j3 == -1) {
                    b2 = 0;
                }
                j3 -= b2;
            }
            aVar3 = aVar2;
        }
        String a3 = a(kVar2);
        long j4 = kVar2.e;
        long b3 = kVar2.g != -1 ? kVar2.g : aVar4.b(a3);
        while (b3 != 0) {
            if (atomicBoolean != null && atomicBoolean.get()) {
                throw new InterruptedException();
            }
            long b4 = aVar4.b(a3, j4, b3 != -1 ? b3 : j);
            String str = a3;
            long j5 = j4;
            if (b4 <= 0) {
                long j6 = -b4;
                if (a(kVar2, j5, j6, cVar, bArr, vVar, aVar3) < j6) {
                    return;
                } else {
                    b4 = j6;
                }
            }
            j4 = j5 + b4;
            if (b3 == -1) {
                b4 = 0;
            }
            b3 -= b4;
            kVar2 = kVar;
            aVar4 = aVar;
            a3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long a(com.anythink.basead.exoplayer.j.k r16, long r17, long r19, com.anythink.basead.exoplayer.j.h r21, byte[] r22, com.anythink.basead.exoplayer.k.v r23, com.anythink.basead.exoplayer.j.a.f.a r24) {
        /*
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r16
        L8:
            if (r23 == 0) goto Ld
            r23.b()
        Ld:
            boolean r4 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            if (r4 != 0) goto L86
            com.anythink.basead.exoplayer.j.k r5 = new com.anythink.basead.exoplayer.j.k     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            android.net.Uri r6 = r3.c     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            byte[] r7 = r3.d     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            long r8 = r3.f     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            long r8 = r8 + r17
            long r10 = r3.e     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            long r10 = r8 - r10
            java.lang.String r14 = r3.h     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            int r4 = r3.i     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            r15 = r4 | 2
            r12 = -1
            r8 = r17
            r5.<init>(r6, r7, r8, r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            long r3 = r1.a(r5)     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r6 = r2.c     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            r8 = -1
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L43
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            long r6 = r5.e     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r6 = r6 + r3
            r2.c = r6     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
        L43:
            r3 = 0
        L45:
            int r6 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r6 == 0) goto L80
            boolean r6 = java.lang.Thread.interrupted()     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            if (r6 != 0) goto L7a
            int r6 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r6 == 0) goto L5d
            int r6 = r0.length     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r6 = (long) r6     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r10 = r19 - r3
            long r6 = java.lang.Math.min(r6, r10)     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            int r6 = (int) r6     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            goto L5e
        L5d:
            int r6 = r0.length     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
        L5e:
            r7 = 0
            int r6 = r1.a(r0, r7, r6)     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            r7 = -1
            if (r6 != r7) goto L72
            long r6 = r2.c     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L80
            long r6 = r5.e     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r6 = r6 + r3
            r2.c = r6     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            goto L80
        L72:
            long r6 = (long) r6     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r3 = r3 + r6
            long r10 = r2.b     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            long r10 = r10 + r6
            r2.b = r10     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            goto L45
        L7a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            r3.<init>()     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
            throw r3     // Catch: com.anythink.basead.exoplayer.k.v.a -> L84 java.lang.Throwable -> L8c
        L80:
            com.anythink.basead.exoplayer.k.af.a(r1)
            return r3
        L84:
            r3 = r5
            goto L91
        L86:
            java.lang.InterruptedException r4 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            r4.<init>()     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
            throw r4     // Catch: java.lang.Throwable -> L8c com.anythink.basead.exoplayer.k.v.a -> L91
        L8c:
            r0 = move-exception
            com.anythink.basead.exoplayer.k.af.a(r1)
            throw r0
        L91:
            com.anythink.basead.exoplayer.k.af.a(r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.j.a.f.a(com.anythink.basead.exoplayer.j.k, long, long, com.anythink.basead.exoplayer.j.h, byte[], com.anythink.basead.exoplayer.k.v, com.anythink.basead.exoplayer.j.a.f$a):long");
    }

    private static void a(com.anythink.basead.exoplayer.j.a.a aVar, String str) {
        Iterator<e> it = aVar.a(str).iterator();
        while (it.hasNext()) {
            try {
                aVar.b(it.next());
            } catch (a.C0150a unused) {
            }
        }
    }

    private f() {
    }
}
