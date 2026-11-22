package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;

/* loaded from: classes6.dex */
public class AccountTier {
    private final int consumers;
    private final AccountLimits limits;
    private final int memory;
    private final int storage;
    private final int streams;

    AccountTier(JsonValue jsonValue) {
        this.memory = JsonValueUtils.readInteger(jsonValue, ApiConstants.MEMORY, 0);
        this.storage = JsonValueUtils.readInteger(jsonValue, ApiConstants.STORAGE, 0);
        this.streams = JsonValueUtils.readInteger(jsonValue, "streams", 0);
        this.consumers = JsonValueUtils.readInteger(jsonValue, ApiConstants.CONSUMERS, 0);
        this.limits = new AccountLimits(JsonValueUtils.readObject(jsonValue, ApiConstants.LIMITS));
    }

    public int getMemory() {
        return this.memory;
    }

    public int getStorage() {
        return this.storage;
    }

    public int getStreams() {
        return this.streams;
    }

    public int getConsumers() {
        return this.consumers;
    }

    public AccountLimits getLimits() {
        return this.limits;
    }
}
