package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3663x5 implements InterfaceC3642w9 {

    /* renamed from: a, reason: collision with root package name */
    public final B9 f18575a;
    public final List b;
    public final List c;
    public final AtomicBoolean d;

    public C3663x5(B9 b9, List<? extends J8> list, List<? extends J8> list2, C3215f5 c3215f5) {
        this.f18575a = b9;
        this.b = list;
        this.c = list2;
        Objects.toString(c3215f5);
        this.d = new AtomicBoolean(true);
    }

    public final void a() {
        this.d.set(false);
    }

    public final void b() {
        this.d.set(true);
    }

    public final void c() {
        if (this.d.get()) {
            List list = this.c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((J8) it.next()).b()) {
                        return;
                    }
                }
            }
            ((Jm) this.f18575a).b();
        }
    }

    public final void d() {
        if (this.d.get()) {
            List list = this.c;
            if (!list.isEmpty() && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((J8) it.next()).b()) {
                        return;
                    }
                }
            }
            List list2 = this.b;
            if (list2.isEmpty() || list2.isEmpty()) {
                return;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((J8) it2.next()).b()) {
                    ((Jm) this.f18575a).b();
                    return;
                }
            }
        }
    }
}
