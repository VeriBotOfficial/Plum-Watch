package io.nats.client;

import io.nats.client.FeatureOptions;

/* loaded from: classes6.dex */
public class KeyValueOptions extends FeatureOptions {
    private KeyValueOptions(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValueOptions keyValueOptions) {
        return new Builder(keyValueOptions);
    }

    public static Builder builder(JetStreamOptions jetStreamOptions) {
        return new Builder().jetStreamOptions(jetStreamOptions);
    }

    public static class Builder extends FeatureOptions.Builder<Builder, KeyValueOptions> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.FeatureOptions.Builder
        public Builder getThis() {
            return this;
        }

        public Builder() {
        }

        public Builder(KeyValueOptions keyValueOptions) {
            super(keyValueOptions);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.FeatureOptions.Builder
        public KeyValueOptions build() {
            return new KeyValueOptions(this);
        }
    }
}
