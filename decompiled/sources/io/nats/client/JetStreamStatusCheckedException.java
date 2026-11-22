package io.nats.client;

/* loaded from: classes6.dex */
public class JetStreamStatusCheckedException extends Exception {
    public JetStreamStatusCheckedException(JetStreamStatusException jetStreamStatusException) {
        super(jetStreamStatusException);
    }
}
