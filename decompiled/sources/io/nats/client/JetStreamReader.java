package io.nats.client;

import java.time.Duration;

/* loaded from: classes6.dex */
public interface JetStreamReader {
    Message nextMessage(long j) throws InterruptedException;

    Message nextMessage(Duration duration) throws InterruptedException;

    void stop();
}
