package com.otaliastudios.cameraview.internal;

import com.otaliastudios.cameraview.CameraLogger;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes17.dex */
public class Pool<T> {
    private int activeCount;
    private Factory<T> factory;
    private final Object lock = new Object();
    private int maxPoolSize;
    private LinkedBlockingQueue<T> queue;
    private static final String TAG = "Pool";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public interface Factory<T> {
        T create();
    }

    public Pool(int i, Factory<T> factory) {
        this.maxPoolSize = i;
        this.queue = new LinkedBlockingQueue<>(i);
        this.factory = factory;
    }

    public boolean isEmpty() {
        boolean z;
        synchronized (this.lock) {
            z = count() >= this.maxPoolSize;
        }
        return z;
    }

    public T get() {
        synchronized (this.lock) {
            T poll = this.queue.poll();
            if (poll != null) {
                this.activeCount++;
                LOG.v("GET - Reusing recycled item.", this);
                return poll;
            }
            if (isEmpty()) {
                LOG.v("GET - Returning null. Too much items requested.", this);
                return null;
            }
            this.activeCount++;
            LOG.v("GET - Creating a new item.", this);
            return this.factory.create();
        }
    }

    public void recycle(T t) {
        synchronized (this.lock) {
            LOG.v("RECYCLE - Recycling item.", this);
            int i = this.activeCount - 1;
            this.activeCount = i;
            if (i < 0) {
                throw new IllegalStateException("Trying to recycle an item which makes activeCount < 0. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. " + this);
            }
            if (!this.queue.offer(t)) {
                throw new IllegalStateException("Trying to recycle an item while the queue is full. This means that this or some previous items being recycled were not coming from this pool, or some item was recycled more than once. " + this);
            }
        }
    }

    public void clear() {
        synchronized (this.lock) {
            this.queue.clear();
        }
    }

    public final int count() {
        int activeCount;
        synchronized (this.lock) {
            activeCount = activeCount() + recycledCount();
        }
        return activeCount;
    }

    public final int activeCount() {
        int i;
        synchronized (this.lock) {
            i = this.activeCount;
        }
        return i;
    }

    public final int recycledCount() {
        int size;
        synchronized (this.lock) {
            size = this.queue.size();
        }
        return size;
    }

    public String toString() {
        return getClass().getSimpleName() + " - count:" + count() + ", active:" + activeCount() + ", recycled:" + recycledCount();
    }
}
