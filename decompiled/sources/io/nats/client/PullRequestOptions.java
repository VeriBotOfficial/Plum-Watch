package io.nats.client;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.Validator;
import java.time.Duration;

/* loaded from: classes6.dex */
public class PullRequestOptions implements JsonSerializable {
    private final int batchSize;
    private final Duration expiresIn;
    private final Duration idleHeartbeat;
    private final long maxBytes;
    private final boolean noWait;

    public PullRequestOptions(Builder builder) {
        this.batchSize = builder.batchSize;
        this.maxBytes = builder.maxBytes;
        this.noWait = builder.noWait;
        this.expiresIn = builder.expiresIn;
        this.idleHeartbeat = builder.idleHeartbeat;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.BATCH, Integer.valueOf(this.batchSize));
        JsonUtils.addField(beginJson, ApiConstants.MAX_BYTES, Long.valueOf(this.maxBytes));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.NO_WAIT, Boolean.valueOf(this.noWait));
        JsonUtils.addFieldAsNanos(beginJson, "expires", this.expiresIn);
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.IDLE_HEARTBEAT, this.idleHeartbeat);
        return JsonUtils.endJson(beginJson).toString();
    }

    public int getBatchSize() {
        return this.batchSize;
    }

    public long getMaxBytes() {
        return this.maxBytes;
    }

    public boolean isNoWait() {
        return this.noWait;
    }

    public Duration getExpiresIn() {
        return this.expiresIn;
    }

    public Duration getIdleHeartbeat() {
        return this.idleHeartbeat;
    }

    public static Builder builder(int i) {
        return new Builder().batchSize(i);
    }

    public static Builder noWait(int i) {
        return new Builder().batchSize(i).noWait();
    }

    public static class Builder {
        private int batchSize;
        private Duration expiresIn;
        private Duration idleHeartbeat;
        private long maxBytes;
        private boolean noWait;

        public Builder batchSize(int i) {
            this.batchSize = i;
            return this;
        }

        public Builder maxBytes(long j) {
            this.maxBytes = j;
            return this;
        }

        public Builder noWait() {
            this.noWait = true;
            return this;
        }

        public Builder noWait(boolean z) {
            this.noWait = z;
            return this;
        }

        public Builder expiresIn(long j) {
            this.expiresIn = Duration.ofMillis(j);
            return this;
        }

        public Builder expiresIn(Duration duration) {
            this.expiresIn = duration;
            return this;
        }

        public Builder idleHeartbeat(long j) {
            this.idleHeartbeat = Duration.ofMillis(j);
            return this;
        }

        public Builder idleHeartbeat(Duration duration) {
            this.idleHeartbeat = duration;
            return this;
        }

        public PullRequestOptions build() {
            Validator.validateGtZero(this.batchSize, "Pull batch size");
            return new PullRequestOptions(this);
        }
    }
}
