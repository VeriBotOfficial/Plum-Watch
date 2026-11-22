package io.nats.client;

import io.nats.client.api.ConsumerInfo;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface MessageConsumer extends AutoCloseable {
    ConsumerInfo getCachedConsumerInfo();

    ConsumerInfo getConsumerInfo() throws IOException, JetStreamApiException;

    boolean isFinished();

    boolean isStopped();

    void stop();
}
