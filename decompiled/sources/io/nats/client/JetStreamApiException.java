package io.nats.client;

import io.nats.client.api.ApiResponse;
import io.nats.client.api.Error;

/* loaded from: classes6.dex */
public class JetStreamApiException extends Exception {
    private final Error error;

    public JetStreamApiException(ApiResponse<?> apiResponse) {
        this(apiResponse.getErrorObject());
    }

    public JetStreamApiException(Error error) {
        super(error.toString());
        this.error = error;
    }

    public int getErrorCode() {
        return this.error.getCode();
    }

    public int getApiErrorCode() {
        return this.error.getApiErrorCode();
    }

    public String getErrorDescription() {
        return this.error.getDescription();
    }
}
