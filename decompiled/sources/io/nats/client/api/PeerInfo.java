package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.Duration;

/* loaded from: classes6.dex */
public class PeerInfo {
    private final Duration active;
    private final boolean current;
    private final long lag;
    private final String name;
    private final boolean offline;

    PeerInfo(JsonValue jsonValue) {
        this.name = JsonValueUtils.readString(jsonValue, "name");
        this.current = JsonValueUtils.readBoolean(jsonValue, "current");
        this.offline = JsonValueUtils.readBoolean(jsonValue, "offline");
        this.active = JsonValueUtils.readNanos(jsonValue, "active", Duration.ZERO);
        this.lag = JsonValueUtils.readLong(jsonValue, ApiConstants.LAG, 0L);
    }

    public String getName() {
        return this.name;
    }

    public boolean isCurrent() {
        return this.current;
    }

    public boolean isOffline() {
        return this.offline;
    }

    public Duration getActive() {
        return this.active;
    }

    public long getLag() {
        return this.lag;
    }
}
