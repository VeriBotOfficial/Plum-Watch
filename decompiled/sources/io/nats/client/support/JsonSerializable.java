package io.nats.client.support;

import java.nio.charset.StandardCharsets;

/* loaded from: classes6.dex */
public interface JsonSerializable {
    String toJson();

    default byte[] serialize() {
        return toJson().getBytes(StandardCharsets.UTF_8);
    }

    default JsonValue toJsonValue() {
        return JsonParser.parseUnchecked(toJson());
    }
}
