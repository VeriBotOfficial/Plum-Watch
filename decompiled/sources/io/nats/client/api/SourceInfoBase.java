package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.Duration;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
abstract class SourceInfoBase {
    protected final Duration active;
    protected final Error error;
    protected final External external;
    protected final long lag;
    protected final String name;

    SourceInfoBase(JsonValue jsonValue) {
        this.name = JsonValueUtils.readString(jsonValue, "name");
        this.lag = JsonValueUtils.readLong(jsonValue, ApiConstants.LAG, 0L);
        this.active = JsonValueUtils.readNanos(jsonValue, "active", Duration.ZERO);
        this.external = External.optionalInstance(JsonValueUtils.readValue(jsonValue, "external"));
        this.error = Error.optionalInstance(JsonValueUtils.readValue(jsonValue, "error"));
    }

    public String getName() {
        return this.name;
    }

    public long getLag() {
        return this.lag;
    }

    public Duration getActive() {
        return this.active;
    }

    public External getExternal() {
        return this.external;
    }

    public Error getError() {
        return this.error;
    }

    public String toString() {
        return "Mirror{name='" + getName() + "', lag=" + getLag() + ", active=" + getActive() + ", " + this.external + ", " + this.error + AbstractJsonLexerKt.END_OBJ;
    }
}
