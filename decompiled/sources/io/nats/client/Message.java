package io.nats.client;

import io.nats.client.impl.AckType;
import io.nats.client.impl.Headers;
import io.nats.client.impl.NatsJetStreamMetaData;
import io.nats.client.support.Status;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

/* loaded from: classes6.dex */
public interface Message {
    void ack();

    void ackSync(Duration duration) throws TimeoutException, InterruptedException;

    long consumeByteCount();

    Connection getConnection();

    byte[] getData();

    Headers getHeaders();

    String getReplyTo();

    String getSID();

    Status getStatus();

    String getSubject();

    Subscription getSubscription();

    boolean hasHeaders();

    void inProgress();

    boolean isJetStream();

    boolean isStatusMessage();

    boolean isUtf8mode();

    AckType lastAck();

    NatsJetStreamMetaData metaData();

    void nak();

    void nakWithDelay(long j);

    void nakWithDelay(Duration duration);

    void term();
}
