package io.nats.client.api;

import io.nats.client.Message;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.ZonedDateTime;

/* loaded from: classes6.dex */
public class ConsumerInfo extends ApiResponse<ConsumerInfo> {
    private final SequenceInfo ackFloor;
    private final ClusterInfo clusterInfo;
    private final ConsumerConfiguration configuration;
    private final ZonedDateTime created;
    private final SequenceInfo delivered;
    private final String name;
    private final long numAckPending;
    private final long numPending;
    private final long numRedelivered;
    private final long numWaiting;
    private final boolean pushBound;
    private final String stream;

    public ConsumerInfo(Message message) {
        this(parseMessage(message));
    }

    public ConsumerInfo(JsonValue jsonValue) {
        super(jsonValue);
        this.configuration = new ConsumerConfiguration(JsonValueUtils.readObject(this.jv, "config"));
        this.stream = JsonValueUtils.readString(this.jv, ApiConstants.STREAM_NAME);
        this.name = JsonValueUtils.readString(this.jv, "name");
        this.created = JsonValueUtils.readDate(this.jv, ApiConstants.CREATED);
        this.delivered = new SequenceInfo(JsonValueUtils.readObject(this.jv, ApiConstants.DELIVERED));
        this.ackFloor = new SequenceInfo(JsonValueUtils.readObject(this.jv, ApiConstants.ACK_FLOOR));
        this.numAckPending = JsonValueUtils.readLong(this.jv, ApiConstants.NUM_ACK_PENDING, 0L);
        this.numRedelivered = JsonValueUtils.readLong(this.jv, ApiConstants.NUM_REDELIVERED, 0L);
        this.numPending = JsonValueUtils.readLong(this.jv, ApiConstants.NUM_PENDING, 0L);
        this.numWaiting = JsonValueUtils.readLong(this.jv, ApiConstants.NUM_WAITING, 0L);
        this.clusterInfo = ClusterInfo.optionalInstance(JsonValueUtils.readValue(this.jv, ApiConstants.CLUSTER));
        this.pushBound = JsonValueUtils.readBoolean(this.jv, ApiConstants.PUSH_BOUND);
    }

    public ConsumerConfiguration getConsumerConfiguration() {
        return this.configuration;
    }

    public String getName() {
        return this.name;
    }

    public String getStreamName() {
        return this.stream;
    }

    public ZonedDateTime getCreationTime() {
        return this.created;
    }

    public SequenceInfo getDelivered() {
        return this.delivered;
    }

    public SequenceInfo getAckFloor() {
        return this.ackFloor;
    }

    public long getNumPending() {
        return this.numPending;
    }

    public long getNumWaiting() {
        return this.numWaiting;
    }

    public long getNumAckPending() {
        return this.numAckPending;
    }

    public long getRedelivered() {
        return this.numRedelivered;
    }

    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public boolean isPushBound() {
        return this.pushBound;
    }

    public long getCalculatedPending() {
        return this.numPending + this.delivered.getConsumerSequence();
    }
}
