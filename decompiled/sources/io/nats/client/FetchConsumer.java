package io.nats.client;

/* loaded from: classes6.dex */
public interface FetchConsumer extends MessageConsumer {
    Message nextMessage() throws InterruptedException, JetStreamStatusCheckedException;
}
