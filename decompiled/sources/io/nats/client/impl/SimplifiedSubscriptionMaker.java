package io.nats.client.impl;

import io.nats.client.Dispatcher;
import io.nats.client.JetStreamApiException;
import io.nats.client.MessageHandler;
import java.io.IOException;

/* loaded from: classes6.dex */
interface SimplifiedSubscriptionMaker {
    NatsJetStreamPullSubscription subscribe(MessageHandler messageHandler, Dispatcher dispatcher) throws IOException, JetStreamApiException;
}
