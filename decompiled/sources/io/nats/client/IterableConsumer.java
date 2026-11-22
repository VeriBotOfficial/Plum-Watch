package io.nats.client;

import java.time.Duration;

/* loaded from: classes6.dex */
public interface IterableConsumer extends MessageConsumer {
    Message nextMessage(long j) throws InterruptedException, JetStreamStatusCheckedException;

    Message nextMessage(Duration duration) throws InterruptedException, JetStreamStatusCheckedException;
}
