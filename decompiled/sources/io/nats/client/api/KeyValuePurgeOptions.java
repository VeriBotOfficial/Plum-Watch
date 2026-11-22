package io.nats.client.api;

import java.time.Duration;

/* loaded from: classes6.dex */
public class KeyValuePurgeOptions {
    public static long DEFAULT_THRESHOLD_MILLIS = Duration.ofMinutes(30).toMillis();
    private final long deleteMarkersThresholdMillis;

    private KeyValuePurgeOptions(Builder builder) {
        this.deleteMarkersThresholdMillis = builder.deleteMarkersThresholdMillis;
    }

    public long getDeleteMarkersThresholdMillis() {
        return this.deleteMarkersThresholdMillis;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long deleteMarkersThresholdMillis = KeyValuePurgeOptions.DEFAULT_THRESHOLD_MILLIS;

        public Builder deleteMarkersThreshold(Duration duration) {
            long millis;
            if (duration == null) {
                millis = KeyValuePurgeOptions.DEFAULT_THRESHOLD_MILLIS;
            } else {
                millis = duration.toMillis();
            }
            this.deleteMarkersThresholdMillis = millis;
            return this;
        }

        public Builder deleteMarkersThreshold(long j) {
            this.deleteMarkersThresholdMillis = j;
            return this;
        }

        public Builder deleteMarkersNoThreshold() {
            this.deleteMarkersThresholdMillis = -1L;
            return this;
        }

        public KeyValuePurgeOptions build() {
            long j = this.deleteMarkersThresholdMillis;
            if (j < 0) {
                this.deleteMarkersThresholdMillis = -1L;
            } else if (j == 0) {
                this.deleteMarkersThresholdMillis = KeyValuePurgeOptions.DEFAULT_THRESHOLD_MILLIS;
            }
            return new KeyValuePurgeOptions(this);
        }
    }
}
