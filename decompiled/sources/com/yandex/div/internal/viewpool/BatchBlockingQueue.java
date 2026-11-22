package com.yandex.div.internal.viewpool;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.anythink.expressad.f.a.b;
import io.livekit.android.room.SignalClient;
import io.nats.client.support.ApiConstants;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatchBlockingQueue.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J+\u0010\u0015\u001a\u00020\u00162\u001d\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u00160\u0017¢\u0006\u0002\b\u0018H\u0086\bø\u0001\u0000J\u001a\u0010\u0019\u001a\u00020\u000e2\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u001bH\u0016J\"\u0010\u0019\u001a\u00020\u000e2\u0010\u0010\u001a\u001a\f\u0012\u0006\b\u0000\u0012\u00028\u0000\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0002J\"\u0010\u001f\u001a\u0002H \"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0082\b¢\u0006\u0002\u0010#J\"\u0010$\u001a\u0002H \"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"H\u0082\b¢\u0006\u0002\u0010#J\b\u0010%\u001a\u00020&H\u0002J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J%\u0010'\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u0010,J\r\u0010-\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u000f\u0010/\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u0004\u0018\u00018\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u00100J\u0015\u00101\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\u000eH\u0016J\u0015\u00104\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J \u00105\u001a\u00020\u00122\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0017H\u0086\bø\u0001\u0000J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0016J\r\u00109\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "E", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "backingQueue", "Ljava/util/Queue;", "(Ljava/util/Queue;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "notEmpty", "Ljava/util/concurrent/locks/Condition;", "kotlin.jvm.PlatformType", "queue", "size", "", "getSize", "()I", b.ay, "", "element", "(Ljava/lang/Object;)Z", ApiConstants.BATCH, "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "drainTo", "c", "", "maxElements", "iterator", "", "locked", TokenNames.R, "action", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lockedInterruptibly", "notSupported", "", SignalClient.SD_TYPE_OFFER, "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "peek", "()Ljava/lang/Object;", "poll", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;)V", "remainingCapacity", "remove", "removeFirstIf", "predicate", "spliterator", "Ljava/util/Spliterator;", "take", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {
    private final ReentrantLock lock;
    private final Condition notEmpty;
    private final Queue<E> queue;

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    public BatchBlockingQueue(Queue<E> backingQueue) {
        Intrinsics.checkNotNullParameter(backingQueue, "backingQueue");
        this.queue = backingQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.notEmpty = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E element) {
        return offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E element) {
        offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E element, long timeout, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return offer(element);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> c, int maxElements) {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<E> spliterator() {
        notSupported();
        throw new KotlinNothingValueException();
    }

    private final Void notSupported() {
        throw new UnsupportedOperationException();
    }

    private final <R> R locked(Function0<? extends R> action) {
        this.lock.lock();
        try {
            return action.invoke();
        } finally {
            this.lock.unlock();
        }
    }

    private final <R> R lockedInterruptibly(Function0<? extends R> action) {
        this.lock.lockInterruptibly();
        try {
            return action.invoke();
        } finally {
            this.lock.unlock();
        }
    }

    public int getSize() {
        this.lock.lock();
        try {
            return this.queue.size();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E element) {
        this.lock.lock();
        try {
            this.queue.offer(element);
            this.notEmpty.signal();
            Unit unit = Unit.INSTANCE;
            this.lock.unlock();
            return true;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue
    public E poll() {
        this.lock.lock();
        try {
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.lock.lockInterruptibly();
        try {
            long nanos = unit.toNanos(timeout);
            while (this.queue.isEmpty() && nanos > 0) {
                nanos = this.notEmpty.awaitNanos(nanos);
            }
            return this.queue.poll();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.lock.lockInterruptibly();
        while (this.queue.isEmpty()) {
            try {
                this.notEmpty.await();
            } finally {
                this.lock.unlock();
            }
        }
        return this.queue.poll();
    }

    @Override // java.util.Queue
    public E peek() {
        this.lock.lock();
        try {
            return this.queue.peek();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object element) {
        this.lock.lock();
        try {
            return this.queue.remove(element);
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r0.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeFirstIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.concurrent.locks.ReentrantLock r0 = access$getLock$p(r2)
            r0.lock()
            java.util.Queue r0 = access$getQueue$p(r2)     // Catch: java.lang.Throwable -> L3a
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3a
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r3.invoke(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L16
            r0.remove()     // Catch: java.lang.Throwable -> L3a
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            java.util.concurrent.locks.ReentrantLock r0 = access$getLock$p(r2)
            r0.unlock()
            return r3
        L3a:
            r3 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = access$getLock$p(r2)
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.BatchBlockingQueue.removeFirstIf(kotlin.jvm.functions.Function1):boolean");
    }

    public final void batch(Function1<? super BatchBlockingQueue<E>, Unit> batch) {
        Intrinsics.checkNotNullParameter(batch, "batch");
        this.lock.lock();
        try {
            batch.invoke(this);
            Unit unit = Unit.INSTANCE;
        } finally {
            this.lock.unlock();
        }
    }
}
