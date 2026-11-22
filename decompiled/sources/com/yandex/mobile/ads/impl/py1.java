package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qy;
import com.yandex.mobile.ads.impl.ry;
import com.yandex.mobile.ads.impl.sy;
import java.util.ArrayDeque;

/* loaded from: classes5.dex */
public abstract class py1<I extends ry, O extends sy, E extends qy> implements oy<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f16607a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private p32 j;
    private boolean k;
    private boolean l;

    final class a extends Thread {
        final /* synthetic */ py1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(uy1 uy1Var) {
            super("ExoPlayer:SimpleDecoder");
            this.b = uy1Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            py1 py1Var = this.b;
            py1Var.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (py1Var.e());
        }
    }

    protected abstract p32 a(ry ryVar, sy syVar, boolean z);

    protected abstract r32 c();

    protected abstract O d();

    @Override // com.yandex.mobile.ads.impl.oy
    public final Object a() throws qy {
        synchronized (this.b) {
            p32 p32Var = this.j;
            if (p32Var != null) {
                throw p32Var;
            }
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.removeFirst();
        }
    }

    @Override // com.yandex.mobile.ads.impl.oy
    public final Object b() throws qy {
        I i;
        synchronized (this.b) {
            p32 p32Var = this.j;
            if (p32Var != null) {
                throw p32Var;
            }
            if (this.i != null) {
                throw new IllegalStateException();
            }
            int i2 = this.g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.e;
                int i3 = i2 - 1;
                this.g = i3;
                i = iArr[i3];
            }
            this.i = i;
        }
        return i;
    }

    protected final void f() {
        int i = this.g;
        I[] iArr = this.e;
        if (i != iArr.length) {
            throw new IllegalStateException();
        }
        for (I i2 : iArr) {
            i2.e(1024);
        }
    }

    @Override // com.yandex.mobile.ads.impl.oy
    public final void a(r32 r32Var) throws qy {
        synchronized (this.b) {
            p32 p32Var = this.j;
            if (p32Var == null) {
                if (r32Var == this.i) {
                    this.c.addLast(r32Var);
                    if (!this.c.isEmpty() && this.h > 0) {
                        this.b.notify();
                    }
                    this.i = null;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw p32Var;
            }
        }
    }

    protected py1(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        a aVar = new a((uy1) this);
        this.f16607a = aVar;
        aVar.start();
    }

    @Override // com.yandex.mobile.ads.impl.oy
    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            I i = this.i;
            if (i != null) {
                i.b();
                I[] iArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                iArr[i2] = i;
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                I removeFirst = this.c.removeFirst();
                removeFirst.b();
                I[] iArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                iArr2[i3] = removeFirst;
            }
            while (!this.d.isEmpty()) {
                this.d.removeFirst().h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(O o) {
        synchronized (this.b) {
            o.b();
            O[] oArr = this.f;
            int i = this.h;
            this.h = i + 1;
            oArr[i] = o;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.oy
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f16607a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.l     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L1a
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.ry> r1 = r8.c     // Catch: java.lang.Throwable -> La8
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L14
            int r1 = r8.h     // Catch: java.lang.Throwable -> La8
            if (r1 <= 0) goto L14
            goto L1a
        L14:
            java.lang.Object r1 = r8.b     // Catch: java.lang.Throwable -> La8
            r1.wait()     // Catch: java.lang.Throwable -> La8
            goto L3
        L1a:
            boolean r1 = r8.l     // Catch: java.lang.Throwable -> La8
            r2 = 0
            if (r1 == 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return r2
        L21:
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.ry> r1 = r8.c     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.ry r1 = (com.yandex.mobile.ads.impl.ry) r1     // Catch: java.lang.Throwable -> La8
            O extends com.yandex.mobile.ads.impl.sy[] r3 = r8.f     // Catch: java.lang.Throwable -> La8
            int r4 = r8.h     // Catch: java.lang.Throwable -> La8
            r5 = 1
            int r4 = r4 - r5
            r8.h = r4     // Catch: java.lang.Throwable -> La8
            r3 = r3[r4]     // Catch: java.lang.Throwable -> La8
            boolean r4 = r8.k     // Catch: java.lang.Throwable -> La8
            r8.k = r2     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            r0 = 4
            boolean r6 = r1.c(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L45
            r3.b(r0)
            goto L7c
        L45:
            boolean r0 = r1.c(r7)
            if (r0 == 0) goto L4e
            r3.b(r7)
        L4e:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.c(r0)
            if (r6 == 0) goto L59
            r3.b(r0)
        L59:
            com.yandex.mobile.ads.impl.p32 r0 = r8.a(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L5e java.lang.RuntimeException -> L67
            goto L70
        L5e:
            r0 = move-exception
            com.yandex.mobile.ads.impl.p32 r4 = new com.yandex.mobile.ads.impl.p32
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L6f
        L67:
            r0 = move-exception
            com.yandex.mobile.ads.impl.p32 r4 = new com.yandex.mobile.ads.impl.p32
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L6f:
            r0 = r4
        L70:
            if (r0 == 0) goto L7c
            java.lang.Object r4 = r8.b
            monitor-enter(r4)
            r8.j = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L79
            return r2
        L79:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            java.lang.Object r2 = r8.b
            monitor-enter(r2)
            boolean r0 = r8.k     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L87
            r3.h()     // Catch: java.lang.Throwable -> La5
            goto L96
        L87:
            boolean r0 = r3.c(r7)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L91
            r3.h()     // Catch: java.lang.Throwable -> La5
            goto L96
        L91:
            java.util.ArrayDeque<O extends com.yandex.mobile.ads.impl.sy> r0 = r8.d     // Catch: java.lang.Throwable -> La5
            r0.addLast(r3)     // Catch: java.lang.Throwable -> La5
        L96:
            r1.b()     // Catch: java.lang.Throwable -> La5
            I extends com.yandex.mobile.ads.impl.ry[] r0 = r8.e     // Catch: java.lang.Throwable -> La5
            int r3 = r8.g     // Catch: java.lang.Throwable -> La5
            int r4 = r3 + 1
            r8.g = r4     // Catch: java.lang.Throwable -> La5
            r0[r3] = r1     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return r5
        La5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r0
        La8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.py1.e():boolean");
    }
}
