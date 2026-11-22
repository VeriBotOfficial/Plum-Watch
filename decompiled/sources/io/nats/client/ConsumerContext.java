package io.nats.client;

import io.nats.client.api.ConsumerInfo;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface ConsumerContext extends BaseConsumerContext {
    ConsumerInfo getCachedConsumerInfo();

    ConsumerInfo getConsumerInfo() throws IOException, JetStreamApiException;

    String getConsumerName();
}
