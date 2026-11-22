package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.i52;

/* loaded from: classes5.dex */
public abstract class h extends i52 {
    private final int c;
    private final iy1 d;
    private final boolean e = false;

    protected abstract int b(int i);

    protected abstract int b(Object obj);

    protected abstract int c(int i);

    protected abstract Object d(int i);

    protected abstract int e(int i);

    protected abstract int f(int i);

    protected abstract i52 g(int i);

    public h(iy1 iy1Var) {
        this.d = iy1Var;
        this.c = iy1Var.b();
    }

    public static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object a(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int b(boolean z) {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int c = z ? this.d.c() : i - 1;
        while (g(c).c()) {
            if (z) {
                c = this.d.d(c);
            } else {
                c = c > 0 ? c - 1 : -1;
            }
            if (c == -1) {
                return -1;
            }
        }
        return g(c).b(z) + f(c);
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int a(boolean z) {
        if (this.c == 0) {
            return -1;
        }
        if (this.e) {
            z = false;
        }
        int a2 = z ? this.d.a() : 0;
        while (g(a2).c()) {
            if (z) {
                a2 = this.d.a(a2);
            } else {
                a2 = a2 < this.c + (-1) ? a2 + 1 : -1;
            }
            if (a2 == -1) {
                return -1;
            }
        }
        return g(a2).a(z) + f(a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x002f, code lost:
    
        if (r0 > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0033, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0033, code lost:
    
        r0 = r0 - 1;
     */
    @Override // com.yandex.mobile.ads.impl.i52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.e
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto Lb
            if (r8 != r2) goto La
            r8 = r3
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.i52 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r3) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.b(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.iy1 r7 = r6.d
            int r7 = r7.d(r0)
            r0 = r7
            goto L33
        L2f:
            if (r0 <= 0) goto L32
            goto L4a
        L32:
            r0 = r1
        L33:
            if (r0 == r1) goto L4c
            com.yandex.mobile.ads.impl.i52 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L4c
            if (r9 == 0) goto L48
            com.yandex.mobile.ads.impl.iy1 r7 = r6.d
            int r0 = r7.d(r0)
            goto L33
        L48:
            if (r0 <= 0) goto L32
        L4a:
            int r0 = r0 - r2
            goto L33
        L4c:
            if (r0 == r1) goto L5c
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.i52 r8 = r6.g(r0)
            int r8 = r8.b(r9)
            int r8 = r8 + r7
            return r8
        L5c:
            if (r8 != r3) goto L63
            int r7 = r6.b(r9)
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.h.b(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final int a(Object obj) {
        int a2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b = b(obj2);
        if (b == -1 || (a2 = g(b).a(obj3)) == -1) {
            return -1;
        }
        return e(b) + a2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0032, code lost:
    
        if (r0 < (r6.c - 1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0036, code lost:
    
        r0 = r0 + 1;
     */
    @Override // com.yandex.mobile.ads.impl.i52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.e
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto Lb
            if (r8 != r3) goto La
            r8 = r2
        La:
            r9 = r1
        Lb:
            int r0 = r6.c(r7)
            int r4 = r6.f(r0)
            com.yandex.mobile.ads.impl.i52 r5 = r6.g(r0)
            int r7 = r7 - r4
            if (r8 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r7 = r5.a(r7, r1, r9)
            r1 = -1
            if (r7 == r1) goto L25
            int r4 = r4 + r7
            return r4
        L25:
            if (r9 == 0) goto L2f
            com.yandex.mobile.ads.impl.iy1 r7 = r6.d
            int r7 = r7.a(r0)
            r0 = r7
            goto L36
        L2f:
            int r7 = r6.c
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
            goto L50
        L35:
            r0 = r1
        L36:
            if (r0 == r1) goto L52
            com.yandex.mobile.ads.impl.i52 r7 = r6.g(r0)
            boolean r7 = r7.c()
            if (r7 == 0) goto L52
            if (r9 == 0) goto L4b
            com.yandex.mobile.ads.impl.iy1 r7 = r6.d
            int r0 = r7.a(r0)
            goto L36
        L4b:
            int r7 = r6.c
            int r7 = r7 - r3
            if (r0 >= r7) goto L35
        L50:
            int r0 = r0 + r3
            goto L36
        L52:
            if (r0 == r1) goto L62
            int r7 = r6.f(r0)
            com.yandex.mobile.ads.impl.i52 r8 = r6.g(r0)
            int r8 = r8.a(r9)
            int r8 = r8 + r7
            return r8
        L62:
            if (r8 != r2) goto L69
            int r7 = r6.a(r9)
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.h.a(int, int, boolean):int");
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final i52.b a(int i, i52.b bVar, boolean z) {
        int b = b(i);
        int f = f(b);
        g(b).a(i - e(b), bVar, z);
        bVar.d += f;
        if (z) {
            Object d = d(b);
            Object obj = bVar.c;
            obj.getClass();
            bVar.c = Pair.create(d, obj);
        }
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final i52.b a(Object obj, i52.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int b = b(obj2);
        int f = f(b);
        g(b).a(obj3, bVar);
        bVar.d += f;
        bVar.c = obj;
        return bVar;
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final Object a(int i) {
        int b = b(i);
        return Pair.create(d(b), g(b).a(i - e(b)));
    }

    @Override // com.yandex.mobile.ads.impl.i52
    public final i52.d a(int i, i52.d dVar, long j) {
        int c = c(i);
        int f = f(c);
        int e = e(c);
        g(c).a(i - f, dVar, j);
        Object d = d(c);
        if (!i52.d.s.equals(dVar.b)) {
            d = Pair.create(d, dVar.b);
        }
        dVar.b = d;
        dVar.p += e;
        dVar.f15781q += e;
        return dVar;
    }
}
