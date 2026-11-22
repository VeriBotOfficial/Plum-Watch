package io.nats.client.impl;

/* loaded from: classes6.dex */
public class IncomingMessage extends NatsMessage {
    IncomingMessage() {
    }

    IncomingMessage(byte[] bArr) {
        super(bArr);
    }

    @Override // io.nats.client.impl.NatsMessage
    byte[] getProtocolBytes() {
        throw new IllegalStateException("getProtocolBytes not supported for this type of message.");
    }

    @Override // io.nats.client.impl.NatsMessage
    int getControlLineLength() {
        throw new IllegalStateException("getControlLineLength not supported for this type of message.");
    }
}
