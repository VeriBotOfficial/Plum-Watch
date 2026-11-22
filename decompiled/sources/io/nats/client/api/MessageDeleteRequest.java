package io.nats.client.api;

import io.nats.client.support.ApiConstants;
import io.nats.client.support.JsonSerializable;
import io.nats.client.support.JsonUtils;

/* loaded from: classes6.dex */
public class MessageDeleteRequest implements JsonSerializable {
    private final boolean erase;
    private final long sequence;

    public MessageDeleteRequest(long j, boolean z) {
        this.sequence = j;
        this.erase = z;
    }

    public long getSequence() {
        return this.sequence;
    }

    public boolean isErase() {
        return this.erase;
    }

    public boolean isNoErase() {
        return !this.erase;
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        StringBuilder beginJson = JsonUtils.beginJson();
        JsonUtils.addField(beginJson, ApiConstants.SEQ, Long.valueOf(this.sequence));
        if (isNoErase()) {
            JsonUtils.addField(beginJson, ApiConstants.NO_ERASE, (Boolean) true);
        }
        return JsonUtils.endJson(beginJson).toString();
    }
}
