package io.nats.client.api;

import io.nats.client.PullSubscribeOptions;
import io.nats.client.PushSubscribeOptions;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import io.nats.client.support.NatsJetStreamClientError;
import io.nats.client.support.Validator;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ConsumerConfiguration implements JsonSerializable {
    public static final long DURATION_MIN_LONG = 1;
    public static final long DURATION_UNSET_LONG = 0;
    public static final int INTEGER_UNSET = -1;
    public static final long LONG_UNSET = -1;
    public static final int MAX_DELIVER_MIN = 1;
    public static final Duration MIN_IDLE_HEARTBEAT;
    public static final long MIN_IDLE_HEARTBEAT_MILLIS;
    public static final long MIN_IDLE_HEARTBEAT_NANOS;
    public static final int STANDARD_MIN = 0;
    public static final long ULONG_UNSET = 0;
    protected final AckPolicy ackPolicy;
    protected final Duration ackWait;
    protected final List<Duration> backoff;
    protected final String deliverGroup;
    protected final DeliverPolicy deliverPolicy;
    protected final String deliverSubject;
    protected final String description;
    protected final String durable;
    protected final String filterSubject;
    protected final Boolean flowControl;
    protected final Boolean headersOnly;
    protected final Duration idleHeartbeat;
    protected final Duration inactiveThreshold;
    protected final Integer maxAckPending;
    protected final Integer maxBatch;
    protected final Integer maxBytes;
    protected final Integer maxDeliver;
    protected final Duration maxExpires;
    protected final Integer maxPullWaiting;
    protected final Boolean memStorage;
    protected final Map<String, String> metadata;
    protected final String name;
    protected final Integer numReplicas;
    protected final Long rateLimit;
    protected final ReplayPolicy replayPolicy;
    protected final String sampleFrequency;
    protected final Long startSeq;
    protected final ZonedDateTime startTime;

    @Deprecated
    public static final Duration DURATION_MIN = Duration.ofNanos(1);
    public static final DeliverPolicy DEFAULT_DELIVER_POLICY = DeliverPolicy.All;
    public static final AckPolicy DEFAULT_ACK_POLICY = AckPolicy.Explicit;
    public static final ReplayPolicy DEFAULT_REPLAY_POLICY = ReplayPolicy.Instant;
    public static final Duration DURATION_UNSET = Duration.ZERO;

    static {
        Duration ofMillis = Duration.ofMillis(100L);
        MIN_IDLE_HEARTBEAT = ofMillis;
        MIN_IDLE_HEARTBEAT_NANOS = ofMillis.toNanos();
        MIN_IDLE_HEARTBEAT_MILLIS = ofMillis.toMillis();
    }

    protected ConsumerConfiguration(ConsumerConfiguration consumerConfiguration) {
        this.deliverPolicy = consumerConfiguration.deliverPolicy;
        this.ackPolicy = consumerConfiguration.ackPolicy;
        this.replayPolicy = consumerConfiguration.replayPolicy;
        this.description = consumerConfiguration.description;
        this.durable = consumerConfiguration.durable;
        this.name = consumerConfiguration.name;
        this.deliverSubject = consumerConfiguration.deliverSubject;
        this.deliverGroup = consumerConfiguration.deliverGroup;
        this.filterSubject = consumerConfiguration.filterSubject;
        this.sampleFrequency = consumerConfiguration.sampleFrequency;
        this.startTime = consumerConfiguration.startTime;
        this.ackWait = consumerConfiguration.ackWait;
        this.idleHeartbeat = consumerConfiguration.idleHeartbeat;
        this.maxExpires = consumerConfiguration.maxExpires;
        this.inactiveThreshold = consumerConfiguration.inactiveThreshold;
        this.startSeq = consumerConfiguration.startSeq;
        this.maxDeliver = consumerConfiguration.maxDeliver;
        this.rateLimit = consumerConfiguration.rateLimit;
        this.maxAckPending = consumerConfiguration.maxAckPending;
        this.maxPullWaiting = consumerConfiguration.maxPullWaiting;
        this.maxBatch = consumerConfiguration.maxBatch;
        this.maxBytes = consumerConfiguration.maxBytes;
        this.numReplicas = consumerConfiguration.numReplicas;
        this.flowControl = consumerConfiguration.flowControl;
        this.headersOnly = consumerConfiguration.headersOnly;
        this.memStorage = consumerConfiguration.memStorage;
        this.backoff = consumerConfiguration.backoff == null ? null : new ArrayList(consumerConfiguration.backoff);
        this.metadata = consumerConfiguration.metadata != null ? new HashMap(consumerConfiguration.metadata) : null;
    }

    ConsumerConfiguration(JsonValue jsonValue) {
        this.deliverPolicy = DeliverPolicy.get(JsonValueUtils.readString(jsonValue, ApiConstants.DELIVER_POLICY));
        this.ackPolicy = AckPolicy.get(JsonValueUtils.readString(jsonValue, ApiConstants.ACK_POLICY));
        this.replayPolicy = ReplayPolicy.get(JsonValueUtils.readString(jsonValue, ApiConstants.REPLAY_POLICY));
        this.description = JsonValueUtils.readString(jsonValue, "description");
        this.durable = JsonValueUtils.readString(jsonValue, ApiConstants.DURABLE_NAME);
        this.name = JsonValueUtils.readString(jsonValue, "name");
        this.deliverSubject = JsonValueUtils.readString(jsonValue, ApiConstants.DELIVER_SUBJECT);
        this.deliverGroup = JsonValueUtils.readString(jsonValue, ApiConstants.DELIVER_GROUP);
        this.filterSubject = JsonValueUtils.readString(jsonValue, ApiConstants.FILTER_SUBJECT);
        this.sampleFrequency = JsonValueUtils.readString(jsonValue, ApiConstants.SAMPLE_FREQ);
        this.startTime = JsonValueUtils.readDate(jsonValue, ApiConstants.OPT_START_TIME);
        this.ackWait = JsonValueUtils.readNanos(jsonValue, ApiConstants.ACK_WAIT);
        this.idleHeartbeat = JsonValueUtils.readNanos(jsonValue, ApiConstants.IDLE_HEARTBEAT);
        this.maxExpires = JsonValueUtils.readNanos(jsonValue, ApiConstants.MAX_EXPIRES);
        this.inactiveThreshold = JsonValueUtils.readNanos(jsonValue, ApiConstants.INACTIVE_THRESHOLD);
        this.startSeq = JsonValueUtils.readLong(jsonValue, ApiConstants.OPT_START_SEQ);
        this.maxDeliver = JsonValueUtils.readInteger(jsonValue, ApiConstants.MAX_DELIVER);
        this.rateLimit = JsonValueUtils.readLong(jsonValue, ApiConstants.RATE_LIMIT_BPS);
        this.maxAckPending = JsonValueUtils.readInteger(jsonValue, ApiConstants.MAX_ACK_PENDING);
        this.maxPullWaiting = JsonValueUtils.readInteger(jsonValue, ApiConstants.MAX_WAITING);
        this.maxBatch = JsonValueUtils.readInteger(jsonValue, ApiConstants.MAX_BATCH);
        this.maxBytes = JsonValueUtils.readInteger(jsonValue, ApiConstants.MAX_BYTES);
        this.numReplicas = JsonValueUtils.readInteger(jsonValue, ApiConstants.NUM_REPLICAS);
        this.flowControl = JsonValueUtils.readBoolean(jsonValue, ApiConstants.FLOW_CONTROL, null);
        this.headersOnly = JsonValueUtils.readBoolean(jsonValue, ApiConstants.HEADERS_ONLY, null);
        this.memStorage = JsonValueUtils.readBoolean(jsonValue, ApiConstants.MEM_STORAGE, null);
        this.backoff = JsonValueUtils.readNanosList(jsonValue, ApiConstants.BACKOFF, true);
        this.metadata = JsonValueUtils.readStringStringMap(jsonValue, "metadata");
    }

    protected ConsumerConfiguration(Builder builder) {
        this.deliverPolicy = builder.deliverPolicy;
        this.ackPolicy = builder.ackPolicy;
        this.replayPolicy = builder.replayPolicy;
        this.description = builder.description;
        this.durable = builder.durable;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.ackWait = builder.ackWait;
        this.filterSubject = builder.filterSubject;
        this.sampleFrequency = builder.sampleFrequency;
        this.deliverSubject = builder.deliverSubject;
        this.deliverGroup = builder.deliverGroup;
        this.idleHeartbeat = builder.idleHeartbeat;
        this.maxExpires = builder.maxExpires;
        this.inactiveThreshold = builder.inactiveThreshold;
        this.startSeq = builder.startSeq;
        this.maxDeliver = builder.maxDeliver;
        this.rateLimit = builder.rateLimit;
        this.maxAckPending = builder.maxAckPending;
        this.maxPullWaiting = builder.maxPullWaiting;
        this.maxBatch = builder.maxBatch;
        this.maxBytes = builder.maxBytes;
        this.numReplicas = builder.numReplicas;
        this.flowControl = builder.flowControl;
        this.headersOnly = builder.headersOnly;
        this.memStorage = builder.memStorage;
        this.backoff = builder.backoff;
        this.metadata = builder.metadata;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, "description", this.description);
        JsonUtils.addField(beginJson, ApiConstants.DURABLE_NAME, this.durable);
        JsonUtils.addField(beginJson, "name", this.name);
        JsonUtils.addField(beginJson, ApiConstants.DELIVER_SUBJECT, this.deliverSubject);
        JsonUtils.addField(beginJson, ApiConstants.DELIVER_GROUP, this.deliverGroup);
        JsonUtils.addField(beginJson, ApiConstants.DELIVER_POLICY, GetOrDefault(this.deliverPolicy).toString());
        JsonUtils.addFieldWhenGtZero(beginJson, ApiConstants.OPT_START_SEQ, this.startSeq);
        JsonUtils.addField(beginJson, ApiConstants.OPT_START_TIME, this.startTime);
        JsonUtils.addField(beginJson, ApiConstants.ACK_POLICY, GetOrDefault(this.ackPolicy).toString());
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.ACK_WAIT, this.ackWait);
        JsonUtils.addFieldWhenGtZero(beginJson, ApiConstants.MAX_DELIVER, this.maxDeliver);
        JsonUtils.addField(beginJson, ApiConstants.MAX_ACK_PENDING, this.maxAckPending);
        JsonUtils.addField(beginJson, ApiConstants.FILTER_SUBJECT, this.filterSubject);
        JsonUtils.addField(beginJson, ApiConstants.REPLAY_POLICY, GetOrDefault(this.replayPolicy).toString());
        JsonUtils.addField(beginJson, ApiConstants.SAMPLE_FREQ, this.sampleFrequency);
        JsonUtils.addFieldWhenGtZero(beginJson, ApiConstants.RATE_LIMIT_BPS, this.rateLimit);
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.IDLE_HEARTBEAT, this.idleHeartbeat);
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.FLOW_CONTROL, this.flowControl);
        JsonUtils.addField(beginJson, ApiConstants.MAX_WAITING, this.maxPullWaiting);
        JsonUtils.addFldWhenTrue(beginJson, ApiConstants.HEADERS_ONLY, this.headersOnly);
        JsonUtils.addField(beginJson, ApiConstants.MAX_BATCH, this.maxBatch);
        JsonUtils.addField(beginJson, ApiConstants.MAX_BYTES, this.maxBytes);
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.MAX_EXPIRES, this.maxExpires);
        JsonUtils.addFieldAsNanos(beginJson, ApiConstants.INACTIVE_THRESHOLD, this.inactiveThreshold);
        JsonUtils.addDurations(beginJson, ApiConstants.BACKOFF, this.backoff);
        JsonUtils.addField(beginJson, ApiConstants.NUM_REPLICAS, this.numReplicas);
        JsonUtils.addField(beginJson, ApiConstants.MEM_STORAGE, this.memStorage);
        JsonUtils.addField(beginJson, "metadata", this.metadata);
        return JsonUtils.endJson(beginJson).toString();
    }

    public String getDescription() {
        return this.description;
    }

    public String getDurable() {
        return this.durable;
    }

    public String getName() {
        return this.name;
    }

    public String getDeliverSubject() {
        return this.deliverSubject;
    }

    public String getDeliverGroup() {
        return this.deliverGroup;
    }

    public DeliverPolicy getDeliverPolicy() {
        return GetOrDefault(this.deliverPolicy);
    }

    public long getStartSequence() {
        return getOrUnsetUlong(this.startSeq);
    }

    public ZonedDateTime getStartTime() {
        return this.startTime;
    }

    public AckPolicy getAckPolicy() {
        return GetOrDefault(this.ackPolicy);
    }

    public Duration getAckWait() {
        return this.ackWait;
    }

    public long getMaxDeliver() {
        return getOrUnset(this.maxDeliver);
    }

    public String getFilterSubject() {
        return this.filterSubject;
    }

    public ReplayPolicy getReplayPolicy() {
        return GetOrDefault(this.replayPolicy);
    }

    public long getRateLimit() {
        return getOrUnsetUlong(this.rateLimit);
    }

    public long getMaxAckPending() {
        return getOrUnset(this.maxAckPending);
    }

    public String getSampleFrequency() {
        return this.sampleFrequency;
    }

    public Duration getIdleHeartbeat() {
        return this.idleHeartbeat;
    }

    public boolean isFlowControl() {
        return Boolean.TRUE.equals(this.flowControl);
    }

    public long getMaxPullWaiting() {
        return getOrUnset(this.maxPullWaiting);
    }

    public boolean isHeadersOnly() {
        Boolean bool = this.headersOnly;
        return bool != null && bool.booleanValue();
    }

    public boolean isMemStorage() {
        Boolean bool = this.memStorage;
        return bool != null && bool.booleanValue();
    }

    public long getMaxBatch() {
        return getOrUnset(this.maxBatch);
    }

    public long getMaxBytes() {
        return getOrUnset(this.maxBytes);
    }

    public Duration getMaxExpires() {
        return this.maxExpires;
    }

    public Duration getInactiveThreshold() {
        return this.inactiveThreshold;
    }

    public List<Duration> getBackoff() {
        List<Duration> list = this.backoff;
        return list == null ? Collections.emptyList() : list;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> map = this.metadata;
        return map == null ? Collections.emptyMap() : map;
    }

    public int getNumReplicas() {
        return getOrUnset(this.numReplicas);
    }

    public boolean deliverPolicyWasSet() {
        return this.deliverPolicy != null;
    }

    public boolean ackPolicyWasSet() {
        return this.ackPolicy != null;
    }

    public boolean replayPolicyWasSet() {
        return this.replayPolicy != null;
    }

    public boolean startSeqWasSet() {
        return this.startSeq != null;
    }

    public boolean maxDeliverWasSet() {
        return this.maxDeliver != null;
    }

    public boolean rateLimitWasSet() {
        return this.rateLimit != null;
    }

    public boolean maxAckPendingWasSet() {
        return this.maxAckPending != null;
    }

    public boolean maxPullWaitingWasSet() {
        return this.maxPullWaiting != null;
    }

    public boolean maxBatchWasSet() {
        return this.maxBatch != null;
    }

    public boolean maxBytesWasSet() {
        return this.maxBytes != null;
    }

    public boolean flowControlWasSet() {
        return this.flowControl != null;
    }

    public boolean headersOnlyWasSet() {
        return this.headersOnly != null;
    }

    public boolean memStorageWasSet() {
        return this.memStorage != null;
    }

    public boolean numReplicasWasSet() {
        return this.numReplicas != null;
    }

    public boolean backoffWasSet() {
        return this.backoff != null;
    }

    public boolean metadataWasSet() {
        return this.metadata != null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerConfiguration consumerConfiguration) {
        return consumerConfiguration == null ? new Builder() : new Builder(consumerConfiguration);
    }

    public static class Builder {
        private AckPolicy ackPolicy;
        private Duration ackWait;
        private List<Duration> backoff;
        private String deliverGroup;
        private DeliverPolicy deliverPolicy;
        private String deliverSubject;
        private String description;
        private String durable;
        private String filterSubject;
        private Boolean flowControl;
        private Boolean headersOnly;
        private Duration idleHeartbeat;
        private Duration inactiveThreshold;
        private Integer maxAckPending;
        private Integer maxBatch;
        private Integer maxBytes;
        private Integer maxDeliver;
        private Duration maxExpires;
        private Integer maxPullWaiting;
        private Boolean memStorage;
        private Map<String, String> metadata;
        private String name;
        private Integer numReplicas;
        private Long rateLimit;
        private ReplayPolicy replayPolicy;
        private String sampleFrequency;
        private Long startSeq;
        private ZonedDateTime startTime;

        public Builder() {
        }

        public Builder(ConsumerConfiguration consumerConfiguration) {
            if (consumerConfiguration != null) {
                this.deliverPolicy = consumerConfiguration.deliverPolicy;
                this.ackPolicy = consumerConfiguration.ackPolicy;
                this.replayPolicy = consumerConfiguration.replayPolicy;
                this.description = consumerConfiguration.description;
                this.durable = consumerConfiguration.durable;
                this.name = consumerConfiguration.name;
                this.deliverSubject = consumerConfiguration.deliverSubject;
                this.deliverGroup = consumerConfiguration.deliverGroup;
                this.filterSubject = consumerConfiguration.filterSubject;
                this.sampleFrequency = consumerConfiguration.sampleFrequency;
                this.startTime = consumerConfiguration.startTime;
                this.ackWait = consumerConfiguration.ackWait;
                this.idleHeartbeat = consumerConfiguration.idleHeartbeat;
                this.maxExpires = consumerConfiguration.maxExpires;
                this.inactiveThreshold = consumerConfiguration.inactiveThreshold;
                this.startSeq = consumerConfiguration.startSeq;
                this.maxDeliver = consumerConfiguration.maxDeliver;
                this.rateLimit = consumerConfiguration.rateLimit;
                this.maxAckPending = consumerConfiguration.maxAckPending;
                this.maxPullWaiting = consumerConfiguration.maxPullWaiting;
                this.maxBatch = consumerConfiguration.maxBatch;
                this.maxBytes = consumerConfiguration.maxBytes;
                this.numReplicas = consumerConfiguration.numReplicas;
                this.flowControl = consumerConfiguration.flowControl;
                this.headersOnly = consumerConfiguration.headersOnly;
                this.memStorage = consumerConfiguration.memStorage;
                if (consumerConfiguration.backoff != null) {
                    this.backoff = new ArrayList(consumerConfiguration.backoff);
                }
                if (consumerConfiguration.metadata != null) {
                    this.metadata = new HashMap(consumerConfiguration.metadata);
                }
            }
        }

        public Builder description(String str) {
            this.description = Validator.emptyAsNull(str);
            return this;
        }

        public Builder durable(String str) {
            this.durable = Validator.validateDurable(str, false);
            return this;
        }

        public Builder name(String str) {
            this.name = Validator.validateConsumerName(str, false);
            return this;
        }

        public Builder deliverPolicy(DeliverPolicy deliverPolicy) {
            this.deliverPolicy = deliverPolicy;
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

        public Builder startSequence(Long l) {
            this.startSeq = ConsumerConfiguration.normalizeUlong(l);
            return this;
        }

        public Builder startSequence(long j) {
            this.startSeq = ConsumerConfiguration.normalizeUlong(Long.valueOf(j));
            return this;
        }

        public Builder startTime(ZonedDateTime zonedDateTime) {
            this.startTime = zonedDateTime;
            return this;
        }

        public Builder ackPolicy(AckPolicy ackPolicy) {
            this.ackPolicy = ackPolicy;
            return this;
        }

        public Builder ackWait(Duration duration) {
            this.ackWait = ConsumerConfiguration.normalize(duration);
            return this;
        }

        public Builder ackWait(long j) {
            this.ackWait = ConsumerConfiguration.normalizeDuration(j);
            return this;
        }

        public Builder maxDeliver(Long l) {
            this.maxDeliver = ConsumerConfiguration.normalize(l, 1);
            return this;
        }

        public Builder maxDeliver(long j) {
            this.maxDeliver = ConsumerConfiguration.normalize(Long.valueOf(j), 1);
            return this;
        }

        public Builder filterSubject(String str) {
            this.filterSubject = Validator.emptyAsNull(str);
            return this;
        }

        public Builder replayPolicy(ReplayPolicy replayPolicy) {
            this.replayPolicy = replayPolicy;
            return this;
        }

        public Builder sampleFrequency(String str) {
            this.sampleFrequency = Validator.emptyAsNull(str);
            return this;
        }

        public Builder rateLimit(Long l) {
            this.rateLimit = ConsumerConfiguration.normalizeUlong(l);
            return this;
        }

        public Builder rateLimit(long j) {
            this.rateLimit = ConsumerConfiguration.normalizeUlong(Long.valueOf(j));
            return this;
        }

        public Builder maxAckPending(Long l) {
            this.maxAckPending = ConsumerConfiguration.normalize(l, 0);
            return this;
        }

        public Builder maxAckPending(long j) {
            this.maxAckPending = ConsumerConfiguration.normalize(Long.valueOf(j), 0);
            return this;
        }

        public Builder idleHeartbeat(Duration duration) {
            if (duration == null) {
                this.idleHeartbeat = null;
                return this;
            }
            long nanos = duration.toNanos();
            if (nanos <= 0) {
                this.idleHeartbeat = ConsumerConfiguration.DURATION_UNSET;
                return this;
            }
            if (nanos < ConsumerConfiguration.MIN_IDLE_HEARTBEAT_NANOS) {
                throw new IllegalArgumentException("Duration must be greater than or equal to " + ConsumerConfiguration.MIN_IDLE_HEARTBEAT_NANOS + " nanos.");
            }
            this.idleHeartbeat = duration;
            return this;
        }

        public Builder idleHeartbeat(long j) {
            if (j <= 0) {
                this.idleHeartbeat = ConsumerConfiguration.DURATION_UNSET;
                return this;
            }
            if (j < ConsumerConfiguration.MIN_IDLE_HEARTBEAT_MILLIS) {
                throw new IllegalArgumentException("Duration must be greater than or equal to " + ConsumerConfiguration.MIN_IDLE_HEARTBEAT_MILLIS + " milliseconds.");
            }
            this.idleHeartbeat = Duration.ofMillis(j);
            return this;
        }

        public Builder flowControl(Duration duration) {
            this.flowControl = true;
            return idleHeartbeat(duration);
        }

        public Builder flowControl(long j) {
            this.flowControl = true;
            return idleHeartbeat(j);
        }

        public Builder maxExpires(Duration duration) {
            this.maxExpires = ConsumerConfiguration.normalize(duration);
            return this;
        }

        public Builder maxExpires(long j) {
            this.maxExpires = ConsumerConfiguration.normalizeDuration(j);
            return this;
        }

        public Builder inactiveThreshold(Duration duration) {
            this.inactiveThreshold = ConsumerConfiguration.normalize(duration);
            return this;
        }

        public Builder inactiveThreshold(long j) {
            this.inactiveThreshold = ConsumerConfiguration.normalizeDuration(j);
            return this;
        }

        public Builder maxPullWaiting(Long l) {
            this.maxPullWaiting = ConsumerConfiguration.normalize(l, 0);
            return this;
        }

        public Builder maxPullWaiting(long j) {
            this.maxPullWaiting = ConsumerConfiguration.normalize(Long.valueOf(j), 0);
            return this;
        }

        public Builder maxBatch(Long l) {
            this.maxBatch = ConsumerConfiguration.normalize(l, 0);
            return this;
        }

        public Builder maxBatch(long j) {
            this.maxBatch = ConsumerConfiguration.normalize(Long.valueOf(j), 0);
            return this;
        }

        public Builder maxBytes(Long l) {
            this.maxBytes = ConsumerConfiguration.normalize(l, 0);
            return this;
        }

        public Builder maxBytes(long j) {
            this.maxBytes = ConsumerConfiguration.normalize(Long.valueOf(j), 0);
            return this;
        }

        public Builder numReplicas(Integer num) {
            this.numReplicas = num == null ? null : Integer.valueOf(Validator.validateNumberOfReplicas(num.intValue()));
            return this;
        }

        public Builder headersOnly(Boolean bool) {
            this.headersOnly = bool;
            return this;
        }

        public Builder memStorage(Boolean bool) {
            this.memStorage = bool;
            return this;
        }

        public Builder backoff(Duration... durationArr) {
            if (durationArr != null) {
                if (durationArr.length != 1 || durationArr[0] != null) {
                    this.backoff = new ArrayList();
                    for (Duration duration : durationArr) {
                        if (duration != null) {
                            if (duration.toNanos() < 1) {
                                throw new IllegalArgumentException("Backoff cannot be less than 1");
                            }
                            this.backoff.add(duration);
                        }
                    }
                    return this;
                }
            }
            this.backoff = null;
            return this;
        }

        public Builder backoff(long... jArr) {
            if (jArr == null) {
                this.backoff = null;
                return this;
            }
            this.backoff = new ArrayList();
            for (long j : jArr) {
                if (j < 1) {
                    throw new IllegalArgumentException("Backoff cannot be less than 1");
                }
                this.backoff.add(Duration.ofMillis(j));
            }
            return this;
        }

        public Builder metadata(Map<String, String> map) {
            this.metadata = (map == null || map.size() == 0) ? null : new HashMap(map);
            return this;
        }

        public ConsumerConfiguration build() {
            Validator.validateMustMatchIfBothSupplied(this.name, this.durable, NatsJetStreamClientError.JsConsumerNameDurableMismatch);
            return new ConsumerConfiguration(this);
        }

        public PushSubscribeOptions buildPushSubscribeOptions() {
            return PushSubscribeOptions.builder().configuration(build()).build();
        }

        public PushSubscribeOptions buildPushSubscribeOptions(String str) {
            return PushSubscribeOptions.builder().configuration(build()).stream(str).build();
        }

        public PullSubscribeOptions buildPullSubscribeOptions() {
            return PullSubscribeOptions.builder().configuration(build()).build();
        }

        public PullSubscribeOptions buildPullSubscribeOptions(String str) {
            return PullSubscribeOptions.builder().configuration(build()).stream(str).build();
        }
    }

    public String toString() {
        return "ConsumerConfiguration{description='" + this.description + "', durable='" + this.durable + "', name='" + this.name + "', deliverPolicy=" + this.deliverPolicy + ", deliverSubject='" + this.deliverSubject + "', deliverGroup='" + this.deliverGroup + "', startSeq=" + this.startSeq + ", startTime=" + this.startTime + ", ackPolicy=" + this.ackPolicy + ", ackWait=" + this.ackWait + ", maxDeliver=" + this.maxDeliver + ", filterSubject='" + this.filterSubject + "', replayPolicy=" + this.replayPolicy + ", sampleFrequency='" + this.sampleFrequency + "', rateLimit=" + this.rateLimit + ", maxAckPending=" + this.maxAckPending + ", idleHeartbeat=" + this.idleHeartbeat + ", flowControl=" + this.flowControl + ", maxPullWaiting=" + this.maxPullWaiting + ", maxBatch=" + this.maxBatch + ", maxBytes=" + this.maxBytes + ", maxExpires=" + this.maxExpires + ", numReplicas=" + this.numReplicas + ", headersOnly=" + this.headersOnly + ", memStorage=" + this.memStorage + ", inactiveThreshold=" + this.inactiveThreshold + ", backoff=" + this.backoff + ", metadata=" + this.metadata + AbstractJsonLexerKt.END_OBJ;
    }

    protected static int getOrUnset(Integer num) {
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected static long getOrUnsetUlong(Long l) {
        if (l == null || l.longValue() < 0) {
            return 0L;
        }
        return l.longValue();
    }

    protected static Duration getOrUnset(Duration duration) {
        return duration == null ? DURATION_UNSET : duration;
    }

    protected static Integer normalize(Long l, int i) {
        if (l == null) {
            return null;
        }
        if (l.longValue() < i) {
            return -1;
        }
        if (l.longValue() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return Integer.valueOf(l.intValue());
    }

    protected static Long normalizeUlong(Long l) {
        if (l == null) {
            return null;
        }
        return Long.valueOf(l.longValue() > 0 ? l.longValue() : 0L);
    }

    protected static Duration normalize(Duration duration) {
        if (duration == null) {
            return null;
        }
        return duration.toNanos() <= 0 ? DURATION_UNSET : duration;
    }

    protected static Duration normalizeDuration(long j) {
        return j <= 0 ? DURATION_UNSET : Duration.ofMillis(j);
    }

    protected static DeliverPolicy GetOrDefault(DeliverPolicy deliverPolicy) {
        return deliverPolicy == null ? DEFAULT_DELIVER_POLICY : deliverPolicy;
    }

    protected static AckPolicy GetOrDefault(AckPolicy ackPolicy) {
        return ackPolicy == null ? DEFAULT_ACK_POLICY : ackPolicy;
    }

    protected static ReplayPolicy GetOrDefault(ReplayPolicy replayPolicy) {
        return replayPolicy == null ? DEFAULT_REPLAY_POLICY : replayPolicy;
    }
}
