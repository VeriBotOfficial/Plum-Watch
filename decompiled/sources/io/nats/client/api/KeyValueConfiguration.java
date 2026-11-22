package io.nats.client.api;

import io.nats.client.api.StreamConfiguration;
import io.nats.client.support.NatsKeyValueUtil;
import io.nats.client.support.Validator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class KeyValueConfiguration extends FeatureConfiguration {
    KeyValueConfiguration(StreamConfiguration streamConfiguration) {
        super(streamConfiguration, NatsKeyValueUtil.extractBucketName(streamConfiguration.getName()));
    }

    public long getMaxHistoryPerKey() {
        return this.sc.getMaxMsgsPerSubject();
    }

    public long getMaxBucketSize() {
        return this.sc.getMaxBytes();
    }

    public long getMaxValueSize() {
        return this.sc.getMaxMsgSize();
    }

    public String toString() {
        return "KeyValueConfiguration{name='" + this.bucketName + "', description='" + getDescription() + "', maxHistoryPerKey=" + getMaxHistoryPerKey() + ", maxBucketSize=" + getMaxBucketSize() + ", maxValueSize=" + getMaxValueSize() + ", ttl=" + getTtl() + ", storageType=" + getStorageType() + ", replicas=" + getReplicas() + ", placement=" + getPlacement() + ", republish=" + getRepublish() + AbstractJsonLexerKt.END_OBJ;
    }

    public Republish getRepublish() {
        return this.sc.getRepublish();
    }

    public static Builder builder() {
        return new Builder((KeyValueConfiguration) null);
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    public static Builder builder(KeyValueConfiguration keyValueConfiguration) {
        return new Builder(keyValueConfiguration);
    }

    public static class Builder {
        Mirror mirror;
        String name;
        final StreamConfiguration.Builder scBuilder;
        final List<Source> sources;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder() {
            this((KeyValueConfiguration) null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(String str) {
            this((KeyValueConfiguration) null);
            name(str);
        }

        public Builder(KeyValueConfiguration keyValueConfiguration) {
            this.sources = new ArrayList();
            if (keyValueConfiguration == null) {
                this.scBuilder = new StreamConfiguration.Builder();
                maxHistoryPerKey(1);
                replicas(1);
            } else {
                this.scBuilder = new StreamConfiguration.Builder(keyValueConfiguration.sc);
                this.name = NatsKeyValueUtil.extractBucketName(keyValueConfiguration.sc.getName());
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

        public Builder maxHistoryPerKey(int i) {
            this.scBuilder.maxMessagesPerSubject(Validator.validateMaxHistory(i));
            return this;
        }

        public Builder maxBucketSize(long j) {
            this.scBuilder.maxBytes(Validator.validateMaxBucketBytes(j));
            return this;
        }

        public Builder maxValueSize(long j) {
            this.scBuilder.maxMsgSize(Validator.validateMaxValueSize(j));
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

        public Builder republish(Republish republish) {
            this.scBuilder.republish(republish);
            return this;
        }

        public Builder mirror(Mirror mirror) {
            this.mirror = mirror;
            return this;
        }

        public Builder sources(Source... sourceArr) {
            this.sources.clear();
            return addSources(sourceArr);
        }

        public Builder sources(Collection<Source> collection) {
            this.sources.clear();
            return addSources(collection);
        }

        public Builder addSource(Source source) {
            if (source != null && !this.sources.contains(source)) {
                this.sources.add(source);
            }
            return this;
        }

        public Builder addSources(Source... sourceArr) {
            return sourceArr != null ? addSources(Arrays.asList(sourceArr)) : this;
        }

        public Builder addSources(Collection<Source> collection) {
            if (collection != null) {
                for (Source source : collection) {
                    if (source != null && !this.sources.contains(source)) {
                        this.sources.add(source);
                    }
                }
            }
            return this;
        }

        public KeyValueConfiguration build() {
            String required = Validator.required(this.name, "name");
            this.name = required;
            this.scBuilder.name(NatsKeyValueUtil.toStreamName(required)).allowRollup(true).allowDirect(true).discardPolicy(DiscardPolicy.New).denyDelete(true);
            if (this.mirror != null) {
                this.scBuilder.mirrorDirect(true);
                String name = this.mirror.getName();
                if (NatsKeyValueUtil.hasPrefix(name)) {
                    this.scBuilder.mirror(this.mirror);
                } else {
                    this.scBuilder.mirror(Mirror.builder(this.mirror).name(NatsKeyValueUtil.toStreamName(name)).build());
                }
            } else if (this.sources.size() > 0) {
                for (Source source : this.sources) {
                    String name2 = source.getName();
                    if (NatsKeyValueUtil.hasPrefix(name2)) {
                        this.scBuilder.addSource(source);
                    } else {
                        this.scBuilder.addSource(Source.builder(source).name(NatsKeyValueUtil.toStreamName(name2)).build());
                    }
                }
            } else {
                this.scBuilder.subjects(NatsKeyValueUtil.toStreamSubject(this.name));
            }
            return new KeyValueConfiguration(this.scBuilder.build());
        }
    }
}
