package io.nats.client;

import java.time.Duration;

/* loaded from: classes6.dex */
public interface Subscription extends Consumer {
    Dispatcher getDispatcher();

    String getQueueName();

    String getSubject();

    Message nextMessage(long j) throws InterruptedException, IllegalStateException;

    Message nextMessage(Duration duration) throws InterruptedException, IllegalStateException;

    Subscription unsubscribe(int i);

    void unsubscribe();
}
