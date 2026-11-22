package io.nats.client;

import io.nats.client.SubscribeOptions;

/* loaded from: classes6.dex */
public class PullSubscribeOptions extends SubscribeOptions {
    public static final PullSubscribeOptions DEFAULT_PULL_OPTS = builder().build();

    private PullSubscribeOptions(Builder builder) {
        super(builder, true, null, null, -1L, -1L);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullSubscribeOptions bind(String str, String str2) {
        return new Builder().stream(str).durable(str2).bind(true).build();
    }

    public static class Builder extends SubscribeOptions.Builder<Builder, PullSubscribeOptions> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.SubscribeOptions.Builder
        public Builder getThis() {
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.SubscribeOptions.Builder
        public PullSubscribeOptions build() {
            return new PullSubscribeOptions(this);
        }
    }
}
