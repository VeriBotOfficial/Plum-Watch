package io.nats.client.api;

import io.nats.client.Message;
import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonParser;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: classes6.dex */
public class StreamInfo extends ApiResponse<StreamInfo> {
    private final ClusterInfo clusterInfo;
    private final StreamConfiguration config;
    private final ZonedDateTime created;
    private final MirrorInfo mirrorInfo;
    private final List<SourceInfo> sourceInfos;
    private final StreamState state;

    public StreamInfo(Message message) {
        this(JsonParser.parseUnchecked(message.getData()));
    }

    public StreamInfo(JsonValue jsonValue) {
        super(jsonValue);
        this.created = JsonValueUtils.readDate(this.jv, ApiConstants.CREATED);
        this.config = StreamConfiguration.instance(JsonValueUtils.readValue(this.jv, "config"));
        this.state = new StreamState(JsonValueUtils.readValue(this.jv, "state"));
        this.clusterInfo = ClusterInfo.optionalInstance(JsonValueUtils.readValue(this.jv, ApiConstants.CLUSTER));
        this.mirrorInfo = MirrorInfo.optionalInstance(JsonValueUtils.readValue(this.jv, ApiConstants.MIRROR));
        this.sourceInfos = SourceInfo.optionalListOf(JsonValueUtils.readValue(this.jv, ApiConstants.SOURCES));
    }

    public StreamConfiguration getConfiguration() {
        return this.config;
    }

    public StreamState getStreamState() {
        return this.state;
    }

    public ZonedDateTime getCreateTime() {
        return this.created;
    }

    public MirrorInfo getMirrorInfo() {
        return this.mirrorInfo;
    }

    public List<SourceInfo> getSourceInfos() {
        return this.sourceInfos;
    }

    public ClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }
}
