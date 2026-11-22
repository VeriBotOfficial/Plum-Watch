package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ConsumerCreateRequest implements JsonSerializable {
    private final ConsumerConfiguration config;
    private final String streamName;

    public ConsumerCreateRequest(String str, ConsumerConfiguration consumerConfiguration) {
        this.streamName = str;
        this.config = consumerConfiguration;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public ConsumerConfiguration getConfig() {
        return this.config;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.STREAM_NAME, this.streamName);
        JsonUtils.addField(beginJson, "config", this.config);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String toString() {
        return "ConsumerCreateRequest{streamName='" + this.streamName + "', " + this.config + AbstractJsonLexerKt.END_OBJ;
    }
}
