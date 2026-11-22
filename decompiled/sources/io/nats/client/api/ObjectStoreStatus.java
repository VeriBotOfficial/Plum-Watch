package io.nats.client.api;

import java.time.Duration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ObjectStoreStatus {
    private final ObjectStoreConfiguration config;
    private final StreamInfo streamInfo;

    public ObjectStoreStatus(StreamInfo streamInfo) {
        this.streamInfo = streamInfo;
        this.config = new ObjectStoreConfiguration(streamInfo.getConfiguration());
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

    public ObjectStoreConfiguration getConfiguration() {
        return this.config;
    }

    public long getSize() {
        return this.streamInfo.getStreamState().getByteCount();
    }

    public boolean isSealed() {
        return this.config.getBackingConfig().getSealed();
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

    public String getBackingStore() {
        return "JetStream";
    }

    public String toString() {
        return "ObjectStoreStatus{name='" + getBucketName() + "', description='" + getDescription() + "', ttl=" + getTtl() + ", storageType=" + getStorageType() + ", replicas=" + getReplicas() + ", isSealed=" + isSealed() + AbstractJsonLexerKt.END_OBJ;
    }
}
