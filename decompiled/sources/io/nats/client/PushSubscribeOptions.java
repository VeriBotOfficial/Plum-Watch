package io.nats.client;

import io.nats.client.SubscribeOptions;
import io.nats.client.support.Validator;

/* loaded from: classes6.dex */
public class PushSubscribeOptions extends SubscribeOptions {
    public static final PushSubscribeOptions DEFAULT_PUSH_OPTS = builder().build();

    private PushSubscribeOptions(Builder builder, String str, String str2, long j, long j2) {
        super(builder, false, str, str2, j, j2);
    }

    public String getDeliverSubject() {
        return this.consumerConfig.getDeliverSubject();
    }

    public String getDeliverGroup() {
        return this.consumerConfig.getDeliverGroup();
    }

    @Deprecated
    public static PushSubscribeOptions bind(String str) {
        return stream(str);
    }

    public static PushSubscribeOptions stream(String str) {
        return new Builder().stream(str).build();
    }

    public static PushSubscribeOptions bind(String str, String str2) {
        return new Builder().stream(str).durable(str2).bind(true).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends SubscribeOptions.Builder<Builder, PushSubscribeOptions> {
        private String deliverGroup;
        private String deliverSubject;
        private long pendingMessageLimit = 524288;
        private long pendingByteLimit = Consumer.DEFAULT_MAX_BYTES;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.SubscribeOptions.Builder
        public Builder getThis() {
            return this;
        }

        public Builder ordered(boolean z) {
            this.ordered = z;
            return this;
        }

        public Builder deliverSubject(String str) {
            this.deliverSubject = Validator.emptyAsNull(str);
            return this;
        }

        public Builder deliverGroup(String str) {
            this.deliverGroup = Validator.emptyAsNull(str);
            return this;
        }

        public Builder pendingMessageLimit(long j) {
            this.pendingMessageLimit = j;
            return this;
        }

        public Builder pendingByteLimit(long j) {
            this.pendingByteLimit = j;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.SubscribeOptions.Builder
        public PushSubscribeOptions build() {
            return new PushSubscribeOptions(this, this.deliverSubject, this.deliverGroup, this.pendingMessageLimit, this.pendingByteLimit);
        }
    }
}
