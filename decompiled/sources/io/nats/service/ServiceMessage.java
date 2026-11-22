package io.nats.service;

import io.nats.client.Connection;
import io.nats.client.Message;
import io.nats.client.impl.Headers;
import io.nats.client.impl.NatsMessage;
import io.nats.client.support.JsonSerializable;
import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public class ServiceMessage {
    public static final String NATS_SERVICE_ERROR = "Nats-Service-Error";
    public static final String NATS_SERVICE_ERROR_CODE = "Nats-Service-Error-Code";
    private final Message message;

    ServiceMessage(Message message) {
        this.message = message;
    }

    public void respond(Connection connection, byte[] bArr) {
        connection.publish(this.message.getReplyTo(), bArr);
    }

    public void respond(Connection connection, String str) {
        connection.publish(this.message.getReplyTo(), str.getBytes(StandardCharsets.UTF_8));
    }

    public void respond(Connection connection, JsonSerializable jsonSerializable) {
        connection.publish(this.message.getReplyTo(), jsonSerializable.serialize());
    }

    public void respond(Connection connection, byte[] bArr, Headers headers) {
        connection.publish(NatsMessage.builder().subject(this.message.getReplyTo()).data(bArr).headers(headers).build());
    }

    public void respond(Connection connection, String str, Headers headers) {
        connection.publish(NatsMessage.builder().subject(this.message.getReplyTo()).data(str).headers(headers).build());
    }

    public void respond(Connection connection, JsonSerializable jsonSerializable, Headers headers) {
        connection.publish(NatsMessage.builder().subject(this.message.getReplyTo()).data(jsonSerializable.serialize()).headers(headers).build());
    }

    public void respondStandardError(Connection connection, String str, int i) {
        connection.publish(NatsMessage.builder().subject(this.message.getReplyTo()).headers(new Headers().put(NATS_SERVICE_ERROR, str).put(NATS_SERVICE_ERROR_CODE, "" + i)).build());
    }

    public String getSubject() {
        return this.message.getSubject();
    }

    public String getReplyTo() {
        return this.message.getReplyTo();
    }

    public boolean hasHeaders() {
        return this.message.hasHeaders();
    }

    public Headers getHeaders() {
        return this.message.getHeaders();
    }

    public byte[] getData() {
        return this.message.getData();
    }
}
