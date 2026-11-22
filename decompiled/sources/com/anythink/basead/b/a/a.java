package com.anythink.basead.b.a;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public abstract class a<R, E> implements e<R, E> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f2239a = new AtomicBoolean(false);
    private final AtomicInteger b = new AtomicInteger(1);
    private final CopyOnWriteArrayList<Integer> c = new CopyOnWriteArrayList<>();
    private d<R, E> d;

    @Override // com.anythink.basead.b.a.e
    public final void a(int i) {
        if (this.f2239a.get() || this.c.contains(Integer.valueOf(i))) {
            return;
        }
        this.c.add(Integer.valueOf(i));
        if (this.b.decrementAndGet() == 0) {
            this.f2239a.set(true);
            d<R, E> dVar = this.d;
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(E e) {
        if (this.f2239a.get()) {
            return;
        }
        this.f2239a.set(true);
        d<R, E> dVar = this.d;
        if (dVar != null) {
            dVar.a(e);
        }
    }

    @Override // com.anythink.basead.b.a.e
    public final void b(int i) {
        this.b.set(i);
    }

    @Override // com.anythink.basead.b.a.e
    public final void a(d<R, E> dVar) {
        this.d = dVar;
    }
}
