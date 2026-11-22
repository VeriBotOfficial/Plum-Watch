package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.Validator;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class StreamConfiguration implements JsonSerializable {
    private final boolean allowDirect;
    private final boolean allowRollup;
    private final boolean denyDelete;
    private final boolean denyPurge;
    private final String description;
    private final boolean discardNewPerSubject;
    private final DiscardPolicy discardPolicy;
    private final Duration duplicateWindow;
    private final Duration maxAge;
    private final long maxBytes;
    private final long maxConsumers;
    private final long maxMsgSize;
    private final long maxMsgs;
    private final long maxMsgsPerSubject;
    private final Map<String, String> metadata;
    private final Mirror mirror;
    private final boolean mirrorDirect;
    private final String name;
    private final boolean noAck;
    private final Placement placement;
    private final int replicas;
    private final Republish republish;
    private final RetentionPolicy retentionPolicy;
    private final boolean sealed;
    private final List<Source> sources;
    private final StorageType storageType;
    private final List<String> subjects;
    private final String templateOwner;

    static StreamConfiguration instance(JsonValue jsonValue) {
        Builder builder = new Builder();
        builder.retentionPolicy(RetentionPolicy.get(JsonValueUtils.readString(jsonValue, ApiConstants.RETENTION)));
        builder.storageType(StorageType.get(JsonValueUtils.readString(jsonValue, ApiConstants.STORAGE)));
        builder.discardPolicy(DiscardPolicy.get(JsonValueUtils.readString(jsonValue, ApiConstants.DISCARD)));
        builder.name(JsonValueUtils.readString(jsonValue, "name"));
        builder.description(JsonValueUtils.readString(jsonValue, "description"));
        builder.maxConsumers(JsonValueUtils.readLong(jsonValue, ApiConstants.MAX_CONSUMERS, -1L));
        builder.maxMessages(JsonValueUtils.readLong(jsonValue, ApiConstants.MAX_MSGS, -1L));
        builder.maxMessagesPerSubject(JsonValueUtils.readLong(jsonValue, ApiConstants.MAX_MSGS_PER_SUB, -1L));
        builder.maxBytes(JsonValueUtils.readLong(jsonValue, ApiConstants.MAX_BYTES, -1L));
        builder.maxAge(JsonValueUtils.readNanos(jsonValue, ApiConstants.MAX_AGE));
        builder.maxMsgSize(JsonValueUtils.readLong(jsonValue, ApiConstants.MAX_MSG_SIZE, -1L));
        builder.replicas(JsonValueUtils.readInteger(jsonValue, ApiConstants.NUM_REPLICAS, 1));
        builder.noAck(JsonValueUtils.readBoolean(jsonValue, ApiConstants.NO_ACK));
        builder.templateOwner(JsonValueUtils.readString(jsonValue, ApiConstants.TEMPLATE_OWNER));
        builder.duplicateWindow(JsonValueUtils.readNanos(jsonValue, ApiConstants.DUPLICATE_WINDOW));
        builder.subjects(JsonValueUtils.readStringList(jsonValue, ApiConstants.SUBJECTS));
        builder.placement(Placement.optionalInstance(JsonValueUtils.readValue(jsonValue, "placement")));
        builder.republish(Republish.optionalInstance(JsonValueUtils.readValue(jsonValue, ApiConstants.REPUBLISH)));
        builder.mirror(Mirror.optionalInstance(JsonValueUtils.readValue(jsonValue, ApiConstants.MIRROR)));
        builder.sources(Source.optionalListOf(JsonValueUtils.readValue(jsonValue, ApiConstants.SOURCES)));
        builder.sealed(JsonValueUtils.readBoolean(jsonValue, ApiConstants.SEALED));
        builder.allowRollup(JsonValueUtils.readBoolean(jsonValue, ApiConstants.ALLOW_ROLLUP_HDRS));
        builder.allowDirect(JsonValueUtils.readBoolean(jsonValue, ApiConstants.ALLOW_DIRECT));
        builder.mirrorDirect(JsonValueUtils.readBoolean(jsonValue, ApiConstants.MIRROR_DIRECT));
        builder.denyDelete(JsonValueUtils.readBoolean(jsonValue, ApiConstants.DENY_DELETE));
        builder.denyPurge(JsonValueUtils.readBoolean(jsonValue, ApiConstants.DENY_PURGE));
        builder.discardNewPerSubject(JsonValueUtils.readBoolean(jsonValue, ApiConstants.DISCARD_NEW_PER_SUBJECT));
        builder.metadata(JsonValueUtils.readStringStringMap(jsonValue, "metadata"));
        return builder.build();
    }

    StreamConfiguration(Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.subjects = builder.subjects;
        this.retentionPolicy = builder.retentionPolicy;
        this.maxConsumers = builder.maxConsumers;
        this.maxMsgs = builder.maxMsgs;
        this.maxMsgsPerSubject = builder.maxMsgsPerSubject;
        this.maxBytes = builder.maxBytes;
        this.maxAge = builder.maxAge;
        this.maxMsgSize = builder.maxMsgSize;
        this.storageType = builder.storageType;
        this.replicas = builder.replicas;
        this.noAck = builder.noAck;
        this.templateOwner = builder.templateOwner;
        this.discardPolicy = builder.discardPolicy;
        this.duplicateWindow = builder.duplicateWindow;
        this.placement = builder.placement;
        this.republish = builder.republish;
        this.mirror = builder.mirror;
        this.sources = builder.sources;
        this.sealed = builder.sealed;
        this.allowRollup = builder.allowRollup;
        this.allowDirect = builder.allowDirect;
        this.mirrorDirect = builder.mirrorDirect;
        this.denyDelete = builder.denyDelete;
        this.denyPurge = builder.denyPurge;
        this.discardNewPerSubject = builder.discardNewPerSubject;
        this.metadata = builder.metadata;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "name", this.name);
        JsonUtils.addField(beginJson, "description", this.description);
        JsonUtils.addStrings(beginJson, ApiConstants.SUBJECTS, this.subjects);
        JsonUtils.addField(beginJson, ApiConstants.RETENTION, this.retentionPolicy.toString());
        JsonUtils.addField(beginJson, ApiConstants.MAX_CONSUMERS, Long.valueOf(this.maxConsumers));
        JsonUtils.addField(beginJson, ApiConstants.MAX_MSGS, Long.valueOf(this.maxMsgs));
        JsonUtils.addField(beginJson, ApiConstants.MAX_MSGS_PER_SUB, Long.valueOf(this.maxMsgsPerSubject));
        JsonUtils.addField(beginJson, ApiConstants.MAX_BYTES, Long.valueOf(this.maxBytes));
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.MAX_AGE, this.maxAge);
        JsonUtils.addField(beginJson, ApiConstants.MAX_MSG_SIZE, Long.valueOf(this.maxMsgSize));
        JsonUtils.addField(beginJson, ApiConstants.STORAGE, this.storageType.toString());
        JsonUtils.addField(beginJson, ApiConstants.NUM_REPLICAS, Integer.valueOf(this.replicas));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.NO_ACK, Boolean.valueOf(this.noAck));
        JsonUtils.addField(beginJson, ApiConstants.TEMPLATE_OWNER, this.templateOwner);
        JsonUtils.addField(beginJson, ApiConstants.DISCARD, this.discardPolicy.toString());
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.DUPLICATE_WINDOW, this.duplicateWindow);
        Placement placement = this.placement;
        if (placement != null) {
            JsonUtils.addField(beginJson, "placement", placement);
        }
        Republish republish = this.republish;
        if (republish != null) {
            JsonUtils.addField(beginJson, ApiConstants.REPUBLISH, republish);
        }
        Mirror mirror = this.mirror;
        if (mirror != null) {
            JsonUtils.addField(beginJson, ApiConstants.MIRROR, mirror);
        }
        JsonUtils.addJsons(beginJson, ApiConstants.SOURCES, this.sources);
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.SEALED, Boolean.valueOf(this.sealed));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.ALLOW_ROLLUP_HDRS, Boolean.valueOf(this.allowRollup));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.ALLOW_DIRECT, Boolean.valueOf(this.allowDirect));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.MIRROR_DIRECT, Boolean.valueOf(this.mirrorDirect));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.DENY_DELETE, Boolean.valueOf(this.denyDelete));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.DENY_PURGE, Boolean.valueOf(this.denyPurge));
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.DISCARD_NEW_PER_SUBJECT, Boolean.valueOf(this.discardNewPerSubject));
        JsonUtils.addField(beginJson, "metadata", this.metadata);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public DiscardPolicy getDiscardPolicy() {
        return this.discardPolicy;
    }

    public RetentionPolicy getRetentionPolicy() {
        return this.retentionPolicy;
    }

    public long getMaxConsumers() {
        return this.maxConsumers;
    }

    public long getMaxMsgs() {
        return this.maxMsgs;
    }

    public long getMaxMsgsPerSubject() {
        return this.maxMsgsPerSubject;
    }

    public long getMaxBytes() {
        return this.maxBytes;
    }

    public Duration getMaxAge() {
        return this.maxAge;
    }

    public long getMaxMsgSize() {
        return this.maxMsgSize;
    }

    public StorageType getStorageType() {
        return this.storageType;
    }

    public int getReplicas() {
        return this.replicas;
    }

    public boolean getNoAck() {
        return this.noAck;
    }

    public String getTemplateOwner() {
        return this.templateOwner;
    }

    public Duration getDuplicateWindow() {
        return this.duplicateWindow;
    }

    public Placement getPlacement() {
        return this.placement;
    }

    public Republish getRepublish() {
        return this.republish;
    }

    public Mirror getMirror() {
        return this.mirror;
    }

    public List<Source> getSources() {
        return this.sources;
    }

    public boolean getSealed() {
        return this.sealed;
    }

    public boolean getAllowRollup() {
        return this.allowRollup;
    }

    public boolean getAllowDirect() {
        return this.allowDirect;
    }

    public boolean getMirrorDirect() {
        return this.mirrorDirect;
    }

    public boolean getDenyDelete() {
        return this.denyDelete;
    }

    public boolean getDenyPurge() {
        return this.denyPurge;
    }

    public boolean isDiscardNewPerSubject() {
        return this.discardNewPerSubject;
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public String toString() {
        return "StreamConfiguration{name='" + this.name + "', description='" + this.description + "', subjects=" + this.subjects + ", retentionPolicy=" + this.retentionPolicy + ", maxConsumers=" + this.maxConsumers + ", maxMsgs=" + this.maxMsgs + ", maxMsgsPerSubject=" + this.maxMsgsPerSubject + ", maxBytes=" + this.maxBytes + ", maxAge=" + this.maxAge + ", maxMsgSize=" + this.maxMsgSize + ", storageType=" + this.storageType + ", replicas=" + this.replicas + ", noAck=" + this.noAck + ", template='" + this.templateOwner + "', discardPolicy=" + this.discardPolicy + ", duplicateWindow=" + this.duplicateWindow + ", allowRollup=" + this.allowRollup + ", allowDirect=" + this.allowDirect + ", mirrorDirect=" + this.mirrorDirect + ", denyDelete=" + this.denyDelete + ", denyPurge=" + this.denyPurge + ", discardNewPerSubject=" + this.discardNewPerSubject + ", " + this.mirror + ", " + this.placement + ", sources=" + this.sources + ", metadata=" + this.metadata + AbstractJsonLexerKt.END_OBJ;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConfiguration streamConfiguration) {
        return new Builder(streamConfiguration);
    }

    public static class Builder {
        private boolean allowDirect;
        private boolean allowRollup;
        private boolean denyDelete;
        private boolean denyPurge;
        private String description;
        private boolean discardNewPerSubject;
        private DiscardPolicy discardPolicy;
        private Duration duplicateWindow;
        private Duration maxAge;
        private long maxBytes;
        private long maxConsumers;
        private long maxMsgSize;
        private long maxMsgs;
        private long maxMsgsPerSubject;
        private Map<String, String> metadata;
        private Mirror mirror;
        private boolean mirrorDirect;
        private String name;
        private boolean noAck;
        private Placement placement;
        private int replicas;
        private Republish republish;
        private RetentionPolicy retentionPolicy;
        private boolean sealed;
        private final List<Source> sources;
        private StorageType storageType;
        private final List<String> subjects;
        private String templateOwner;

        public Builder() {
            this.name = null;
            this.description = null;
            this.subjects = new ArrayList();
            this.retentionPolicy = RetentionPolicy.Limits;
            this.maxConsumers = -1L;
            this.maxMsgs = -1L;
            this.maxMsgsPerSubject = -1L;
            this.maxBytes = -1L;
            this.maxAge = Duration.ZERO;
            this.maxMsgSize = -1L;
            this.storageType = StorageType.File;
            this.replicas = 1;
            this.noAck = false;
            this.templateOwner = null;
            this.discardPolicy = DiscardPolicy.Old;
            this.duplicateWindow = Duration.ZERO;
            this.placement = null;
            this.republish = null;
            this.mirror = null;
            this.sources = new ArrayList();
            this.sealed = false;
            this.allowRollup = false;
            this.allowDirect = false;
            this.mirrorDirect = false;
            this.denyDelete = false;
            this.denyPurge = false;
            this.discardNewPerSubject = false;
        }

        public Builder(StreamConfiguration streamConfiguration) {
            this.name = null;
            this.description = null;
            this.subjects = new ArrayList();
            this.retentionPolicy = RetentionPolicy.Limits;
            this.maxConsumers = -1L;
            this.maxMsgs = -1L;
            this.maxMsgsPerSubject = -1L;
            this.maxBytes = -1L;
            this.maxAge = Duration.ZERO;
            this.maxMsgSize = -1L;
            this.storageType = StorageType.File;
            this.replicas = 1;
            this.noAck = false;
            this.templateOwner = null;
            this.discardPolicy = DiscardPolicy.Old;
            this.duplicateWindow = Duration.ZERO;
            this.placement = null;
            this.republish = null;
            this.mirror = null;
            this.sources = new ArrayList();
            this.sealed = false;
            this.allowRollup = false;
            this.allowDirect = false;
            this.mirrorDirect = false;
            this.denyDelete = false;
            this.denyPurge = false;
            this.discardNewPerSubject = false;
            if (streamConfiguration != null) {
                this.name = streamConfiguration.name;
                this.description = streamConfiguration.description;
                subjects(streamConfiguration.subjects);
                this.retentionPolicy = streamConfiguration.retentionPolicy;
                this.maxConsumers = streamConfiguration.maxConsumers;
                this.maxMsgs = streamConfiguration.maxMsgs;
                this.maxMsgsPerSubject = streamConfiguration.maxMsgsPerSubject;
                this.maxBytes = streamConfiguration.maxBytes;
                this.maxAge = streamConfiguration.maxAge;
                this.maxMsgSize = streamConfiguration.maxMsgSize;
                this.storageType = streamConfiguration.storageType;
                this.replicas = streamConfiguration.replicas;
                this.noAck = streamConfiguration.noAck;
                this.templateOwner = streamConfiguration.templateOwner;
                this.discardPolicy = streamConfiguration.discardPolicy;
                this.duplicateWindow = streamConfiguration.duplicateWindow;
                this.placement = streamConfiguration.placement;
                this.republish = streamConfiguration.republish;
                this.mirror = streamConfiguration.mirror;
                sources(streamConfiguration.sources);
                this.sealed = streamConfiguration.sealed;
                this.allowRollup = streamConfiguration.allowRollup;
                this.allowDirect = streamConfiguration.allowDirect;
                this.mirrorDirect = streamConfiguration.mirrorDirect;
                this.denyDelete = streamConfiguration.denyDelete;
                this.denyPurge = streamConfiguration.denyPurge;
                this.discardNewPerSubject = streamConfiguration.discardNewPerSubject;
                if (streamConfiguration.metadata != null) {
                    this.metadata = new HashMap(streamConfiguration.metadata);
                }
            }
        }

        public Builder name(String str) {
            this.name = Validator.validateStreamName(str, false);
            return this;
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder subjects(String... strArr) {
            this.subjects.clear();
            return addSubjects(strArr);
        }

        public Builder subjects(Collection<String> collection) {
            this.subjects.clear();
            return addSubjects(collection);
        }

        public Builder addSubjects(String... strArr) {
            return strArr != null ? addSubjects(Arrays.asList(strArr)) : this;
        }

        public Builder addSubjects(Collection<String> collection) {
            if (collection != null) {
                for (String str : collection) {
                    if (str != null && !this.subjects.contains(str)) {
                        this.subjects.add(str);
                    }
                }
            }
            return this;
        }

        public Builder retentionPolicy(RetentionPolicy retentionPolicy) {
            if (retentionPolicy == null) {
                retentionPolicy = RetentionPolicy.Limits;
            }
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder maxConsumers(long j) {
            this.maxConsumers = Validator.validateMaxConsumers(j);
            return this;
        }

        public Builder maxMessages(long j) {
            this.maxMsgs = Validator.validateMaxMessages(j);
            return this;
        }

        public Builder maxMessagesPerSubject(long j) {
            this.maxMsgsPerSubject = Validator.validateMaxMessagesPerSubject(j);
            return this;
        }

        public Builder maxBytes(long j) {
            this.maxBytes = Validator.validateMaxBytes(j);
            return this;
        }

        public Builder maxAge(Duration duration) {
            this.maxAge = Validator.validateDurationNotRequiredGtOrEqZero(duration, Duration.ZERO);
            return this;
        }

        public Builder maxAge(long j) {
            this.maxAge = Validator.validateDurationNotRequiredGtOrEqZero(j);
            return this;
        }

        public Builder maxMsgSize(long j) {
            this.maxMsgSize = Validator.validateMaxMessageSize(j);
            return this;
        }

        public Builder storageType(StorageType storageType) {
            if (storageType == null) {
                storageType = StorageType.File;
            }
            this.storageType = storageType;
            return this;
        }

        public Builder replicas(int i) {
            this.replicas = Validator.validateNumberOfReplicas(i);
            return this;
        }

        public Builder noAck(boolean z) {
            this.noAck = z;
            return this;
        }

        public Builder templateOwner(String str) {
            this.templateOwner = Validator.emptyAsNull(str);
            return this;
        }

        public Builder discardPolicy(DiscardPolicy discardPolicy) {
            if (discardPolicy == null) {
                discardPolicy = DiscardPolicy.Old;
            }
            this.discardPolicy = discardPolicy;
            return this;
        }

        public Builder duplicateWindow(Duration duration) {
            this.duplicateWindow = Validator.validateDurationNotRequiredGtOrEqZero(duration, Duration.ZERO);
            return this;
        }

        public Builder duplicateWindow(long j) {
            this.duplicateWindow = Validator.validateDurationNotRequiredGtOrEqZero(j);
            return this;
        }

        public Builder placement(Placement placement) {
            this.placement = placement;
            return this;
        }

        public Builder republish(Republish republish) {
            this.republish = republish;
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

        public Builder addSources(Source... sourceArr) {
            return addSources(Arrays.asList(sourceArr));
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

        public Builder addSource(Source source) {
            if (source != null && !this.sources.contains(source)) {
                this.sources.add(source);
            }
            return this;
        }

        protected Builder sealed(boolean z) {
            this.sealed = z;
            return this;
        }

        public Builder allowRollup(boolean z) {
            this.allowRollup = z;
            return this;
        }

        public Builder allowDirect(boolean z) {
            this.allowDirect = z;
            return this;
        }

        public Builder mirrorDirect(boolean z) {
            this.mirrorDirect = z;
            return this;
        }

        public Builder denyDelete(boolean z) {
            this.denyDelete = z;
            return this;
        }

        public Builder denyPurge(boolean z) {
            this.denyPurge = z;
            return this;
        }

        public Builder discardNewPerSubject(boolean z) {
            this.discardNewPerSubject = z;
            return this;
        }

        public Builder seal() {
            this.sealed = true;
            return this;
        }

        public Builder metadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public StreamConfiguration build() {
            return new StreamConfiguration(this);
        }
    }
}
