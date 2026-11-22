package io.nats.client.api;

import io.nats.client.JetStreamApiException;
import io.nats.client.Message;
import io.nats.client.support.JsonParseException;
import io.nats.client.support.JsonParser;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;

/* loaded from: classes6.dex */
public abstract class ApiResponse<T> {
    public static final String NO_TYPE = "io.nats.jetstream.api.v1.no_type";
    public static final String PARSE_ERROR_TYPE = "io.nats.client.api.parse_error";
    private final Error error;
    protected final JsonValue jv;
    private final String type;

    public ApiResponse(Message message) {
        this(parseMessage(message));
    }

    protected static JsonValue parseMessage(Message message) {
        if (message == null) {
            return null;
        }
        try {
            return JsonParser.parse(message.getData());
        } catch (JsonParseException e) {
            return JsonValueUtils.mapBuilder().put("error", new Error(500, "Error parsing: " + e.getMessage())).put("type", PARSE_ERROR_TYPE).toJsonValue();
        }
    }

    public ApiResponse(JsonValue jsonValue) {
        this.jv = jsonValue;
        if (jsonValue == null) {
            this.error = null;
            this.type = null;
            return;
        }
        this.error = Error.optionalInstance(JsonValueUtils.readValue(jsonValue, "error"));
        String readString = JsonValueUtils.readString(jsonValue, "type");
        if (readString == null) {
            this.type = NO_TYPE;
        } else {
            this.type = readString;
            jsonValue.map.remove("type");
        }
    }

    public ApiResponse() {
        this.jv = null;
        this.error = null;
        this.type = NO_TYPE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T throwOnHasError() throws JetStreamApiException {
        if (hasError()) {
            throw new JetStreamApiException((ApiResponse<?>) this);
        }
        return this;
    }

    public JsonValue getJv() {
        return this.jv;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public String getType() {
        return this.type;
    }

    public int getErrorCode() {
        Error error = this.error;
        if (error == null) {
            return -1;
        }
        return error.getCode();
    }

    public int getApiErrorCode() {
        Error error = this.error;
        if (error == null) {
            return -1;
        }
        return error.getApiErrorCode();
    }

    public String getDescription() {
        Error error = this.error;
        if (error == null) {
            return null;
        }
        return error.getDescription();
    }

    public String getError() {
        Error error = this.error;
        if (error == null) {
            return null;
        }
        return error.toString();
    }

    public Error getErrorObject() {
        return this.error;
    }

    public String toString() {
        JsonValue jsonValue = this.jv;
        if (jsonValue == null) {
            return JsonUtils.toKey(getClass()) + "\":null";
        }
        return jsonValue.toString(getClass());
    }
}
