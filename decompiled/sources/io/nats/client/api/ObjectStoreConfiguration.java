package io.nats.client.api;

import io.nats.client.api.StreamConfiguration;
import io.nats.client.support.NatsObjectStoreUtil;
import io.nats.client.support.Validator;
import java.time.Duration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ObjectStoreConfiguration extends FeatureConfiguration {
    ObjectStoreConfiguration(StreamConfiguration streamConfiguration) {
        super(streamConfiguration, NatsObjectStoreUtil.extractBucketName(streamConfiguration.getName()));
    }

    public long getMaxBucketSize() {
        return this.sc.getMaxBytes();
    }

    public String toString() {
        return "ObjectStoreConfiguration{name='" + this.bucketName + "', description='" + getDescription() + "', maxBucketSize=" + getMaxBucketSize() + ", ttl=" + getTtl() + ", storageType=" + getStorageType() + ", replicas=" + getReplicas() + ", placement=" + getPlacement() + AbstractJsonLexerKt.END_OBJ;
    }

    public static Builder builder() {
        return new Builder((ObjectStoreConfiguration) null);
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    public static Builder builder(ObjectStoreConfiguration objectStoreConfiguration) {
        return new Builder(objectStoreConfiguration);
    }

    public static class Builder {
        String name;
        StreamConfiguration.Builder scBuilder;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder() {
            this((ObjectStoreConfiguration) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(String str) {
            this((ObjectStoreConfiguration) null);
            name(str);
        }

        public Builder(ObjectStoreConfiguration objectStoreConfiguration) {
            if (objectStoreConfiguration == null) {
                this.scBuilder = new StreamConfiguration.Builder();
                replicas(1);
            } else {
                this.scBuilder = new StreamConfiguration.Builder(objectStoreConfiguration.sc);
                this.name = NatsObjectStoreUtil.extractBucketName(objectStoreConfiguration.sc.getName());
            }
        }

        public Builder name(String str) {
            this.name = Validator.validateBucketName(str, true);
            return this;
        }

        public Builder description(String str) {
            this.scBuilder.description(str);
            return this;
        }

        public Builder maxBucketSize(long j) {
            this.scBuilder.maxBytes(Validator.validateMaxBucketBytes(j));
            return this;
        }

        public Builder ttl(Duration duration) {
            this.scBuilder.maxAge(duration);
            return this;
        }

        public Builder storageType(StorageType storageType) {
            this.scBuilder.storageType(storageType);
            return this;
        }

        public Builder replicas(int i) {
            this.scBuilder.replicas(i);
            return this;
        }

        public Builder placement(Placement placement) {
            this.scBuilder.placement(placement);
            return this;
        }

        public ObjectStoreConfiguration build() {
            String required = Validator.required(this.name, "name");
            this.name = required;
            this.scBuilder.name(NatsObjectStoreUtil.toStreamName(required)).subjects(NatsObjectStoreUtil.toMetaStreamSubject(this.name), NatsObjectStoreUtil.toChunkStreamSubject(this.name)).allowRollup(true).allowDirect(true).discardPolicy(DiscardPolicy.New);
            return new ObjectStoreConfiguration(this.scBuilder.build());
        }
    }
}
