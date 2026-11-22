package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class LostStreamData {
    private final Long bytes;
    private final List<Long> messages;

    static LostStreamData optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new LostStreamData(jsonValue);
    }

    LostStreamData(JsonValue jsonValue) {
        this.messages = JsonValueUtils.readLongList(jsonValue, ApiConstants.MSGS);
        this.bytes = JsonValueUtils.readLong(jsonValue, ApiConstants.BYTES);
    }

    public List<Long> getMessages() {
        return this.messages;
    }

    public Long getBytes() {
        return this.bytes;
    }

    public String toString() {
        return "LostStreamData{messages=" + this.messages + ", bytes=" + this.bytes + AbstractJsonLexerKt.END_OBJ;
    }
}
