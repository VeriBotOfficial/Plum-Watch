package io.nats.client;

import io.nats.client.BaseConsumeOptions;

/* loaded from: classes6.dex */
public class FetchConsumeOptions extends BaseConsumeOptions {
    public static FetchConsumeOptions DEFAULT_FETCH_OPTIONS = builder().build();

    private FetchConsumeOptions(Builder builder) {
        super(builder);
    }

    public int getMaxMessages() {
        return this.messages;
    }

    public long getMaxBytes() {
        return this.bytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends BaseConsumeOptions.Builder<Builder, FetchConsumeOptions> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.BaseConsumeOptions.Builder
        public Builder getThis() {
            return this;
        }

        public Builder maxMessages(int i) {
            messages(i);
            return bytes(-1L);
        }

        public Builder maxBytes(long j) {
            return (Builder) super.bytes(j);
        }

        public Builder max(int i, int i2) {
            messages(i2);
            return bytes(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.BaseConsumeOptions.Builder
        public FetchConsumeOptions build() {
            return new FetchConsumeOptions(this);
        }
    }
}
