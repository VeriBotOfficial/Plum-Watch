package io.nats.client.api;

import io.nats.client.api.SourceBase;
import io.nats.client.support.JsonValue;
import java.time.ZonedDateTime;

/* loaded from: classes6.dex */
public class Mirror extends SourceBase {
    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ External getExternal() {
        return super.getExternal();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ String getFilterSubject() {
        return super.getFilterSubject();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ String getSourceName() {
        return super.getSourceName();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ long getStartSeq() {
        return super.getStartSeq();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ ZonedDateTime getStartTime() {
        return super.getStartTime();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // io.nats.client.api.SourceBase, io.nats.client.support.JsonSerializable
    public /* bridge */ /* synthetic */ String toJson() {
        return super.toJson();
    }

    @Override // io.nats.client.api.SourceBase
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static Mirror optionalInstance(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return new Mirror(jsonValue);
    }

    Mirror(JsonValue jsonValue) {
        super(jsonValue);
    }

    Mirror(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Mirror mirror) {
        return new Builder(mirror);
    }

    public static class Builder extends SourceBase.SourceBaseBuilder<Builder> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.nats.client.api.SourceBase.SourceBaseBuilder
        public Builder getThis() {
            return this;
        }

        public Builder() {
        }

        public Builder(Mirror mirror) {
            super(mirror);
        }

        public Mirror build() {
            return new Mirror(this);
        }
    }
}
