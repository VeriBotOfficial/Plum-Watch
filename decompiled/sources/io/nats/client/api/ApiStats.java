package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;

/* loaded from: classes6.dex */
public class ApiStats {
    private final int errors;
    private final int total;

    ApiStats(JsonValue jsonValue) {
        this.total = JsonValueUtils.readInteger(jsonValue, "total", 0);
        this.errors = JsonValueUtils.readInteger(jsonValue, ApiConstants.ERRORS, 0);
    }

    public int getTotal() {
        return this.total;
    }

    public int getErrors() {
        return this.errors;
    }
}
