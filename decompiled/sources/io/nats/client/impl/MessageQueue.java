package io.nats.client.impl;

import io.nats.client.support.NatsConstants;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

/* loaded from: classes6.dex */
class MessageQueue {
    private static final int DRAINING = 2;
    private static final int RUNNING = 1;
    private static final int STOPPED = 0;
    private final boolean discardWhenFull;
    private final Lock filterLock;
    private final AtomicLong length;
    private final NatsMessage poisonPill;
    private final LinkedBlockingQueue<NatsMessage> queue;
    private final AtomicInteger running;
    private final boolean singleThreadedReader;
    private final AtomicLong sizeInBytes;

    MessageQueue(boolean z, int i, boolean z2) {
        this.queue = i > 0 ? new LinkedBlockingQueue<>(i) : new LinkedBlockingQueue<>();
        this.discardWhenFull = z2;
        this.running = new AtomicInteger(1);
        this.sizeInBytes = new AtomicLong(0L);
        this.length = new AtomicLong(0L);
        this.poisonPill = new NatsMessage("_poison", null, NatsConstants.EMPTY_BODY);
        this.filterLock = new ReentrantLock();
        this.singleThreadedReader = z;
    }

    MessageQueue(boolean z) {
        this(z, 0);
    }

    MessageQueue(boolean z, int i) {
        this(z, i, false);
    }

    boolean isSingleReaderMode() {
        return this.singleThreadedReader;
    }

    boolean isRunning() {
        return this.running.get() != 0;
    }

    boolean isDraining() {
        return this.running.get() == 2;
    }

    void pause() {
        this.running.set(0);
        poisonTheQueue();
    }

    void resume() {
        this.running.set(1);
    }

    void drain() {
        this.running.set(2);
        poisonTheQueue();
    }

    boolean isDrained() {
        return this.running.get() == 2 && length() == 0;
    }

    boolean push(NatsMessage natsMessage) {
        return push(natsMessage, false);
    }

    boolean push(NatsMessage natsMessage, boolean z) {
        this.filterLock.lock();
        if (!z) {
            try {
                if (this.discardWhenFull) {
                    return this.queue.offer(natsMessage);
                }
            } finally {
                this.filterLock.unlock();
            }
        }
        if (!offer(natsMessage)) {
            throw new IllegalStateException("Output queue is full " + this.queue.size());
        }
        this.sizeInBytes.getAndAdd(natsMessage.getSizeInBytes());
        this.length.incrementAndGet();
        this.filterLock.unlock();
        return true;
    }

    void poisonTheQueue() {
        try {
            this.queue.add(this.poisonPill);
        } catch (IllegalStateException unused) {
        }
    }

    boolean offer(NatsMessage natsMessage) {
        try {
            return this.queue.offer(natsMessage, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            return false;
        }
    }

    NatsMessage poll(Duration duration) throws InterruptedException {
        NatsMessage poll;
        if (duration == null || isDraining()) {
            poll = this.queue.poll();
        } else {
            long nanos = duration.toNanos();
            if (nanos != 0) {
                poll = this.queue.poll(nanos, TimeUnit.NANOSECONDS);
            } else {
                poll = null;
                while (isRunning() && (poll = this.queue.poll(100L, TimeUnit.DAYS)) == null) {
                }
            }
        }
        if (poll == this.poisonPill) {
            return null;
        }
        return poll;
    }

    NatsMessage pop(Duration duration) throws InterruptedException {
        NatsMessage poll;
        if (!isRunning() || (poll = poll(duration)) == null) {
            return null;
        }
        this.sizeInBytes.getAndAdd(-poll.getSizeInBytes());
        this.length.decrementAndGet();
        return poll;
    }

    NatsMessage accumulate(long j, long j2, Duration duration) throws InterruptedException {
        NatsMessage poll;
        if (!this.singleThreadedReader) {
            throw new IllegalStateException("Accumulate is only supported in single reader mode.");
        }
        if (!isRunning() || (poll = poll(duration)) == null) {
            return null;
        }
        long sizeInBytes = poll.getSizeInBytes();
        if (j2 <= 1 || sizeInBytes >= j) {
            this.sizeInBytes.addAndGet(-sizeInBytes);
            this.length.decrementAndGet();
            return poll;
        }
        NatsMessage natsMessage = poll;
        long j3 = 1;
        while (natsMessage != null) {
            NatsMessage peek = this.queue.peek();
            if (peek != null && peek != this.poisonPill) {
                long sizeInBytes2 = peek.getSizeInBytes();
                if (j >= 0 && sizeInBytes + sizeInBytes2 >= j) {
                    break;
                }
                sizeInBytes += sizeInBytes2;
                j3++;
                natsMessage.next = this.queue.poll();
                natsMessage = natsMessage.next;
                if (j3 == j2) {
                    break;
                }
            } else {
                break;
            }
        }
        this.sizeInBytes.addAndGet(-sizeInBytes);
        this.length.addAndGet(-j3);
        return poll;
    }

    NatsMessage popNow() throws InterruptedException {
        return pop(null);
    }

    long length() {
        return this.length.get();
    }

    long sizeInBytes() {
        return this.sizeInBytes.get();
    }

    void filter(Predicate<NatsMessage> predicate) {
        this.filterLock.lock();
        try {
            if (isRunning()) {
                throw new IllegalStateException("Filter is only supported when the queue is paused");
            }
            ArrayList arrayList = new ArrayList();
            NatsMessage poll = this.queue.poll();
            while (poll != null) {
                if (!predicate.test(poll)) {
                    arrayList.add(poll);
                } else {
                    this.sizeInBytes.addAndGet(-poll.getSizeInBytes());
                    this.length.decrementAndGet();
                }
                poll = this.queue.poll();
            }
            this.queue.addAll(arrayList);
        } finally {
            this.filterLock.unlock();
        }
    }
}
