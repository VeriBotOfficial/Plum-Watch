package io.nats.client;

/* loaded from: classes6.dex */
public class BaseConsumeOptions {
    public static final long DEFAULT_EXPIRES_IN_MILLIS = 30000;
    public static final int DEFAULT_MESSAGE_COUNT = 500;
    public static final int DEFAULT_MESSAGE_COUNT_WHEN_BYTES = 1000000;
    public static final int DEFAULT_THRESHOLD_PERCENT = 25;
    public static final long MAX_HEARTBEAT_MILLIS = 30000;
    public static final int MAX_IDLE_HEARTBEAT_PERCENT = 50;
    public static final long MIN_EXPIRES_MILLS = 1000;
    protected final long bytes;
    protected final long expiresIn;
    protected final long idleHeartbeat;
    protected final int messages;
    protected final int thresholdPercent;

    protected BaseConsumeOptions(Builder builder) {
        long j = builder.bytes;
        this.bytes = j;
        if (j > 0) {
            this.messages = builder.messages == -1 ? 1000000 : builder.messages;
        } else {
            this.messages = builder.messages == -1 ? 500 : builder.messages;
        }
        this.thresholdPercent = builder.thresholdPercent;
        long j2 = builder.expiresIn;
        this.expiresIn = j2;
        this.idleHeartbeat = Math.min(30000L, (j2 * 50) / 100);
    }

    public long getExpiresInMillis() {
        return this.expiresIn;
    }

    public long getIdleHeartbeat() {
        return this.idleHeartbeat;
    }

    public int getThresholdPercent() {
        return this.thresholdPercent;
    }

    protected static abstract class Builder<B, CO> {
        protected int messages = -1;
        protected long bytes = 0;
        protected int thresholdPercent = 25;
        protected long expiresIn = 30000;

        public abstract CO build();

        protected abstract B getThis();

        protected Builder() {
        }

        protected B messages(int i) {
            if (i < 1) {
                i = -1;
            }
            this.messages = i;
            return getThis();
        }

        protected B bytes(long j) {
            if (j < 1) {
                j = 0;
            }
            this.bytes = j;
            return getThis();
        }

        public B expiresIn(long j) {
            if (j < 1) {
                this.expiresIn = 30000L;
            } else {
                if (j < 1000) {
                    throw new IllegalArgumentException("Expires must be greater than or equal to 1000");
                }
                this.expiresIn = j;
            }
            return getThis();
        }

        public B thresholdPercent(int i) {
            this.thresholdPercent = i < 1 ? 25 : Math.min(100, i);
            return getThis();
        }
    }
}
