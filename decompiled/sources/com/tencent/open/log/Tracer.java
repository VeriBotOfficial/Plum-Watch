package com.tencent.open.log;

import com.tencent.open.log.d;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class Tracer {

    /* renamed from: a, reason: collision with root package name */
    private volatile int f13652a;
    private volatile boolean b;
    private g c;

    protected abstract void doTrace(int i, Thread thread, long j, String str, String str2, Throwable th);

    public Tracer() {
        this(c.f13655a, true, g.f13659a);
    }

    public Tracer(int i, boolean z, g gVar) {
        this.f13652a = c.f13655a;
        this.b = true;
        this.c = g.f13659a;
        a(i);
        a(z);
        a(gVar);
    }

    public void a(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (d() && d.a.a(this.f13652a, i)) {
            doTrace(i, thread, j, str, str2, th);
        }
    }

    public void a(int i) {
        this.f13652a = i;
    }

    public boolean d() {
        return this.b;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public g e() {
        return this.c;
    }

    public void a(g gVar) {
        this.c = gVar;
    }
}
