package io.nats.client;

import io.nats.client.api.ConsumerConfiguration;
import io.nats.client.support.Validator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class SubscribeOptions {
    public static final long DEFAULT_ORDERED_HEARTBEAT = 5000;
    protected final boolean bind;
    protected final ConsumerConfiguration consumerConfig;
    protected final long messageAlarmTime;
    protected final boolean ordered;
    protected final long pendingByteLimit;
    protected final long pendingMessageLimit;
    protected final boolean pull;
    protected final String stream;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected SubscribeOptions(io.nats.client.SubscribeOptions.Builder r7, boolean r8, java.lang.String r9, java.lang.String r10, long r11, long r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.SubscribeOptions.<init>(io.nats.client.SubscribeOptions$Builder, boolean, java.lang.String, java.lang.String, long, long):void");
    }

    public String getStream() {
        return this.stream;
    }

    public String getDurable() {
        return this.consumerConfig.getDurable();
    }

    public boolean isPull() {
        return this.pull;
    }

    public boolean isBind() {
        return this.bind;
    }

    public boolean isOrdered() {
        return this.ordered;
    }

    public long getMessageAlarmTime() {
        return this.messageAlarmTime;
    }

    public ConsumerConfiguration getConsumerConfiguration() {
        return this.consumerConfig;
    }

    public long getPendingMessageLimit() {
        return this.pendingMessageLimit;
    }

    public long getPendingByteLimit() {
        return this.pendingByteLimit;
    }

    public String toString() {
        return getClass().getSimpleName() + "{stream='" + this.stream + "'bind=" + this.bind + ", " + this.consumerConfig + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class Builder<B, SO> {
        protected boolean bind;
        protected ConsumerConfiguration cc;
        protected String durable;
        protected long messageAlarmTime = -1;
        protected String name;
        protected boolean ordered;
        protected String stream;

        public abstract SO build();

        protected abstract B getThis();

        protected Builder() {
        }

        public B stream(String str) {
            this.stream = Validator.validateStreamName(str, false);
            return getThis();
        }

        public B bind(boolean z) {
            this.bind = z;
            return getThis();
        }

        public B durable(String str) {
            this.durable = Validator.validateDurable(str, false);
            return getThis();
        }

        public B name(String str) {
            this.name = Validator.validateConsumerName(str, false);
            return getThis();
        }

        public B configuration(ConsumerConfiguration consumerConfiguration) {
            this.cc = consumerConfiguration;
            return getThis();
        }

        public B messageAlarmTime(long j) {
            this.messageAlarmTime = j;
            return getThis();
        }
    }
}
