package io.nats.client.api;

import android.gov.nist.core.Separators;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.NatsJetStreamConstants;
import io.nats.client.support.Status;

/* loaded from: classes6.dex */
public class Error implements JsonSerializable {
    public static final Error JsBadRequestErr = new Error(400, 10003, "bad request");
    public static final Error JsNoMessageFoundErr = new Error(404, NatsJetStreamConstants.JS_NO_MESSAGE_FOUND_ERR, "no message found");
    public static final int NOT_SET = -1;
    private final JsonValue jv;

    static Error optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new Error(jsonValue);
    }

    Error(JsonValue jsonValue) {
        this.jv = jsonValue;
    }

    Error(int i, String str) {
        this(i, -1, str);
    }

    Error(int i, int i2, String str) {
        this.jv = JsonValueUtils.mapBuilder().put("code", Integer.valueOf(i)).put(ApiConstants.ERR_CODE, Integer.valueOf(i2)).put("description", str).toJsonValue();
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        return this.jv.toJson();
    }

    @Override // io.nats.client.support.JsonSerializable
    public JsonValue toJsonValue() {
        return this.jv;
    }

    public int getCode() {
        return JsonValueUtils.readInteger(this.jv, "code", -1);
    }

    public int getApiErrorCode() {
        return JsonValueUtils.readInteger(this.jv, ApiConstants.ERR_CODE, -1);
    }

    public String getDescription() {
        return JsonValueUtils.readString(this.jv, "description", "Unknown JetStream Error");
    }

    public String toString() {
        int apiErrorCode = getApiErrorCode();
        int code = getCode();
        if (apiErrorCode == -1) {
            if (code == -1) {
                return getDescription();
            }
            return getDescription() + " (" + code + Separators.RPAREN;
        }
        if (code == -1) {
            return getDescription();
        }
        return getDescription() + " [" + apiErrorCode + "]";
    }

    public static Error convert(Status status) {
        int code = status.getCode();
        if (code == 404) {
            return JsNoMessageFoundErr;
        }
        if (code == 408) {
            return JsBadRequestErr;
        }
        return new Error(status.getCode(), -1, status.getMessage());
    }
}
