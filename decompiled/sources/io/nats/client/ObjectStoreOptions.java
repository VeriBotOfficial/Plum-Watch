package io.nats.client;

import io.nats.client.FeatureOptions;

/* loaded from: classes6.dex */
public class ObjectStoreOptions extends FeatureOptions {
    private ObjectStoreOptions(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectStoreOptions objectStoreOptions) {
        return new Builder(objectStoreOptions);
    }

    public static Builder builder(JetStreamOptions jetStreamOptions) {
        return new Builder().jetStreamOptions(jetStreamOptions);
    }

    public static class Builder extends FeatureOptions.Builder<Builder, ObjectStoreOptions> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.FeatureOptions.Builder
        public Builder getThis() {
            return this;
        }

        public Builder() {
        }

        public Builder(ObjectStoreOptions objectStoreOptions) {
            super(objectStoreOptions);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.FeatureOptions.Builder
        public ObjectStoreOptions build() {
            return new ObjectStoreOptions(this);
        }
    }
}
