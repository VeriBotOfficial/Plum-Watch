package com.anythink.basead.exoplayer.c;

import com.anythink.basead.exoplayer.c.e;
import com.anythink.basead.exoplayer.c.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes11.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f2410a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    protected abstract I h();

    protected abstract O i();

    protected abstract E j();

    protected abstract E k();

    private g(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = h();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = i();
        }
        Thread thread = new Thread() { // from class: com.anythink.basead.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        };
        this.f2410a = thread;
        thread.start();
    }

    private void a(int i) {
        com.anythink.basead.exoplayer.k.a.b(this.g == this.e.length);
        for (I i2 : this.e) {
            i2.d(i);
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i;
        synchronized (this.b) {
            l();
            com.anythink.basead.exoplayer.k.a.b(this.i == null);
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

    @Override // com.anythink.basead.exoplayer.c.c
    public final void a(I i) {
        synchronized (this.b) {
            l();
            com.anythink.basead.exoplayer.k.a.a(i == this.i);
            this.c.addLast(i);
            m();
            this.i = null;
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O c() {
        synchronized (this.b) {
            l();
            if (this.d.isEmpty()) {
                return null;
            }
            return this.d.removeFirst();
        }
    }

    protected final void a(O o) {
        synchronized (this.b) {
            b((g<I, O, E>) o);
            m();
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void d() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            I i = this.i;
            if (i != null) {
                b((g<I, O, E>) i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b((g<I, O, E>) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                b((g<I, O, E>) this.d.removeFirst());
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void e() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f2410a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void l() {
        E e = this.j;
        if (e != null) {
            throw e;
        }
    }

    private void m() {
        if (p()) {
            this.b.notify();
        }
    }

    private void n() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (o());
    }

    private boolean o() {
        synchronized (this.b) {
            while (!this.l && !p()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            I removeFirst = this.c.removeFirst();
            O[] oArr = this.f;
            int i = this.h - 1;
            this.h = i;
            O o = oArr[i];
            this.k = false;
            if (removeFirst.c()) {
                o.b(4);
            } else {
                if (removeFirst.b()) {
                    o.b(Integer.MIN_VALUE);
                }
                try {
                    this.j = k();
                } catch (OutOfMemoryError unused) {
                    this.j = j();
                } catch (RuntimeException unused2) {
                    this.j = j();
                }
                if (this.j != null) {
                    synchronized (this.b) {
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    b((g<I, O, E>) o);
                } else if (o.b()) {
                    this.m++;
                    b((g<I, O, E>) o);
                } else {
                    o.b = this.m;
                    this.m = 0;
                    this.d.addLast(o);
                }
                b((g<I, O, E>) removeFirst);
            }
            return true;
        }
    }

    private boolean p() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private void b(I i) {
        i.a();
        I[] iArr = this.e;
        int i2 = this.g;
        this.g = i2 + 1;
        iArr[i2] = i;
    }

    private void b(O o) {
        o.a();
        O[] oArr = this.f;
        int i = this.h;
        this.h = i + 1;
        oArr[i] = o;
    }

    static /* synthetic */ void a(g gVar) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (gVar.o());
    }
}
