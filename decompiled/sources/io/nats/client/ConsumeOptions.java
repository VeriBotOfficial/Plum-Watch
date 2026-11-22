package io.nats.client;

import io.nats.client.BaseConsumeOptions;

/* loaded from: classes6.dex */
public class ConsumeOptions extends BaseConsumeOptions {
    public static ConsumeOptions DEFAULT_CONSUME_OPTIONS = builder().build();

    private ConsumeOptions(Builder builder) {
        super(builder);
    }

    public int getBatchSize() {
        return this.messages;
    }

    public long getBatchBytes() {
        return this.bytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BaseConsumeOptions.Builder<Builder, ConsumeOptions> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.BaseConsumeOptions.Builder
        public Builder getThis() {
            return this;
        }

        public Builder batchSize(int i) {
            messages(i);
            return bytes(-1L);
        }

        public Builder batchBytes(long j) {
            messages(-1);
            return bytes(j);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.BaseConsumeOptions.Builder
        public ConsumeOptions build() {
            return new ConsumeOptions(this);
        }
    }
}
