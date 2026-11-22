package io.nats.client.api;

import java.time.Duration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class KeyValueStatus {
    private final KeyValueConfiguration config;
    private final StreamInfo streamInfo;

    public KeyValueStatus(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
        this.config = new KeyValueConfiguration(streamInfo.getConfiguration());
    }

    public String getBucketName() {
        return this.config.getBucketName();
    }

    public String getDescription() {
        return this.config.getDescription();
    }

    public StreamInfo getBackingStreamInfo() {
        return this.streamInfo;
    }

    public KeyValueConfiguration getConfiguration() {
        return this.config;
    }

    public long getEntryCount() {
        return this.streamInfo.getStreamState().getMsgCount();
    }

    public long getByteCount() {
        return this.streamInfo.getStreamState().getByteCount();
    }

    public long getMaxHistoryPerKey() {
        return this.config.getMaxHistoryPerKey();
    }

    public long getMaxBucketSize() {
        return this.config.getMaxBucketSize();
    }

    public long getMaxValueSize() {
        return this.config.getMaxValueSize();
    }

    public Duration getTtl() {
        return this.config.getTtl();
    }

    public StorageType getStorageType() {
        return this.config.getStorageType();
    }

    public int getReplicas() {
        return this.config.getReplicas();
    }

    public Placement getPlacement() {
        return this.config.getPlacement();
    }

    public Republish getRepublish() {
        return this.config.getRepublish();
    }

    public String getBackingStore() {
        return "JetStream";
    }

    public String toString() {
        return "KeyValueStatus{name='" + getBucketName() + "', description='" + getDescription() + "', entryCount=" + getEntryCount() + ", maxHistoryPerKey=" + getMaxHistoryPerKey() + ", maxBucketSize=" + getMaxBucketSize() + ", maxValueSize=" + getMaxValueSize() + ", ttl=" + getTtl() + ", storageType=" + getStorageType() + ", replicas=" + getReplicas() + AbstractJsonLexerKt.END_OBJ;
    }
}
