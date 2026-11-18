package com.amap.api.col.p0003sl;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: LifoBlockingQueue.java */
/* JADX INFO: loaded from: classes7.dex */
public final class sc<E> implements BlockingQueue<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingDeque<E> f1879a = new LinkedBlockingDeque<>(256);

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Collection
    public final boolean add(E e) {
        this.f1879a.addFirst(e);
        return true;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return !collection.isEmpty();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1879a.clear();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1879a.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f1879a.containsAll(collection);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection) {
        return this.f1879a.drainTo(collection);
    }

    @Override // java.util.Queue
    public final E element() {
        return this.f1879a.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1879a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f1879a.iterator();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public final boolean offer(E e) {
        return this.f1879a.offerFirst(e);
    }

    @Override // java.util.Queue
    public final E peek() {
        return this.f1879a.peek();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E poll(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f1879a.poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(E e) throws InterruptedException {
        this.f1879a.putFirst(e);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return this.f1879a.remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f1879a.remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f1879a.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f1879a.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1879a.size();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E take() throws InterruptedException {
        return this.f1879a.take();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f1879a.toArray();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection, int r3) {
        return this.f1879a.drainTo(collection, r3);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(E e, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f1879a.offerFirst(e, j, timeUnit);
    }

    @Override // java.util.Queue
    public final E poll() {
        return this.f1879a.poll();
    }

    @Override // java.util.Queue
    public final E remove() {
        return this.f1879a.remove();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f1879a.toArray(tArr);
    }
}
