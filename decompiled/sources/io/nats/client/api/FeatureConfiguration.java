package io.nats.client.api;

import java.time.Duration;

/* loaded from: classes6.dex */
public abstract class FeatureConfiguration {
    protected final String bucketName;
    protected final StreamConfiguration sc;

    public FeatureConfiguration(StreamConfiguration streamConfiguration, String str) {
        this.sc = streamConfiguration;
        this.bucketName = str;
    }

    public StreamConfiguration getBackingConfig() {
        return this.sc;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getDescription() {
        return this.sc.getDescription();
    }

    public Duration getTtl() {
        return this.sc.getMaxAge();
    }

    public StorageType getStorageType() {
        return this.sc.getStorageType();
    }

    public int getReplicas() {
        return this.sc.getReplicas();
    }

    public Placement getPlacement() {
        return this.sc.getPlacement();
    }
}
