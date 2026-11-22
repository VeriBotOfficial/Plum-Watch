package io.nats.client.api;

import io.nats.client.support.JsonValue;
import java.time.Duration;

/* loaded from: classes6.dex */
public class MirrorInfo extends SourceInfoBase {
    @Override // io.nats.client.api.SourceInfoBase
    public /* bridge */ /* synthetic */ Duration getActive() {
        return super.getActive();
    }

    @Override // io.nats.client.api.SourceInfoBase
    public /* bridge */ /* synthetic */ Error getError() {
        return super.getError();
    }

    @Override // io.nats.client.api.SourceInfoBase
    public /* bridge */ /* synthetic */ External getExternal() {
        return super.getExternal();
    }

    @Override // io.nats.client.api.SourceInfoBase
    public /* bridge */ /* synthetic */ long getLag() {
        return super.getLag();
    }

    @Override // io.nats.client.api.SourceInfoBase
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    static MirrorInfo optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new MirrorInfo(jsonValue);
    }

    MirrorInfo(JsonValue jsonValue) {
        super(jsonValue);
    }

    @Override // io.nats.client.api.SourceInfoBase
    public String toString() {
        return "Mirror" + super.toString();
    }
}
