package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.yandex.mobile.ads.impl.bc0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes5.dex */
public final class as0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final jp f15038a;
    private final hf0 b;
    private final b<T> c;
    private final CopyOnWriteArraySet<c<T>> d;
    private final ArrayDeque<Runnable> e;
    private final ArrayDeque<Runnable> f;
    private boolean g;

    public interface a<T> {
        void invoke(T t);
    }

    public interface b<T> {
        void a(T t, bc0 bc0Var);
    }

    public as0(Looper looper, jp jpVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, jpVar, bVar);
    }

    public final void a(T t) {
        if (this.g) {
            return;
        }
        t.getClass();
        this.d.add(new c<>(t));
    }

    private as0(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, jp jpVar, b<T> bVar) {
        this.f15038a = jpVar;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new ArrayDeque<>();
        this.f = new ArrayDeque<>();
        this.b = jpVar.a(looper, new Handler.Callback() { // from class: com.yandex.mobile.ads.impl.as0$$ExternalSyntheticLambda1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean a2;
                a2 = as0.this.a(message);
                return a2;
            }
        });
    }

    public final void b() {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.c;
            ((c) next).d = true;
            if (((c) next).c) {
                bVar.a(next.f15039a, ((c) next).b.a());
            }
        }
        this.d.clear();
        this.g = true;
    }

    private static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f15039a;
        private bc0.a b = new bc0.a();
        private boolean c;
        private boolean d;

        public c(T t) {
            this.f15039a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f15039a.equals(((c) obj).f15039a);
        }

        public final int hashCode() {
            return this.f15039a.hashCode();
        }
    }

    public final as0<T> a(Looper looper, b<T> bVar) {
        return new as0<>(this.d, looper, this.f15038a, bVar);
    }

    public final void b(T t) {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f15039a.equals(t)) {
                b<T> bVar = this.c;
                ((c) next).d = true;
                if (((c) next).c) {
                    bVar.a(next.f15039a, ((c) next).b.a());
                }
                this.d.remove(next);
            }
        }
    }

    public final void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.b()) {
            hf0 hf0Var = this.b;
            hf0Var.a(hf0Var.b(0));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                this.e.peekFirst().run();
                this.e.removeFirst();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.c;
            if (!((c) next).d && ((c) next).c) {
                bc0 a2 = ((c) next).b.a();
                ((c) next).b = new bc0.a();
                ((c) next).c = false;
                bVar.a(next.f15039a, a2);
            }
            if (this.b.b()) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.d) {
                if (i != -1) {
                    cVar.b.a(i);
                }
                cVar.c = true;
                aVar.invoke(cVar.f15039a);
            }
        }
    }

    public final void a(final int i, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.yandex.mobile.ads.impl.as0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                as0.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }
}
