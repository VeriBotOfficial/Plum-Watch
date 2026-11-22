package io.nats.client.impl;

import io.nats.client.support.ByteArrayBuilder;

/* loaded from: classes6.dex */
class ProtocolMessage extends NatsMessage {
    private static final ByteArrayBuilder EMPTY_BAB = new ByteArrayBuilder();

    @Override // io.nats.client.impl.NatsMessage
    boolean isProtocol() {
        return true;
    }

    ProtocolMessage(ByteArrayBuilder byteArrayBuilder) {
        this.protocolBab = byteArrayBuilder;
        int length = this.protocolBab.length() + 2;
        this.controlLineLength = length;
        this.sizeInBytes = length;
    }

    ProtocolMessage(byte[] bArr) {
        this(bArr == null ? EMPTY_BAB : new ByteArrayBuilder(bArr));
    }

    ProtocolMessage(ProtocolMessage protocolMessage) {
        this.protocolBab = protocolMessage.protocolBab;
        this.sizeInBytes = protocolMessage.sizeInBytes;
    }
}
