package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonValue;
import io.nats.client.support.JsonValueUtils;
import java.time.ZonedDateTime;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class SequenceInfo extends SequencePair {
    private final ZonedDateTime lastActive;

    SequenceInfo(JsonValue jsonValue) {
        super(jsonValue);
        this.lastActive = JsonValueUtils.readDate(jsonValue, ApiConstants.LAST_ACTIVE);
    }

    public ZonedDateTime getLastActive() {
        return this.lastActive;
    }

    public String toString() {
        return "SequenceInfo{consumerSeq=" + this.consumerSeq + ", streamSeq=" + this.streamSeq + ", lastActive=" + this.lastActive + AbstractJsonLexerKt.END_OBJ;
    }
}
