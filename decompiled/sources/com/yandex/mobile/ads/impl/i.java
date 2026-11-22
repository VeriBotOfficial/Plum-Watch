package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public abstract class i<V> extends rp0 implements Future {
    private static final boolean e;
    private static final Logger f;
    private static final a g;
    private static final Object h;

    @CheckForNull
    private volatile Object b;

    @CheckForNull
    private volatile d c;

    @CheckForNull
    private volatile C0972i d;

    static abstract class h<V> extends i<V> implements Future {
        @Override // com.yandex.mobile.ads.impl.i, java.util.concurrent.Future
        public final boolean isCancelled() {
            return ((i) this).b instanceof b;
        }

        h() {
        }

        @Override // com.yandex.mobile.ads.impl.i, java.util.concurrent.Future
        public V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.yandex.mobile.ads.impl.i, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.yandex.mobile.ads.impl.i, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // com.yandex.mobile.ads.impl.i, java.util.concurrent.Future
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z;
        a gVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        e = z;
        f = Logger.getLogger(i.class.getName());
        Throwable th = null;
        Object[] objArr = 0;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(C0972i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0972i.class, C0972i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, C0972i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "b"));
        } catch (Throwable th2) {
            gVar = new g();
            th = th2;
        }
        g = gVar;
        if (th != null) {
            f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h = new Object();
    }

    private void a(StringBuilder sb) {
        V v;
        boolean z = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[").append(e2.getClass()).append(" thrown from get()]");
                return;
            } catch (ExecutionException e3) {
                sb.append("FAILURE, cause=[").append(e3.getCause()).append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        a(sb, v);
        sb.append("]");
    }

    protected boolean b(V v) {
        if (!g.a((i<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        a((i<?>) this);
        return true;
    }

    /* renamed from: com.yandex.mobile.ads.impl.i$i, reason: collision with other inner class name */
    private static final class C0972i {
        static final C0972i c = new C0972i(0);

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        volatile Thread f15759a;

        @CheckForNull
        volatile C0972i b;

        C0972i() {
            i.g.a(this, Thread.currentThread());
        }

        C0972i(int i) {
        }
    }

    private static final class d {
        static final d b = new d();

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        d f15757a;

        d() {
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        final Throwable f15756a;

        final class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }

            a() {
                super("Failure occurred while trying to finish a future.");
            }
        }

        static {
            new c(new a());
        }

        c(Throwable th) {
            this.f15756a = (Throwable) vj1.a(th);
        }
    }

    private static final class b {

        @CheckForNull
        static final b b;

        @CheckForNull
        static final b c;

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        final Throwable f15755a;

        static {
            if (i.e) {
                c = null;
                b = null;
            } else {
                c = new b(false, null);
                b = new b(true, null);
            }
        }

        b(boolean z, @CheckForNull Throwable th) {
            this.f15755a = th;
        }
    }

    private static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    protected i() {
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.b;
            if ((obj != null) & (!(obj instanceof f))) {
                return (V) a(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0972i c0972i = this.d;
                if (c0972i != C0972i.c) {
                    C0972i c0972i2 = new C0972i();
                    do {
                        a aVar = g;
                        aVar.a(c0972i2, c0972i);
                        if (aVar.a((i<?>) this, c0972i, c0972i2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.b;
                                    if ((obj2 != null) & (!(obj2 instanceof f))) {
                                        return (V) a(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(c0972i2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(c0972i2);
                        } else {
                            c0972i = this.d;
                        }
                    } while (c0972i != C0972i.c);
                }
                return (V) a(Objects.requireNonNull(this.b));
            }
            while (nanos > 0) {
                Object obj3 = this.b;
                if ((obj3 != null) & (!(obj3 instanceof f))) {
                    return (V) a(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String iVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + iVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) a(obj2);
            }
            C0972i c0972i = this.d;
            if (c0972i != C0972i.c) {
                C0972i c0972i2 = new C0972i();
                do {
                    a aVar = g;
                    aVar.a(c0972i2, c0972i);
                    if (aVar.a((i<?>) this, c0972i, c0972i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                a(c0972i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) a(obj);
                    }
                    c0972i = this.d;
                } while (c0972i != C0972i.c);
            }
            return (V) a(Objects.requireNonNull(this.b));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof f)) & (this.b != null);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        b bVar;
        Object requireNonNull;
        Object obj = this.b;
        if ((obj == null) | (obj instanceof f)) {
            if (e) {
                requireNonNull = new b(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    bVar = b.b;
                } else {
                    bVar = b.c;
                }
                requireNonNull = Objects.requireNonNull(bVar);
            }
            while (!g.a((i<?>) this, obj, requireNonNull)) {
                obj = this.b;
                if (!(obj instanceof f)) {
                }
            }
            a((i<?>) this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@').append(Integer.toHexString(System.identityHashCode(this))).append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.b;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                ((f) obj).getClass();
                try {
                    sb.append((Object) null);
                } catch (RuntimeException | StackOverflowError e2) {
                    sb.append("Exception thrown from implementation: ").append(e2.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = i32.a(a());
                } catch (RuntimeException | StackOverflowError e3) {
                    str = "Exception thrown from implementation: " + e3.getClass();
                }
                if (str != null) {
                    sb.append(", info=[").append(str).append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                a(sb);
            }
        }
        return sb.append("]").toString();
    }

    private void a(StringBuilder sb, @CheckForNull Object obj) {
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName()).append(Separators.AT).append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private static void a(i<?> iVar) {
        C0972i c0972i;
        d dVar;
        do {
            c0972i = ((i) iVar).d;
        } while (!g.a(iVar, c0972i, C0972i.c));
        while (c0972i != null) {
            Thread thread = c0972i.f15759a;
            if (thread != null) {
                c0972i.f15759a = null;
                LockSupport.unpark(thread);
            }
            c0972i = c0972i.b;
        }
        do {
            dVar = ((i) iVar).c;
        } while (!g.a(iVar, dVar, d.b));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.f15757a;
            dVar.f15757a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        if (dVar2 != null) {
            throw null;
        }
    }

    private static Object a(Object obj) throws ExecutionException {
        if (!(obj instanceof b)) {
            if (!(obj instanceof c)) {
                if (obj == h) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f15756a);
        }
        Throwable th = ((b) obj).f15755a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    private static abstract class a {
        abstract void a(C0972i c0972i, @CheckForNull C0972i c0972i2);

        abstract void a(C0972i c0972i, Thread thread);

        abstract boolean a(i<?> iVar, @CheckForNull d dVar, d dVar2);

        abstract boolean a(i<?> iVar, @CheckForNull C0972i c0972i, @CheckForNull C0972i c0972i2);

        abstract boolean a(i<?> iVar, @CheckForNull Object obj, Object obj2);

        private a() {
        }
    }

    private static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<C0972i, Thread> f15758a;
        final AtomicReferenceFieldUpdater<C0972i, C0972i> b;
        final AtomicReferenceFieldUpdater<i, C0972i> c;
        final AtomicReferenceFieldUpdater<i, d> d;
        final AtomicReferenceFieldUpdater<i, Object> e;

        e(AtomicReferenceFieldUpdater<C0972i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0972i, C0972i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<i, C0972i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<i, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<i, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f15758a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull d dVar, d dVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.d, iVar, dVar, dVar2);
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.e, iVar, obj, obj2);
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull C0972i c0972i, @CheckForNull C0972i c0972i2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.c, iVar, c0972i, c0972i2);
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final void a(C0972i c0972i, @CheckForNull C0972i c0972i2) {
            this.b.lazySet(c0972i, c0972i2);
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final void a(C0972i c0972i, Thread thread) {
            this.f15758a.lazySet(c0972i, thread);
        }
    }

    private static final class g extends a {
        private g() {
            super();
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull d dVar, d dVar2) {
            synchronized (iVar) {
                if (((i) iVar).c != dVar) {
                    return false;
                }
                ((i) iVar).c = dVar2;
                return true;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull Object obj, Object obj2) {
            synchronized (iVar) {
                if (((i) iVar).b != obj) {
                    return false;
                }
                ((i) iVar).b = obj2;
                return true;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final boolean a(i<?> iVar, @CheckForNull C0972i c0972i, @CheckForNull C0972i c0972i2) {
            synchronized (iVar) {
                if (((i) iVar).d != c0972i) {
                    return false;
                }
                ((i) iVar).d = c0972i2;
                return true;
            }
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final void a(C0972i c0972i, @CheckForNull C0972i c0972i2) {
            c0972i.b = c0972i2;
        }

        @Override // com.yandex.mobile.ads.impl.i.a
        final void a(C0972i c0972i, Thread thread) {
            c0972i.f15759a = thread;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    protected final String a() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    private void a(C0972i c0972i) {
        c0972i.f15759a = null;
        while (true) {
            C0972i c0972i2 = this.d;
            if (c0972i2 == C0972i.c) {
                return;
            }
            C0972i c0972i3 = null;
            while (c0972i2 != null) {
                C0972i c0972i4 = c0972i2.b;
                if (c0972i2.f15759a != null) {
                    c0972i3 = c0972i2;
                } else if (c0972i3 != null) {
                    c0972i3.b = c0972i4;
                    if (c0972i3.f15759a == null) {
                        break;
                    }
                } else if (!g.a((i<?>) this, c0972i2, c0972i4)) {
                    break;
                }
                c0972i2 = c0972i4;
            }
            return;
        }
    }

    protected boolean a(Throwable th) {
        if (!g.a((i<?>) this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a((i<?>) this);
        return true;
    }
}
